package com.yc.Shmarket.pojo;

public class Type {
    private Integer tid;

    private String tname;

    private Integer tidd;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }

    public Integer getTidd() {
        return tidd;
    }

    public void setTidd(Integer tidd) {
        this.tidd = tidd;
    }
}