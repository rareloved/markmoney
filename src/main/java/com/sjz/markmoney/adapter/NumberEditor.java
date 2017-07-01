package com.sjz.markmoney.adapter;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.beans.PropertyEditorSupport;
import java.math.BigDecimal;

/**
 * 数字转换
 *
 */
public class NumberEditor extends PropertyEditorSupport {

    private static final Logger LOGGER = LoggerFactory.getLogger(DateEditor.class);

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        if (!StringUtils.isBlank(text)) {
            try {
                BigDecimal bigDecimal = new BigDecimal(text);
                bigDecimal = bigDecimal.multiply(new BigDecimal(100));
                setValue(bigDecimal.longValue());
            } catch (Exception e) {
                LOGGER.error("前台页面传回金额转换单位出错", e);
            }

        }
    }
}
