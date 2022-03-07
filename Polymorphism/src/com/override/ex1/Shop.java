package com.override.ex1;

public class Shop extends Factory {
	
	@Override
	public void costOFSoap(String Amount) {
		System.out.println(" Price of Soap in Shop = "+Amount);
		}
	@Override
	public void costOFBrushy(String Amount) {
			System.out.println(" Price of Brush in Shop = "+Amount);
}

}