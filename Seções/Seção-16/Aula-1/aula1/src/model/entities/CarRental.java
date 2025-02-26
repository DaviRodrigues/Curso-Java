package model.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CarRental {
	
	private final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:MM");
	
	private LocalDateTime start;
	private LocalDateTime finish;
	
	private Vehicle vehicle;
	private Invoice invoice;
	
	public CarRental(String start, String finish) {
		this.start = LocalDateTime.parse(start, dtf);
		this.finish = LocalDateTime.parse(finish, dtf);
	}

	public CarRental(LocalDateTime start, LocalDateTime finish, Vehicle vehicle, Invoice invoice) {
		this.start = start;
		this.finish = finish;
		this.vehicle = vehicle;
		this.invoice = invoice;
	}

	public LocalDateTime getStart() {
		return start;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public LocalDateTime getFinish() {
		return finish;
	}

	public void setFinish(LocalDateTime finish) {
		this.finish = finish;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	
}
