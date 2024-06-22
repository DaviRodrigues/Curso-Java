package entities;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
	
	private List<Produto> produtos = new ArrayList<>();
	
    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public void listarProdutos() {
        for (Produto produto : produtos) {
            produto.exibirDetalhes();
        }
    }

	public List<Produto> getProdutos() {
		return produtos;
	}
	
	public double calcularValorTotalEstoque() {
		double total = 0;
        for (Produto produto : produtos) {
            total = produto.calcularValorTotal();
        }
        return total;
	}
	
}
