package com.woniuxy.domain;

import java.io.Serializable;

public class Coupon implements Serializable {
    private String cpid;

    private String cpname;

    private Double cpMinPrice;

    private Double cpvalue;

    private Integer cptime;

    private static final long serialVersionUID = 1L;

    public String getCpid() {
        return cpid;
    }

    public void setCpid(String cpid) {
        this.cpid = cpid == null ? null : cpid.trim();
    }

    public String getCpname() {
        return cpname;
    }

    public void setCpname(String cpname) {
        this.cpname = cpname == null ? null : cpname.trim();
    }

    public Double getCpMinPrice() {
        return cpMinPrice;
    }

    public void setCpMinPrice(Double cpMinPrice) {
        this.cpMinPrice = cpMinPrice;
    }

    public Double getCpvalue() {
        return cpvalue;
    }

    public void setCpvalue(Double cpvalue) {
        this.cpvalue = cpvalue;
    }

    public Integer getCptime() {
        return cptime;
    }

    public void setCptime(Integer cptime) {
        this.cptime = cptime;
    }

	@Override
	public String toString() {
		return "Coupon [cpid=" + cpid + ", cpname=" + cpname + ", cpMinPrice=" + cpMinPrice + ", cpvalue=" + cpvalue
				+ ", cptime=" + cptime + "]";
	}  
}