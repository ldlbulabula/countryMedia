package com.ldl.Util;


public class LoginResult {
    private String session_key;
    private String openid;
    private String errcode;
    private String errmsg;

    @Override
    public String toString() {
        return "LoginResult{" +
                "session_key='" + session_key + '\'' +
                ", openid='" + openid + '\'' +
                ", errcode='" + errcode + '\'' +
                ", errmsg='" + errmsg + '\'' +
                '}';
    }

    public LoginResult() {
    }

    public LoginResult(String session_key, String openid, String errcode, String errmsg) {
        this.session_key = session_key;
        this.openid = openid;
        this.errcode = errcode;
        this.errmsg = errmsg;
    }

    public String getSession_key() {
        return session_key;
    }

    public void setSession_key(String session_key) {
        this.session_key = session_key;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getErrcode() {
        return errcode;
    }

    public void setErrcode(String errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }
}
