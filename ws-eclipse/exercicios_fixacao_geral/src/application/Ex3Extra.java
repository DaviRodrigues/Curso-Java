package application;

import entities.Estoque;
import entities.Produto;

public class Ex3Extra {

	public static void main(String[] args) {
		Estoque estoque = new Estoque();
		
		estoque.adicionarProduto(new Produto("Notebook", 10, 2000.0));
		estoque.adicionarProduto(new Produto("Mouse", 50, 50.0));
		
		estoque.listarProdutos();
		System.out.println("Valor Total do Estoque: " + estoque.calcularValorTotalEstoque());

	}

}
