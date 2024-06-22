package entities;

public class Produto {
	
	private String nome;
	
	private Integer quantidade;
	
	private Double preco;
	
	public Produto() {
	}

	public Produto(String nome, Integer quantidade, Double preco) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço: " + preco);
    }
    
    public double calcularValorTotal() {
    	return quantidade * preco;
    }
	
}
