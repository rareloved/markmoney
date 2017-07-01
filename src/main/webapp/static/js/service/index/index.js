/**
 * Created by andy on 2017/6/7.
 */
require.config({
    baseUrl: '/markmoney/static'
});
define(
    [
        'js/common/Config'
        ,'js/common/Util'
    ], function(
        Config
        ,Util
    ){

    var GlobalTip = new Util.GlobalTip(),
        GlobalLoading = new Util.GlobalLoading();


    /**获取分页参数**/
    function getParams($pager){
        return {
            'pageSize':$pager.data("pagesize")||10,
            'currentPageNo':$pager.data("currentpageno")||1
        }
    }
    /**恢复当前页为1（当重新选择筛选条件，点查询时）**/
    function restoreCurrentPageNO($btn){
        $btn.closest(".search").siblings(".tablebox").find(".page-div").data("currentpageno", 1);
    }

    //检索
    function query_ing(_params) {
        var $wrapper = $("#ing-list"),
            $pager = $wrapper.find(".page-div"),
            $tab = $(".tab_ing");

        var pageParam = getParams($pager);
        var params = {
            sfzh:$.trim($tab.find(".sfzh").val())
        };
        params = $.extend(params, pageParam);

        //_params 用于分页
        (_params)&&(_params.currentPageNo) && (params = $.extend(params, _params));

        GlobalLoading.show();
        Util.Request(Config.Route.demo.getDemoList, params).then(function (data) {
            $wrapper.html(data);
            //分页处理
            Util.SimplePage($wrapper.find(".page-div"), query_ing);
        }).fail(function(res){
            GlobalTip.error((res&&res.errorMsg)||"获取数据失败");
        }).always(function(){
            GlobalLoading.hide();
        })
    }

    function toValid() {
        if($("input[name='money']").val().length == 0){
            alert("你花了多少钱都不填吗？");
            $("input[name='money']").focus();
            return false;
        }
        return true;
    }
    function initEvent(){
        $(".form_submit").submit(function(){
            return toValid();
        })
        $(".content").on("click", ".querying_btn", function(){
            restoreCurrentPageNO($(this));
            query_ing();
        })
        Util.OverflowHandle(".overflow-content");
    }
        onsubmit="return toVaild()"
    initEvent();

})
