/* Purpose of Class-this class has 3 methods checkDayofWeekCase1, checkDayofWeekCase2 ,checkDayofWeekCase3
 * 					that returns Boolean value to dayofweek Object inside the the If Condition of three Cases in the BookRoom() Method inside the Implementation class
 * 					if dayofweek is true then futher computation takes place other wise the Bookroom excecution is halted immediately
 * 
 * Input -			Room obj is input from whuch the CheckIn day is considered for computation inside the checkDayofWeekCase Methods
 * 
 * Outputs-			 Returns Boolean value dayofweek Object inside the Each Cases of BookRoom Method
 * 
 * Called from -	 slotOfMonth(roomObj) inside the BookRoom of Implementation class 
*/

package com.proj.MethodImplemtation;
import java.time.DayOfWeek;
import java.time.LocalDate;

import com.proj.Model.*;
public class DayOfWeekClass {
	
	public boolean checkDayofWeekCase1(Room roomObj){	
		
	/* this method checks if the checkIn day is Monday or Friday 
	 * return true if and only if  if  condition is fullilled then else return False 
	 *
	 */		
		
		LocalDate weekofday=roomObj.getCheckInDate();
			if(weekofday.getDayOfWeek().equals(DayOfWeek.MONDAY)||weekofday.getDayOfWeek().equals(DayOfWeek.FRIDAY)){
				return true;
			}else{
				return false;
			}
	}
	public boolean checkDayofWeekCase2(Room roomObj){
		
		/* this method checks if the checkIn day is Monday 
		 * return true if and only if  if  condition is fullilled then else return False 
		 *
		 */		
		LocalDate weekofday=roomObj.getCheckInDate();
		if(weekofday.getDayOfWeek().equals(DayOfWeek.MONDAY)){
			return true;
		}else{
			return false;
		}
	}	
	public boolean checkDayofWeekCase3(Room roomObj){
		/* this method checks if the checkIn day is Monday or Friday 
		 * return true if and only if  if  condition is fullilled then else return False 
		 *
		 */	
		LocalDate weekofday=roomObj.getCheckInDate();
		if(weekofday.getDayOfWeek().equals(DayOfWeek.MONDAY)||weekofday.getDayOfWeek().equals(DayOfWeek.FRIDAY)){
			return true;
		}else{
			return false;
		}
	}

}
