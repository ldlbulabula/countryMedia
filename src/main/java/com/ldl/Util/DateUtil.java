package com.ldl.Util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
    public static final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    public static String formatToDay(Date date){
        return format.format(date);
    }

    //在这天的基础上减一天
    public static String formatToDayAndSupOneDay(Date date,int supDayNum){
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, supDayNum);
        return  format.format(cal.getTime());
    }

//    public static
}
