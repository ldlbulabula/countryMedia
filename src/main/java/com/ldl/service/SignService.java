package com.ldl.service;

import com.ldl.bean.VO.SignVo;

public interface SignService {
    //今天签到
    void signThisDay(String openId);

    //今天是否签到了
    SignVo isSignThisDay(String openId);

}
