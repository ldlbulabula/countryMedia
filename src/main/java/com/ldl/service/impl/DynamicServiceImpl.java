package com.ldl.service.impl;

import com.ldl.bean.Dynamic;
import com.ldl.mapper.DynamicMapper;
import com.ldl.service.DynamicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class DynamicServiceImpl implements DynamicService {
    @Autowired
    @Qualifier("without_Hms")
    SimpleDateFormat simpleDateFormat;

    @Autowired
    private DynamicMapper dynamicMapper;
    @Override
    public List<Dynamic> getDynamics() {
        return dynamicMapper.getDynamics("%"+simpleDateFormat.format(new Date())+"%");
    }
}
