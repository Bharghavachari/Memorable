package com.relation1.java;

public class Bike {
	String Name;
	String Color;
	String Brand;
	double Price;
	long   SlNo;
	
	public Bike() {
		
	}
	
	public Bike(String name, String color, String brand, double price, long slNo) {
		super();
		Name = name;
		Color = color;
		Brand = brand;
		Price = price;
		SlNo = slNo;
	}

	@Override
	public String toString() {
		return "Bike [Name=" + Name + ", Color=" + Color + ", Brand=" + Brand + ", Price=" + Price + ", SlNo=" + SlNo
				+ "]";
	}
	
	
	
}
