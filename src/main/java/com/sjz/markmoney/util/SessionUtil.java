package com.sjz.markmoney.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;


public class SessionUtil {

    public static synchronized String getSessionId() throws NoSuchAlgorithmException{
        Random random = new SecureRandom();
        byte bytes[] = new byte[16];
        random.nextBytes(bytes);
        return MD5.encrypt(bytes);
    }

    public static String getSessionIdFromCookie(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if(cookies == null || cookies.length <= 0) {
            return null;
        }
        String sessionId = null;
        for(Cookie cookie : cookies) {
            if("sessionId".equals(cookie.getName())) {
                sessionId = cookie.getValue();
            }
        }
        return sessionId;
    }

    public static void main(String[] args) {
        try {
            String sessionId = SessionUtil.getSessionId();
            System.out.println(sessionId);
            System.out.println(sessionId.length());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

}
