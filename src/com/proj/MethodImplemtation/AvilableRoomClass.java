/*
 * 
 * 
*/

package com.proj.MethodImplemtation;

import java.util.HashMap;
import java.util.Map;

import com.proj.Model.Room;

public class AvilableRoomClass {

	public Map<Integer,Room>  displayAvilableRooms(){	
		Room r;
		Map<Integer,Room> aviRoomMap=new HashMap<Integer, Room>();

		//initially set the id of each room and the status of each rooom to avilablity true using the loop
		//we are dynamically setting the roomnubers for each room object and putting in map
		//assuming room number start from 101 and have fixed number of room in hotel 
		//in this case i am assuming there are 5 rooms in hotel 
		
		if(ImplementationClass.avilableRoomMapObject.isEmpty()){
			int j=101;
				for(int i=1;i<=5;i++){
					r=new Room();	
					r.setId(j);//setting the roomnubers for each room object
					r.setStatus(true);//setting avilablity status as true and put in map 
					aviRoomMap.put(j,r);
					j++;
				}
			return aviRoomMap;
		}
		else{
			return ImplementationClass.getAvilableRoomMapObject();
		}
			//System.out.println("list of avilable rooms is   "+aviRoomMap);
		
	}
}
