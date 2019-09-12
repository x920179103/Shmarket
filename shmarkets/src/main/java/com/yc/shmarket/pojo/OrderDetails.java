package com.yc.shmarket.pojo;

public class OrderDetails {
	private Integer odid;

	private Integer oid;

	private Integer cid;

	private Long odprice;

	private Integer odnum;

	private Long ocharge;

	public Integer getOdid() {
		return odid;
	}

	public void setOdid(Integer odid) {
		this.odid = odid;
	}

	public Integer getOid() {
		return oid;
	}

	public void setOid(Integer oid) {
		this.oid = oid;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public Long getOdprice() {
		return odprice;
	}

	public void setOdprice(Long odprice) {
		this.odprice = odprice;
	}

	public Integer getOdnum() {
		return odnum;
	}

	public void setOdnum(Integer odnum) {
		this.odnum = odnum;
	}

	public Long getOcharge() {
		return ocharge;
	}

	public void setOcharge(Long ocharge) {
		this.ocharge = ocharge;
	}
}