package com.ldl.service.impl;

import com.ldl.bean.Dialogue;
import com.ldl.bean.DialogueMenuVo;
import com.ldl.bean.VO.DialogueVo;
import com.ldl.mapper.DialogueMapper;
import com.ldl.service.DialogueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class DialogueServiceImpl implements DialogueService {
    @Autowired
    private DialogueMapper dialogueMapper;

    @Autowired
    @Qualifier("with_Hms")
    SimpleDateFormat simpleDateFormat;

    @Override
    public List<DialogueVo> getDialogueVOsByOpenIdAndToOpenId(String openId, String toOpenId) {
        dialogueMapper.updateDialogueIsLookByOpenIdAndToOpenId(openId, toOpenId);
        return dialogueMapper.selectAllDialogueByOpenId(openId, toOpenId);
    }

    @Override
    public int insertDialogue(String openId, String toOpenId, String content, String type) {
        Dialogue dialogue = new Dialogue(content, simpleDateFormat.format(new Date()), openId, toOpenId, "0", type);
        return dialogueMapper.insertDialogue(dialogue);
    }

    @Override
    public List<DialogueMenuVo> getDialogueMenu(String toOpenId) {
        return dialogueMapper.selectDialogueVo(toOpenId);
    }
}
