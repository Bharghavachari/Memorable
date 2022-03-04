package com.multilevel.example1;

public class Tester {
	public static void main(String args[]) {
	
	Mathematics mathematics = new Mathematics ();
	mathematics.length(20);
	System.out.println("********");
	
	Geometry geometry = new Geometry();
	geometry.length(30);
	geometry.perimeter(30, 40);
	System.out.println("********");
	
	Square square = new Square ();
	square.equalSides();
	square.length(40);
	square.perimeter(40, 50);
	System.out.println("********");
}
}