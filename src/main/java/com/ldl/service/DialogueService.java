package com.ldl.service;

import com.ldl.bean.DialogueMenuVo;
import com.ldl.bean.VO.DialogueVo;

import java.util.List;

public interface DialogueService {
    List<DialogueVo> getDialogueVOsByOpenIdAndToOpenId(String openId,String toOpenId);

    int insertDialogue(String openId,String toOpenId,String content,String type);

    List<DialogueMenuVo> getDialogueMenu(String toOpenId);
}
