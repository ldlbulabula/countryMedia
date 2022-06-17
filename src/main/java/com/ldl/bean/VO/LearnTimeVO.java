package com.ldl.bean.VO;

public class LearnTimeVO {
    String maxLearnNum;
    String countiueNum;
    String allNum;
    String isLearn;
    String isLearnYesterday;
    String isLearnBeforeYesterday;

    public LearnTimeVO() {
    }

    public LearnTimeVO(String maxLearnNum, String countiueNum, String allNum, String isLearn, String isLearnYesterday, String isLearnBeforeYesterday) {
        this.maxLearnNum = maxLearnNum;
        this.countiueNum = countiueNum;
        this.allNum = allNum;
        this.isLearn = isLearn;
        this.isLearnYesterday = isLearnYesterday;
        this.isLearnBeforeYesterday = isLearnBeforeYesterday;
    }

    public String getMaxLearnNum() {
        return maxLearnNum;
    }

    public void setMaxLearnNum(String maxLearnNum) {
        this.maxLearnNum = maxLearnNum;
    }

    public String getCountiueNum() {
        return countiueNum;
    }

    public void setCountiueNum(String countiueNum) {
        this.countiueNum = countiueNum;
    }

    public String getAllNum() {
        return allNum;
    }

    public void setAllNum(String allNum) {
        this.allNum = allNum;
    }

    public String getIsLearn() {
        return isLearn;
    }

    public void setIsLearn(String isLearn) {
        this.isLearn = isLearn;
    }

    public String getIsLearnYesterday() {
        return isLearnYesterday;
    }

    public void setIsLearnYesterday(String isLearnYesterday) {
        this.isLearnYesterday = isLearnYesterday;
    }

    public String getIsLearnBeforeYesterday() {
        return isLearnBeforeYesterday;
    }

    public void setIsLearnBeforeYesterday(String isLearnBeforeYesterday) {
        this.isLearnBeforeYesterday = isLearnBeforeYesterday;
    }
}
