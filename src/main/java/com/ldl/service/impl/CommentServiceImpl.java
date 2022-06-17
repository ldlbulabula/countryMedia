package com.ldl.service.impl;

import com.ldl.bean.Comment;
import com.ldl.bean.Rely;
import com.ldl.bean.VO.CommentVo;
import com.ldl.mapper.CommentMapper;
import com.ldl.mapper.RelyMapper;
import com.ldl.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
    @Qualifier("with_Hms")
    SimpleDateFormat simpleDateFormat;
    /**
     * 获取评论
     * @Author hjh
     * @return 2022/5/10
     */
    @Override
    public List<CommentVo> queryCommentVo(String class_id) {
        return commentMapper.getCommentVoByClass_id(class_id);
    }

    @Override
    public Integer addComment(String openid, String class_id, String content) {

        Comment comment = new Comment(openid,Integer.parseInt(class_id),simpleDateFormat.format(new Date()),content);
        return commentMapper.insertComment(comment);
    }

    @Override
    public Integer addRely(String openid, String cid, String content) {
        return relyMapper.insertRely(new Rely(openid,Integer.parseInt(cid),simpleDateFormat.format(new Date()),content));
    }
}
