package com.exception.watsapp;

public class Watsapp {
	public void createGroup(String [] Names) {
		
		if(Names.length>5) {
			throw new WatsappException();
			}
		else {
			System.out.println("Watsapp group created Successfully");
			}
		}
		public void shareFiles(File File) {
			if(File.Size>1000) {
				throw new WatsappException();
			}
		else {
				System.out.println("File Uploaded Successfully");
				}
		}
	}

