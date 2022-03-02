package com.relation.java;

public class AggregationTester {
	public static void main(String args[]) {
		Library library = new Library ("= Bhargav","= Electronic City","= Bangalore", 85550.48847);
		Book book = new Book("= Core Java","= Chari",900,library);
		book.library=library;
		book.readBookProperties();
		System.out.println("#########");
		book.readLibraryProperties();
	}
}
