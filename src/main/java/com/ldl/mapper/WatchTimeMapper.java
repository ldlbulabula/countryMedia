package com.ldl.mapper;


import com.ldl.bean.WatchingTime;
import org.apache.ibatis.annotations.Param;

public interface WatchTimeMapper {
    int addWatchTime(@Param("watch_time_mils") long watch_time_mils,@Param("openid") String openid,@Param("watch_date") String watch_date);
    WatchingTime selectIsWatchToday(@Param("openid") String openid,@Param("watch_date")String watch_date );
    int WatchTimeCumulate(@Param("watch_time_mils") long watch_time_mils,@Param("openid") String openid,@Param("watch_date") String watch_date);
    long getTodayWatchTime(@Param("openid") String openid,@Param("watch_date") String watch_date);
}
