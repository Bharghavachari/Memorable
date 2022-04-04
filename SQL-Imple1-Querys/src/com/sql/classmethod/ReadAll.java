package com.sql.classmethod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadAll {
	private static final String Connection = null;

	public static void main (String [] args) {
		String url = "jdbc:mysql://localhost:3306/sqldeveloper";
		String userName = "root";
		String password = "Mysql@345";
		Connection connection = null;
		String ReadAllQuery = "SELECT * FROM trainee;";
		
		try {
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("Connection Established" +url);
			Statement statement = connection.createStatement();
			ResultSet resultset = statement.executeQuery(ReadAllQuery);
			while (resultset.next()){
				System.out.println("id"+resultset.getInt(1));
				System.out.println("nameame"+resultset.getString(2));
				System.out.println("gender"+resultset.getString(3));
				System.out.println("desination"+resultset.getString(4));
				System.out.println("moble number"+resultset.getString(5));
				System.out.println("location"+resultset.getString(6));
				System.out.println("salary"+resultset.getString(7));
				
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
