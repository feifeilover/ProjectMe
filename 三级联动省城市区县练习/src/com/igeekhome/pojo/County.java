package com.igeekhome.pojo;

public class County {
	private int qid;
	private String qname;
	private int city_id;

	public County() {
		super();
		// TODO Auto-generated constructor stub
	}

	public County(int qid, String qname, int city_id) {
		super();
		this.qid = qid;
		this.qname = qname;
		this.city_id = city_id;
	}

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQname() {
		return qname;
	}

	public void setQname(String qname) {
		this.qname = qname;
	}

	public int getCity_id() {
		return city_id;
	}

	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}

	@Override
	public String toString() {
		return "County [qid=" + qid + ", qname=" + qname + ", city_id=" + city_id + "]";
	}

}
