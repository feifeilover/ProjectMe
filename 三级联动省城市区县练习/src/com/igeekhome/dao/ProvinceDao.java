package com.igeekhome.dao;

import java.sql.SQLException;
import java.util.List;

import com.igeekhome.pojo.Province;

public interface ProvinceDao {
	public List<Province> doSearchAll() throws SQLException;
}
