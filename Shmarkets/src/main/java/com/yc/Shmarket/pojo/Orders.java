package com.yc.Shmarket.pojo;

import java.util.Date;

public class Orders {
    private Integer oid;

    private String onumber;

    private Integer ostate;

    private Date ocreateTime;

    private Date opayTime;

    private Date odeliverTime;

    private Date ofinishTime;

    private Integer addid;

    private String ops;

    private Long oallCharge;

    private Long oallPrice;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getOnumber() {
        return onumber;
    }

    public void setOnumber(String onumber) {
        this.onumber = onumber == null ? null : onumber.trim();
    }

    public Integer getOstate() {
        return ostate;
    }

    public void setOstate(Integer ostate) {
        this.ostate = ostate;
    }

    public Date getOcreateTime() {
        return ocreateTime;
    }

    public void setOcreateTime(Date ocreateTime) {
        this.ocreateTime = ocreateTime;
    }

    public Date getOpayTime() {
        return opayTime;
    }

    public void setOpayTime(Date opayTime) {
        this.opayTime = opayTime;
    }

    public Date getOdeliverTime() {
        return odeliverTime;
    }

    public void setOdeliverTime(Date odeliverTime) {
        this.odeliverTime = odeliverTime;
    }

    public Date getOfinishTime() {
        return ofinishTime;
    }

    public void setOfinishTime(Date ofinishTime) {
        this.ofinishTime = ofinishTime;
    }

    public Integer getAddid() {
        return addid;
    }

    public void setAddid(Integer addid) {
        this.addid = addid;
    }

    public String getOps() {
        return ops;
    }

    public void setOps(String ops) {
        this.ops = ops == null ? null : ops.trim();
    }

    public Long getOallCharge() {
        return oallCharge;
    }

    public void setOallCharge(Long oallCharge) {
        this.oallCharge = oallCharge;
    }

    public Long getOallPrice() {
        return oallPrice;
    }

    public void setOallPrice(Long oallPrice) {
        this.oallPrice = oallPrice;
    }
}