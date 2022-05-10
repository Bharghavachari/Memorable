package com.properti.datatypes;

public class Test {
	public static void main(String args[]) {
		
		Two t1 = new Two();
		t1.slno = 01;
		t1.name = "tata";
		t1.color = "green";
		
		System.out.println("tata slno = "+Two.slno);
		System.out.println("tata name = "+Two.name);
		System.out.println("tata color = "+Two.color);
		System.out.println("*******");
		
		Two t2 = new Two();
		t2.slno = 10;
		t2.name = "volvo";
		t2.color = "Orange";
		
		System.out.println("volvo slno = "+Two.slno);
		System.out.println("volvo name = "+Two.name);
		System.out.println("volvo color = "+Two.color);
	}
}
