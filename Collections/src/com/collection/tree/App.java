package com.collection.tree;


import java.util.Map;
import java.util.TreeMap;

public class App {
	public static void main (String[] args) {
		
		Map<Code,String> lecturer = new TreeMap<Code, String>();    //TressMap compareTo Must Use
		lecturer.put(new Code("S01","L03"),"Datatypes");
		lecturer.put(new Code("S02","L01"),"variables");
		lecturer.put(new Code("S05","L06"),"Oops");
		
		for(Map.Entry<Code, String> entry:lecturer.entrySet()) {                 // for Method
			//System.out.println(entry);
			
			System.out.println("Key "+entry.getKey()+" values "+entry.getValue());  //Like Table form
		}
}
}