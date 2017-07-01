package com.sjz.markmoney;

import com.hbdm.ga.publictools.data.Message;
import com.hbdm.ga.publictools.page.Page;
import com.sjz.markmoney.adapter.DateEditor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @version 1.0
 * @since java 1.7.0
 */
public class BaseController {
    private static final Logger LOGGER = LoggerFactory.getLogger(BaseController.class);

    /**
     * 绑定日期类型转换
     *
     * @param binder
     */
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Date.class, new DateEditor());
    }

    /**
     * 公共的分页对象设置
     *
     * @param dataList 　message　对象
     * @param <T>
     * @return
     */
    protected <T> Map<String, Object> createModel(Message<Page<T>> dataList) {
        Map<String, Object> model = new HashMap();
        if (dataList != null) {
            Page paycashList = dataList.getData();
            if (paycashList != null) {
                model.put("currentPageNo", paycashList.getCurrentPageNo());
                model.put("totalPageCount", paycashList.getTotalPageCount());
                model.put("totalCount", paycashList.getTotalCount());
                model.put("pageSize", paycashList.getPageSize());
                model.put("dataList", paycashList.getDataList());

            } else {
                model.put("currentPageNo", 1);
                model.put("pageSize", 10);
                model.put("totalPageCount", 0);
                model.put("totalCount", 0);
            }
        }
        return model;
    }

    /**
     * 公共的分页对象设置
     *
     * @param dataList 　message　对象
     * @param <T>
     * @return
     */
    protected <T> Map<String, Object> createModel(Page<T> dataList) {
        Map<String, Object> model = new HashMap();

        if (dataList != null) {
            model.put("currentPageNo", dataList.getCurrentPageNo());
            model.put("totalPageCount", dataList.getTotalPageCount());
            model.put("totalCount", dataList.getTotalCount());
            model.put("pageSize", dataList.getPageSize());
            model.put("dataList", dataList.getDataList());

        } else {
            model.put("currentPageNo", 1);
            model.put("pageSize", 10);
            model.put("totalPageCount", 0);
            model.put("totalCount", 0);
        }
        return model;
    }

    protected Date setEndDate(Date date) {
        if(date == null) {
            return null;
        }
        Calendar calendarDate = Calendar.getInstance();
        calendarDate.setTime(date);
        calendarDate.set(Calendar.HOUR_OF_DAY, 23);
        calendarDate.set(Calendar.MINUTE, 59);
        calendarDate.set(Calendar.SECOND, 59);
        return calendarDate.getTime();
    }
}
