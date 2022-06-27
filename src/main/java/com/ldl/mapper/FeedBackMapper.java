package com.ldl.mapper;

import com.ldl.bean.FeedBack;
import com.ldl.bean.VO.FeedBackVO;

import java.util.List;


public interface FeedBackMapper {
    int insertFeedBack(FeedBack feedBack);
    List<FeedBackVO> selectAllFeedBack();
    FeedBackVO selectFeedBackByFid(String fid);

    void updateIsLookCondition(String fid);
}
