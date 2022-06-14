package com.ldl.bean.VO;

public class SignVo {
   String maxSignNum;
   String countiueNum;
   String allNum;
   String isSign;
   String isSignYesterday;
   String isSignBeforeYesterday;

    public String getMaxSignNum() {
        return maxSignNum;
    }

    public String getIsSignYesterday() {
        return isSignYesterday;
    }

    public void setIsSignYesterday(String isSignYesterday) {
        this.isSignYesterday = isSignYesterday;
    }

    public String getIsSignBeforeYesterday() {
        return isSignBeforeYesterday;
    }

    public void setIsSignBeforeYesterday(String isSignBeforeYesterday) {
        this.isSignBeforeYesterday = isSignBeforeYesterday;
    }

    public void setMaxSignNum(String maxSignNum) {
        this.maxSignNum = maxSignNum;
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

    public String getIsSign() {
        return isSign;
    }

    public void setIsSign(String isSign) {
        this.isSign = isSign;
    }
}
