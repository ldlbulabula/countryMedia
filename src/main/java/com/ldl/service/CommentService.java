package com.ldl.service;

import com.ldl.bean.RelyMessage;
import com.ldl.bean.RelyMessage_admin;
import com.ldl.bean.VO.CommentVo;


import java.util.List;


public interface CommentService {
    List<CommentVo> queryCommentVo(String class_id);

    Integer addComment(String openId,String class_id,String content);

    Integer addRely(String openId,String cid,String content);


    List<CommentVo> queryCommentVo_admin(String adminClass_id);

    Integer addComment_admin(String openId,String adminClass_id,String content);

    Integer addRely_admin(String openId,String adminClass_id,String content);

    List<RelyMessage> getRelyMessage(String openid);

    List<RelyMessage_admin> getRelyMessage_admin(String openid);
}
