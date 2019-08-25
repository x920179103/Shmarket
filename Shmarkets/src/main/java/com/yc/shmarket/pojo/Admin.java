package com.yc.shmarket.pojo;

public class Admin {
    private Integer aid;

    private String ausename;

    private String alogo;

    private String apwd;

    private String aname;

    private String agender;

    private String aphone;

    private String aemail;

    private Integer alevel;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAusename() {
        return ausename;
    }

    public void setAusename(String ausename) {
        this.ausename = ausename == null ? null : ausename.trim();
    }

    public String getAlogo() {
        return alogo;
    }

    public void setAlogo(String alogo) {
        this.alogo = alogo == null ? null : alogo.trim();
    }

    public String getApwd() {
        return apwd;
    }

    public void setApwd(String apwd) {
        this.apwd = apwd == null ? null : apwd.trim();
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname == null ? null : aname.trim();
    }

    public String getAgender() {
        return agender;
    }

    public void setAgender(String agender) {
        this.agender = agender == null ? null : agender.trim();
    }

    public String getAphone() {
        return aphone;
    }

    public void setAphone(String aphone) {
        this.aphone = aphone == null ? null : aphone.trim();
    }

    public String getAemail() {
        return aemail;
    }

    public void setAemail(String aemail) {
        this.aemail = aemail == null ? null : aemail.trim();
    }

    public Integer getAlevel() {
        return alevel;
    }

    public void setAlevel(Integer alevel) {
        this.alevel = alevel;
    }
}