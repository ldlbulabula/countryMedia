package com.ldl.mapper;

import com.ldl.bean.Sign;
import com.ldl.bean.VO.SignVo;
import org.apache.ibatis.annotations.Param;

public interface SignMapper {
    String selectIsSignThisDay(@Param("openId") String openId,@Param("thisDay")String thisDay);

    int insertSign(@Param("openId") String openId,@Param("thisDay")String thisDay);

    int insertSignUser(@Param("openId")String openId,@Param("maxSignNum")int maxSignNum,@Param("continueSignNum")int continueSignNum);

    Sign selectSidByOpenId(@Param("openId")String openId);

    int updateContinueSignDay(@Param("openId")String openId,@Param("continueNum")int continueNum);

    int updateMaxSignDay(@Param("openId")String openId,@Param("maxNum")int maxNum);

    SignVo selectSignVoByOpenId(@Param("openId")String openId);
}
