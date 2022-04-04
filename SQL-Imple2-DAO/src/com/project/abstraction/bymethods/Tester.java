package com.project.abstraction.bymethods;


public class Tester {
	public static void main (String []args) {
		TraineeDAOimpl impl = new TraineeDAOimpl();
		//impl.insertData();
		//impl.readAllData();
		//impl.readSingleData();
		//impl.updateData();
		impl.deleteData();
	}
}