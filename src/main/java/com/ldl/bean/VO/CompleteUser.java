package com.ldl.bean.VO;

import com.ldl.bean.User;

public class CompleteUser {
    private User user;
    private String completeDate;

    public CompleteUser() {
    }

    public CompleteUser(User user, String completeDate) {
        this.user = user;
        this.completeDate = completeDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getCompleteDate() {
        return completeDate;
    }

    public void setCompleteDate(String completeDate) {
        this.completeDate = completeDate;
    }
}
