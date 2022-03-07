package com.polymorphysum.example2;

public class Facebook {
	
	public void userSearch(int userId) {
		System.out.println("Search Result for User Id found " + userId);
	}
	public void userSearch(long PhoneNumber) {
		System.out.println("Search Result for PhoneNumber found "+ PhoneNumber);
	}
	public void userSearch(String FirstName, String LastName) {
		System.out.println("Search Result for FullName found " + FirstName+LastName);
	}
}
