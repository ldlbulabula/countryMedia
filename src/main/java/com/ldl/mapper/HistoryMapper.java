package com.ldl.mapper;

import org.apache.ibatis.annotations.Param;

public interface HistoryMapper {
    int insertHistory(@Param("openid")String openid,@Param("cid")String cid,@Param("lookTime")String lookTime);

    int updateHistory(@Param("hid")String hid,@Param("lookTime")String lookTime);

    String selectHistory(@Param("cid")String cid,@Param("openid")String openid);
}
