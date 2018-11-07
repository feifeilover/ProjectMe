package com.igeekhome.dao;

import com.igeekhome.pojo.User;

public interface UserDao {
	public User login(String username,String password);
}
