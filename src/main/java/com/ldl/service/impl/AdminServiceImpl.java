package com.ldl.service.impl;

import com.ldl.Util.DateUtil;
import com.ldl.bean.AdminPublic;
import com.ldl.bean.BasicData_User;
import com.ldl.bean.TeacherAuthentication;
import com.ldl.bean.User;
import com.ldl.bean.VO.TeacherAuthenticationVO;
import com.ldl.bean.VO.classVo2;
import com.ldl.mapper.ClassMapper;
import com.ldl.mapper.PublicMapper;
import com.ldl.mapper.TeacherMapper;
import com.ldl.mapper.UserMapper;
import com.ldl.service.AdminService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private PublicMapper publicMapper;
    @Autowired
    private ClassMapper classMapper;
    @Autowired
    private TeacherMapper teacherMapper;
    @Autowired
    private UserMapper userMapper;

    @Autowired
    @Qualifier("with_Hms")
    SimpleDateFormat simpleDateFormat;

    @Override
    public void addPublic(String content,String title) {
        publicMapper.insertPublic(new AdminPublic(title,simpleDateFormat.format(new Date()),content));
    }

    @Override
    public List<AdminPublic> getAllAdminPublic() {
        return publicMapper.selectAllAdminPublic();
    }

    @Override
    public List<classVo2> getNotCheckClass() {
        return classMapper.getNotCheckClass();
    }

    @Override
    public int checkClass(int isCheck,int class_id) {
        return classMapper.checkClass(isCheck,class_id,simpleDateFormat.format(new Date()));
    }

    @Override
    public List<classVo2> getCheckedClass() {
        return classMapper.getCheckedClass();
    }

    @Override
    public String getClassCheckCondition(int class_id) {
        return classMapper.getClassCheckCondition(class_id);
    }

    @Override
    public int checkTeacher(int isPass, int aid) {
        teacherMapper.updateIsRead(aid);
        if(isPass==1){
            userMapper.updateRoleAsTeacher(aid);
        }
        return teacherMapper.checkTeacher(isPass,aid);
    }

    @Override
    public TeacherAuthentication getCheckTeacherByAid(int aid) {

        return teacherMapper.getCheckTeacherByAid(aid);
    }

    @Override
    public List<TeacherAuthenticationVO> getAllCheckTeacher() {
        return teacherMapper.getAllCheckTeacher();
    }

    @Override
    public BasicData_User getBasicData_User() {
        int todayCount = userMapper.getNewUserCountOfDay(DateUtil.formatToDay(new Date()));
        int yesterdayCount = userMapper.getNewUserCountOfDay(DateUtil.formatToDayAndSupOneDay(new Date(), -1));
        int totalCountOfUser = userMapper.getTotalCountOfUser();
        return new BasicData_User(todayCount,todayCount-yesterdayCount,totalCountOfUser,todayCount);
    }

    @Override
    public List<User> selectCompleteUser(int adminClass_id) {
        return userMapper.selectCompleteUser(adminClass_id);
    }
}
