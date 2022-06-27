package com.ldl.controller;


import com.ldl.bean.RelyMessage;
import com.ldl.bean.RelyMessage_admin;
import com.ldl.bean.VO.CommentVo;
import com.ldl.service.CommentService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller()
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    private CommentService commentService;

    /**
     * 评论接口
     * @Author hjh
     * @return 2022/5/10
     */

    /**
     * 评论接口
     * @Author ldl
     * @return 2022/5/22 进行更改
     */
    @ApiOperation("获取评论接口")
    @PostMapping("/getComment")
    @ResponseBody
    public List<CommentVo> getComment(String class_id){
        return commentService.queryCommentVo(class_id);
    }

    @ApiOperation("/发表评论接口")
    @PostMapping("/addComment")
    @ResponseBody
    public Integer addComment(String openid,String class_id,String content) {
        return commentService.addComment(openid, class_id, content);
    }

    @ApiOperation("/回复接口")
    @PostMapping("/rely")
    @ResponseBody
    public Integer addRely (String openid,String cid, String content){
        return commentService.addRely(openid, cid, content);
    }







    @ApiOperation("获取评论接口（管理员课程）")
    @PostMapping("/getComment_admin")
    @ResponseBody
    public List<CommentVo> getComment_admin(String class_id){
        return commentService.queryCommentVo_admin(class_id);
    }

    @ApiOperation("/发表评论接口（管理员课程）")
    @PostMapping("/addComment_admin")
    @ResponseBody
    public Integer addComment_admin(String openid,String class_id,String content) {
        return commentService.addComment_admin(openid, class_id, content);
    }

    @ApiOperation("/回复接口（管理员课程）")
    @PostMapping("/rely_admin")
    @ResponseBody
    public Integer addRely_admin (String openid,String cid, String content){
        return commentService.addRely_admin(openid, cid, content);
    }


    @ApiOperation("/获取回复信息")
    @PostMapping("/getRelyMessage")
    @ResponseBody
    public List<RelyMessage> getRelyMessage (String openid){
        return commentService.getRelyMessage(openid);
    }

    @ApiOperation("/获取回复信息(管理员)")
    @PostMapping("/getRelyMessage_admin")
    @ResponseBody
    public List<RelyMessage_admin> getRelyMessage_admin (String openid){
        return commentService.getRelyMessage_admin(openid);
    }
}
