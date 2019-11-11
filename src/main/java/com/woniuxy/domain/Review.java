package com.woniuxy.domain;

import java.io.Serializable;
import java.util.Date;

public class Review implements Serializable {
    private String rwid;

    private Date rwtime;

    private String uid;

    private String rwParentid;

    private String rwtext;

    private static final long serialVersionUID = 1L;

    public String getRwid() {
        return rwid;
    }

    public void setRwid(String rwid) {
        this.rwid = rwid == null ? null : rwid.trim();
    }

    public Date getRwtime() {
        return rwtime;
    }

    public void setRwtime(Date rwtime) {
        this.rwtime = rwtime;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getRwParentid() {
        return rwParentid;
    }

    public void setRwParentid(String rwParentid) {
        this.rwParentid = rwParentid == null ? null : rwParentid.trim();
    }

    public String getRwtext() {
        return rwtext;
    }

    public void setRwtext(String rwtext) {
        this.rwtext = rwtext == null ? null : rwtext.trim();
    }

	@Override
	public String toString() {
		return "Review [rwid=" + rwid + ", rwtime=" + rwtime + ", uid=" + uid + ", rwParentid=" + rwParentid
				+ ", rwtext=" + rwtext + "]";
	}    
}