package com.project.tester;

import com.project.dao.StudentsDaoImpl;

public class Tester {

	public static void main(String[] args) {
		
		StudentsDaoImpl Impl = new StudentsDaoImpl();
		//Impl.insertStudentsEntityData();
		//Impl.getStudentsEntityDataByID();
		//Impl.updateStudentsEntityData();
		Impl.deleteStudentsEntityData();
	}

}
