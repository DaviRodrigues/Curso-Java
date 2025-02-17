package app;

<<<<<<< HEAD
import java.util.Scanner;

public class Program {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		
		sc.close();
	}

=======
import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
	
	public static void main(String[] args) {
		
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		
		x.withdraw(50.0);
		// feito em tempo de execução
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		
	}
>>>>>>> 3f15b8912e214caffbf983ec3b4011fc2e7dcf61
}
