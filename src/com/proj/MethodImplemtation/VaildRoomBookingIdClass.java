/*
 * Purpose of Class- Method  CheckValidRoomidMethod(int id) checks if the Customer inputs valid Room id
 * 
 *  	Input-  room id 
 *  
 * 		Output- Boolean value returned to alreadyroombookFlag object depending upon 
 * 				if the roomid entered by the customer is already inside the BookedRoomMap
 *  			if Booked Room Map already have the roomid then we conclude that room is already booked and return false
 *  
 * Called from -BookedRoomClass. BookRoomFunction() ..inside the if(ConfirmroomMapObj.containsKey(id))  
 * 
 * */



package com.proj.MethodImplemtation;

import java.util.Map;

import com.proj.Model.Room;

public class VaildRoomBookingIdClass {

	public static boolean CheckValidRoomidMethod(int id){
		Integer idobj=id;
		if(idobj.equals(ImplementationClass.bookedRoomMapObject.containsKey(idobj))){
			System.err.println("Sorry the room is already Booked");
			return false;
		}
			return true;
	}
	
}
