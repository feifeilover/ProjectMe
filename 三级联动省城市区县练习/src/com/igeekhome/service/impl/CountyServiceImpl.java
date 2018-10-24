package com.igeekhome.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.igeekhome.dao.CountyDao;
import com.igeekhome.dao.impl.CountyDaoImpl;
import com.igeekhome.pojo.County;
import com.igeekhome.service.CountyService;

public class CountyServiceImpl implements CountyService {
	private CountyDao countydao = new CountyDaoImpl();
	@Override
	public List<County> queryCountyById(int qid) {
		try {
			return countydao.doSearchCountyById(qid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
