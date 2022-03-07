package com.override.ex1;

public class Tester {
	public static void main (String args[]) {
		
		Factory factory = new Factory ();
		factory.costOFSoap("25");
		factory.costOFBrushy("15");
		
		Shop shop = new Shop();
		shop.costOFSoap("30");
		shop.costOFBrushy("20"); 
		System.out.println("*************");
		
		Factory factory1 = new Shop();
		factory1.costOFSoap("30");
		factory1.costOFBrushy("20");
	}
}
