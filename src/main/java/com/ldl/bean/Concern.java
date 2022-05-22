package com.ldl.bean;

public class Concern {
    private int id;
    private int uid;
    private int buid;

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

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getBuid() {
        return buid;
    }

    public void setBuid(int buid) {
        this.buid = buid;
    }
}
