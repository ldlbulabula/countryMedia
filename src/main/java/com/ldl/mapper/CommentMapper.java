package com.ldl.mapper;

import com.ldl.bean.Comment;
import com.ldl.bean.VO.CommentVo;


import java.util.List;

public interface CommentMapper {

    Integer insertComment(Comment comment);

    List<CommentVo> getCommentVoByClass_id(String class_id);
}
