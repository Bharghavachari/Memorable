package com.collection.ex2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDeo {
	public static void main(String [] args) {
		Set<String> demo = new HashSet<String>();  //HashSet   //jumbling
	demo.add("Bhargav");
	demo.add("Dinesh");
	demo.add("sagar");
	demo.add("mahindran");
	demo.add("manoj");
	
	/*for(String str:demo) {
		System.out.println(str);     // by using for method
	}*/
	
	Iterator<String> itr = demo.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	}
}
