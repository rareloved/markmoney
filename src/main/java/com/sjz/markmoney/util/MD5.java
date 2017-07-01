package com.sjz.markmoney.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * <p>md5加密</p>
 */
public class MD5 {

    public static String encrypt(byte[] obj) throws NoSuchAlgorithmException {
        byte[] bytes = (MessageDigest.getInstance("MD5")).digest(obj);
        StringBuffer result = new StringBuffer();
        for(int i = 0; i < bytes.length; i++) {
            byte b1 = (byte)((bytes[i] & 0xf0) >> 4);
            byte b2 = (byte)((bytes[i] & 0x0f));
            if(b1 < 10) {
                result.append((char)('0'+b1));
            } else {
                result.append((char)('A'+(b1 - 10)));
            }
            if(b2 < 10) {
                result.append((char)('0'+b2));
            } else {
                result.append((char)('A'+(b2 - 10)));
            }
        }
        return result.toString();
    }

    public static String encrypt(String obj) throws NoSuchAlgorithmException {
        return encrypt(obj.getBytes());
    }

    public static void main(String[] args) {
        try {
            System.out.println(MD5.encrypt("1234567"));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
