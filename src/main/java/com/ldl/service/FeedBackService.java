package com.ldl.service;

import com.ldl.bean.VO.FeedBackVO;

import java.util.List;

public interface FeedBackService {
    void addFeedBack(String openId,String content);

    List<FeedBackVO> selectAllFeedBack();

    FeedBackVO selectFeedBackByFid(String fid);
}
