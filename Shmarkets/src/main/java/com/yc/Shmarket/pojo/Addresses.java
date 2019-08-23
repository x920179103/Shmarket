package com.yc.Shmarket.pojo;

public class Addresses {
    private Integer addid;

    private Integer uid;

    private String addname;

    private String addphone;

    private String address;

    private Integer addstate;

    public Integer getAddid() {
        return addid;
    }

    public void setAddid(Integer addid) {
        this.addid = addid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getAddname() {
        return addname;
    }

    public void setAddname(String addname) {
        this.addname = addname == null ? null : addname.trim();
    }

    public String getAddphone() {
        return addphone;
    }

    public void setAddphone(String addphone) {
        this.addphone = addphone == null ? null : addphone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getAddstate() {
        return addstate;
    }

    public void setAddstate(Integer addstate) {
        this.addstate = addstate;
    }
}