package com.ldl.mapper;

import com.ldl.bean.Comment;
import com.ldl.bean.RelyMessage;
import com.ldl.bean.RelyMessage_admin;
import com.ldl.bean.User;
import com.ldl.bean.VO.CommentVo;


import java.util.List;

public interface CommentMapper {

    Integer insertComment(Comment comment);

    List<CommentVo> getCommentVoByClass_id(String class_id);

    int getClassIdByCommentID(int commentID);
    int getAdminClassIdByCommentID(int commentID);

    Integer insertComment_admin(Comment comment);

    List<CommentVo> getCommentVoByAdminClass_id(String adminClass_id);

    List<RelyMessage> getRelyMessage(String openid);
    String getContentByCid(String cid);
    String getContentByCid_admin(String cid);

    List<RelyMessage_admin> getRelyMessage_admin(String openid);
}
