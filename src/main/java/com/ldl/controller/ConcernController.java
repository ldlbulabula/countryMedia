package com.ldl.controller;

import com.ldl.bean.User;
import com.ldl.service.UserService;
import com.ldl.service.VideoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.List;

@Controller
@RequestMapping("/concern")
public class ConcernController {

    @Autowired
    VideoService videoService;
    @Autowired
    @Qualifier("with_Hms")
    SimpleDateFormat simpleDateFormat;

    @Autowired
    private UserService userService;

    @ApiOperation("添加关注的接口")
    @PostMapping("/addConcern")
    @ResponseBody
    public int addConcern(String openid,String bopenid) {
        return videoService.addConcern(openid, bopenid);
    }

    @ApiOperation("取消关注")
    @PostMapping("/deleteConcern")
    @ResponseBody
    public int deleteConcern(String openid,String bopenid) {
        return videoService.removerConcern(openid, bopenid);
    }

    @ApiOperation("获取关注列表的接口")
    @PostMapping("/getMyConcerns")
    @ResponseBody
    public List<User> getConcern(String openId){
        return userService.getConcernUserByOpenId(openId);
    }
}
