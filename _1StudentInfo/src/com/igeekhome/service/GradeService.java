package com.igeekhome.service;

import java.util.List;

import com.igeekhome.pojo.Grade;
import com.igeekhome.pojo.Paging;

public interface GradeService {
	public List<Grade> queryAllGrade() ; //查询所有班级信息
	public List<Grade> queryGradeByPage(Paging paging) ;	//班级信息分页
	public int querytAllCount();  //获取总记录数
	public List<Grade> queryGradeByName(Grade grade) ;  //模糊查询
	public List<Grade> queryGradeByPageAndName(Paging paging, Grade grade) ;  //模糊查询加分页
	public int removeGradeByBatch(String delIds);//批量删除几条数据
	public int addGrade(Grade grade);	//添加数据
	public int updateGrade(Grade grade);	//更新数据
}
