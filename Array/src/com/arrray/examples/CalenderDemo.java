package com.arrray.examples;

public class CalenderDemo {
	public static void main (String[] args) {
		Calender mallige = new Calender ("cmedium",20," mallige"," paper");
		Calender sampige = new Calender (" small",15," sampige"," paper cut");
		
		Calender [] calenders = {mallige, sampige};
		
		for(Calender c:calenders) {
			System.out.println(c.toString());
		}
	}
}
