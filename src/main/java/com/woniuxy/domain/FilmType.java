package com.woniuxy.domain;

import java.io.Serializable;

public class FilmType implements Serializable {
    private String ftid;

    private String ftname;

    private String ftinfo;

    private static final long serialVersionUID = 1L;

    public String getFtid() {
        return ftid;
    }

    public void setFtid(String ftid) {
        this.ftid = ftid == null ? null : ftid.trim();
    }

    public String getFtname() {
        return ftname;
    }

    public void setFtname(String ftname) {
        this.ftname = ftname == null ? null : ftname.trim();
    }

    public String getFtinfo() {
        return ftinfo;
    }

    public void setFtinfo(String ftinfo) {
        this.ftinfo = ftinfo == null ? null : ftinfo.trim();
    }
}