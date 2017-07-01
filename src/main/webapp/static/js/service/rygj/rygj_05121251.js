var rygj_query = {
	sfzh : [],
	lx : [],
	html : "",
	addHead : function() {
		this.html += '<div class="box"><ul class="event_list"><div>';
	},
	addFoot : function() {
		this.html += '</div></ul></div>';
	},
	addYear : function(year) {
		this.html += '<h3 id=' + year + '>' + year + '</h3>'
	},
	addLineStart : function(date) {
		this.html += '<li><span>'+date+'</span>';
	},
	addLineEnd : function() {
		this.html += '</li>';
	},
	addPartStart : function() {
		this.html += '<p>';
	},
	addPartEnd : function() {
		this.html += '</p>';
	},
	addSpan : function(data,id,lx) {
		this.html += '<span class="bg-info" id='+id+' lx='+lx+'>'+data+'</span>';
	},
	addRightSpan : function(data,id,lx){
		this.html += '<span class="bg-info" id= '+id+' lx ='+lx+' style="float:right;">'+data+'</span>';
	},
	addContent : function(data) {
		rygj_query.addHead();
		var year;
		var date;
		var pref_date;
		var lx;
		var pref_lx;
		var sfzh;
		var pref_sfzh;
		for (i in data) {
			var fullDate = new Date(data[i].fssj);
			lx=data[i].lx;
			if (!year || year != fullDate.getFullYear()) {
				year = fullDate.getFullYear();
				this.addYear(year);
			}
			date = fullDate.getMonth() + 1 + "-" + fullDate.getDate();
			if(this.sfzh[0] == data[i].sfzh){
				//当为第一个人
				//当与上条数据为同一人时添加结束标签
				if(pref_sfzh == data[i].sfzh){
					this.addPartEnd();
					this.addLineEnd();
				}
				this.addLineStart(date);
				this.addPartStart();
				this.addSpan(this.getMessageFromData(data[i]),data[i].xxzjbh,lx);
				pref_lx = lx
				pref_date = date
			}else{
				//当为第二个人
				if (pref_date == date && pref_lx == lx) {
					//轨迹日期相等且轨迹类型相等(同轨迹)时
					this.addRightSpan(this.getMessageFromData(data[i]),data[i].xxzjbh,lx);
				}else{
					//不同轨迹时
					this.addLineStart(date);
					this.addPartStart();
					this.addRightSpan(this.getMessageFromData(data[i]),data[i].xxzjbh,lx);
				}
				this.addPartEnd();
				this.addLineEnd();
			}
			pref_sfzh = data[i].sfzh;
		}
		this.addFoot();
		$("div[class='page']").html(this.html);
		this.html="";
	},
	getMessageFromData : function(data) {
		if (data.lx == 1) {
			return "上网 :" + data.qd;
		} else if (data.lx == 2) {
			return "住宿 :" + data.qd;
		} else if (data.lx == 3) {
			return "铁路 : " + data.jgdm + " 次 " + data.qd + " 至 " + data.zd;
		} else if (data.lx == 4) {
			return  "航班 : "+ data.jgdm;
		}
	},
	query : function() {
		$.ajax({
			url : "query",
			type : "post",
			data : {
				"sfzh" : JSON.stringify(this.sfzh),
				"lx" : JSON.stringify(this.lx)
			},
			dataType : "json",
			success : function(data) {
				rygj_query.addContent(data);
				$("li p span").on("click",function(){
					rygj_query.detail(this);
				})
			}
		});
	},
	compare : function() {
		$.ajax({
			url : "compare",
			type : "post",
			data : {
				"sfzh" : JSON.stringify(this.sfzh),
				"lx" : JSON.stringify(this.lx)
			},
			dataType : "html",
			success : function(data) {
				$("div[class='page']").html(data);
			}
		});
	},
	detail : function(e){
		var xxzjbh = $(e).attr("id");
		var lx = $(e).attr("lx");
		$.ajax({
			url : "detail",
			type : "post",
			data : {
				"xxzjbh" : xxzjbh,
				"lx" : lx
			},
			dataType : "html",
			success : function(data) {
				$(".modal-body p").html(data)
				$("#mymodal").modal("show");
				
				
				/*$("div[class='detail']").html(data);
				$("div[class='detail']").show();*/
			}
		});
	}
};