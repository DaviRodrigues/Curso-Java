package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		// Outra alternativa
		// d = new Date(d.getTime() - (4 * 60 * 60 * 1000))
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d); // aqui eu seto a data dentro do obj cal
		
		cal.add(Calendar.HOUR_OF_DAY, -4);
		d = cal.getTime();
		
		System.out.println(sdf.format(d));
		
		cal.add(Calendar.HOUR_OF_DAY, 8);
		d = cal.getTime(); // pegando a data modificada

		System.out.println(sdf.format(d));
		
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH); // Mês começa a partir de 0
		
		System.out.println(minutes);
		System.out.println(month);
	}

}
