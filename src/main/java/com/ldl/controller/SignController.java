package com.ldl.controller;

import com.ldl.mapper.SignMapper;
import com.ldl.service.SignService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sign")
public class SignController {

    @Autowired
    private SignService signService;

    @ApiOperation("判断今日有无打卡")
    @PostMapping("isSign")
    @ResponseBody
    public Object getIsSign(String openId){
        return signService.isSignThisDay(openId);
    }

    @ApiOperation("打卡")
    @PostMapping("/signThisDay")
    @ResponseBody
    public void signThisDay(String openId){
        signService.signThisDay(openId);
    }
}
