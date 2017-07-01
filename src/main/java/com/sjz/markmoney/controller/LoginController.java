package com.sjz.markmoney.controller;

import com.sjz.markmoney.domain.UserInfo;
import com.sjz.markmoney.service.UserInfoService;
import com.sjz.markmoney.util.SessionUtil;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

/**
 * User: andy
 * Date: 2017/7/1
 * Time: 3:10
 */
@Controller
public class LoginController {
    private static final Logger logger = LoggerFactory
            .getLogger(LoginController.class);

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public ModelAndView loginPage() {
        return new ModelAndView("auth/login");
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    @ResponseBody
    public Map login(HttpServletRequest request, HttpServletResponse response, Model model) throws NoSuchAlgorithmException {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        Map result = new HashMap();
//        List<UserInfo> list=Db.getAll();
//        for(User user:list)
        //todo 真正的验证用户名密码
        if ("andy".equals(userName) && "888888".equals(password)) {
            HttpSession session = request.getSession();
            //构造并获取sessionID,生成cookie
            String sessionId = SessionUtil.getSessionId();

            Cookie cookie = new Cookie("sessionId", sessionId);
            cookie.setMaxAge(60 * 30);//30分钟
            cookie.setPath(request.getContextPath());
            response.addCookie(cookie);

            UserInfo userInfo = new UserInfo();
            userInfo = userInfoService.getUserInfoByName("andy");
            // 登录成功后要存入用户的登录状态，key是用户对象的String形式value就是用户对象(model)！！别的页面应该能用到
            session.setAttribute(sessionId, userInfo);

            result.put("status", "200");
            result.put("message", "登录成功！");
        } else{
            result.put("status", "500");
            result.put("message", "用户名或密码错误！");
        }
        return result;
    }
}
