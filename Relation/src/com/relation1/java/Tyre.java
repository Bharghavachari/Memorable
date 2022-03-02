package com.relation1.java;

public class Tyre {
	String Name;
	String Color;
	String Brand;
	double Price;
	long SlNo;
	
	Bike bike;
	
	public void displayBikeProperties() {
	System.out.println("Bike name "+bike.Name);
	System.out.println("Bike color"+bike.Color);
	System.out.println("Bike brand"+bike.Brand);
	System.out.println("Bike price"+bike.Price);
	System.out.println("Bike slno"+bike.SlNo);
	}
	
	public void displayTyreProperties() {
	System.out.println("Tyre name"+Name);
	System.out.println("Tyre color"+Color);
	System.out.println("Tyre brand"+Brand);
	System.out.println("Tyre price"+Price);
	System.out.println("Tyre slno"+SlNo);
	}

	public Tyre(String name, String color, String brand, double price, long slNo, Bike bike) {
		super();
		Name = name;
		Color = color;
		Brand = brand;
		Price = price;
		SlNo = slNo;
		this.bike = bike;
	}

	@Override
	public String toString() {
		return "Tyre [Name=" + Name + ", Color=" + Color + ", Brand=" + Brand + ", Price=" + Price + ", SlNo=" + SlNo
				+ ", bike=" + bike + "]";
	}

	
	
	
}
