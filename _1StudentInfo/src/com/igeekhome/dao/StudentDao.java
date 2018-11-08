package com.igeekhome.dao;

import java.util.List;

import com.igeekhome.pojo.Paging;
import com.igeekhome.pojo.Student;

public interface StudentDao {
	public List<Student> doSelectByPage(Paging paging);//分页
    public int doSelectStudentByAll();	//总记录数
}
