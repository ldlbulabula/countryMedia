package com.ldl.service;

import com.ldl.bean.AdminPublic;
import com.ldl.bean.BasicData_User;
import com.ldl.bean.TeacherAuthentication;
import com.ldl.bean.User;
import com.ldl.bean.VO.TeacherAuthenticationVO;
import com.ldl.bean.VO.classVo2;

import java.util.List;

public interface AdminService {
    void addPublic(String content,String title);

    List<AdminPublic> getAllAdminPublic();

    List<classVo2> getNotCheckClass();

    int checkClass(int isCheck,int class_id);

    List<classVo2> getCheckedClass();

    String getClassCheckCondition(int class_id);

    int checkTeacher(int isPass, int aid);

    TeacherAuthentication getCheckTeacherByAid(int aid);

    List<TeacherAuthenticationVO> getAllCheckTeacher();

    BasicData_User getBasicData_User();

    List<User> selectCompleteUser(int adminClass_id);
}
