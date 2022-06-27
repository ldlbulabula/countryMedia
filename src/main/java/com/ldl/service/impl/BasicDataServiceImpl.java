package com.ldl.service.impl;

import com.ldl.Util.DateUtil;
import com.ldl.bean.BasicData;
import com.ldl.mapper.BasicDataMapper;
import com.ldl.service.BasicDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class BasicDataServiceImpl implements BasicDataService {
    @Autowired
    private BasicDataMapper basicDataMapper;
    @Autowired
    @Qualifier("without_Hms")
    SimpleDateFormat simpleDateFormat;


    @Override
    public BasicData getBasicData() {
        int todayClassNumber = basicDataMapper.newClassOfDate("%"+DateUtil.formatToDay(new Date())+"%");
        int yesterdayClassNumber = basicDataMapper.newClassOfDate("%"+DateUtil.formatToDayAndSupOneDay(new Date(),-1)+"%");
        BasicData basicData = new BasicData();
        basicData.setNewClassToday(todayClassNumber);
        basicData.setNewClassToday_green(todayClassNumber-yesterdayClassNumber);
        basicData.setTotalClassNum(basicDataMapper.totalClassNum());
        basicData.setTotalClassNum_green(todayClassNumber);
        return basicData;
    }
}
