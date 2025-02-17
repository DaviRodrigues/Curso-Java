package entities;

public class SavingsAccount extends Account {
<<<<<<< HEAD
	
	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}
=======

	private Double interestRate;
	
	public SavingsAccount() { super(); }
>>>>>>> 3f15b8912e214caffbf983ec3b4011fc2e7dcf61

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}
<<<<<<< HEAD

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
=======
>>>>>>> 3f15b8912e214caffbf983ec3b4011fc2e7dcf61
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	@Override
<<<<<<< HEAD
	public void withdraw(double amount) {
		balance -= amount;
	}
=======
	// evita sobreposição do método
	public final void withdraw(Double amount) {
		balance -= amount;
	}

	public Double getInterestRate() {
		return interestRate;
	}
	
>>>>>>> 3f15b8912e214caffbf983ec3b4011fc2e7dcf61
}
