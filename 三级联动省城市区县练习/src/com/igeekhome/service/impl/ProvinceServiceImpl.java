package com.igeekhome.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.igeekhome.dao.ProvinceDao;
import com.igeekhome.dao.impl.ProvinceDaoImpl;
import com.igeekhome.pojo.Province;
import com.igeekhome.service.ProvinceService;

public class ProvinceServiceImpl implements ProvinceService {
	private ProvinceDao provincedao = new ProvinceDaoImpl();
	@Override
	public List<Province> queryAll() {
		try {
			return provincedao.doSearchAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
