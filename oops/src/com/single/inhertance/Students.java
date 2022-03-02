package com.single.inhertance;

public class Students extends Teacher {
	String StudentName;
	String Subject;
	
	public void takingTuition() {
		System.out.println(StudentName+" will goes daily for a tuition to learn "+Subject); //B Class  extends to
	}
	
	public void tuitionTiming() {
		System.out.println(TuitionTime+"is the time for the Weekend classes"); // A 
	}
}
