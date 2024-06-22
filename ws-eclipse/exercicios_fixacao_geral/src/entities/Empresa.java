package entities;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	
    private ArrayList<Funcionariof> funcionarios;

    public Empresa() {
        this.funcionarios = new ArrayList<>();
    }
	
	public void adicionarFuncionario(Funcionariof funcionario) {
		funcionarios.add(funcionario);
	}
	
	public void removerFuncionario(Funcionariof funcionario) {
		funcionarios.remove(funcionario);
	}
	
    public void listarFuncionarios() {
        for (Funcionariof funcionario : funcionarios) {
            funcionario.exibirDetalhes();
        }
    }

	public List<Funcionariof> getFuncionarios() {
		return funcionarios;
	}
	
}
