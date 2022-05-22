package com.ldl.mapper;

import com.ldl.bean.Comment;
import com.ldl.bean.VO.CommentVo;


import java.util.List;

public interface CommentMapper {

    int insertComment(Comment comment);

    List<CommentVo> getCommentVoByVid(int vid);
}
