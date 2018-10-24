package com.igeekhome.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.igeekhome.dao.ProvinceDao;
import com.igeekhome.pojo.Province;
import com.igeekhome.utils.C3P0Utils;

public class ProvinceDaoImpl implements ProvinceDao {
	private QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
	@Override
	public List<Province> doSearchAll() throws SQLException {
		String sql = "SELECT * FROM province";
		return qr.query(sql, new BeanListHandler<Province>(Province.class));
	}

}
