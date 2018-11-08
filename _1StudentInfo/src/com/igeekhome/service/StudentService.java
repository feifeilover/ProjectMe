package com.igeekhome.service;

import java.util.List;

import com.igeekhome.pojo.Paging;
import com.igeekhome.pojo.Student;

public interface StudentService {
	public List<Student> queryByPage(Paging paging); //分页
	public int queryStudentByAll(); //获取总记录数
}
