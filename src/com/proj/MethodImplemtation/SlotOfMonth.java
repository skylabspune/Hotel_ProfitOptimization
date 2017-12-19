package com.proj.MethodImplemtation;

import java.time.LocalDate;

import com.proj.Model.Room;

public class SlotOfMonth {
	
	/*checking for the slot between specified month used from com.proj.SlotofMonth 
	that returns the int values as 1 2 or 3 to apply the conditions specified  according to requirement
		if 1 is return then --  condition  1 checking for MONDAY & FRIDAY As Check-In Day
		if 2 is returned then--  condition 2 checking for MONDAY As Check-In Day
		if 3 is returned then--  condition 3 checking for MONDAY & FRIDAY As Check-In Day 
	*
	*
	*/
	String S_slot1Startdate="2016-11-01";
	LocalDate LD_slot1Start=LocalDate.parse(S_slot1Startdate);

	String S_slot1Enddate="2016-11-14";
	LocalDate LD_slot1End=LocalDate.parse(S_slot1Enddate);
	

	String S_slot2Startdate="2016-11-21";
	LocalDate LD_slot2Start=LocalDate.parse(S_slot2Startdate);

	String S_slot2Enddate="2016-12-02";
	LocalDate LD_slot2End=LocalDate.parse(S_slot2Enddate);

	
	String S_slot3Startdate="2016-12-03";
	LocalDate LD_slot3Start=LocalDate.parse(S_slot3Startdate);

	String S_slot3Enddate="2017-01-02";
	LocalDate LD_slot3End=LocalDate.parse(S_slot3Enddate);

	
	
	public  int slotOfMonth(Room roomobj){
		//this method helps in computing whch slot of month the program must choose  
		// since depending on the moths criteria the DAY of WEEK and NUMBER of DAYS conditions can be applied
		
		
		if(roomobj.getCheckInDate().isAfter(LD_slot1Start)&& roomobj.getCheckInDate().isBefore( LD_slot1End)||roomobj.getCheckInDate().isEqual(LD_slot1Start)|| roomobj.getCheckInDate().isEqual(LD_slot1End)	){
			System.out.println("Inside Case 1");
			System.out.println("your CheckIn Date applies to case 1 "+LD_slot1Start+"---"+roomobj.getCheckInDate()+"---"+LD_slot1End);
			return 1;
		}
		else if(roomobj.getCheckInDate().isAfter(LD_slot2Start)&& roomobj.getCheckInDate().isBefore( LD_slot2End)||roomobj.getCheckInDate().isEqual(LD_slot2Start)|| roomobj.getCheckInDate().isEqual(LD_slot2End)){
			System.out.println("Inside Case 2");
			System.out.println("your CheckIn Date applies to case 2 "+LD_slot2Start+"---"+roomobj.getCheckInDate()+"---"+LD_slot2End);
			return 2;
		}
		else if(roomobj.getCheckInDate().isAfter(LD_slot3Start)&& roomobj.getCheckInDate().isBefore( LD_slot3End)||roomobj.getCheckInDate().isEqual(LD_slot3Start)|| roomobj.getCheckInDate().isEqual(LD_slot3End)) {
			System.out.println("Inside Case 3");
			System.out.println("your CheckIn Date applies to case 3 "+LD_slot3Start+"---"+roomobj.getCheckInDate()+"---"+LD_slot3End);
			return 3;	
		}
					
		return 0;
		
	}
	
	public LocalDate getLD_slot1Start() {
		return LD_slot1Start;
	}
	public LocalDate getLD_slot1End() {
		return LD_slot1End;
	}
	public LocalDate getLD_slot2Start() {
		return LD_slot2Start;
	}
	public LocalDate getLD_slot2End() {
		return LD_slot2End;
	}
	public LocalDate getLD_slot3Start() {
		return LD_slot3Start;
	}
	public LocalDate getLD_slot3End() {
		return LD_slot3End;
	}
	public void setLD_slot3End(LocalDate lD_slot3End) {
		LD_slot3End = lD_slot3End;
	}

}
