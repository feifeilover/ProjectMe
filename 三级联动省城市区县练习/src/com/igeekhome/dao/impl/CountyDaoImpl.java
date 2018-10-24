package com.igeekhome.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.igeekhome.dao.CountyDao;
import com.igeekhome.pojo.County;
import com.igeekhome.utils.C3P0Utils;

public class CountyDaoImpl implements CountyDao {
	private QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
	@Override
	public List<County> doSearchCountyById(int qid) throws SQLException {
		String sql = "SELECT * FROM county WHERE city_id = ?;";
		return qr.query(sql, new BeanListHandler<County>(County.class),qid);
	}

}
