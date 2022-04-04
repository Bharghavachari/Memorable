package com.project.abstraction.bymethods;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.project.single.codeoptimization.ConnectionProvider;



public  class TraineeDAOimpl implements TraineeDAO{
	@Override
	public void insertData() {
		System.out.println("Invoked save Data Method");
		
		
		String insertQuery = "insert into trainee value(3,'Just','in','java developer',8555012347, 'Bangalore',45000);";
		
		try {
			Connection connection=ConnectionProvider.getConnection();
			
			
			Statement statement=connection.createStatement();
			statement.executeUpdate(insertQuery);
			System.out.println("Data is insert sucessfully");
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
	 
}
	@Override
	public void readAllData() {
		System.out.println("Invoked save Data Method");
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
			if(connection!= null) {                                 // ( ! = ) no space // Syntax error
				System.out.println("connection is closed");
		}
		else {
				System.out.println("Connection is not Closed");
		}
	}
}
	@Override
	public void readSingleData() {
		System.out.println("Invoked save Data Method");
		String url = "jdbc:mysql://localhost:3306/sqldeveloper";
		String userName = "root";
		String password = "Mysql@345";
		Connection connection = null;
		String readSingleData = "select * from trainee where id = 1";
		
		try {
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("Connection Established" +url);
			Statement statement = connection.createStatement();
			ResultSet resultset = statement.executeQuery(readSingleData);
			resultset.next();
			System.out.println("id"+resultset.getInt(1));
			System.out.println("nameame"+resultset.getString(2));
			System.out.println("gender"+resultset.getString(3));
			System.out.println("desination"+resultset.getString(4));
			System.out.println("moble number"+resultset.getString(5));
			System.out.println("location"+resultset.getString(6));
			System.out.println("salary"+resultset.getString(7));
			
			System.out.println("***********************");
		}
		catch(SQLException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	@Override
	public void updateData() {
		System.out.println("Invoked save Data Method");
		String url = "jdbc:mysql://localhost:3306/sqldeveloper";
		String userName = "root";
		String password = "Mysql@345";
		Connection connection = null;
		String updateQuery = "update trainee set designation = 'java Developer ' where id = 1";
		
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
	@Override
	public void deleteData() {
		System.out.println("Invoked save Data Method");
		String url = "jdbc:mysql://localhost:3306/sqldeveloper";
		String userName = "root";
		String password = "Mysql@345";
		Connection connection = null;
		String deleteQuery = "Delete from trainee  where id = 3;";
		
		try {
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("Connection Established" +url);
			Statement statement = connection.createStatement();
			statement.executeUpdate(deleteQuery);
			System.out.println("Data is Deleted Successfully");
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		finally {
			if(connection!= null) {                                 // ( ! = ) no space // Syntax error
				System.out.println("connection is closed");
		}
		else {
				System.out.println("Connection is not Closed");
		}
	}

}
	
		
	
}
