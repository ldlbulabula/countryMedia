package com.ldl.controller;

import com.ldl.Util.WxOpenIdUtil;
import com.ldl.bean.User;
import com.ldl.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


@Controller
public class UserController {
    @Autowired
    UserService userService;

    @ApiOperation("登录接口")
    @ResponseBody
    @PostMapping(value = "/login",produces = "application/json;charset=UTF-8")
    public User login(String code,String faceImg, String nickName){
//        String openId = WxOpenIdUtil.getOpenId(code);
//        System.out.println(openId);
//        return openId;
        String openId = WxOpenIdUtil.getOpenId(code);
        return  userService.login(new User(openId,faceImg,nickName));
     }

    @ApiOperation("测试接口")
    @ResponseBody
    @PostMapping(value = "/test",produces = "application/json;charset=UTF-8")
    public List<String> login(String faceImg, String nickName){
        ArrayList<String> list = new ArrayList<>();
        list.add(faceImg);
        list.add(nickName);
        System.out.println(list);
        return list;
    }
}
