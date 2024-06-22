package entities;

public class Gerente extends Funcionariof {
	
	private String departamento;
	
	public Gerente() {
	}

	public Gerente(String nome, Double salario, String departamento) {
		super(nome, salario);
		this.departamento = departamento;
	}
	
	@Override
	public double calcularBonus() {
		return super.calcularBonus() + (getSalario() * 0.2);
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
}
