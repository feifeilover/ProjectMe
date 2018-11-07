package com.igeekhome.service.Impl;

import com.igeekhome.dao.UserDao;
import com.igeekhome.dao.Impl.UserDaoImpl;
import com.igeekhome.pojo.User;
import com.igeekhome.service.UserService;

public class UserServiceImpl implements UserService{
	private UserDao userdao = new UserDaoImpl();
	@Override
	public User login(String username, String password) {
		return userdao.login(username, password);
	}
}
