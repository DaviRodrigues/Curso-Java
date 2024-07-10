package model.entities;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	
	private Integer roomNumber;
	
	private Date chechkin;
	
	private Date checkout;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation() {
	}

	public Reservation(Integer roomNumber, Date chechkin, Date checkout) {
		this.roomNumber = roomNumber;
		this.chechkin = chechkin;
		this.checkout = checkout;
	}
	
	public long duration() {
		long diff = checkout.getTime() - chechkin.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public void updateDates(Date checkin, Date checkout) {
		this.chechkin = checkin;
		this.checkout = checkout;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getChechkin() {
		return chechkin;
	}

	public Date getCheckout() {
		return checkout;
	}

	@Override
	public String toString() {
		return "Room " 
				+ roomNumber 
				+ ", check-in: " 
				+ sdf.format(chechkin)
				+ ", checkout: "
				+ sdf.format(checkout)
				+ ", "
				+ duration()
				+ "nights";
	}
	
}
