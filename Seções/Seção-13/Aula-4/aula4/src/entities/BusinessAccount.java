package entities;

public class BusinessAccount extends Account {
<<<<<<< HEAD
	private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}
=======

	private Double loanLimit;
	
	public BusinessAccount() { super(); }
>>>>>>> 3f15b8912e214caffbf983ec3b4011fc2e7dcf61

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}
<<<<<<< HEAD
=======
	
	public void loan(Double amount) {
		if (amount <= loanLimit) deposit(amount - 10.0);
	}
>>>>>>> 3f15b8912e214caffbf983ec3b4011fc2e7dcf61

	public Double getLoanLimit() {
		return loanLimit;
	}
<<<<<<< HEAD

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}
	
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}
=======
	
>>>>>>> 3f15b8912e214caffbf983ec3b4011fc2e7dcf61
}
