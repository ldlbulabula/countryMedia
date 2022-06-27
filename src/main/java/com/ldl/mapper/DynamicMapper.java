package com.ldl.mapper;

import com.ldl.bean.Comment;
import com.ldl.bean.Dynamic;
import com.ldl.bean.Rely;
import com.ldl.bean.Star;

import java.util.List;

public interface DynamicMapper {
    int insertCommentIntoDynamic(Comment comment);
    int insertStarIntoDynamic(Star star);
    int insertRelyIntoDynamic(Rely rely);

    int insertCommentIntoDynamic_admin(Comment comment);
    int insertRelyIntoDynamic_admin(Rely rely);
    List<Dynamic> getDynamics(String date);
}
