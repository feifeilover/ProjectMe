package com.igeekhome.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.igeekhome.dao.CityDao;
import com.igeekhome.pojo.City;
import com.igeekhome.utils.C3P0Utils;

public class CityDaoImpl implements CityDao{
	private QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
	@Override
	public List<City> doSearchCityById(int pid) throws SQLException {
		String sql = "SELECT * FROM city WHERE pro_id = ?;";
		return qr.query(sql, new BeanListHandler<City>(City.class),pid);
	}
}
