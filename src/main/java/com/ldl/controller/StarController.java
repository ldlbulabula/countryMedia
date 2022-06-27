package com.ldl.controller;

import com.ldl.service.StarService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/star")
public class StarController {

    @Autowired
    private StarService starService;

    @ApiOperation("修改收藏的接口cid是课程的id")
    @ResponseBody
    @PostMapping(value = "/updateStar")
    public void updateStar(String openId,String cid){
        starService.updateStar(openId, cid);
    }


}
