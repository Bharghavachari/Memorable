package com.sql.classmethod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
	public static void main(String [] args) 
	{
		String url= "jdbc:mysql://localhost:3306/sqldeveloper";
		String userName = "root"; 
		String password = "Mysql@345";
		Connection connection = null;
		//String insertQuery = "insert into studentsinfo value(4,'Dhoni','MS',40)";
		//String insertQuery = "insert into trainee value(2,'Dinesh','M','java developer',8555012346, 'Bangalore',45000);";
		String insertQuery = "insert into trainee value(3,'Just','in','java developer',8555012347, 'Bangalore',45000);";
		
		try 
		{
			connection=DriverManager.getConnection(url, userName, password);
			System.out.println("Connection is succesful"+url);
			Statement statement=connection.createStatement();
			statement.executeUpdate(insertQuery);
			System.out.println("Data is insert sucessfully");
		}
		catch(SQLException e) 
		{
			System.out.println(e.getMessage());
		}
		finally 
		{
			if(connection!=null) {
				System.out.println("connection is closed");
				System.out.println("****************");
		}
		else 
		{
				System.out.println("Connecton is not closed");
		}
	}
}
}
