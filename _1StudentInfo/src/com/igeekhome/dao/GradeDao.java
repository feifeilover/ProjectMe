package com.igeekhome.dao;

import java.util.List;

import com.igeekhome.pojo.Grade;
import com.igeekhome.pojo.Paging;

public interface GradeDao {
	public List<Grade> doSelectAllGrade();//查询所有班级信息
    public int doSelectAllCount();	  //查询总记录数
    public List<Grade> doSelectGradeByPage(Paging paging);  //分页
    public List<Grade> doSelectGradeByName(Grade grade);//模糊查询
    public List<Grade> doSelectGradeByPageAndName(Paging paging,Grade grade);  //模糊查询加分页
    public int doDeleteGradeByBatch(String delIds);  //批量删除
}
