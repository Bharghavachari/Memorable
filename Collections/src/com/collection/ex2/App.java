package com.collection.ex2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class App {
	public static void main (String[] args) {
		
		Map<Integer, String > std = new HashMap<Integer, String>();
		std.put(5,"Chari");
		std.put(1,"k");
		std.put(2,"Bhargav");
		
		/*for(Map.Entry<Integer, String> entry:std.entrySet()) {                 // for Method
			//System.out.println(entry);
			
			System.out.println("Key "+entry.getKey()+" values "+entry.getValue());  //Like Table form
		}*/
		Iterator<Entry<Integer, String >> entry = std.entrySet().iterator();  // while Method
		while(entry.hasNext()) {
		System.out.println(entry.next());	
		}
	}
}
