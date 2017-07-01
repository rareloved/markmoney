package com.sjz.markmoney.controller;

import com.hbdm.ga.publictools.Messages;
import com.hbdm.ga.publictools.data.Message;
import com.sjz.markmoney.domain.MarkInfo;
import com.sjz.markmoney.domain.UserInfo;
import com.sjz.markmoney.service.MarkMoneyService;
import com.sjz.markmoney.util.GUIDGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * User: andy
 * Date: 2017/7/1
 * Time: 13:58
 */
@Controller("/")
public class IndexController {
    @Autowired
    private MarkMoneyService markInfoService;

    @RequestMapping("/")
    public ModelAndView loginPage(HttpServletRequest request) {
        Map model = new HashMap();

        UserInfo userInfo = (UserInfo) request.getAttribute("userInfo");
        List<MarkInfo> markInfos = getNear10MarkList(userInfo);
        model.put("markInfos",markInfos);
        model.put("today", new Date());

        return new ModelAndView("index/index", model);
    }

    @RequestMapping(value = "saveMark", method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView saveMark(HttpServletRequest request, HttpServletResponse response) throws ParseException, IOException {
        Map model = new HashMap();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        UserInfo userInfo = (UserInfo) request.getAttribute("userInfo");
        MarkInfo markInfo = new MarkInfo();
        markInfo.setId(GUIDGenerator.getGUID());
        markInfo.setUserid(userInfo.getId());
        markInfo.setMarkDate(simpleDateFormat.parse(request.getParameter("date")));
        markInfo.setConsumerType(Integer.parseInt(request.getParameter("type")));
        markInfo.setMoney(Integer.parseInt(request.getParameter("money")));
        markInfo.setMarkNote(request.getParameter("note"));
        markInfo.setCreateDate(new Date());
        markInfoService.saveMark(markInfo);


        List<MarkInfo> markInfos = getNear10MarkList(userInfo);
        model.put("markInfos",markInfos);
        model.put("today", new Date());
        response.sendRedirect(request.getContextPath()+"/");
return null;
//        return new ModelAndView("index/index",model);
    }

    /**
     * 得到当前登录用户最近10笔记账信息
     * @return
     */
    private List<MarkInfo> getNear10MarkList(UserInfo userInfo){
        List<MarkInfo> markInfos = new ArrayList<MarkInfo>();
        markInfos = markInfoService.getNear10MarkList(userInfo.getId());
        return markInfos;
    }
}
