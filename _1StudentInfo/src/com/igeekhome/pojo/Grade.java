package com.igeekhome.pojo;

public class Grade {
	private int id;
	private String gradeName;
	private String gradeDesc;

	public Grade() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Grade(int id, String gradeName, String gradeDesc) {
		super();
		this.id = id;
		this.gradeName = gradeName;
		this.gradeDesc = gradeDesc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGradeName() {
		return gradeName;
	}

	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}

	public String getGradeDesc() {
		return gradeDesc;
	}

	public void setGradeDesc(String gradeDesc) {
		this.gradeDesc = gradeDesc;
	}

	@Override
	public String toString() {
		return "Grade [id=" + id + ", gradeName=" + gradeName + ", gradeDesc=" + gradeDesc + "]";
	}

}
