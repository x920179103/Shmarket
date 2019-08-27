package com.yc.shmarket.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(value = {"handler"})
public class Commodities {
    private Integer cid;

    private String cname;

    private Integer tid;
    private Type type;

    private Integer cnum;

    private String cdescribe;

    private String ccolor;

    private String cmodel;

    private Integer cnew;

    private String cpic;

    private Long cprice;

    private Integer uid;
    private Users user;

    private String caddress;

    private String cphone;

    private Integer cpostage;

    private Date cupDate;

    private Date cdownDate;

    private Integer cstateCom;

    private Integer cstateDingdan;

    private Integer cavgGrade;

    private String cbargain;

    public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getCnum() {
        return cnum;
    }

    public void setCnum(Integer cnum) {
        this.cnum = cnum;
    }

    public String getCdescribe() {
        return cdescribe;
    }

    public void setCdescribe(String cdescribe) {
        this.cdescribe = cdescribe == null ? null : cdescribe.trim();
    }

    public String getCcolor() {
        return ccolor;
    }

    public void setCcolor(String ccolor) {
        this.ccolor = ccolor == null ? null : ccolor.trim();
    }

    public String getCmodel() {
        return cmodel;
    }

    public void setCmodel(String cmodel) {
        this.cmodel = cmodel == null ? null : cmodel.trim();
    }

    public Integer getCnew() {
        return cnew;
    }

    public void setCnew(Integer cnew) {
        this.cnew = cnew;
    }

    public String getCpic() {
        return cpic;
    }

    public void setCpic(String cpic) {
        this.cpic = cpic == null ? null : cpic.trim();
    }

    public Long getCprice() {
        return cprice;
    }

    public void setCprice(Long cprice) {
        this.cprice = cprice;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getCaddress() {
        return caddress;
    }

    public void setCaddress(String caddress) {
        this.caddress = caddress == null ? null : caddress.trim();
    }

    public String getCphone() {
        return cphone;
    }

    public void setCphone(String cphone) {
        this.cphone = cphone == null ? null : cphone.trim();
    }

    public Integer getCpostage() {
        return cpostage;
    }

    public void setCpostage(Integer cpostage) {
        this.cpostage = cpostage;
    }

    public Date getCupDate() {
        return cupDate;
    }

    public void setCupDate(Date cupDate) {
        this.cupDate = cupDate;
    }

    public Date getCdownDate() {
        return cdownDate;
    }

    public void setCdownDate(Date cdownDate) {
        this.cdownDate = cdownDate;
    }

    public Integer getCstateCom() {
        return cstateCom;
    }

    public void setCstateCom(Integer cstateCom) {
        this.cstateCom = cstateCom;
    }

    public Integer getCstateDingdan() {
        return cstateDingdan;
    }

    public void setCstateDingdan(Integer cstateDingdan) {
        this.cstateDingdan = cstateDingdan;
    }

    public Integer getCavgGrade() {
        return cavgGrade;
    }

    public void setCavgGrade(Integer cavgGrade) {
        this.cavgGrade = cavgGrade;
    }

    public String getCbargain() {
        return cbargain;
    }

    public void setCbargain(String cbargain) {
        this.cbargain = cbargain == null ? null : cbargain.trim();
    }

	@Override
	public String toString() {
		return "Commodities [cid=" + cid + ", cname=" + cname + ", tid=" + tid + ", type=" + type + ", cnum=" + cnum
				+ ", cdescribe=" + cdescribe + ", ccolor=" + ccolor + ", cmodel=" + cmodel + ", cnew=" + cnew
				+ ", cpic=" + cpic + ", cprice=" + cprice + ", uid=" + uid + ", user=" + user + ", caddress=" + caddress
				+ ", cphone=" + cphone + ", cpostage=" + cpostage + ", cupDate=" + cupDate + ", cdownDate=" + cdownDate
				+ ", cstateCom=" + cstateCom + ", cstateDingdan=" + cstateDingdan + ", cavgGrade=" + cavgGrade
				+ ", cbargain=" + cbargain + "]";
	}

}