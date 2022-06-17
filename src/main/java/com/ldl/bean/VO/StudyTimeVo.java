package com.ldl.bean.VO;

import com.ldl.bean.WatchingResult;

import java.util.List;

public class StudyTimeVo {
    String thisDayTime;
    String allStudyTime;
    List<StarClassVo> classVo;
    WatchingResult allStudyTimeResult;
    WatchingResult thisDayTimeResult;

    public WatchingResult getAllStudyTimeResult() {
        return allStudyTimeResult;
    }

    public void setAllStudyTimeResult(WatchingResult allStudyTimeResult) {
        this.allStudyTimeResult = allStudyTimeResult;
    }

    public WatchingResult getThisDayTimeResult() {
        return thisDayTimeResult;
    }

    public void setThisDayTimeResult(WatchingResult thisDayTimeResult) {
        this.thisDayTimeResult = thisDayTimeResult;
    }

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
