package com.project.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.project.connection.ConnectionProvider;
import com.project.entity.Trainee;


public class TraineeDAOImpl implements TraineeDAO {

	@Override
	public void insertData(Trainee trainee ) {
		System.out.println("Invoked save Data Method");
		
		
		String insertQuery = "insert into trainee value(?,?,?,?,?,?,?);";
		
		try {
			Connection connection=ConnectionProvider.getConnection();
			PreparedStatement preparedstatement = connection.prepareStatement(insertQuery);
			preparedstatement.setInt(1,trainee.getId());
			preparedstatement.setString(2,trainee.getName());
			preparedstatement.setString(3, trainee.getGender());
			preparedstatement.setString(4, trainee.getDesignation());
			preparedstatement.setLong(5, trainee.getMobileNumber());
			preparedstatement.setString(6, trainee.getLacation());
			preparedstatement.setInt(7, trainee.getSalary());
			
			preparedstatement.executeUpdate();
			System.out.println("Data is insert sucessfully");
			Statement statement=connection.createStatement();
			statement.executeUpdate(insertQuery);
			
		}
	catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
	 
}
	@Override
	public void readAllData(Trainee trainee) {
		
		
		
		String ReadAllData = "SELECT * FROM trainee";
		
		try {
			
			Connection connection=ConnectionProvider.getConnection();
			Statement statement=connection.createStatement();
			PreparedStatement preparedstatement = connection.prepareStatement(ReadAllData);
			
			ResultSet resultset = preparedstatement.executeQuery(ReadAllData);
		while (resultset.next()){
		System.out.println("id"+	preparedstatement.getResultSet().getInt(1));
		System.out.println("name"+	preparedstatement.getResultSet().getString(2));
		System.out.println("gender"+	preparedstatement.getResultSet().getString(3));
		System.out.println("designation"+	preparedstatement.getResultSet().getString(4));
		System.out.println("mobileNumber"+	preparedstatement.getResultSet().getLong(5));
		System.out.println("locaton"+	preparedstatement.getResultSet().getString(6));
		System.out.println("salary"+	preparedstatement.getResultSet().getInt(7));
				
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
		public void readSingleData(Trainee trainee) {
			System.out.println("Invoked save Data Method");
			
			String readSingleData = "select * from trainee where id =?";
			
			try {
				Connection connection=ConnectionProvider.getConnection();
				PreparedStatement preparedstatement = connection.prepareStatement(readSingleData);
				preparedstatement.setInt(1, trainee.getId());
				
				ResultSet resultset = preparedstatement.executeQuery();
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
	public void updateData(Trainee trainee) {
		System.out.println("Invoked save Data Method");
		
		String updateData = "update trainee set designation =? where id = ?";     //  Not  = " ? "
		
		try {
			Connection connection = ConnectionProvider.getConnection();
			PreparedStatement preparedstatement = connection.prepareStatement(updateData);
			preparedstatement.setString(1, trainee.getDesignation());
			preparedstatement.setInt(2, trainee.getId());
			preparedstatement.executeUpdate();
			System.out.println("Data is Updated Successfully");
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	@Override
	public void deleteData(Trainee trainee) {
		System.out.println("Invoked save Data Method");
		
		String deleteData = "Delete from trainee  where id = ?";
		
		try {
			Connection connection = ConnectionProvider.getConnection();
			
			PreparedStatement preparedstatement = connection.prepareStatement(deleteData);
			preparedstatement.setInt(1,trainee.getId());
			preparedstatement.executeUpdate();
			System.out.println("Data is Deleted Successfully");
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
	
	
	}
}
	
	
		
	

	

	

	

		
	

