package com.Banking.Dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {
	
	 public Connection getConnection() throws SQLException{
	 final String DB_URL = "jdbc:mysql://localhost/dbbank";

	   //  Database credentials
	    final String USER = "root";
	    final String PASS = "root";
	   
	    
	   Connection conn = null;
	   Statement stmt = null;
	  
	      

	      //STEP 3: Open a connection
	      System.out.println("Connecting to a selected database...");
	      conn = DriverManager.getConnection(DB_URL, USER, PASS);
	      System.out.println("Connected database successfully...");
	      
	    
	      stmt = conn.createStatement();
	      String sql = "SELECT * FROM customers"; 
	      ResultSet rs = stmt.executeQuery(sql);	
	      while(rs.next()) {
	    	  String id = rs.getString(2);
	      
				System.out.print(id); 
	      }
	      System.out.println("");
				
	   
	 
	      
	   
	return conn;
	  
	
	 }

}