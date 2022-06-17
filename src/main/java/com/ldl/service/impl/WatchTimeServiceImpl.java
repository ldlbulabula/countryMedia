package com.ldl.service.impl;

import com.ldl.bean.WatchingTime;
import com.ldl.mapper.WatchTimeMapper;
import com.ldl.service.WatchTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class WatchTimeServiceImpl implements WatchTimeService {
    @Autowired
    private WatchTimeMapper watchTimeMapper;
    @Autowired
    @Qualifier("without_Hms")
    SimpleDateFormat format;
    @Override
    public Integer addWatchTime(long start, long end, String openid) {
        String date = this.format.format(new Date());
        WatchingTime watchingTime = watchTimeMapper.selectIsWatchToday(openid, date);
        if(watchingTime==null){
            //今天是第一次观看
            watchTimeMapper.addWatchTime(end-start,openid,date);
        }else {
            watchTimeMapper.WatchTimeCumulate(end-start,openid,date);
        }

        return 1;
    }
}
