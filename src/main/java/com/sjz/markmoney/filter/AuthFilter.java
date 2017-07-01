package com.sjz.markmoney.filter;

import com.hbdm.ga.publictools.util.JsonUtils;
import com.hbdm.ga.publictools.util.StringUtil;
import com.sjz.markmoney.domain.UserInfo;
import com.sjz.markmoney.util.SessionUtil;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 登录Filter
 * User: andy
 * Date: 2017/7/1
 * Time: 2:39
 */
public class AuthFilter implements Filter {


    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest)request;
        HttpServletResponse res = (HttpServletResponse)response;

        String currentPath=req.getContextPath();
        String loginUrl=currentPath+"/login";
        String updatePassword = currentPath+"/systemUser/goToUpdatePasswordPage";
        String updatePasswordPost = currentPath+"/systemUser/updatePassword";

        if(loginUrl.equals(req.getRequestURI()) || req.getRequestURI().contains("static")) {
            chain.doFilter(request, response);
            return;
        }
        String sessionId = SessionUtil.getSessionIdFromCookie(req);

        if (StringUtil.isEmpty(sessionId)) {
            sendRedirect(req,res,loginUrl);//登录页
            return;
        }

        HttpSession session = req.getSession();
        if(session == null){
            sendRedirect(req,res,loginUrl);
            return;
        }
        UserInfo userInfo = (UserInfo) session.getAttribute(sessionId);

        if(userInfo == null) {
            sendRedirect(req,res,loginUrl);
            return;
        }

        //用户信息通过request传递
        req.setAttribute("userInfo",userInfo);

        chain.doFilter(request, response);
        return;

    }

    private void sendRedirect(HttpServletRequest request,HttpServletResponse response,String loginUrl) throws IOException {

        java.io.PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<script id='loginTimeout'>");
        out.println("window.open ('"+loginUrl+"','_parent')");
        out.println("</script>");
        out.println("</html>");
    }

    public void destroy() {

    }
}
