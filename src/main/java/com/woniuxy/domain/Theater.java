package com.woniuxy.domain;

import java.io.Serializable;

public class Theater implements Serializable {
    private String tid;

    private String tname;

    private String tlogo;

    private String tphoto;

    private String tphone;

    private String tcopyright;

    private String taccount;

    private Integer tsoftDel;

    private String turl;

    private String uid;

    private static final long serialVersionUID = 1L;

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid == null ? null : tid.trim();
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }

    public String getTlogo() {
        return tlogo;
    }

    public void setTlogo(String tlogo) {
        this.tlogo = tlogo == null ? null : tlogo.trim();
    }

    public String getTphoto() {
        return tphoto;
    }

    public void setTphoto(String tphoto) {
        this.tphoto = tphoto == null ? null : tphoto.trim();
    }

    public String getTphone() {
        return tphone;
    }

    public void setTphone(String tphone) {
        this.tphone = tphone == null ? null : tphone.trim();
    }

    public String getTcopyright() {
        return tcopyright;
    }

    public void setTcopyright(String tcopyright) {
        this.tcopyright = tcopyright == null ? null : tcopyright.trim();
    }

    public String getTaccount() {
        return taccount;
    }

    public void setTaccount(String taccount) {
        this.taccount = taccount == null ? null : taccount.trim();
    }

    public Integer getTsoftDel() {
        return tsoftDel;
    }

    public void setTsoftDel(Integer tsoftDel) {
        this.tsoftDel = tsoftDel;
    }

    public String getTurl() {
        return turl;
    }

    public void setTurl(String turl) {
        this.turl = turl == null ? null : turl.trim();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }
}