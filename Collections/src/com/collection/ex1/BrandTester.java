package com.collection.ex1;

import java.util.ArrayList;
import java.util.ListIterator;

public class BrandTester {
	public static void main (String[] args) {
		BrandsDTO brand = new BrandsDTO();
		brand.setBrandid(150);
		brand.setBrandName("Raymond");
		brand.setEstablished(1995);
		brand.setIndustryType("Automative");
		brand.setHeadQuater("Bangalore");
		
		BrandsDTO brand1 = new BrandsDTO();
		brand1.setBrandid(200);
		brand1.setBrandName("Maruthi");
		brand1.setEstablished(2000);
		brand1.setIndustryType("Tetile");
		brand1.setHeadQuater("Hyderbad");
		
		java.util.List<BrandsDTO> list = new ArrayList<BrandsDTO>();
		list.add(brand);
		list.add(brand1);
		//System.out.println(list);
		
		ListIterator<BrandsDTO> itr = list.listIterator();
		System.out.println("Foward direction");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Reverse direction");
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	java.util.List<String>list1 = new ArrayList<String>();
	list1.add("life");
	list1.add("is ");
	list1.add("so");
	list1.add("beautiful");
	System.out.println(list1);
	}
	
}
