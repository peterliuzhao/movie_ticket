package com.woniuxy.domain;

import java.io.Serializable;

public class ShowVenue implements Serializable {
    private String svid;

    private String svname;

    private String svaddress;

    private String svinfo;

    private String svlayout;

    private String tid;

    private static final long serialVersionUID = 1L;

    public String getSvid() {
        return svid;
    }

    public void setSvid(String svid) {
        this.svid = svid == null ? null : svid.trim();
    }

    public String getSvname() {
        return svname;
    }

    public void setSvname(String svname) {
        this.svname = svname == null ? null : svname.trim();
    }

    public String getSvaddress() {
        return svaddress;
    }

    public void setSvaddress(String svaddress) {
        this.svaddress = svaddress == null ? null : svaddress.trim();
    }

    public String getSvinfo() {
        return svinfo;
    }

    public void setSvinfo(String svinfo) {
        this.svinfo = svinfo == null ? null : svinfo.trim();
    }

    public String getSvlayout() {
        return svlayout;
    }

    public void setSvlayout(String svlayout) {
        this.svlayout = svlayout == null ? null : svlayout.trim();
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid == null ? null : tid.trim();
    }
}