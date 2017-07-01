define(function(){
    /** 
     * 格式化日期
     * @method format
     * @static
     * @param {Date} d 日期对象
     * @param {string} pattern 日期格式(y年M月d天h时m分s秒)，默认为"yyyy-MM-dd"
     * @return {string}  返回format后的字符串
     * @example
     var d=new Date();
     alert(format(d," yyyy年M月d日\n yyyy-MM-dd\n MM-dd-yy\n yyyy-MM-dd hh:mm:ss"));
     */
    function formatDate(d, pattern) {
        pattern = pattern || 'yyyy-MM-dd';
        var y = d.getFullYear().toString(),
            o = {
                M: d.getMonth() + 1, //month
                d: d.getDate(), //day
                h: d.getHours(), //hour
                m: d.getMinutes(), //minute
                s: d.getSeconds() //second
            };
        pattern = pattern.replace(/(y+)/ig, function(a, b) {
            return y.substr(4 - Math.min(4, b.length));
        });
        for (var i in o) {
            pattern = pattern.replace(new RegExp('(' + i + '+)', 'g'), function(a, b) {
                return (o[i] < 10 && b.length > 1) ? '0' + o[i] : o[i];
            });
        }
        return pattern;
    }

    /**getQueryString**/
    function getQueryString(name) {
        var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
        var r = window.location.search.substr(1).match(reg);
        if (r != null) return decodeURIComponent(r[2]); return "";
    }


    /*
    * @summary: Request
    */
    function Request(url, params, method, contentType, header){
        var defer = $.Deferred();
        $.ajax({
            'url': url,
            'type': method||'GET',
            'dataType': 'TEXT', 
            'data': params,
            'header': header||"",
            'contentType': contentType||"application/x-www-form-urlencoded",
            'traditional': true,
            'success': function(res){
                if(res.indexOf("<title>ERROR</title>")>-1){
                    //todo 后台产生错误会跳至error.vm
                    defer.reject();
                }else if(res.indexOf('"result":"ERROR"')>-1||res.indexOf('"result":"FAILED"')>-1){
                    defer.reject({'errorMsg':JSON.parse(res).message});
                }else if(res.indexOf('class="errorMsg"')>-1){
                    defer.reject({'errorMsg':$("<div>").append($(res)).find(".errorMsg").text()});
                }else{
                    defer.resolve(res);
                }
            },
            'error': function(){
                defer.reject();
            },
            'timeout': 20000
        })
        return defer;
    }


    /**
     * [uploadFile 上传]
     * @param  {[type]} fileElementId [dom id]
     * @return {[type]}               [description]
     */
    function uploadFile(fileElementId){
         var defer = $.Deferred();
         if(!fileElementId){
            defer.reject({'errorMsg':'参数错误'});
            return false;
         }
         $.ajaxFileUpload({
            url:'/fileuplaod/upload',
            sercureuri:false,
            fileElementId:fileElementId,
            dataType:"text",
            success:function(data){
                var jsonData = eval("(" + data + ")");
                if(jsonData.result == "SUCCESS") {
                    defer.resolve(jsonData.data);
                } else {
                    defer.reject({'errorMsg':'上传失败'});
                }
            },
            error:function(data,status,e){
                defer.reject({'errorMsg':'上传失败'});
            }
        });
        return defer;
    }

    /**Confirm**/
    var Confirm = function(config){
        this.$wrapper = config.wrapper;
        this.confirmHandel=config.confirmHandel;
        this.$mask = $("#lean_overlay");
        this.$trigger = config.trigger;
        this.beforeOpen = config.beforeOpen;
    }
    Confirm.prototype.show = function(){
        this.$wrapper.show();
        this.$mask.show();
    }
    Confirm.prototype.hide = function(){
        this.$wrapper.hide();
        this.$mask.hide();
    }
    Confirm.prototype.init = function(){
        var self = this,
            $trigger_btn = null;

        function showTrigger(){
          $trigger_btn = $(this);
          if(self.beforeOpen){
            var res = self.beforeOpen(self.$wrapper, $(this), self);
            if(res!==false){
                self.show();
            }
          }else{
            self.show();
          }
        }
        if(typeof this.$trigger.length !== "undefined"){
          //jquery元素
          this.$trigger.on("click", showTrigger);
        }else{
          //'trigger':{'parent':$(""), 'selector':'.update_btn'}
          this.$trigger.parent.on("click", this.$trigger.selector, showTrigger);
        }

        this.$wrapper.find(".confirm_btn").on("click", function(){
          var res = self.confirmHandel(self.$wrapper, $(this), self, $trigger_btn);
          if(res!==false){
            self.hide();
          }
        });
        this.$wrapper.find(".cacel_btn").on("click", function(){
          self.hide();
        });
    }


    /**pop begin**/
    var Pop = function(config){
        this.$wrapper = config.wrapper;
        this.$trigger = config.trigger;
        this.$submit_btn = this.$wrapper.find(".submit_btn");
        this.beforeOpen = config.beforeOpen||null;
        this.submitHandel = config.submitHandel||null;
    }
    Pop.prototype.show = function(){
        this.$wrapper.show();
    }
    Pop.prototype.hide = function(){
        this.$wrapper.hide();
    }
    Pop.prototype.init = function(){
        var self = this,
            $trigger_btn = null;

        function showTrigger(){
          $trigger_btn = $(this);
          if(self.beforeOpen){
            var res = self.beforeOpen(self.$wrapper, $trigger_btn, self);
            if(res!==false){
                self.show();
            }
          }else{
            self.show();
          }
         //self.beforeOpen&&self.beforeOpen(self.$wrapper, $(this), self);
        }
        if(typeof this.$trigger.length !== "undefined"){
          //jquery元素
          this.$trigger.on("click", showTrigger);
        }else{
          //'trigger':{'parent':$(""), 'selector':'.update_btn'}
          // $ele = this.$trigger.parent.find(this.$trigger.selector);
          this.$trigger.parent.on("click", this.$trigger.selector, showTrigger);
        }
        this.$wrapper.on("click", ".pop_close", function(){
            self.hide();
        }).on("click", ".submit_btn", function(){
            if(self.submitHandel){
                var res = self.submitHandel(self.$wrapper, self, $trigger_btn, $(this));
            }
        })
    }
    /**pop end**/

    /**global Tip begin**/
    function GlobalTip(config){
         this.timeout = (config&&config.timeout)||3000;
         this.hasInit = false;
         this.$tipEle = $("<p style='z-index: 99999;padding:3px 20px;font-size:14px;position:fixed;top:82px;left:50%;-webkit-transform: translate(-50%);-ms-transform: translate(-50%);transform: translate(-50%);color:white;border-radius:4px;box-shadow:0px 3px 3px #ccc;'></p>");
         this.initDom = function(){
             $('body').append(this.$tipEle);
             this.hasInit = true;
         }
         this.showTip = function(type, msg){
             if(!this.hasInit){
                 this.initDom();
             }
             var bgcolor = "#278eda";
             if(type=="error"){
                 bgcolor = "#DA4027";
             }
             this.$tipEle.text(msg).css({"background-color": bgcolor, 'opacity':1}).stop(true).fadeIn().delay(this.timeout).fadeOut(); 
         }
     }

     GlobalTip.prototype.success = function(msg){
         this.showTip("success", msg);
     }
     GlobalTip.prototype.error = function(msg){
         this.showTip("error", msg);
     }
     /**global Tip end**/

     /**global loading begin**/
     function GlobalLoading(){
        this.hasInit = false;
        this.$Ele = $('<div class="pop pop-loading" style="display:none;"> <div class="pop_bg"></div> <div class="pop_box_loading"> <img border="0" src="/markmoney/static/images/loading.gif"> </div> </div>');
        this.initDom = function(){
            $('body').append(this.$Ele);
            this.hasInit = true;
        }
        this.showTip = function(){
            if(!this.hasInit){
                this.initDom();
            }
            this.$Ele.show(); 
        }
        this.hideTip = function(){
            this.$Ele.hide();
        }
     }
     GlobalLoading.prototype.show = function(){
         this.showTip();
     }
     GlobalLoading.prototype.hide = function(msg){
         this.hideTip();
     }
     /**global loading end**/

    /**Progress begin**/
    var Progress = function(wrapper){
      this.$wrapper = $(wrapper);
      this.$wrapper.append('<div class="progress-inner"></div> <span class="progress-percent">0%</span>');
        this.$wrapper.show();
    }
    Progress.prototype.update = function(totalCount, currentCount){
      var wrapper_width = this.$wrapper.width(),
        percent = (currentCount/totalCount)>=1?1:(currentCount/totalCount),
        inner_width = wrapper_width*percent;
      this.$wrapper.find(".progress-inner").width(inner_width);
      this.$wrapper.find(".progress-percent").text(percent==1?"完成":(Math.ceil(percent*100)+"%"));
    }
    /**Progress end**/

    /**分页**/
    function SimplePage($wrapper, handle){
         var currentPageNo = $wrapper.data("currentpageno"),
             totalPageCount = $wrapper.data("totalpagecount");

         $wrapper.off("click").off("change");

         if(totalPageCount==0){
            $wrapper.html("<p style='width:100%;text-align:center;'>没有数据</p>")
            return false;
         }
         $wrapper.on("change", ".js-display-count", function(){
             handle({'pageSize': $(this).val().trim(), 'currentPageNo':1});
         })

         if(totalPageCount==1){
            $wrapper.find(".prev").addClass("dis-btn");
            $wrapper.find(".first").addClass("dis-btn");
            $wrapper.find(".next").addClass("dis-btn");
            $wrapper.find(".last").addClass("dis-btn");
            $wrapper.find(".goPage").attr("disabled", true);
            $wrapper.find(".jump").css("color", "#ccc");
         }else{
            $wrapper.on("click", ".jump", function(){
                 handle({'currentPageNo': $wrapper.find(".goPage").val().trim()});
            })
            if(currentPageNo==1){
               $wrapper.find(".prev").addClass("dis-btn");
               $wrapper.find(".first").addClass("dis-btn");
               $wrapper.on("click", ".next", function(){
                   handle({'currentPageNo':currentPageNo+1});
               }).on("click", ".last", function(){
                   handle({'currentPageNo':totalPageCount});
               })
            }else if(currentPageNo==totalPageCount){
               $wrapper.find(".next").addClass("dis-btn");
               $wrapper.find(".last").addClass("dis-btn");
               $wrapper.on("click", ".first", function(){
                   handle({'currentPageNo':1});
               }).on("click", ".prev", function(){
                   handle({'currentPageNo':currentPageNo-1});
               })
            }else{
               $wrapper.on("click", ".next", function(){
                   handle({'currentPageNo':currentPageNo+1});
               }).on("click", ".last", function(){
                   handle({'currentPageNo':totalPageCount});
               }).on("click", ".first", function(){
                   handle({'currentPageNo':1});
               }).on("click", ".prev", function(){
                   handle({'currentPageNo':currentPageNo-1});
               })
            }
         }

    }

    /**
     * [$$$ 前端模版参数处理]
     * @param  {[type]} obj       [description]
     * @param  {[type]} namespace [description]
     * @param  {[type]} type      [description]
     *                  "date" 日期格式化    
     *                  "d100k2" 除100保留2位小数   
     * @param  {[type]} formate   [description]
     * @return {[type]}           [description]
     */
    function $$$(obj, namespace, type, formate){
        var namespace_arr = namespace.split(".");
        var current_obj = obj;
        for(var i=0,len=namespace_arr.length; i<len; i++){
            var item = namespace_arr[i];
            current_obj = current_obj[item];
            if(typeof current_obj == "undefined" || current_obj==null){
                return "--";
            }
        }
        if(type){
           switch(type){
              case 'date':
                current_obj = formatDate(current_obj, formate);
              break;
              case 'd100k2':
                current_obj = (current_obj/100).toFixed(2);
              break;
           }
        }
        return current_obj;
    }

    /**
     * [OpenWindow 打开新窗口]
     * @param {[type]} url  [url]
     * @param {[type]} rate [相对于原窗口大小比率]
     */
    function OpenWindow(url, rate){
       var win_w = $(window).width()+218, //加上左侧导航宽度
           win_h = $(window).height()+80, //加上顶部高度
           width = win_w*(rate||0.8),
           height = win_h*(rate||0.8);
       var left = (win_w-width)/2,
           top = (win_h-height)/2;
       window.open(url, "_blank", "height="+(height||900)+",width="+(width||900)+",left="+left+",top="+top+",scrollbars=yes,toolbar=no,menubar=no,resizable=no,location=no,status=no");
   }

    function OpenIFrame(url){
        var win_w = $(window).width(),
            win_h = $(window).height(),
            width = win_w*0.9,
            height = win_h*0.95;
        var left = (win_w-width)/2,
            top = (win_h-height)/2;
        var $ele = $("#frame_wrapper");
        if(!$ele.length){
            $ele = $("<div id='frame_wrapper'><iframe src=''></iframe></div>")
            $('body').append($ele.attr("style","height:"+(height||900)+"px;width:"+(width||900)+"px;left:"+left+"px;top:"+top+"px;"));
        }
        $ele.find("iframe").attr("src", url);
    }

    function reload_parent_data(){
        //用于上级页面的数据更新
        window.parent.opener.window.reload_data&&window.parent.opener.window.reload_data();
    }

    function stringToDate(date_str){
        if(date_str){
            date_str = date_str.replace(/-/gm, "/");
            return new Date(date_str);
        }else{
            return null;
        }
    }

    function OverflowHandle(selector){
        $(document.body).on("mouseenter", selector, function(){
            var $self = $(this);
            if(!$self.siblings(".showOverflow").length){
                $self.parent().append("<div class='showOverflow'>"+$self.text()+"</div>")
            }
            $(this).siblings(".showOverflow").show();
         }).on("mouseleave", ".overflow-content", function(){
            $(this).siblings(".showOverflow").hide();
         }).on("mouseenter", ".showOverflow", function(){
            $(this).show();
         }).on("mouseleave", ".showOverflow", function(){
            $(this).hide();
         })
    }

    function ByteLen(s) {
      return (s||'').replace(/[^\x00-\xff]/g, "--").length;
    }

    /**
     * 正则判断
     * @type {Object}
     */
    var Check = {
        isUrl:function(url){
            return /^http[s]?:\/\/[\w\/\.\?\-%#&=_]+$/.test(url);
        }
    }

    function isLetterThan(left_value, right_value){
        //第一个数小于第二个数
        if(typeof left_value == "undefined" || left_value==""){
            left_value = -Infinity;
        }else if(isNaN(left_value)){
            left_value = + stringToDate(left_value);
        }else{
            left_value = parseFloat(left_value);
        }

        if(typeof right_value == "undefined" || right_value==""){
            right_value = Infinity;
        }else if(isNaN(right_value)){
            right_value = + stringToDate(right_value);
        }else{
            right_value = parseFloat(right_value);
        }

        if(left_value > right_value){
            return false;
        }else{
            return true;
        }   
    }


    /**
     * 返回上一页
     * @param  {[type]} timeout [description]
     * @return {[type]}         [description]
     */
    function historyBack(timeout){
        setTimeout(function(){history.go(-1)}, timeout||1000);
    }

    /**
     * 除以100,保留2位小数  通常用于元转分
     * @param  {[type]} number [description]
     * @return {[type]}        [description]
     */
    function d100k2(number){
        if(!number || isNaN(number)){
            return "0"
        }else{
            return (number/100).toFixed(2);
        }
    }
    /**
     * 浮点数计算，修正精度问题
     * 原理，将两位数都乘以小数位数最大的，相加后再除
     * @type {Object}
     */
    var FloatCalculate = {
        accAdd:  function(arg1,arg2){ 
            var r1,r2,m; 
            try{r1=arg1.toString().split(".")[1].length}catch(e){r1=0} 
            try{r2=arg2.toString().split(".")[1].length}catch(e){r2=0} 
            m=Math.pow(10,Math.max(r1,r2)) 
            return (arg1*m+arg2*m)/m 
        },
        accSub:  function(arg1,arg2){ 
           var r1,r2,m,n;
           try{r1=arg1.toString().split(".")[1].length}catch(e){r1=0}
           try{r2=arg2.toString().split(".")[1].length}catch(e){r2=0}
           m=Math.pow(10,Math.max(r1,r2));
           //last modify by deeka
           //动态控制精度长度
           n=(r1>=r2)?r1:r2;
           return ((arg1*m-arg2*m)/m).toFixed(n);
        },
        accMul:  function(arg1,arg2){ 
            var m=0,s1=arg1.toString(),s2=arg2.toString(); 
            try{m+=s1.split(".")[1].length}catch(e){} 
            try{m+=s2.split(".")[1].length}catch(e){} 
            return Number(s1.replace(".",""))*Number(s2.replace(".",""))/Math.pow(10,m) 
        },
        accDiv: function(arg1,arg2){ 
            var t1=0,t2=0,r1,r2; 
            try{t1=arg1.toString().split(".")[1].length}catch(e){} 
            try{t2=arg2.toString().split(".")[1].length}catch(e){} 
            with(Math){ 
                r1=Number(arg1.toString().replace(".","")) 
                r2=Number(arg2.toString().replace(".","")) 
                return (r1/r2)*pow(10,t2-t1); 
            }
        }
    }

    return{
         formatDate: formatDate
        ,getQueryString: getQueryString
        ,Request: Request
        ,Confirm: Confirm
        ,Pop: Pop
        ,GlobalTip: GlobalTip
        ,GlobalLoading: GlobalLoading
        ,SimplePage: SimplePage
        ,OpenWindow: OpenWindow
        ,reload_parent_data: reload_parent_data
        ,stringToDate: stringToDate
        ,OverflowHandle: OverflowHandle
        ,ByteLen: ByteLen
        ,$$$: $$$
        ,uploadFile: uploadFile
        ,Check: Check
        ,Progress: Progress
        ,isLetterThan: isLetterThan
        ,historyBack: historyBack
        ,FloatCalculate: FloatCalculate
        ,d100k2: d100k2
    }
})