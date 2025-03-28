package model.services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {

	private Double pricePerDay;
	private Double pricePerHour;
	
	private TaxService taxService;

	public RentalService(Double pricePerDay, Double pricePerHour, TaxService taxService) {
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxService = taxService;
	}
	
	public void processInvoice(CarRental carRental) {
		double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();		
		double hours = minutes / 60.0;
		
		double basicPayment = 0.0;
		
		if (hours <= 12.0) basicPayment = pricePerHour * Math.ceil(hours);
		if (hours > 12.0) basicPayment = pricePerDay * Math.ceil(hours / 24);

		carRental.setInvoice(
				new Invoice(basicPayment, taxService.tax(basicPayment)
				));
	}
}