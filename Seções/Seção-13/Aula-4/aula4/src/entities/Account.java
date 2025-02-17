package entities;

<<<<<<< HEAD
public abstract class Account {
	private Integer number;
	private String holder;
	protected Double balance;
		
	public Account() {
	}
	
=======
public class Account {
	
	private Integer number;
	private String holder;
	protected Double balance;
	
	public Account() {}

>>>>>>> 3f15b8912e214caffbf983ec3b4011fc2e7dcf61
	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

<<<<<<< HEAD
	public void setNumber(Integer number) {
		this.number = number;
	}

=======
>>>>>>> 3f15b8912e214caffbf983ec3b4011fc2e7dcf61
	public String getHolder() {
		return holder;
	}

<<<<<<< HEAD
	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}

	public void deposit(double amount) {
		balance += amount;
	}
=======
	public Double getBalance() {
		return balance;
	}
	
	public void withdraw(Double amount) {
		balance -= amount + 5.0;
	}
	
	public void deposit(Double amount) {
		balance += amount;
	}
	
>>>>>>> 3f15b8912e214caffbf983ec3b4011fc2e7dcf61
}
