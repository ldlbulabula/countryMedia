package com.ldl.controller;


import com.ldl.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class VideoController {
    @Autowired
    VideoService videoService;

//    @ApiOperation("上传视频")
//    @ResponseBody
//    @PostMapping(value = "/uploadVideo",produces = "application/json;charset=UTF-8")
//    public User login(String code, String faceImg, String nickName) throws IOException {
//        String openId = WxOpenIdUtil.getOpenId(code);
//        LoginResult loginResult = new ObjectMapper().readValue(openId, LoginResult.class);
//        openId= loginResult.getOpenid();
//        User login = userService.login(new User(null, openId, faceImg, nickName));
//        return  login;
//    }
}
