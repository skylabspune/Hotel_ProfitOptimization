package com.proj.MethodImplemtation;
//this method BookRoomFunction(LocalDate checkInDate,ImplementationClass imclassobj) is called from the Switch case of implementation class.BookRooms() Method
//Method is responsibel for taking Room id and checkInDate and give the possible 
//valid checkout dates by applying the constartints of minimum number of Stay in room for Customer
//from which the customer can enter and Book his room by the list of valid checkout dates that are possible,
//calculated by this method.

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.proj.Model.Room;

public class BookRoomClass {
	
	public void BookRoomFunction(LocalDate checkInDate,ImplementationClass imclassobj,int slotofmonth) {
		LocalDate CheckoutDate;
		boolean alreadyroombookFlag=false;
		ArrayList<LocalDate>CheckOutDatesList=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.err.println("Enter the Room Id to Book a Room From List of Avilable Rooms");
	
		int id=Integer.parseInt(sc.nextLine());
		/*alreadyroombookFlag=VaildRoomBookingIdClass.CheckValidRoomidMethod(id);
		  if(alreadyroombookFlag){*/
		Map<Integer,Room> ConfirmroomMapObj; //type get the map of avilable rooms.
		ConfirmroomMapObj=imclassobj.getAvilableRoomMapObject();
		System.out.println("inside BookRoom Class BookRoomFunction");
		Room r1=new Room() ;
		System.out.println(ConfirmroomMapObj);
			if(ConfirmroomMapObj.containsKey(id)){	//checking if the entered roomid by user actually exists in avilable roomobjectMap
				//r1=new Room(); 
				r1=ConfirmroomMapObj.get(id);
				System.out.println("room object retrived out of map "+r1);
				alreadyroombookFlag=VaildRoomBookingIdClass.CheckValidRoomidMethod(id);  //checking if user is booking a room that is already booked
					if(alreadyroombookFlag){
						r1.setStatus(false);	//setting the status of the object with rid as avilablity as fasle and 
											   //setting the checkIn date for the retrived object using the rid from the map
						r1.setCheckInDate(checkInDate);
					}
				System.out.println("Status of Object retrived out of map "+r1);	
			}
			 
			PossibleCheckOutClass pco=new PossibleCheckOutClass();
			
			
			switch (slotofmonth) {
			case 1:CheckOutDatesList=pco.possibleCheckOutDatesMethod1(checkInDate,r1);
				break;
			case 2:CheckOutDatesList=pco.possibleCheckOutDatesMethod2(checkInDate,r1);
				break;
			case 3:CheckOutDatesList=pco.possibleCheckOutDatesMethod3(checkInDate,r1);
				break;
			default:
				break;
			}
			 System.err.println("Possible CheckOut list From BookRoomClass"+CheckOutDatesList);
			 System.err.println("Enter Only of Posssible CheckOut Date(yyyy-mm-dd) From previous Line above");
			// CheckoutDate=LocalDate.parse(sc.nextLine());
			 String tempcheckout=sc.nextLine();
			 LocalDate  CheckoutDate1=LocalDate.parse(tempcheckout);
			 System.out.println("Entered CheckOut date is "+CheckoutDate1);
			if(CheckOutDatesList.contains(CheckoutDate1)){ //checking if the Entered CheckOut date by customer is present 
														  //in the posssible valid chekout list 
				r1.setCheckOutDate(CheckoutDate1);
				System.out.println("CheckOut Date from getter is "+r1.getCheckOutDate());
				Room r2=new Room();
				r2=ConfirmroomMapObj.remove(r1.getId());
				System.out.println("................................................................................................................................");
				System.err.println("Thank You your Room  Number "+r2.getId()+" has been booked Sucesfully..from  "+r2.getCheckInDate()+"  to " +r2.getCheckOutDate());
				System.out.println("................................................................................................................................");
				System.out.println("Object removed from map is "+r2);
				//Room roomtemp=new Room();
				
				/* Map<Integer,Room>bookedRoomMapObject1=new HashMap<Integer, Room>();*/
				 ImplementationClass.bookedRoomMapObject.put(r2.getId(),r2);
					//System.out.println("Booked Room Map is "+bookedRoomMapObject1);	
			}
			
 		 
	}
}
