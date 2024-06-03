package entities;

public class ContaBancaria {
	
	static double TAXA = 5.00;
	
	private int numeroConta;
	private String nomeTitular;
	private double saldo;
	
	public ContaBancaria() {
	}
	
	public ContaBancaria(int numeroConta, String nomeTitular, double saldo) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.saldo = saldo;
	}
	
	public ContaBancaria(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}
	
	public void depositarSaldo(double valor) {
		System.out.println("Updated account data: ");
		saldo += valor;
	}
	
	public void sacarSaldo(double valor) {
		System.out.println("Updated account data: ");
		saldo -= (valor + 5.0);
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public String toString() {
		return "\nAccount data:\nAccount " + numeroConta + ", Holder: " + nomeTitular + ", Balance: $ " + saldo;
	}
	
	
	
}
