package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// conn = DriverManager.getConnection("jdbc:mysql://localhost:3360/db1", "admin", "password");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception in getConnection ##  " + e.getMessage() );
			e.printStackTrace();
		}
		
		return conn;
	}

}
