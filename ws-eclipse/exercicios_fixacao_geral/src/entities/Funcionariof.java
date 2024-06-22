package entities;

public class Funcionariof {
	
	private String nome;
	
	private Double salario;
	
	public Funcionariof() {
	}
	
	public Funcionariof(String nome, Double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public double calcularBonus() {
		return salario * 0.1;
	}
	
    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
        System.out.println("Bônus: " + calcularBonus());
    }

	public String getNome() {
		return nome;
	}

	public Double getSalario() {
		return salario;
	}
	
}
