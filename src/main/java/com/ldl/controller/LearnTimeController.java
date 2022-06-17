package com.ldl.controller;

import com.ldl.service.LearnTimeService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/learnTime")
public class LearnTimeController {
    @Autowired
    private LearnTimeService learnTimeService;
    @ApiOperation("判断今日有无学习")
    @PostMapping("/isLearn")
    @ResponseBody
    public Object getIsLearn(String openId){
        return learnTimeService.isLearnThisDay(openId);
    }

    @ApiOperation("今日学习")
    @PostMapping("/learnThisDay")
    @ResponseBody
    public void signThisDay(String openId){
        learnTimeService.learnThisDay(openId);
    }
}
