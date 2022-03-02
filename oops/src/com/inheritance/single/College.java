package com.inheritance.single;

public class College extends University {
	String Name;
	String Subjects;
	
	void collegeExam() {
		System.out.println(Name+" from Bit College "+Subjects+"is Passed");
	}
	
	void collegeResult() {
		System.out.println(BoardName+" is provided "+Certification+" for all "+Semister+" subjects");
	}
}
