package com.ldl.bean.VO;

import java.util.List;

public class StudyTimeVo {
    String thisDayTime;
    String allStudyTime;
    List<StarClassVo> classVo;

    public String getThisDayTime() {
        return thisDayTime;
    }

    public List<StarClassVo> getClassVo() {
        return classVo;
    }

    public void setClassVo(List<StarClassVo> classVo) {
        this.classVo = classVo;
    }

    public void setThisDayTime(String thisDayTime) {
        this.thisDayTime = thisDayTime;
    }

    public String getAllStudyTime() {
        return allStudyTime;
    }

    public void setAllStudyTime(String allStudyTime) {
        this.allStudyTime = allStudyTime;
    }
}
