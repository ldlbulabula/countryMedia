package com.ldl.bean;

public class WatchingResult {
    private int minutes;
    private int second;

    public WatchingResult() {
    }

    public WatchingResult(int minutes, int second) {
        this.minutes = minutes;
        this.second = second;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "WatchingResult{" +
                "minutes=" + minutes +
                ", second=" + second +
                '}';
    }
}
