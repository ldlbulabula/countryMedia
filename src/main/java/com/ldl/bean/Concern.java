package com.ldl.bean;

public class Concern {
    private int id;
    private String uid;
    private String buid;

    public Concern() {
    }

    @Override
    public String toString() {
        return "concern{" +
                "id=" + id +
                ", uid=" + uid +
                ", buid=" + buid +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getBuid() {
        return buid;
    }

    public void setBuid(String buid) {
        this.buid = buid;
    }
}
