package com.relation.java;

public class Book {

	String BookName;
	String Author;
	int NoOfPages;
	
	Library library;

	public void readBookProperties() {
		System.out.println("Book Name "+ BookName);
		System.out.println("Author "+ Author);
		System.out.println("NoOfPages "+ NoOfPages);
	}
	
	public void readLibraryProperties() {
		System.out.println("LibraryName "+ library.LibraryName);
		System.out.println("Location "+ library.Location);
		System.out.println("City "+ library.City);
		System.out.println("ContactNumber "+ library.ContactNumber);
		
	}
	
	public Book(String bookname, String author, int noOfPages, Library library) {
		super();
		BookName = bookname;
		Author = author;
		NoOfPages = noOfPages;
		this.library = library;
	}

	@Override
	public String toString() {
		return "Book [Book=" + BookName + ", Author=" + Author + ", NoOfPages=" + NoOfPages + ", librry=" + library + "]";
	}
	
	
}
