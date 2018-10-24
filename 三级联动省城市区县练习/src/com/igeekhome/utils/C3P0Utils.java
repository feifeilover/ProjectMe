package com.igeekhome.utils;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * C3P0工具类
 * @author student
 *
 */
public class C3P0Utils {
	private static ComboPooledDataSource dataSource = new ComboPooledDataSource("test");
	
	//获取数据源
	public static DataSource getDataSource() {
		return dataSource;
	}
	
	//获取一个连接
	public static Connection getConnection() throws SQLException {
		return dataSource.getConnection();
	}
	
	
	
	/*@Test
	public void test01() throws SQLException {
		ComboPooledDataSource dataSource = new ComboPooledDataSource("test");
		System.out.println(dataSource.getConnection());
		System.out.println(dataSource.getMinPoolSize());
		System.out.println(dataSource.getJdbcUrl());
		System.out.println(dataSource.getUser());
	}*/
	
	
}
