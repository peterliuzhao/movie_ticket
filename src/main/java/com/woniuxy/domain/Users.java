package com.woniuxy.domain;

import java.io.Serializable;

public class Users implements Serializable {
    private String uid;

    private String uname;

    private String upwd;

    private String salt;

    private String tid;

    private Integer usoftDel;

    private static final long serialVersionUID = 1L;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd == null ? null : upwd.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid == null ? null : tid.trim();
    }

    public Integer getUsoftDel() {
        return usoftDel;
    }

    public void setUsoftDel(Integer usoftDel) {
        this.usoftDel = usoftDel;
    }
}