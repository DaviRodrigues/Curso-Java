package entities;

public class CurrencyConverter {
	
	public static final int IMPOST = 6;
	
	public static double calcTotal(double price, double money) {
		return price * money;
	}
	
	public static void calcImpost(double total) {
		double impost = (total * IMPOST) / 100;
		impost = impost + total;
		System.out.print("Amount to be paid in reais = " + impost);
	}
	
}
