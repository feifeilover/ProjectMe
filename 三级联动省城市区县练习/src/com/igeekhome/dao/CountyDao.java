package com.igeekhome.dao;

import java.sql.SQLException;
import java.util.List;

import com.igeekhome.pojo.County;

public interface CountyDao {
	public List<County> doSearchCountyById(int qid) throws SQLException;
}
