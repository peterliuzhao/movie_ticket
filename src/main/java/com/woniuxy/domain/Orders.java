package com.woniuxy.domain;

import java.io.Serializable;
import java.util.Date;

public class Orders implements Serializable {
    private String oid;
    
    private Date ostartTime;

    private Date oupdateTime;

    private Double ototalprice;

    private Integer ostatus;

    private String cid;

    private String fsid;
    
    
    //聚合函数查询
    private String dates;
    private Double sum;
    
    

    
    
    public String getDates() {
		return dates;
	}

	public void setDates(String dates) {
		this.dates = dates;
	}

	
	

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}




	private static final long serialVersionUID = 1L;

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid == null ? null : oid.trim();
    }

    public Date getOstartTime() {
        return ostartTime;
    }

    public void setOstartTime(Date ostartTime) {
        this.ostartTime = ostartTime;
    }

    public Date getOupdateTime() {
        return oupdateTime;
    }

    public void setOupdateTime(Date oupdateTime) {
        this.oupdateTime = oupdateTime;
    }

    public Double getOtotalprice() {
        return ototalprice;
    }

    public void setOtotalprice(Double ototalprice) {
        this.ototalprice = ototalprice;
    }

    public Integer getOstatus() {
        return ostatus;
    }

    public void setOstatus(Integer ostatus) {
        this.ostatus = ostatus;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    public String getFsid() {
        return fsid;
    }

    public void setFsid(String fsid) {
        this.fsid = fsid == null ? null : fsid.trim();
    }
}