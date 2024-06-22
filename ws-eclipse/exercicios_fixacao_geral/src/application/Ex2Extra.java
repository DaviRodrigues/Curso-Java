package application;

import entities.Desenvolvedor;
import entities.Empresa;
import entities.Funcionariof;
import entities.Gerente;

public class Ex2Extra {

	public static void main(String[] args) {
		Funcionariof gerente = new Gerente("Alice", 1000.00, "TI");
		Funcionariof desenvolvedor = new Desenvolvedor("Bob", 8000.00, "Java");
		
		Empresa empresa = new Empresa();
		empresa.adicionarFuncionario(gerente);
		empresa.adicionarFuncionario(desenvolvedor);
		
		empresa.listarFuncionarios();
	}

}
