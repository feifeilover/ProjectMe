package com.igeekhome.dao.Impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.igeekhome.dao.UserDao;
import com.igeekhome.pojo.User;
import com.igeekhome.utils.C3P0Utils;

public class UserDaoImpl implements UserDao{
	private QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
	@Override
	public User login(String username, String password) {
		String sql = "select * from t_user where username=? and password=?";
		try {
			return qr.query(sql, new BeanHandler<User>(User.class),username,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
