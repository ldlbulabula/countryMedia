package com.ldl.bean;

public class AdminPublic {
    int pid;
    String title;
    String public_time;
    String content;

    public AdminPublic() {
    }

    public AdminPublic(String title, String public_time, String content) {
        this.title = title;
        this.public_time = public_time;
        this.content = content;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublic_time() {
        return public_time;
    }

    public void setPublic_time(String public_time) {
        this.public_time = public_time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
