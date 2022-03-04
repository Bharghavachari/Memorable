package com.multilevel.example2;

public class Tester {
	public static void main(String args[]) {
		
		Justin justin = new Justin();
		justin.Result();
		justin.PgCourseEligibleForJustin();
		justin.resultForJustin();
		justin.eligibleForPgCource();
		System.out.println("*******");
		
		justin.Result();
		justin.PgCourseEligibleForBhargav();
		justin.resultOfBhargav();
		justin.eligibleForPgCource();
		System.out.println("*******");
		
		justin.Result();
		justin.PgCourseEligibleForDinesh();
		justin.resultOfDinesh();
		justin.eligibleForPgCource();
		System.out.println("*******");
	}
}
