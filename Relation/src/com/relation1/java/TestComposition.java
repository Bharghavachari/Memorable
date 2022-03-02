package com.relation1.java;

public class TestComposition {
	public static void main(String args[]) {
		Bike bike = new Bike ("pulsar", "Blue", "Bajaj", 35.000d, 8090);
		Tyre tyre = new Tyre ("MRF", "Black", "Bajaj", 1500.00d, 9090, bike);
		tyre.bike = bike;
			//tyre.displayBikeProperties();
			//System.out.println("$$$$$");
			//tyre.displayTyreProperties(); 
		System.out.println(tyre);
		//System.out.println(bike);  
		
	}
}
