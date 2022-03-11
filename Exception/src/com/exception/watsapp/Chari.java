package com.exception.watsapp;

public class Chari {
	public static void main(String[] args) {
		String[] Names= {"bhargav","Dinesh","sagar","Justin","mahi",};
		
		File File = new File();
		Watsapp watsapp = new Watsapp();
		
		try{
			watsapp.createGroup(Names);
			watsapp.shareFiles(File);
		}
		catch(Exception e) {
			if(Names.length>5){
				System.out.println(e.getMessage());
				}
			 
			 else {
				System.out.println(e);
			}
			
		}
	}
}
