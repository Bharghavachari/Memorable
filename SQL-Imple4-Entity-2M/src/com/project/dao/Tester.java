package com.project.dao;

import com.project.entity.Trainee;

public class Tester {
	public static void main (String [] args) {
		TraineeDAOImpl impl= new TraineeDAOImpl();
		
		//Trainee trainee = new Trainee(3,"Just","m","java developer",8555012347L, "Bangalore",4500);
		//impl.insertData(trainee);
		
		//Trainee trainee1= new Trainee();
		//impl.readAllData(trainee1);
		
		//Trainee trainee2= new Trainee();
		//trainee2.setId(2);
		//impl.readSingleData(trainee2);
		
		//Trainee trainee3= new Trainee();
		//trainee3.setId(1);
		//trainee3.setDesignation("SQL Developer");
		//impl.updateData(trainee3);
		
		Trainee trainee4 = new Trainee();
		trainee4.setId(3);
		impl.deleteData(trainee4);
		
	}
}
