package com.project.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateQuery {
	public static void main (String [] args) {
		String url = "jdbc:mysql://localhost:3306/database2";
		String userName = "root";
		String password = "Mysql@345";
		Connection connection = null;
		String updateQuery = "update studentsinfo set age = 32 where sid = 1;";
	
		try {
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("Connection Established" +url);
			Statement statement = connection.createStatement();
			statement.executeUpdate(updateQuery);
			System.out.println("Data is inserted Successfully");
			}
		catch(SQLException e) {
			System.out.println(e.getMessage());
			}
		finally {
			if(connection!= null) {                                 // ( ! = ) no space // Sysntax error
				System.out.println("connection is closed");
				}
			else {
				System.out.println("Connection is not Closed");
				}
				}
	}
}