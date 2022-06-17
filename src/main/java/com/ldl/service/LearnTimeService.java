package com.ldl.service;

import com.ldl.bean.VO.LearnTimeVO;

public interface LearnTimeService {
    //今天签到
    void learnThisDay(String openId);

    //今天是否签到了
    LearnTimeVO isLearnThisDay(String openId);
}
