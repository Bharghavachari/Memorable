package com.project.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadSingleData {
	public static void main (String [] args) {
		String url = "jdbc:mysql://localhost:3306/database2";
		String userName = "root";
		String password = "Mysql@345";
		Connection connection = null;
		String readSingleData = "select * from database2.studentsinfo where sid = 1";

		try {
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("Connection Established" +url);
			Statement statement = connection.createStatement();
			ResultSet resultset = statement.executeQuery(readSingleData);
			resultset.next();
			System.out.println("sid"+resultset.getInt(1));
			System.out.println("firstName"+resultset.getString(2));
			System.out.println("lastName"+resultset.getString(3));
			System.out.println("age"+resultset.getInt(4));
			
			System.out.println("***********************");
			}
		catch(SQLException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
			}
	}
}