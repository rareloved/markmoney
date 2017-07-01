package com.sjz.markmoney.adapter;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.beans.PropertyEditorSupport;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p>DESCRIPTION:  spring mvc date类型转换适配器
 *
 * @version 1.0
 * @since java 1.7.0
 */
public class DateEditor extends PropertyEditorSupport {
    private static final Logger LOGGER = LoggerFactory.getLogger(DateEditor.class);

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        if (!StringUtils.isBlank(text)) {
            DateFormat format = null;
            if(text.length()>10){
                format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            }else{
                format = new SimpleDateFormat("yyyy-MM-dd");
            }
            Date date = null;
            try {
                date = format.parse(text);
            } catch (ParseException e) {
                LOGGER.error("字符串转日期类型出错", e);
            }
            setValue(date);
        }
    }
}
