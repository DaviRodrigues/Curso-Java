package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import model.entities.Reservation;

public class Program {

    static Scanner sc = new Scanner(System.in);
    static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {
        System.out.print("Room number: ");
        int roomNumber = sc.nextInt();
        sc.nextLine();
        
        CheckData checkData;

        checkData = getCheckDates();

        Reservation reservation = new Reservation(roomNumber, checkData.checkin(), checkData.checkout());
        System.out.println(reservation);

        System.out.println();
        System.out.println("Enter data to update the reservation");
        
        checkData = getCheckDates();
        
        LocalDate now = LocalDate.now();
        
        if (checkData.checkin.isBefore(now) || checkData.checkout.isBefore(now)) {
        	throw new IllegalArgumentException("Error in reservation: Reservation dates for update must be future dates");
        }
        
        reservation.updateDates(checkData.checkin, checkData.checkout);
        System.out.println(reservation);
        
        sc.close();
    }

    public static CheckData getCheckDates() {
        LocalDate checkin = readAndValidateDate("Check-in date (dd/MM/yyyy): ");
        LocalDate checkout = readAndValidateDate("Check-out date (dd/MM/yyyy): ");
        validateDateIsAfter(checkin, checkout);
        return new CheckData(checkin, checkout);
    }

    public static LocalDate readAndValidateDate(String message) {
        System.out.print(message);
        String date = sc.next();
        validateDate(date);
        return LocalDate.parse(date, dtf);
    }

    public static void validateDate(String date) {
        if (!date.matches("^(3[01]|[12][0-9]|0?[1-9])/(1[0-2]|0?[1-9])/\\d{4}$")) {
            throw new IllegalArgumentException("Date format is invalid (dd/MM/yyyy)");
        }
    }

    public static void validateDateIsAfter(LocalDate checkin, LocalDate checkout) {
        if (!checkout.isAfter(checkin)) {
            throw new IllegalArgumentException("Error in reservation: Check-out date must be after check-in date");
        }
    }

    public record CheckData(LocalDate checkin, LocalDate checkout) {}
}
