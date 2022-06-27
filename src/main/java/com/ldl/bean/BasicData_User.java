package com.ldl.bean;

public class BasicData_User {
    private int todayNewUser;
    private int todayNewUser_green;
    private int totalUser;
    private int totalUser_green;

    public BasicData_User(int todayNewUser, int todayNewUser_green, int totalUser, int totalUser_green) {
        this.todayNewUser = todayNewUser;
        this.todayNewUser_green = todayNewUser_green;
        this.totalUser = totalUser;
        this.totalUser_green = totalUser_green;
    }

    public BasicData_User() {
    }

    public int getTodayNewUser() {
        return todayNewUser;
    }

    public void setTodayNewUser(int todayNewUser) {
        this.todayNewUser = todayNewUser;
    }

    public int getTodayNewUser_green() {
        return todayNewUser_green;
    }

    public void setTodayNewUser_green(int todayNewUser_green) {
        this.todayNewUser_green = todayNewUser_green;
    }

    public int getTotalUser() {
        return totalUser;
    }

    public void setTotalUser(int totalUser) {
        this.totalUser = totalUser;
    }

    public int getTotalUser_green() {
        return totalUser_green;
    }

    public void setTotalUser_green(int totalUser_green) {
        this.totalUser_green = totalUser_green;
    }
}
