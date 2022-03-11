package com.exception.ex;

public class Trail {
	public static void main (String [] args) {
		
		try{
			double data = 10.5/2.9;                    // double data = 0/0;
			System.out.print( data);
			System.out.println("  is the answer");
		}
		catch(ArithmeticException e){
			System.out.println("invalid data");   //invalid data
			System.out.println("bhargav");        //bhargav
			
		}
		
	
		/*int data = 1/0;
		System.out.println(data);
		System.out.println("bhargav");
		System.out.println("Dinesh");
		System.out.println("sagar");*/
	}
}
