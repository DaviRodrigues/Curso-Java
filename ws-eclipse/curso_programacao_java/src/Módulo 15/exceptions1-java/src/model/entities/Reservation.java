package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {
	
	private Integer roomNumber;
	
	private Date checkIn;
	
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation() {
	}

	// caso seja uma RuntimeException não é obrigatório colocar o throws, porém o ideal será tratar no programa principal
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {
		if (!checkOut.after(checkIn)) {
			// throw new IllegalArgumentException("Error in reservation: Check-out date must be after check-in date");
			
			throw new DomainException("Error in reservation: Check-out date must be after check-in date");
		}
		
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	/* o thows DomainException serve para propagar a o erro para o programa principal, dessa forma
	ele acaba caindo no catch de lá mostrando a exceção (nesse caso personalizada com uma classe no model)
	*/
	
	// caso seja uma RuntimeException não é obrigatório colocar o throws, porém o ideal será tratar no programa principal
	public void updateDates(Date checkIn, Date checkOut) throws DomainException {
		Date now = new Date();
		
		if (checkIn.before(now) || checkOut.before(now)) {
			// throw new IllegalArgumentException("Error in reservation: Reservation dates for update must be future dates");
			
			throw new DomainException("Error in reservation: Reservation dates for update must be future dates");
		} 
		if (!checkOut.after(checkIn)) {
			// throw new IllegalArgumentException("Error in reservation: Check-out date must be after check-in date");
			
			throw new DomainException("Error in reservation: Check-out date must be after check-in date");
		}
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	@Override
	public String toString() {
		return "Room " 
				+ roomNumber 
				+ ", check-in: " 
				+ sdf.format(checkIn)
				+ ", checkout: "
				+ sdf.format(checkOut)
				+ ", "
				+ duration()
				+ " nights";
	}
	
}
