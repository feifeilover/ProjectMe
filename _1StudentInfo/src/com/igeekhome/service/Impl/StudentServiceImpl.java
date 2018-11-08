package com.igeekhome.service.Impl;

import java.util.List;

import com.igeekhome.dao.StudentDao;
import com.igeekhome.dao.Impl.StudentDaoImpl;
import com.igeekhome.pojo.Paging;
import com.igeekhome.pojo.Student;
import com.igeekhome.service.StudentService;

public class StudentServiceImpl implements StudentService{
	private StudentDao stuDao = new StudentDaoImpl();
	@Override
	public List<Student> queryByPage(Paging paging) {
		return stuDao.doSelectByPage(paging);
	}
	@Override
	public int queryStudentByAll() {
		return stuDao.doSelectStudentByAll();
	}

}
