package com.project.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class dataBase {
	public static void main(String [] args) {
		String url= "jdbc:mysql://localhost:3306/database2";
		String userName = "root"; 
		String password = "Mysql@345";
		Connection connection = null;
		String insertQuery = "insert into studentsinfo value(4,'Dhoni','MS',40)";
		
		try {
			connection=DriverManager.getConnection(url, userName, password);
			System.out.println("Connection is succesful"+url);
			Statement statement=connection.createStatement();
			statement.executeUpdate(insertQuery);
			System.out.println("Data is insert sucessfully");
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		finally {
			if(connection!=null) {
				System.out.println("connection is closed");
				System.out.println("****************");
		}
			else {
				System.out.println("Connecton is not closed");
			}
		}
	}
}
