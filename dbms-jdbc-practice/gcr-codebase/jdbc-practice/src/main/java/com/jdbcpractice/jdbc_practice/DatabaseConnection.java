package com.jdbcpractice.jdbc_practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	//Database credentials
	private static final String url = "jdbc:mysql://localhost:3306/mydb";
	private static final String user = "root";
	private static final String password = "Aryamishra@24";
	
	public static Connection getConnection() {
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection = DriverManager.getConnection(url,user,password);
			System.out.println("Database connection estabilished successfully!");
		}catch(ClassNotFoundException e) {
			System.err.println("MYSQL JDBC Driver not found!");
			e.printStackTrace();
		}catch(SQLException e) {
			System.err.println("Connection failed!");
			e.printStackTrace();
		}
		return connection;
	}
	
	public static void main(String[] args) throws SQLException {
		Connection conn = getConnection();
		
		if(conn != null) {
			conn.close();
			System.out.println("Connection closed!");
		}
	}
	
}
