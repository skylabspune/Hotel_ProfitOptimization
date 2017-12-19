
//Purpose-- this Class has 3 methods that gives us the possible checkout date for a given checkIn date
//input --CheckIn Date given by the customer
//output-- gives us all the posssible valid checkout dates cosidering the WeekofDay Criteria as per the requirement 
//Note ---Three methods are used since each method is concered with the slot of month for the CheckIn Date applies 


package com.proj.MethodImplemtation;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

import com.proj.Model.Room;

public class PossibleCheckOutClass {
	public ArrayList<LocalDate> possibleCheckOutDatesMethod1(LocalDate checkInDate,Room r1){
		System.out.println("inside PossibleCheckOut Class Method");
		ArrayList<LocalDate>CheckOutDatesList=new ArrayList<>();
		SlotOfMonth sofmonthobj=new SlotOfMonth();
		LocalDate startDateofRent=sofmonthobj.getLD_slot1Start();	//case:1  Start permitted date of rentablity
		LocalDate EndDateofRent=sofmonthobj.getLD_slot1End();		//case:1  End permitted date of rentablity
		EndDateofRent=EndDateofRent.plusDays(1);
		while(checkInDate.isBefore(EndDateofRent)){
			if(checkInDate.getDayOfWeek()==checkInDate.getDayOfWeek().MONDAY||checkInDate.getDayOfWeek()==checkInDate.getDayOfWeek().FRIDAY){
				long days =ChronoUnit.DAYS.between(r1.getCheckInDate(),checkInDate); //counting the number of days between Actual CheckIn and new checkIn day
																					// incrementig the chekIn date by Looping
				if(days>=03&&days<=14){
					CheckOutDatesList.add(checkInDate);	//adding the possible chekout date into list of possible chekout list ArrayList
														//after cheking the day of week and number of days
					System.out.println(checkInDate+"Added to Possible CheckOut List "+checkInDate.getDayOfWeek());
				}
				
			}
			checkInDate=checkInDate.plusDays(1);
		}
		return CheckOutDatesList;
	}
	
	public ArrayList<LocalDate> possibleCheckOutDatesMethod2(LocalDate checkInDate,Room r1){
		ArrayList<LocalDate>CheckOutDatesList1=new ArrayList<>();
		SlotOfMonth sofmonthobj=new SlotOfMonth();
		LocalDate startDateofRent=sofmonthobj.getLD_slot2Start();	//case:2  Start permitted date of rentablity
		LocalDate EndDateofRent=sofmonthobj.getLD_slot2End();		//case:2  End permitted date of rentablity
		EndDateofRent=EndDateofRent.plusDays(1);
		while(checkInDate.isBefore(EndDateofRent)){
			if(checkInDate.getDayOfWeek()==checkInDate.getDayOfWeek().MONDAY||checkInDate.getDayOfWeek()==checkInDate.getDayOfWeek().FRIDAY){
				long days =ChronoUnit.DAYS.between(r1.getCheckInDate(),checkInDate);
				if(days>=3&&days<=14 &&checkInDate.getDayOfWeek()==checkInDate.getDayOfWeek().FRIDAY){
					CheckOutDatesList1.add(checkInDate);
					System.out.println(checkInDate+"Added to Possible CheckOut List "+checkInDate.getDayOfWeek());
				}
			}
			checkInDate=checkInDate.plusDays(1);
		}
		return CheckOutDatesList1;
	}
	
	public ArrayList<LocalDate> possibleCheckOutDatesMethod3(LocalDate checkInDate,Room r1){
		ArrayList<LocalDate>CheckOutDatesList2=new ArrayList<>();
		SlotOfMonth sofmonthobj=new SlotOfMonth();
		LocalDate startDateofRent=sofmonthobj.getLD_slot3Start();	//case:3  Start permitted date of rentablity
		LocalDate EndDateofRent=sofmonthobj.getLD_slot3End();		//case:3  End permitted date of rentablity
		EndDateofRent=EndDateofRent.plusDays(1);
		while(checkInDate.isBefore(EndDateofRent)){
			checkInDate=checkInDate.plusDays(1);
			if(checkInDate.getDayOfWeek()==checkInDate.getDayOfWeek().MONDAY||checkInDate.getDayOfWeek()==checkInDate.getDayOfWeek().FRIDAY){
				long days =ChronoUnit.DAYS.between(r1.getCheckInDate(),checkInDate);
				if(days>=07&&days<=21){
					CheckOutDatesList2.add(checkInDate);
					System.out.println(checkInDate+"Added to Possible CheckOut List "+checkInDate.getDayOfWeek());
				}
			}
			
		}
		return CheckOutDatesList2; //sending the list of possible ChekOut day list to BookRoom class's  BookRoomFunction  
	}
	
	
	
	

}
