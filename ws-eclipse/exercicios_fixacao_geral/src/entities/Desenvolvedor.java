package entities;

public class Desenvolvedor extends Funcionariof {

	private String linguagem;
	
	public Desenvolvedor() {
	}
	
	public Desenvolvedor(String nome, Double salario, String linguagem) {
		super(nome, salario);
		this.linguagem = linguagem;
	}

	public String getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}
	
	@Override
	public double calcularBonus() {
		return super.calcularBonus() + (getSalario() * 0.1);
	}
	
}
