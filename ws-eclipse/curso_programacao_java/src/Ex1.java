import java.util.Locale;

public class Ex1 {

	public static void main(String[] args) {
		String product1, product2;
		int age, code;
		char gender;
		double price1, price2, measure;
		
		product1 = "Computer";
		product2 = "Office desk";
		
		age = 30;
		code = 5290;
		
		// char utiliza aspas simples
		gender = 'F';
		
		price1 = 2100.0;
		price2 = 650.50;
		measure = 53.234567;
		
		System.out.printf("Products:\n%s, which price is $ %.2f\n%s, which price is $ %.2f", product1, price1, product2, price2);
		
		System.out.printf("\n\nRecord: %d years old, code %d and gender: %c\n\n", age, code, gender);
		
		System.out.printf("Measue with eight decimal places: %.8f\nRouded (three decimal places): %.3f\n", measure, measure);

		Locale.setDefault(Locale.US);
		
		System.out.printf("US decimal point: %.3f", measure);
		
	}

}
