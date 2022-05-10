package com.project.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.project.singletondesign.ConnectionProvider;

public class StudentsDAOimpl implements StudentsDAO {
	 
	
	@Override
	public void saveData() {
		System.out.println("Invoked save Data Method");
		
	
		String insertQuery = "insert into studentsinfo value(3,'Just','In',26)";
		
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
		
		
		
		String ReadAllQuery = "SELECT * FROM database2.studentsinfo;";
		
		try {
			
			Connection connection=ConnectionProvider.getConnection();
			Statement statement=connection.createStatement();
			
			
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
		
	
}
	@Override
	public void readSingleData() {
		
		
		String readSingleData = "select * from database2.studentsinfo where sid = 1";
		
		try {
			
			Connection connection=ConnectionProvider.getConnection();
			Statement statement=connection.createStatement();
			
			
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

	@Override
	public void updateData() {
		
		
		String updateQuery = "update studentsinfo set age = 32 where sid = 1;";
		
		try {
			Connection connection=ConnectionProvider.getConnection();
			Statement statement=connection.createStatement();
			
			
			statement.executeUpdate(updateQuery);
			System.out.println("Data is inserted Successfully");
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
}
	@Override
	public void deleteData() {
	
		String deleteQuery = "Delete from studentsinfo  where sid = 6;";
		
		try {
			Connection connection=ConnectionProvider.getConnection();
			Statement statement=connection.createStatement();
			
			
			statement.executeUpdate(deleteQuery);
			System.out.println("Data is inserted Successfully");
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		

}
}