package com.ldl.service.impl;

import com.ldl.bean.FeedBack;
import com.ldl.bean.VO.FeedBackVO;
import com.ldl.mapper.FeedBackMapper;
import com.ldl.service.FeedBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class FeedBackServiceImpl implements FeedBackService {
    @Autowired
    private FeedBackMapper feedBackMapper;

    @Autowired
    @Qualifier("with_Hms")
    SimpleDateFormat simpleDateFormat;

    @Override
    public void addFeedBack(String openId,String content){
        FeedBack feedBack = new FeedBack(openId, content, simpleDateFormat.format(new Date()), "0");
        feedBackMapper.insertFeedBack(feedBack);
    }

    @Override
    public List<FeedBackVO> selectAllFeedBack() {
        return feedBackMapper.selectAllFeedBack();
    }

    @Override
    public FeedBackVO selectFeedBackByFid(String fid) {
        feedBackMapper.updateIsLookCondition(fid);
        return feedBackMapper.selectFeedBackByFid(fid);
    }


}
