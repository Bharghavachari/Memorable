package com.abstraction.interfaceeEx1;

public class Bus {
	private String Name;
	private String Color;
	private String Brand;
	private String BusNumber;
	public long ContactNumber;
	/*public String getName() {           //Getters and Setters
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getBusNumber() {
		return BusNumber;
	}
	public void setBusNumber(String busNumber) {
		BusNumber = busNumber;
	}
	public long getContactNumber() {
		return ContactNumber;
	}
	public void setContactNumber(long contactNumber) {
		ContactNumber = contactNumber;
	}*/
	@Override
	public String toString() {
		return "Bus [Name=" + Name + ", Color=" + Color + ", Brand=" + Brand + ", BusNumber=" + BusNumber
				+ ", ContactNumber=" + ContactNumber + "]";
	}
	
}