package entities;

public class Product {
	
	String name; // dessa forma não pode ser acessado por classes de pacotes diferentes e sim iguais
	private double price;
	private int quantity;
	
	// Contrutor padrão
	public Product() {
	}
	
	// Construtor tem nome da classe e inicia no começo do objeto
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	// Construtor de sobrecarga ele tem caracteristicas parecidas, porém faz coisas diferentes
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getQuantity() {
		return quantity;
	}

	public double totalValueInStock() {
		return this.price * this.quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return 	"Product data: "
				+ this.name  
				+ ", $ " 
				+ String.format("%.2f", this.price)
				+ ", "
				+ this.quantity
				+ " units, Total: $ "
				+ String.format("%.2f", this.totalValueInStock());
	}
}
