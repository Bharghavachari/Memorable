package com.parameter.constructor;

public class Tester {
	public static void main (String args[]) {
		
		
		Apple apple = new Apple(15000.00f);
		Apple apple1 = new Apple(15000.00F,"i7");
		Apple apple2 = new Apple(15000.00f,"i7","Blue");
		Apple apple3 = new Apple(15000.00f,"i7","Blue",4);
		Apple apple4 = new Apple(15000.00f,"i7","Blue",4,true);
		
		System.out.println("Data of "+apple);
		System.out.println("Data of "+apple1);
		System.out.println("Data of "+apple2);
		System.out.println("Data of "+apple3);
		System.out.println("Data of "+apple4);
		
		/*System.out.println(apple.Price);
		System.out.println("**********");
		
		Apple apple1 = new Apple(15000.00F,"i7");
		System.out.println(apple.Price);
		System.out.println(apple1.Brand);
		System.out.println("**********");
		
		Apple apple2 = new Apple(15000.00f,"i7","Blue");
		System.out.println(apple.Price);
		System.out.println(apple1.Brand);
		System.out.println(apple2.Color);
		System.out.println("**********");
		
		Apple apple3 = new Apple(15000.00f,"i7","Blue",4);
		System.out.println(apple.Price);
		System.out.println(apple1.Brand);
		System.out.println(apple2.Color);
		System.out.println(apple3.Ram);
		System.out.println("**********");
		
		Apple apple4 = new Apple(15000.00f,"i7","Blue",4,true);
		System.out.println(apple.Price);
		System.out.println(apple1.Brand);
		System.out.println(apple2.Color);
		System.out.println(apple3.Ram);
		System.out.println(apple4.isFingerPrintWorking);
		System.out.println("**********");
		*/
	}

	public Tester() {
		super();
		// TODO Auto-generated constructor stub
	}
}
