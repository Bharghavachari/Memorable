package com.project.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadAllData {
	private static final String Connection = null;

	public static void main (String [] args) {
		String url = "jdbc:mysql://localhost:3306/database2";
		String userName = "root";
		String password = "Mysql@345";
		Connection connection = null;
		String ReadAllQuery = "SELECT * FROM database2.studentsinfo;";
		
		try {
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("Connection Established" +url);
			Statement statement = connection.createStatement();
			ResultSet resultset = statement.executeQuery(ReadAllQuery);
			while (resultset.next()){
				System.out.println("sid"+resultset.getInt(1));
				System.out.println("firstName"+resultset.getString(2));
				System.out.println("lastName"+resultset.getString(3));
				System.out.println("age"+resultset.getInt(4));
				
				System.out.println("***********************");
				
			}
			}
		catch (SQLException e) {
			System.out.println("inside catch block exception");
			System.out.println(e.getMessage());
			e.printStackTrace();
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
