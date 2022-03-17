package com.aryyalist.ex;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		java.util.List<String> list = new ArrayList<String>();
		
		list.add("Bhargav");
		list.add("Dinesh");
		list.add("Mahindran");
		list.add("Justin");
		list.add("Sagar");
		
		//System.out.println(list);   
		
		Iterator<String> itr = list.iterator(); //by using iterator method preferable
		while (itr.hasNext()){
			System.out.println(itr.next());
		}
	
		/*for(String str:list) {
			System.out.println(str);		
			
			}*/
	}
}
