/*
 * Purpose of Class- provides command prompt Interface for Custoemr and Admin for input & output 
 * 
 * Input -User Can Input the Choice options as 1 or 2 or 3 For respective operations 
 * 
 * OutPut - for input 1 it displays the Avilable rooms in the hotel
 * 			for input 2 it prompts Request to Customer for his preffered checkIn Date followed by Room Id to book the room and finally request Checkout date  
 *      	for input 3 it Displays all the Room Booked by the customers on the Dates Followed by the Roomid that are already Booked
 
 * Method Called From - Default Main Method Called by JVM that starting point of the Application 
 * 
 * 
*/




package com.proj.mainGUI;

import java.util.Scanner;

import com.proj.MethodImplemtation.ImplementationClass;

public class MainCmd {
	
	public static void main(String args[]){
		System.err.println("Note- Before Booking a Room Avilable Rooms must be checkd ");
	int opt=0;
	Scanner sc=new Scanner(System.in);
			do{
				System.out.println("-------------------Menu-----------------------");
				System.out.println("Enter choice");
				System.out.println(" 1 ) Display available Rooms");
				System.out.println(" 2 ) Book a Room ");
				System.out.println(" 3 ) Display Booked Rooms (for admin)");
				System.out.println(" 4 ) Exit");
				System.out.println("-----------------------------------------------");
				String option=sc.nextLine();
				opt=Integer.parseInt(option);
				System.out.println("Entered option is "+opt);
				System.out.println("-------------------------------------------------");
				ImplementationClass icobject=new ImplementationClass(); 
				switch (opt) {
				case 1:
						icobject.displayAvilableRooms(); //calls the displayAvilableRooms method from ImplementationClass class,Displaying all avilable roooms in hotel
					break;
				case 2:
						icobject.BookRooms();//calls the BookRooms() method from ImplementationClass class,for process of Booking a Room from avilable roooms in hotel
					break;
				case 3:
						icobject.displayBookedRooms();//calls the displayBookedRooms method from Implementation class,for Admin to Displaying all avilable roooms in hotel
					break;

				default:
					break;
				}
			}
			while(opt!=4);
	}
}
