package com.inheritance.single;

public class Tester {
	public static void main (String args[]) {
		College college = new College(); 
		college.Name = "Bhargav";
		college.Subjects = "All subjects ";
		college.BoardName = "JNTU";
		college.Certification = "Degree";
		college.Semister = "Final";
		college.collegeExam();
		college.collegeResult();
	}
}
