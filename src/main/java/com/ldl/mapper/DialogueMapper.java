package com.ldl.mapper;

import com.ldl.bean.Dialogue;
import com.ldl.bean.DialogueMenuVo;
import com.ldl.bean.VO.DialogueVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DialogueMapper {
    int insertDialogue(Dialogue dialogue);

    List<DialogueVo> selectAllDialogueByOpenId(@Param("openId")String openId,@Param("toOpenId")String toOpenId);

    int updateDialogueIsLookByOpenIdAndToOpenId(@Param("openId")String openId,@Param("toOpenId")String toOpenId);

    int selectDialogueNumByToOpenId(@Param("toOpenId")String openId);

    List<DialogueMenuVo> selectDialogueVo(@Param("toOpenId")String toOpenId);
}
