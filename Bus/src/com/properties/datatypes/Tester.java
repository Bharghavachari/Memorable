package com.properties.datatypes;

public class Tester {
 public static void main(String args[]) {
	 
	 Bus bus=new Bus();
	 bus.slno = 01;
	 bus.Capacity = 500;
	 bus.Name = "KSRTC";
	 bus.Color ="Red";
	 bus.BusNumber = "ka-05 JP 6655";
	 bus.ContactNumber = 8555048887L;
	 bus.busCanMove();
	 bus.busCanCarryPeople();
	 
	 System.out.println("Bus slno = "+bus.slno );
	 System.out.println("Bus Capacity = "+bus.Capacity );
	 System.out.println("Bus Name = "+bus.Name );
	 System.out.println("Bus Color = "+bus.Color );
	 System.out.println("Bus BusNumber = "+bus.BusNumber );
	 System.out.println("Bus ContactNumber = "+bus.ContactNumber );
 
}
}
