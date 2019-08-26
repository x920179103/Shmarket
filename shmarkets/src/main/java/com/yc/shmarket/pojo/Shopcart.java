package com.yc.shmarket.pojo;

import java.util.Date;

public class Shopcart {
    private Integer scid;

    private Integer uid;

    private Integer cid;

    private Integer scnum;

    private Date sctime;

    public Integer getScid() {
        return scid;
    }

    public void setScid(Integer scid) {
        this.scid = scid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getScnum() {
        return scnum;
    }

    public void setScnum(Integer scnum) {
        this.scnum = scnum;
    }

    public Date getSctime() {
        return sctime;
    }

    public void setSctime(Date sctime) {
        this.sctime = sctime;
    }
}