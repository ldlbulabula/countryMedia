package com.ldl.mapper;

import com.ldl.bean.LearnTime;

import com.ldl.bean.VO.LearnTimeVO;
import org.apache.ibatis.annotations.Param;

public interface LearnTimeMapper {
    String selectIsLearnThisDay(@Param("openId") String openId, @Param("thisDay")String thisDay);

    int insertLearn(@Param("openId") String openId,@Param("thisDay")String thisDay);

    int insertLearnUser(@Param("openId")String openId,@Param("maxLearnNum")int maxLearnNum,@Param("continueLearnNum")int continueLearnNum);

    LearnTime selectLidByOpenId(@Param("openId")String openId);

    int updateContinueLearnDay(@Param("openId")String openId,@Param("continueNum")int continueNum);

    int updateMaxLearnDay(@Param("openId")String openId,@Param("maxNum")int maxNum);

    LearnTimeVO selectLearnVoByOpenId(@Param("openId")String openId);
}
