package com.igeekhome.dao.Impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.igeekhome.dao.GradeDao;
import com.igeekhome.pojo.Grade;
import com.igeekhome.pojo.Paging;
import com.igeekhome.utils.C3P0Utils;

public class GradeDaoImpl implements GradeDao{
	private QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
	@Override
	public List<Grade> doSelectAllGrade() {
		String sql = "SELECT * FROM t_grade;";
		try {
			return qr.query(sql, new BeanListHandler<Grade>(Grade.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public int doSelectAllCount() {
		String sql = "select count(1) from t_grade";
		long result = 0;
		try {
			result = qr.query(sql, new ScalarHandler<Long>());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return (int)result;
	}
	
	@Override
	public List<Grade> doSelectGradeByPage(Paging paging) {
		String sql = "select * from t_grade limit ?,?";
		List<Grade> grades = null;
		try {
			grades = qr.query(sql, new BeanListHandler<Grade>(Grade.class),paging.getStart(),paging.getRows());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return grades;
	}
	@Override
	public List<Grade> doSelectGradeByName(Grade grade) {
		String sql = "SELECT * FROM t_grade WHERE gradeName LIKE ?;";
		try {
			return qr.query(sql, new BeanListHandler<Grade>(Grade.class), "%"+ grade.getGradeName()+ "%");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public List<Grade> doSelectGradeByPageAndName(Paging paging, Grade grade) {
		String sql = "SELECT * FROM t_grade WHERE gradeName LIKE ? LIMIT ?,?;";
		String sql1 = "SELECT * FROM t_grade LIMIT ?,?;";
		if(grade.getGradeName() == null || grade.getGradeName() == "") {
			try {
				return qr.query(sql1, new BeanListHandler<Grade>(Grade.class),paging.getStart(),paging.getRows());
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else {
			try {
				return qr.query(sql, new BeanListHandler<Grade>(Grade.class),'%' + grade.getGradeName() +'%',paging.getStart(),paging.getRows());
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		return null;
	}
	
	@Override
	public int doDeleteGradeByBatch(String delIds) {
		String sql = "delete from t_grade where id in ("+delIds+")";
		try {
			return qr.update(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	@Override
	public int doInsertGrade(Grade grade) {
		String sql = "insert into t_grade(gradeName,gradeDesc) values(?,?);";
		try {
			return qr.update(sql,grade.getGradeName(),grade.getGradeDesc());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	@Override
	public int doUpdateGrade(Grade grade) {
		String sql = "UPDATE t_grade SET gradeName = ?,gradeDesc = ? WHERE id = ?";
		try {
			return qr.update(sql,grade.getGradeName(),grade.getGradeDesc(),grade.getId());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
