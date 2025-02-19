package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reservation {

	private Integer roomNumber;
	private LocalDate checkin;
	private LocalDate checkout;
    
	public Reservation() {}

	public Reservation(Integer roomNumber, LocalDate checkin, LocalDate checkout) {
		this.roomNumber = roomNumber;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public LocalDate getCheckin() {
		return checkin;
	}

	public LocalDate getCheckout() {
		return checkout;
	}

	public Integer duration() {
		return checkout.getDayOfYear() - checkin.getDayOfYear();
	}
	
	public void updateDates(LocalDate checkin, LocalDate checkout) {
		this.checkin = checkin;
		this.checkout = checkout;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	    sb.append("Reservation: Room ")
	      .append(roomNumber)
	      .append(", check-in: ")
	      .append(checkin.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")))
	      .append(", check-out: ")
	      .append(checkout.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")))
	      .append(", ")
	      .append(duration())
	      .append(" nights");
	    
	    return sb.toString();
	}
	
}
