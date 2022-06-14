package com.ldl.service;

import com.ldl.bean.VO.CommentVo;


import java.util.List;


public interface CommentService {
    List<CommentVo> queryCommentVo(String class_id);

    Integer addComment(String openId,String class_id,String content);

    Integer addRely(String openId,String cid,String content);
}
