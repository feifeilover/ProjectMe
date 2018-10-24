package com.igeekhome.pojo;

public class City {
	private int cid;
	private String cname;
	private int pro_id;
	public City() {
		super();
	}
	
	public City(int cid, String cname, int pro_id) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.pro_id = pro_id;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getPro_id() {
		return pro_id;
	}
	public void setPro_id(int pro_id) {
		this.pro_id = pro_id;
	}
	@Override
	public String toString() {
		return "City [cid=" + cid + ", cname=" + cname + ", pro_id=" + pro_id + "]";
	}
	
}
