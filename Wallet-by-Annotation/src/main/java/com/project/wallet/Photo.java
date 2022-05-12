package com.project.wallet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Photo {
	@Value("White")
	String colour;
	
	@Value("2.5")
	double size;
	
	public Photo() {
		
		System.out.println("Object Created: "+this.getClass().getName());
		
	}
	public Photo(String colour, double size) {
		super();
		this.colour = colour;
		this.size = size;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	
	@Override
	public String toString() {
		return "Photo [colour=" + colour + ", size=" + size + "]";
	}
	
	
}
