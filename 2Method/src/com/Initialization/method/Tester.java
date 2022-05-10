package com.Initialization.method;

public class Tester {
	public static void main(String args[]) {
		
		Student s1 = new Student ();
		Student s2 = new Student ();
		
		s1.insertRecord(111,"karan");
		s2.insertRecord(222,"Aryan");
		s1.displayInformation();
		s2.displayInformation();
	}
}
