package com.frame.demo.utils;


import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author : longrong.lang
 * @description：
 * @date : 10:50 2019/11/3
 */
public class BaseInfo {

    public static String getInfo(String key){
        ResourceBundle bundle = ResourceBundle.getBundle("config", Locale.CHINA);
        String value = bundle.getString(key);
        return value;
    }
}
