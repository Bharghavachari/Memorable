package com.parameter.constructor;

public class Apple {
	float Price;
	String Brand;
	String Color;
	int Ram;
	boolean isFingerPrintWorking;
	
	@Override
	public String toString() {
		return "Apple [Price=" + Price + ", Brand=" + Brand + ", Color=" + Color + ", Ram=" + Ram
				+ ", isFingerPrintWorking=" + isFingerPrintWorking + "]";
	}

	public Apple(float price) {
		super();
		Price = price;
	}

	public Apple(float price, String brand) {
		super();
		Price = price;
		Brand = brand;
	}

	public Apple(float price, String brand, String color) {
		super();
		Price = price;
		Brand = brand;
		Color = color;
	}

	public Apple(float price, String brand, String color, int ram) {
		super();
		Price = price;
		Brand = brand;
		Color = color;
		Ram = ram;
	}

	public Apple(float price, String brand, String color, int ram, boolean isFingerPrintWorking) {
		super();
		Price = price;
		Brand = brand;
		Color = color;
		Ram = ram;
		this.isFingerPrintWorking = isFingerPrintWorking;
	}
	
	
	
}
