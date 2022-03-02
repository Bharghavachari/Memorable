package com.relation.java;

public class Library {
	String LibraryName;
	String Location;
	String City;
	double ContactNumber;
	
	public Library() {
		
	}
	
	public Library(String libraryName, String location, String city, double contactnumber) {
		super();
		LibraryName = libraryName;
		Location = location;
		City = city;
		ContactNumber = contactnumber;
	}

	
	@Override
	public String toString() {
		return "Library [LibraryName=" + LibraryName + ", Location=" + Location + ", City=" + City + ", ContactNumber="
				+ ContactNumber + "]";
	}
	
}
