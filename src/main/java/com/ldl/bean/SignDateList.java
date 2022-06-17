package com.ldl.bean;

public class SignDateList {
    private int month;
    private int day;
    private int theDayBeforeYesterday;
    private int yesterday;
    private int today;
    private int tomorrow;
    private int theDayAfterTomorrow;

    public SignDateList() {
    }

    public SignDateList(int month, int day, int theDayBeforeYesterday, int yesterday, int today, int tomorrow, int theDayAfterTomorrow) {
        this.month = month;
        this.day = day;
        this.theDayBeforeYesterday = theDayBeforeYesterday;
        this.yesterday = yesterday;
        this.today = today;
        this.tomorrow = tomorrow;
        this.theDayAfterTomorrow = theDayAfterTomorrow;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getTheDayBeforeYesterday() {
        return theDayBeforeYesterday;
    }

    public void setTheDayBeforeYesterday(int theDayBeforeYesterday) {
        this.theDayBeforeYesterday = theDayBeforeYesterday;
    }

    public int getYesterday() {
        return yesterday;
    }

    public void setYesterday(int yesterday) {
        this.yesterday = yesterday;
    }

    public int getToday() {
        return today;
    }

    public void setToday(int today) {
        this.today = today;
    }

    public int getTomorrow() {
        return tomorrow;
    }

    public void setTomorrow(int tomorrow) {
        this.tomorrow = tomorrow;
    }

    public int getTheDayAfterTomorrow() {
        return theDayAfterTomorrow;
    }

    public void setTheDayAfterTomorrow(int theDayAfterTomorrow) {
        this.theDayAfterTomorrow = theDayAfterTomorrow;
    }
}
