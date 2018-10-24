package com.igeekhome.dao;

import java.sql.SQLException;
import java.util.List;

import com.igeekhome.pojo.City;

public interface CityDao {
	public List<City> doSearchCityById(int pid) throws SQLException;//根据id找城市
}
