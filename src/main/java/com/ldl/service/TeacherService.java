package com.ldl.service;

import com.ldl.bean.TeacherAuthentication;
import com.ldl.bean.VO.classVo2;

import java.util.List;

public interface TeacherService {
    List<classVo2> getMyAllClass(String openid);

    List<classVo2> getMy2Class(String openId);

    List<classVo2> searchMyClass(String openId, String regex);

    TeacherAuthentication authentication(TeacherAuthentication authentication);

    TeacherAuthentication checkAuthentication(String aid);
}
