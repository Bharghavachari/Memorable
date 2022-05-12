package com.project.wallet;

public class Money {
	
	private String type;
	private String size;
	public Money() {
		
		System.out.println("Object Created: "+this.getClass().getName());

	}
	public Money(String type, String size) {
		super();
		this.type = type;
		this.size = size;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	@Override
	public String toString() {
		return "money [type=" + type + ", size=" + size + "]";
	}
	
	
	
}
