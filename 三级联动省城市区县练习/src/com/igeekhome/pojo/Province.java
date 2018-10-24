package com.igeekhome.pojo;

public class Province {
	private int pid;
	private String pname;
	
	public Province() {
		super();
	}

	public Province(int pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	@Override
	public String toString() {
		return "Province [pid=" + pid + ", pname=" + pname + "]";
	}
}
