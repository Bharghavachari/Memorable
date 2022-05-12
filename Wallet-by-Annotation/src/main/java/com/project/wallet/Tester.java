package com.project.wallet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
	
	public static void main (String [] args) {
		
		String SpringConfigFile = "Spring.xml";
		
		ApplicationContext SpringContainer = new ClassPathXmlApplicationContext(SpringConfigFile);
		Wallet wallet = SpringContainer.getBean(Wallet.class);
		System.out.println(wallet);
		
	} 
}
