package com.sjz.markmoney.controller;

import com.sjz.markmoney.domain.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * User: andy
 * Date: 2017/7/1
 * Time: 19:19
 */
@Controller
public class NavigatorController {
    @RequestMapping("/analysis")
    public String analysis(HttpServletRequest request) {
        Map model = new HashMap();

        UserInfo userInfo = (UserInfo) request.getAttribute("userInfo");
        model.put("today", new Date());

        return "index/analysis_mark";
    }
    @RequestMapping("/history")
    public String history(HttpServletRequest request) {
        Map model = new HashMap();

        UserInfo userInfo = (UserInfo) request.getAttribute("userInfo");
        model.put("today", new Date());

        return "index/history_mark";
    }
}
