package com.Banking.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.Banking.Dao.JDBC;
public class UserDao {
	
	public static void main(String[] args) throws SQLException {
		
		JDBC a = new JDBC();
		a.getConnection();
		
	}
	
	



}