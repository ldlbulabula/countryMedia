package com.ldl.Util;

import com.ldl.bean.WatchingResult;
import java.math.BigInteger;
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

    //在今天的基础上减一天
    public static Calendar formatToDayAndSupOneDay(int supDayNum){
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.DATE, supDayNum);
        return  cal;
    }

    public static WatchingResult getWatchingResult(BigInteger start, BigInteger end){
        Calendar startTime=Calendar.getInstance();
        Calendar endTime=Calendar.getInstance();
        startTime.setTimeInMillis(start.longValue());
        endTime.setTimeInMillis(end.longValue());
        int minute =endTime.get(Calendar.MINUTE)- startTime.get(Calendar.MINUTE)  ;
        int second =endTime.get(Calendar.SECOND)- startTime.get(Calendar.SECOND)  ;
        return new WatchingResult(minute,second);
    }

    public static WatchingResult getWatchingResult(String time){
        BigInteger millisecond = new BigInteger(time);
        if (millisecond.compareTo(new BigInteger(String.valueOf(1000))) < 0) {
            return new WatchingResult(0,0);
        }
        BigInteger second = millisecond.divide(new BigInteger("1000"));
        BigInteger seconds = second.mod(new BigInteger("60"));
        BigInteger minutes = second.divide(new BigInteger("60"));
        return new WatchingResult(minutes.intValue(),seconds.intValue());
    }
}
