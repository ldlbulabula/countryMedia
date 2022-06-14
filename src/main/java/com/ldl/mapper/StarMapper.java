package com.ldl.mapper;

import com.ldl.bean.Star;
import org.apache.ibatis.annotations.Param;

public interface StarMapper {
    int insertStar(@Param("cid")String cid,@Param("openId")String openId);

    String selectStar(@Param("openId") String openId,@Param("cid")String cid);

    String selectLike(@Param("openId") String openId,@Param("cid")String cid);

    int insertLike(@Param("cid")String cid,@Param("openId")String openId);

    Star selectStarBy(@Param("openId") String openId,@Param("cid")String cid);

    int updateStar(Star star);

    int updateLike(@Param("openId") String openId,@Param("cid")String cid,@Param("isLike") String isLike);
}
