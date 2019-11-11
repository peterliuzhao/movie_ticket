package com.woniuxy.domain;

import java.io.Serializable;

public class Film implements Serializable {
    private String fid;

    private String fname;

    private String ftid;

    private String factor;

    private String factorPhoto;

    private String fphoto;

    private Double fprice;

    private String fpreview;

    private String finfo;

    private static final long serialVersionUID = 1L;

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid == null ? null : fid.trim();
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname == null ? null : fname.trim();
    }

    public String getFtid() {
        return ftid;
    }

    public void setFtid(String ftid) {
        this.ftid = ftid == null ? null : ftid.trim();
    }

    public String getFactor() {
        return factor;
    }

    public void setFactor(String factor) {
        this.factor = factor == null ? null : factor.trim();
    }

    public String getFactorPhoto() {
        return factorPhoto;
    }

    public void setFactorPhoto(String factorPhoto) {
        this.factorPhoto = factorPhoto == null ? null : factorPhoto.trim();
    }

    public String getFphoto() {
        return fphoto;
    }

    public void setFphoto(String fphoto) {
        this.fphoto = fphoto == null ? null : fphoto.trim();
    }

    public Double getFprice() {
        return fprice;
    }

    public void setFprice(Double fprice) {
        this.fprice = fprice;
    }

    public String getFpreview() {
        return fpreview;
    }

    public void setFpreview(String fpreview) {
        this.fpreview = fpreview == null ? null : fpreview.trim();
    }

    public String getFinfo() {
        return finfo;
    }

    public void setFinfo(String finfo) {
        this.finfo = finfo == null ? null : finfo.trim();
    }
}