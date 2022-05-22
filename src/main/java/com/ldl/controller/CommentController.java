package com.ldl.controller;


import com.ldl.bean.VO.CommentVo;
import com.ldl.service.CommentService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    @ApiOperation("获取评论接口")
    @GetMapping("/")
    @ResponseBody
    public List<CommentVo> getComment(int vid){
        return commentService.queryCommentVo(vid);
    }


    @ApiOperation("/评论得接口")
    @PutMapping("/")
    @ResponseBody
    public int addComment(int uid,int vid,String content) {
        return commentService.addComment(uid, vid, content);
    }

        @ApiOperation("/回复得接口")
        @PutMapping("/rely")
        @ResponseBody
        public int addRely ( int uid, int cid, String content){
            return commentService.addRely(uid, cid, content);
        }
}
