package entities;

public class SavingsAccountPlus extends SavingsAccount {
	
	// como está com final na classe e na sobreposição do método irá dar erro
	// Ajuda em segurança o final e retira inconsistências, além disso ganha performance
	
	@Override
	public void withdraw(double amount) {
		balance -= amount + 2.0;
	}
	
}
