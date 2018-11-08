package com.igeekhome.pojo;
/**
 * sno 
	sname 
	gender 
	class 
	birthday 
	address 
 * @author student
 *
 */

import java.util.Date;

public class Student {
	private int sno;
	private String sname;
	private String gender;
	private String class_home;
	private Date birthday;
	private String address;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int sno, String sname, String gender, String class_home, Date birthday, String address) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.gender = gender;
		this.class_home = class_home;
		this.birthday = birthday;
		this.address = address;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getClass_home() {
		return class_home;
	}

	public void setClass_home(String class_home) {
		this.class_home = class_home;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", gender=" + gender + ", class_home=" + class_home
				+ ", birthday=" + birthday + ", address=" + address + "]";
	}

}
