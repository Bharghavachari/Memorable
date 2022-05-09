package com.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table (name = "paper")
@NamedQuery(name = "Newspaper.getpaperObject", query = "from Newspaper where Newspaper : name")
public class Newspaper {
	@Id
	@GeneratedValue( generator = "abc")
	@GenericGenerator(name  = "abc ", strategy = "incement")
	@Column (name = "NAME")
	private String NewspaperName;
	
	@Column (name = "PRICE")
	private double Price;
	
	@Column (name = "LANGUAGE")
	private String Language;
	
	@Column (name = "NOOFPAGES")
	private int NoOfPages;
	
	public Newspaper() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Newspaper(String newspaperName, double price, String language, int noOfPages) {
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
		return "Newspaper [NewspaperName=" + NewspaperName + ", Price=" + Price + ", Language=" + Language
				+ ", NoOfPages=" + NoOfPages + "]";
	}
	
	
	
	
}
