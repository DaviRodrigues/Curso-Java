package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2002-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		DateTimeFormatter fmtTest = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		
		System.out.println(d04.format(fmt1));
		System.out.println(fmt1.format(d04));
		System.out.println(d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println(d05.format(fmt2));
		System.out.println(LocalDateTime.parse(
				"20/02/2020 14:30", 
				DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")
				).format(fmtTest));
		
		System.out.println(d05.format(fmt1));
		System.out.println(d05.format(fmt2));
		
		System.out.println(fmt4.format(d05));
		
		System.out.println(fmt3.format(d06));
		System.out.println(fmt5.format(d06));
	}

}
