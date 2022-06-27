package com.ldl.controller;

import com.ldl.bean.BasicData_User;
import com.ldl.bean.TeacherAuthentication;
import com.ldl.bean.VO.TeacherAuthenticationVO;
import com.ldl.bean.VO.classVo2;
import com.ldl.service.AdminService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/check")
public class CheckController {
    @Autowired
    private AdminService adminService;

    @PostMapping("/getNotCheckClass")
    @ApiOperation("获取未审核的课程")
    @ResponseBody
    public List<classVo2> getNotCheckClass(){
        return adminService.getNotCheckClass();
    }

    @PostMapping("/getCheckedClass")
    @ApiOperation("获取已审核的课程")
    @ResponseBody
    public List<classVo2> getCheckedClass(){
        return adminService.getCheckedClass();
    }


    @PostMapping("/CheckClass")
    @ApiOperation("审核课程,1为通过,-1为不通过")
    @ResponseBody
    public int checkClass(int isCheck,int class_id){
        return adminService.checkClass(isCheck,class_id);
    }

    @PostMapping("/getClassCheckCondition")
    @ApiOperation("获取当前课程的审核状态,1为通过,-1为不通过")
    @ResponseBody
    public String getClassCheckCondition(int class_id){
        return adminService.getClassCheckCondition(class_id);
    }





    @PostMapping("/CheckTeacher")
    @ApiOperation("教师认证,1为通过,-1为不通过")
    @ResponseBody
    public void CheckTeacher(int isPass,int aid){
         adminService.checkTeacher(isPass,aid);
    }

    @PostMapping("/getCheckTeacherByAid")
    @ApiOperation("获取当前教师认证的信息")
    @ResponseBody
    public TeacherAuthentication getCheckTeacherByAid(int aid){
        return adminService.getCheckTeacherByAid(aid);
    }

    @PostMapping("/getAllCheckTeacher")
    @ApiOperation("获取所有教师认证的信息")
    @ResponseBody
    public List<TeacherAuthenticationVO> getAllCheckTeacher(){
        return adminService.getAllCheckTeacher();
    }

    @PostMapping("/BasicDateOfUser")
    @ApiOperation("获取基础数据（用户数量）")
    @ResponseBody
    public BasicData_User getBasicData_User(){
        return adminService.getBasicData_User();
    }
}
