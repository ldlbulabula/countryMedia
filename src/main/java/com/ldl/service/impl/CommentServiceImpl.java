package com.ldl.service.impl;

import com.ldl.bean.Comment;
import com.ldl.bean.Rely;
import com.ldl.bean.RelyMessage;
import com.ldl.bean.RelyMessage_admin;
import com.ldl.bean.VO.CommentVo;
import com.ldl.mapper.CommentMapper;
import com.ldl.mapper.DynamicMapper;
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

    @Autowired
    private DynamicMapper dynamicMapper;
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
        dynamicMapper.insertCommentIntoDynamic(comment);
        return commentMapper.insertComment(comment);
    }

    @Override
    public Integer addRely(String openid, String cid, String content) {
        Date date = new Date();
        Rely rely =new Rely(openid, Integer.parseInt(cid), simpleDateFormat.format(date), content);
        Rely temp= new Rely(openid, Integer.parseInt(cid), simpleDateFormat.format(date), content);
        int classId = commentMapper.getClassIdByCommentID(rely.getCid());
        rely.setCid(classId);
        dynamicMapper.insertRelyIntoDynamic(rely);
        return relyMapper.insertRely(temp);
    }

    @Override
    public List<CommentVo> queryCommentVo_admin(String adminClass_id) {
        return commentMapper.getCommentVoByAdminClass_id(adminClass_id);
    }

    @Override
    public Integer addComment_admin(String openId, String adminClass_id, String content) {
         Comment comment = new Comment(openId,Integer.parseInt(adminClass_id),simpleDateFormat.format(new Date()),content);
         dynamicMapper.insertCommentIntoDynamic_admin(comment);
        return commentMapper.insertComment_admin(comment);
    }

    @Override
    public Integer addRely_admin(String openId, String cid, String content) {


        Date date = new Date();
        Rely rely = new Rely(openId, Integer.parseInt(cid), simpleDateFormat.format(date), content);
        Rely temp = new Rely(openId, Integer.parseInt(cid), simpleDateFormat.format(date), content);
        int classId = commentMapper.getAdminClassIdByCommentID(rely.getCid());
        rely.setCid(classId);
        dynamicMapper.insertRelyIntoDynamic_admin(rely);
        return relyMapper.insertRely_admin(temp);
    }

    @Override
    public List<RelyMessage> getRelyMessage(String openid) {
        return commentMapper.getRelyMessage(openid);
    }

    @Override
    public List<RelyMessage_admin> getRelyMessage_admin(String openid) {
        return commentMapper.getRelyMessage_admin(openid);
    }
}
