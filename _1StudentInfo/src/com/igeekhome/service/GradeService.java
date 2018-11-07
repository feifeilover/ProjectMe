package com.igeekhome.service;

import java.util.List;

import com.igeekhome.pojo.Grade;
import com.igeekhome.pojo.Paging;

public interface GradeService {
	public List<Grade> queryAllGrade() ; //查询所有班级信息
	public List<Grade> queryGradeByPage(Paging paging) ;	//班级信息分页
	public int querytAllCount();  //获取总记录数
}
