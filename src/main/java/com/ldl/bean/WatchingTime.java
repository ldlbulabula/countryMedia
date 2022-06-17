package com.ldl.bean;

public class WatchingTime {
   private int wt_id;
   private String openid;
   private String watch_date;
   private long watch_time_mils;

    public WatchingTime() {
    }

    public WatchingTime(int wt_id, String openid, String watch_date, long watch_time_mils) {
        this.wt_id = wt_id;
        this.openid = openid;
        this.watch_date = watch_date;
        this.watch_time_mils = watch_time_mils;
    }

    public int getWt_id() {
        return wt_id;
    }

    public void setWt_id(int wt_id) {
        this.wt_id = wt_id;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getWatch_date() {
        return watch_date;
    }

    public void setWatch_date(String watch_date) {
        this.watch_date = watch_date;
    }

    public long getWatch_time_mils() {
        return watch_time_mils;
    }

    public void setWatch_time_mils(long watch_time_mils) {
        this.watch_time_mils = watch_time_mils;
    }

    @Override
    public String toString() {
        return "WatchingTime{" +
                "wt_id=" + wt_id +
                ", openid='" + openid + '\'' +
                ", watch_date='" + watch_date + '\'' +
                ", watch_time_mils=" + watch_time_mils +
                '}';
    }
}
