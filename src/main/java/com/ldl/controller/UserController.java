package com.ldl.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ldl.Util.LoginResult;
import com.ldl.Util.WxOpenIdUtil;
import com.ldl.bean.User;
import com.ldl.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.List;


@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    ObjectMapper objectMapper;

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
        return userService.login(new User(null, openId, faceImg, nickName));
     }
    @ApiOperation("获取全部用户")
    @ResponseBody
    @PostMapping(value = "/getAllUsers",produces = "application/json;charset=UTF-8")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

}
