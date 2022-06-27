package com.ldl.Util;

public class MyUtil {
    public static String getRegex(String regex){
        StringBuilder stringBuilder = new StringBuilder();
        if(regex==null){
            return null;
        }
        for (int i = 0; i < regex.length(); i++) {
            stringBuilder.append('%');
            stringBuilder.append(regex.charAt(i));
        }
        stringBuilder.append('%');
        return stringBuilder.toString();
    }
}
