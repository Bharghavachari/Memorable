package com.project.wallet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Wallet {
	@Value("White")
	private String colour;
	
	@Value("A_ONE")
	private Brand brand;
	
	@Autowired
	private Material material;
	
	@Value("200.00")
	private double price;
	
	@Autowired
	private Money money;
	
	@Autowired
	private ATMcard atmcard;
	
	@Autowired
	private Photo photo;
	
	public Wallet() {
		
		System.out.println("Object Created: "+this.getClass().getName());
		
	}
	public Wallet(String colour, Brand brand, Material material, double price, com.project.wallet.Money money,
			ATMcard atmcard, Photo photo) {
		super();
		this.colour = colour;
		this.brand = brand;
		this.material = material;
		this.price = price;
		this.money = money;
		this.atmcard = atmcard;
		this.photo = photo;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public Material getMaterial() {
		return material;
	}
	public void setMaterial(Material material) {
		this.material = material;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Money getMoney() {
		return money;
	}
	public void setMoney(Money money) {
		this.money = money;
	}
	public ATMcard getAtmcard() {
		return atmcard;
	}
	public void setAtmcard(ATMcard atmcard) {
		this.atmcard = atmcard;
	}
	public Photo getPhoto() {
		return photo;
	}
	public void setPhoto(Photo photo) {
		this.photo = photo;
	}
	
	@Override
	public String toString() {
		return "Wallet [colour=" + colour + ", brand=" + brand + ", material=" + material + ", price=" + price
				+ ", money=" + money + ", atmcard=" + atmcard + ", photo=" + photo + "]";
	}
	
	
	
	
}
