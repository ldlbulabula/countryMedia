package com.ldl.bean;

public class BasicData {
    private int newClassToday;
    private int newClassToday_green;
    private int totalClassNum;
    private int totalClassNum_green;

    public BasicData() {
    }

    public BasicData(int newClassToday, int newClassToday_green, int totalClassNum, int totalClassNum_green) {
        this.newClassToday = newClassToday;
        this.newClassToday_green = newClassToday_green;
        this.totalClassNum = totalClassNum;
        this.totalClassNum_green = totalClassNum_green;
    }

    public int getNewClassToday() {
        return newClassToday;
    }

    public void setNewClassToday(int newClassToday) {
        this.newClassToday = newClassToday;
    }

    public int getNewClassToday_green() {
        return newClassToday_green;
    }

    public void setNewClassToday_green(int newClassToday_green) {
        this.newClassToday_green = newClassToday_green;
    }

    public int getTotalClassNum() {
        return totalClassNum;
    }

    public void setTotalClassNum(int totalClassNum) {
        this.totalClassNum = totalClassNum;
    }

    public int getTotalClassNum_green() {
        return totalClassNum_green;
    }

    public void setTotalClassNum_green(int totalClassNum_green) {
        this.totalClassNum_green = totalClassNum_green;
    }
}
