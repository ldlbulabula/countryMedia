package com.ldl.controller;

import com.ldl.bean.AdminPublic;
import com.ldl.bean.DialogueMenuVo;
import com.ldl.bean.VO.DialogueVo;
import com.ldl.service.AdminService;
import com.ldl.service.DialogueService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/dialogue")
public class DialogueController {
    @Autowired
    private DialogueService dialogueService;

    @Autowired
    private AdminService adminService;

    @ApiOperation("获取两人对话")
    @ResponseBody
    @PostMapping(value = "/getAlldialogue")
    public List<DialogueVo>  getAllDialogue(String openId,String toOpenId){
        return dialogueService.getDialogueVOsByOpenIdAndToOpenId(openId, toOpenId);
    }

    @ApiOperation("获取首页一系列的新信息列表")
    @ResponseBody
    @PostMapping(value = "/getDialogueMenu")
    public List<DialogueMenuVo> getDialogueMenuVos(String openId){
        return dialogueService.getDialogueMenu(openId);
    }

    @ApiOperation("进行对话")
    @ResponseBody
    @PostMapping(value = "/addDia")
    public int getDialogueMenuVos(String openId,String toOpenId,String type,String content){
        return dialogueService.insertDialogue(openId,toOpenId,content,type);
    }

    @ApiOperation("直接获取全部的系统消息")
    @ResponseBody
    @PostMapping(value = "/getAllPublic")
    public List<AdminPublic> getAllPublic(){
        return adminService.getAllAdminPublic();
    }

}
