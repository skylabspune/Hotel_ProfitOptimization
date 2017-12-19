/*
 * Purpose of Class- this class implements primary methods of the appplication ie- displayAvilableRooms(),BookRooms(),displayBookedRooms()
 * 
 * Inputs -Room Object is input parameter for BookRooms(),displayBookedRooms() sent from main class method and No Input for displayAvilableRooms();
 * 
 * OutPuts- Nill  (performs operation as per the Calle (Main method)
 * 
 * Called From- Since All Methods are Primary Method operations of applications hence are called from Main Method
 * 
 * 
*/
package com.proj.MethodImplemtation;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.proj.Model.Room;

public class ImplementationClass {
	static Map<Integer,Room> avilableRoomMapObject=new HashMap<Integer,Room>();;
	static Map<Integer,Room> bookedRoomMapObject=new HashMap<Integer, Room>();
	

	
	public static Map<Integer, Room> getBookedRoomMapObject() {
		return bookedRoomMapObject;
	}

	public static void setBookedRoomMapObject(Map<Integer, Room> bookedRoomMapObject) {
		ImplementationClass.bookedRoomMapObject = bookedRoomMapObject;
	}
	
	public static Map<Integer, Room> getAvilableRoomMapObject() {
		return avilableRoomMapObject;
	}

	public static void setAvilableRoomMapObject(Map<Integer, Room> avilableRoomMapObject) {
		ImplementationClass.avilableRoomMapObject = avilableRoomMapObject;
	}

	public void displayAvilableRooms(){
		System.out.println("inside Display Aviable Rooms Function");
		AvilableRoomClass avilableroomclasscObj=new AvilableRoomClass();
		avilableRoomMapObject=avilableroomclasscObj.displayAvilableRooms();
		System.out.println(avilableRoomMapObject);
	}
	
	public void BookRooms(){
		
		//this method is responsible to switch the control according to checkIn date (Considering the date and calculating in which solt of month it belongs to ) 
		//by calling the slotOfMonth(roomObj); that returns the int value after computing in which slot of month
		//Switch Statements are used since it is more Effecient than the If_Else_Loop in sensen of Time Complexity 
		//for Justification Refer  https://discuss.codechef.com/questions/86082/switch-vs-if-else 
		
		Room roomObj=new Room();
		Scanner sc= new Scanner(System.in);
		System.out.println("inside BookRooms Function");
		System.out.println("Enter the checkIn Date in YYY-MM-DD FORMAT..");
		System.err.println("CheckIn Date Strictly of yyyy-mm-dd Format else it will Terminate");
		System.err.println("In case of Single digit Date make use of ZERO ie-0 as prefix in MM or DD of date");
		String date=sc.nextLine();
		LocalDate checkInDate=LocalDate.parse(date);
		roomObj.setCheckInDate(checkInDate);
		LocalDate citemp=roomObj.getCheckInDate();
		System.out.println("your Chekin Date is Set"+citemp);
		DayOfWeek CheckInWeekOfDay=citemp.getDayOfWeek();
		SlotOfMonth sfm=new SlotOfMonth(); 	
			int slotofmonth=sfm.slotOfMonth(roomObj); //checking for the slot between specified month used from com.proj.SlotofMonth Class
			boolean dayofweek=false;
			DayOfWeekClass dayofwkobj=new DayOfWeekClass();
			switch (slotofmonth) {
			case 1: 
					dayofweek=dayofwkobj.checkDayofWeekCase1(roomObj);
					//if_&_only_if week of day criteria is fullfilled then checkDayofWeekCase1 returns TRUE and goes 
					//inside the If for further computation else the function exits gracefully if false is returned
					//if day is MONDAY OR FRIDAY then TRUE
					
						if(dayofweek){	
							System.out.println("CheckIn Day of Week is "+CheckInWeekOfDay);
							System.out.println("Seems that your CheckIn Date Fulfills the Day of Week Criteria(MONDAY OR Friday)");
							BookRoomClass bookroomObj=new BookRoomClass();
							ImplementationClass imclassobj=new ImplementationClass();
							//bookroomObj.BookRoomFunction(checkInDate,avilableRoomMapObject);
							bookroomObj.BookRoomFunction(checkInDate,imclassobj,slotofmonth);
							 
							
						}
						else{
							
							System.out.println("CheckIn Day of Week is "+CheckInWeekOfDay);
							System.out.println("Enter Valid CheckIn date that is either on MONDAY OR Friday ");
						}
			break;
			case 2:
				dayofweek=dayofwkobj.checkDayofWeekCase2(roomObj);
				//if_&_only_if week of day criteria is fullfilled(ie-checkIn day is MONDAY Only) then checkDayofWeekCase2 returns TRUE and goes 
				//inside the If for further computation else the function exits gracefully if false is returned
					if(dayofweek){	
						System.out.println("CheckIn Day of Week is "+CheckInWeekOfDay);
						System.out.println("Seems that your CheckIn Date Fulfills the Day of Week Criteria(MONDAY)");
						BookRoomClass bookroomObj=new BookRoomClass();
						ImplementationClass imclassobj=new ImplementationClass();
						//bookroomObj.BookRoomFunction(checkInDate,avilableRoomMapObject);
						bookroomObj.BookRoomFunction(checkInDate,imclassobj,slotofmonth);
					}
					else{
						System.out.println("CheckIn Day of Week is "+CheckInWeekOfDay);
						System.out.println("Enter Valid CheckIn date that is only MONDAY  ");
					}
			break;
			case 3:
				dayofweek=dayofwkobj.checkDayofWeekCase3(roomObj);
				//if_&_only_if week of day criteria is fullfilled(ie-checkIn day is MONDAY OR FRIDAY Only) then checkDayofWeekCase2 returns TRUE and goes 
				//inside the If for further computation else the function exits gracefully if false is returned
		
					if(dayofweek){	
						System.out.println("CheckIn Day of Week is "+CheckInWeekOfDay);
						System.out.println("Seems that your CheckIn Date Fulfills the Day of Week Criteria(MONDAY OR Friday)");
						BookRoomClass bookroomObj=new BookRoomClass();
						ImplementationClass imclassobj=new ImplementationClass();
						//bookroomObj.BookRoomFunction(checkInDate,avilableRoomMapObject);
						bookroomObj.BookRoomFunction(checkInDate,imclassobj,slotofmonth);
					}
					else{
						System.out.println("CheckIn Day of Week is "+CheckInWeekOfDay);
						System.out.println("Enter Valid CheckIn date that is either on MONDAY OR Friday ");
					}
			break;

			default:
				break;
			}
			
		
	}
	
	public void displayBookedRooms(){
		System.out.println("inside  Already BookedRooms Function");
		System.out.println("Already Booked Rooms are"+bookedRoomMapObject);

	}
	

}
