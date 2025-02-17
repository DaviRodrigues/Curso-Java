package app;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;

=======
>>>>>>> 3f15b8912e214caffbf983ec3b4011fc2e7dcf61
import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
<<<<<<< HEAD

	public static void main(String[] args) {
		
		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
		list.add(new BusinessAccount(1001, "Maria", 1000.00, 400.00));
		list.add(new SavingsAccount(1004, "Bob", 300.00, 0.01));
		list.add(new BusinessAccount(1005, "Anna", 500.00, 500.00));
		
		double sum = list
				.stream()
				.map(item -> item.getBalance())
				.reduce(0.0, (subtotal, element) -> subtotal + element);
		
		System.out.println(sum);
		
		for (Account acc: list) {
			acc.deposit(10);
			System.out.println(acc.getBalance());
		}
	}

=======
	
	public static void main(String[] args) {
		

		
	}
>>>>>>> 3f15b8912e214caffbf983ec3b4011fc2e7dcf61
}
