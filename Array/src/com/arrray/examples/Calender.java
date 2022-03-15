package com.arrray.examples;

public class Calender {
	String Size;
	int Price;
	String Name;
	String Type;
	
	
	public Calender(String size, int price, String name, String type) {
		super();
		Size = size;
		Price = price;
		Name = name;
		Type = type;
	}

	@Override
	public String toString() {
		return "Calender [Size=" + Size + ", Price=" + Price + ", Name=" + Name + ", Type=" + Type + "]";
	}
	
}
