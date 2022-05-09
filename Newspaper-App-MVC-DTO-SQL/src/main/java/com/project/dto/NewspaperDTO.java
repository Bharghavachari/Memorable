package com.project.dto;

public class NewspaperDTO {
	private String NewspaperName;
	private double Price;
	private String Language;
	private int NoOfPages;
	
	public NewspaperDTO() {
		super();
		
	}

	public NewspaperDTO(String newspaperName, double price, String language, int noOfPages) {
		super();
		NewspaperName = newspaperName;
		Price = price;
		Language = language;
		NoOfPages = noOfPages;
	}

	public String getNewspaperName() {
		return NewspaperName;
	}

	public void setNewspaperName(String newspaperName) {
		NewspaperName = newspaperName;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public String getLanguage() {
		return Language;
	}

	public void setLanguage(String language) {
		Language = language;
	}

	public int getNoOfPages() {
		return NoOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		NoOfPages = noOfPages;
	}

	@Override
	public String toString() {
		return "NewspaperDTO [NewspaperName=" + NewspaperName + ", Price=" + Price + ", Language=" + Language
				+ ", NoOfPages=" + NoOfPages + "]";
	}
	
	
	
}
