package com.ldl.service;

import com.ldl.bean.VO.CommentVo;


import java.util.List;


public interface CommentService {
    List<CommentVo> queryCommentVo(int vid);

    int addComment(int uid,int vid,String content);

    int addRely(int uid,int cid,String content);
}
