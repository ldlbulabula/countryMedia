package com.ldl.controller;

import com.ldl.Util.DateUtil;
import com.ldl.Util.ObsUtil;
import com.ldl.bean.TeacherAuthentication;
import com.ldl.bean.VO.classVo2;
import com.ldl.service.TeacherService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @ApiOperation("获取我发布的课程（全部）")
    @ResponseBody
    @PostMapping(value = "/getMyAllClass")
    public List<classVo2> getMyAllClass(String openId){
        return  teacherService.getMyAllClass(openId);
    }


    @ApiOperation("获取我发布的课程（两条）")
    @ResponseBody
    @PostMapping(value = "/getMy2Class")
    public List<classVo2> getMy2Class(String openId){
        return  teacherService.getMy2Class(openId);
    }

    @ApiOperation("搜索课程")
    @ResponseBody
    @PostMapping(value = "/searchMyClass")
    public List<classVo2> searchMyClass(String openId,String regex){
        return teacherService.searchMyClass(openId,regex);
    }


    @ApiOperation("教师认证")
    @ResponseBody
    @PostMapping(value = "/authentication")
    public TeacherAuthentication  authentication(String openId,String realName,String identity_card_1, String identity_card_2){
        return teacherService.authentication(new TeacherAuthentication(
                null,identity_card_1,identity_card_2,openId,realName, DateUtil.formatToDay(new Date()),0,0
        ));
    }

    @ApiOperation("查看提交后的教师认证")
    @ResponseBody
    @PostMapping(value = "/checkAuthentication")
    public TeacherAuthentication checkAuthentication(String aid){
        return teacherService.checkAuthentication(aid);
    }

    @ApiOperation("身份证上传")
    @ResponseBody
    @PostMapping(value = "/identityCardUpload")
    public String identityCardUpload(MultipartFile identityCard){
        return ObsUtil.uploadFile(identityCard);
    }

//    @ApiOperation("查看教师认证情况")
//    @ResponseBody
//    @PostMapping(value = "/checkAuthentication")
//    public String checkAuthentication(String openid){
//        return teacherService.checkAuthentication(openid);
//    }
}
