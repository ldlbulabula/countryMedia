package com.ldl.bean;

public class LearnTime {
    String sid;
    String openid;
    int continuous_learn ;
    int all_learn;

    public LearnTime(String sid, String openid, int continuous_learn, int all_learn) {
        this.sid = sid;
        this.openid = openid;
        this.continuous_learn = continuous_learn;
        this.all_learn = all_learn;
    }

    public LearnTime() {
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public int getContinuous_learn() {
        return continuous_learn;
    }

    public void setContinuous_learn(int continuous_learn) {
        this.continuous_learn = continuous_learn;
    }

    public int getAll_learn() {
        return all_learn;
    }

    public void setAll_learn(int all_learn) {
        this.all_learn = all_learn;
    }
}
