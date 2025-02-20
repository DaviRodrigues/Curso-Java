package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import model.exceptions.DomainException;

public class Reservation {

	private Integer roomNumber;
	private LocalDate checkin;
	private LocalDate checkout;
	
	private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
	public Reservation() {}

	public Reservation(Integer roomNumber, LocalDate checkin, LocalDate checkout) throws DomainException, NullPointerException {
		if (roomNumber == null || checkin == null || checkout == null) {
			throw new NullPointerException("Error: some of the data is null");
		}
		
		validateIsAfter(checkin, checkout);
		
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
	
	public void updateDates(LocalDate checkin, LocalDate checkout) throws DomainException {
        validateIsAfter(checkin, checkout);
        validateIsBefore(checkin, checkout);
		
		this.checkin = checkin;
		this.checkout = checkout;
	}
	
	private void validateIsAfter(LocalDate checkin, LocalDate checkout) throws DomainException {
        if (!checkout.isAfter(checkin)) {
            throw new DomainException("Error in reservation: Check-out date must be after check-in date");
        }
	}
	
	private void validateIsBefore(LocalDate checkin, LocalDate checkout) throws DomainException {
        LocalDate now = LocalDate.now();
		
        if (checkin.isBefore(now) || checkout.isBefore(now)) {
        	throw new DomainException("Error in reservation: Reservation dates for update must be future dates");
        }
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	    sb.append("Reservation: Room ")
	      .append(roomNumber)
	      .append(", check-in: ")
	      .append(checkin.format(dtf))
	      .append(", check-out: ")
	      .append(checkout.format(dtf))
	      .append(", ")
	      .append(duration())
	      .append(" nights");
	    
	    return sb.toString();
	}
	
}
