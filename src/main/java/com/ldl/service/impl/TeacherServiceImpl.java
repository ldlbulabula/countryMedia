package com.ldl.service.impl;

import com.ldl.Util.MyUtil;
import com.ldl.bean.TeacherAuthentication;
import com.ldl.bean.VO.classVo2;
import com.ldl.mapper.TeacherMapper;
import com.ldl.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public List<classVo2> getMyAllClass(String openid) {
        return teacherMapper.getMyAllClass(openid);
    }

    @Override
    public List<classVo2> getMy2Class(String openId) {
        return teacherMapper.getMy2Class(openId);
    }

    @Override
    public List<classVo2> searchMyClass(String openId, String regex) {
        return teacherMapper.searchMyClass(openId, MyUtil.getRegex(regex));
    }

    @Override
    public TeacherAuthentication authentication(TeacherAuthentication teacherAuthentication) {
        teacherMapper.addAuthentication(teacherAuthentication);
        return teacherAuthentication;
    }

    @Override
    public TeacherAuthentication checkAuthentication(String aid) {
        return teacherMapper.checkAuthentication(aid);
    }
}
