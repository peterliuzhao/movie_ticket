package com.woniuxy.domain;

import java.io.Serializable;

public class Tcombo implements Serializable {
    private String tcid;

    private String tcname;

    private String tcinfo;

    private Double tcprice;

    private Integer tctime;

    private static final long serialVersionUID = 1L;

    public String getTcid() {
        return tcid;
    }

    public void setTcid(String tcid) {
        this.tcid = tcid == null ? null : tcid.trim();
    }

    public String getTcname() {
        return tcname;
    }

    public void setTcname(String tcname) {
        this.tcname = tcname == null ? null : tcname.trim();
    }

    public String getTcinfo() {
        return tcinfo;
    }

    public void setTcinfo(String tcinfo) {
        this.tcinfo = tcinfo == null ? null : tcinfo.trim();
    }

    public Double getTcprice() {
        return tcprice;
    }

    public void setTcprice(Double tcprice) {
        this.tcprice = tcprice;
    }

    public Integer getTctime() {
        return tctime;
    }

    public void setTctime(Integer tctime) {
        this.tctime = tctime;
    }
}