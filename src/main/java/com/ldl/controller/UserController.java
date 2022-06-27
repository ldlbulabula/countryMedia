package com.ldl.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ldl.Util.LoginResult;
import com.ldl.Util.WxOpenIdUtil;
import com.ldl.bean.User;
import com.ldl.bean.VO.AllNum;
import com.ldl.bean.VO.PreviousAdminClass;
import com.ldl.bean.VO.UserVo;
import com.ldl.service.FeedBackService;
import com.ldl.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    ObjectMapper objectMapper;
    @Autowired
    @Qualifier("with_Hms")
    SimpleDateFormat simpleDateFormat;

    @Autowired
    private FeedBackService feedBackService;
    @ApiOperation("登录接口")
    @ResponseBody
    @PostMapping(value = "/login",produces = "application/json;charset=UTF-8")
    public User login(String code,String faceImg, String nickName) throws IOException {
        /*
          现在得到的名为openid的字符串，其实是一个包含session_key、openid的JSON对象
          要把JSON对象转成实体类对象（LoginResult），再通过属性名获取真正的openid
        */
        String openId = WxOpenIdUtil.getOpenId(code);
        LoginResult loginResult = objectMapper.readValue(openId, LoginResult.class);
        openId = loginResult.getOpenid();
        return userService.login(new User(null, openId, faceImg, nickName,simpleDateFormat.format(new Date())));
     }
    @ApiOperation("获取全部用户")
    @ResponseBody
    @PostMapping(value = "/getAllUsers",produces = "application/json;charset=UTF-8")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @ApiOperation("获取我关注了的用户")
    @ResponseBody
    @PostMapping("/getConernUsers")
    public List<User> getAllConernUser(String openId){
        return userService.getConcernUserByOpenId(openId);
    }


    @ApiOperation("获取我的粉丝，也就是关注了我的用户")
    @ResponseBody
    @PostMapping("/getConernMe")
    public List<User> getAllConernMeUser(String openId){
        return userService.getToConcernUserByOpenId(openId);
    }

    @ApiOperation("用户进行反馈")
    @ResponseBody
    @PostMapping("/feedback")
    public void getAllConernUser(String openId,String content){
        //能上传图文？ 提供上传图文
        feedBackService.addFeedBack(openId, content);
    }

    @ApiOperation("获取收藏数量，关注数量，发布数量")
    @ResponseBody
    @PostMapping("/getSignNum")
    public AllNum getAllNum(String openId){
        return userService.getNum(openId);
    }

    @ApiOperation("获取个人信息")
    @ResponseBody
    @PostMapping("/UserMessage")
    public UserVo getUserMessage(String openId){
        return userService.getUserVoByOpenId(openId);
    }

    @ApiOperation("修改个人信息")
    @ResponseBody
    @PostMapping("/updateUserMessage")
    public int updateUser(String openid,String field,String value){
        return userService.modifyUser(openid,field,value);
    }


    @ApiOperation("登录接口")
    @ResponseBody
    @PostMapping(value = "/updateFaceImgAndNickName",produces = "application/json;charset=UTF-8")
    public int updateFaceImgAndNickName(String openid,String faceImg, String nickName){

        return userService.updateFaceImgAndNickName(openid,faceImg,nickName);
    }

    @ApiOperation("完成普法学习，用户第一次完成时返回1，否则为0")
    @ResponseBody
    @PostMapping(value = "/completeAdminClass")
    public int completeAdminClass(String openid,int adminClass_id){
        return userService.completeAdminClass(openid,adminClass_id);
    }

    @ApiOperation("判断用户是否完成普法学习，完成则返回openid,未完成则返回NotComplete")
    @ResponseBody
    @PostMapping(value = "/getCompleteAdminClassCondition")
    public String getCompleteAdminClassCondition(String openid,int adminClass_id){
        return userService.getCompleteAdminClassCondition(openid,adminClass_id);
    }

    @ApiOperation("查看往期普法学习,isComplete为空表示未完成课程。完成则显示当前用户的openid")
    @ResponseBody
    @PostMapping(value = "/getPreviousAdminClass")
    public List<PreviousAdminClass> getPreviousAdminClass(String openid){
        return userService.getPreviousAdminClass(openid);
    }

}
