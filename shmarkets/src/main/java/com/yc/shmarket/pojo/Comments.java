package com.yc.shmarket.pojo;

import java.util.Date;

public class Comments {
    private Integer comid;

    private Integer odid;

    private String comcontent;

    private String compic;

    private Integer comgrade;

    private Date comtime;

    public Integer getComid() {
        return comid;
    }

    public void setComid(Integer comid) {
        this.comid = comid;
    }

    public Integer getOdid() {
        return odid;
    }

    public void setOdid(Integer odid) {
        this.odid = odid;
    }

    public String getComcontent() {
        return comcontent;
    }

    public void setComcontent(String comcontent) {
        this.comcontent = comcontent == null ? null : comcontent.trim();
    }

    public String getCompic() {
        return compic;
    }

    public void setCompic(String compic) {
        this.compic = compic == null ? null : compic.trim();
    }

    public Integer getComgrade() {
        return comgrade;
    }

    public void setComgrade(Integer comgrade) {
        this.comgrade = comgrade;
    }

    public Date getComtime() {
        return comtime;
    }

    public void setComtime(Date comtime) {
        this.comtime = comtime;
    }
}