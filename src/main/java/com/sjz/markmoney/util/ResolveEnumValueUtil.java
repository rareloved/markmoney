package com.sjz.markmoney.util;

import org.apache.commons.lang.StringUtils;

/**
 * User: andy
 * Date: 2017/7/1
 * Time: 18:48
 */
public class ResolveEnumValueUtil {
    /**
     * todo fix it
     * enumName:
     * consumerType
     * @param key
     * @param enumName
     * @return
     */
    public static String getEnumValue(Integer key,String enumName){
        String ret = "";
        if(StringUtils.isEmpty(enumName)){
            return ret;
        }
        if(enumName.equals("consumerType")){
            if(key == 1){
                ret = "购物";
            }else if(key == 2){
                ret = "旅游";
            }else if(key == 3){
                ret = "请客吃饭";
            }else if(key == 4){
                ret = "打车";
            }else if(key == 5){
                ret = "人情";
            }
        }
        return ret;
    }
}
