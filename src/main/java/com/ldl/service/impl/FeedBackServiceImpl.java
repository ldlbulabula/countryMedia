package com.ldl.service.impl;

import com.ldl.bean.FeedBack;
import com.ldl.mapper.FeedBackMapper;
import com.ldl.service.FeedBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class FeedBackServiceImpl implements FeedBackService {
    @Autowired
    private FeedBackMapper feedBackMapper;

    @Autowired
    private SimpleDateFormat simpleDateFormat;

    @Override
    public void addFeedBack(String openId,String content){
        FeedBack feedBack = new FeedBack(openId, content, simpleDateFormat.format(new Date()), "1");
        feedBackMapper.insertFeedBack(feedBack);
    }
}
