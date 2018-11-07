package com.igeekhome.dao;

import java.util.List;

import com.igeekhome.pojo.Grade;
import com.igeekhome.pojo.Paging;

public interface GradeDao {
	public List<Grade> doSelectAllGrade();//查询所有班级信息
    public int doSelectAllCount();	  //查询总记录数
    public List<Grade> doSelectGradeByPage(Paging paging);  //分页
}
