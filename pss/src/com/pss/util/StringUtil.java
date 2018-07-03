/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.util;

/**
 * 封装了一些对字符串操作的工具类
 * @author 曲健磊
 */
public class StringUtil {
    
    /**
     * 判断字符串是否为空
     * @param str 字符串
     * @return 字符串为空或者是一个空字符返回true，非空返回false
     */
    public static boolean isEmpty(String str) {
        if (str == null || str.equals("") || str.length() == 0) {
            return true;
        }
        return false;
    }
    
    /**
     * 判断字符串是否非空
     * @param str 字符串
     * @return 不为空就返回true，为空就返回false
     */
    public static boolean isNotEmpty(String str) {
        if (str == null || str.equals("") || str.length() == 0) {
            return false;
        }
        return true;
    }
    
    /**
     * 判断一个字符串是否是数字
     * @param s 传入的字符串 
     * @return 是数字返回true,否则返回false
     */
    public final static boolean isNumeric(String s) {
        if (s != null && !"".equals(s.trim())) {
            return s.matches("^[0-9]*$");
        } else {
            return false;
        }
    }
    
}
