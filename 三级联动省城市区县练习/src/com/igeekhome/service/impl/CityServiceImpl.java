package com.igeekhome.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.igeekhome.dao.CityDao;
import com.igeekhome.dao.impl.CityDaoImpl;
import com.igeekhome.pojo.City;
import com.igeekhome.service.CityService;

public class CityServiceImpl implements CityService {
	private CityDao citydao = new CityDaoImpl();
	@Override
	public List<City> queryByCityById(int pid) {
		try {
			return citydao.doSearchCityById(pid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		return null;
	}

}
