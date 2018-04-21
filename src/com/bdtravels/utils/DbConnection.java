package com.bdtravels.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	
	private static Connection conn;
	String url="jdbc:mysql://localhost:3306/tourism?verifyServerCertificate=false&useSSL=true";
	String driver="com.mysql.jdbc.Driver";
	String userName="root";
	String password="linAF9979";

	
	public Connection getConnection(){
		try {
			try {
				Class.forName(driver);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			 conn= DriverManager.getConnection(url,userName,password);
		} catch (SQLException e) {
			System.out.println(e.getMessage()+"Not success");
		}
		return conn;
	}
}
