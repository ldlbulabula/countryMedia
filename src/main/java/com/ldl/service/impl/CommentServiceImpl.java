package com.ldl.service.impl;

import com.ldl.bean.Comment;
import com.ldl.bean.Rely;
import com.ldl.bean.VO.CommentVo;
import com.ldl.mapper.CommentMapper;
import com.ldl.mapper.RelyMapper;
import com.ldl.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentMapper commentMapper;

    @Autowired
    private RelyMapper relyMapper;

    @Autowired
    SimpleDateFormat simpleDateFormat;
    /**
     * 获取评论
     * @Author hjh
     * @return 2022/5/10
     */
    @Override
    public List<CommentVo> queryCommentVo(int vid) {
        List<CommentVo> commentVoByVid = commentMapper.getCommentVoByVid(vid);
        System.out.println(commentVoByVid);
        return commentMapper.getCommentVoByVid(vid);
    }

    @Override
    public int addComment(int uid, int vid, String content) {
        Comment comment = new Comment(uid,vid,simpleDateFormat.format(new Date()),content);
        return commentMapper.insertComment(comment);
    }

    @Override
    public int addRely(int uid, int cid, String content) {
        return relyMapper.insertRely(new Rely(uid,cid,simpleDateFormat.format(new Date()),content));
    }
}
