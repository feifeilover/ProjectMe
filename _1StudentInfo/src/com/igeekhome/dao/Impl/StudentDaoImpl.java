package com.igeekhome.dao.Impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.igeekhome.dao.StudentDao;
import com.igeekhome.pojo.Paging;
import com.igeekhome.pojo.Student;
import com.igeekhome.utils.C3P0Utils;

public class StudentDaoImpl implements StudentDao {
	private QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
	@Override
	public List<Student> doSelectByPage(Paging paging) {
		String sql = "SELECT * FROM t_student LIMIT ?,?;";
		try {
			return qr.query(sql, new BeanListHandler<Student>(Student.class),paging.getStart(),paging.getRows());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public int doSelectStudentByAll() {
		String sql = "select count(1) from t_student";
		long result = 0;
		try {
			result = qr.query(sql, new ScalarHandler<Long>());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return (int) result;
	}
}
