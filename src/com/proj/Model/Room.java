package com.proj.Model;

import java.time.LocalDate;

public class Room {

	private int id;
	private LocalDate checkInDate;
	private LocalDate checkOutDate;
	private boolean status;
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getCheckInDate() {
		return checkInDate;
	}
	public void setCheckInDate(LocalDate checkInDate) {
		this.checkInDate = checkInDate;
	}
	public LocalDate getCheckOutDate() {
		return checkOutDate;
	}
	public void setCheckOutDate(LocalDate checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	@Override
	public String toString() {
		return "Room [id=" + id + ", checkInDate=" + checkInDate + ", checkOutDate=" + checkOutDate + ", status="
				+ status + "]";
	}
	
		
}
