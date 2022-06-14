package com.ldl.bean.VO;

import java.util.List;

public class ClassVo {
    List<ClassIdVo> classIdVoComment;
    List<ClassIdVo> classIdVo;

    public ClassVo(List<ClassIdVo> classIdVoComment, List<ClassIdVo> classIdVo) {
        this.classIdVoComment = classIdVoComment;
        this.classIdVo = classIdVo;
    }

    public ClassVo() {
    }

    public List<ClassIdVo> getClassIdVoComment() {
        return classIdVoComment;
    }

    public void setClassIdVoComment(List<ClassIdVo> classIdVoComment) {
        this.classIdVoComment = classIdVoComment;
    }

    public List<ClassIdVo> getClassIdVo() {
        return classIdVo;
    }

    public void setClassIdVo(List<ClassIdVo> classIdVo) {
        this.classIdVo = classIdVo;
    }
}
