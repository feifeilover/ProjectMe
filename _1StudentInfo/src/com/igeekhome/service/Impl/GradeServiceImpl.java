package com.igeekhome.service.Impl;

import java.util.List;

import com.igeekhome.dao.GradeDao;
import com.igeekhome.dao.Impl.GradeDaoImpl;
import com.igeekhome.pojo.Grade;
import com.igeekhome.pojo.Paging;
import com.igeekhome.service.GradeService;

public class GradeServiceImpl implements GradeService{
	private GradeDao gradeDao = new GradeDaoImpl();
	@Override
	public List<Grade> queryAllGrade() {
		return gradeDao.doSelectAllGrade();
	}
	@Override
	public List<Grade> queryGradeByPage(Paging paging) {
		return gradeDao.doSelectGradeByPage(paging);
	}
	@Override
	public int querytAllCount() {
		return gradeDao.doSelectAllCount();
	}
	@Override
	public List<Grade> queryGradeByName(Grade grade) {
		return gradeDao.doSelectGradeByName(grade);
	}
	@Override
	public List<Grade> queryGradeByPageAndName(Paging paging, Grade grade) {
		return gradeDao.doSelectGradeByPageAndName(paging, grade);
	}
}
