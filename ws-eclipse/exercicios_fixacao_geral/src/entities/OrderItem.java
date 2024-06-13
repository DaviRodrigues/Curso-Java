package entities;

public class OrderItem {
	
	private Integer quantity;
	
	private Double price;
	
	private ProductItem product;
	
	public OrderItem() {
	}
	
	public OrderItem(Integer quantity, Double price, ProductItem product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}
	
	public double subTotal() {
		return price * quantity;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public ProductItem getProduct() {
		return product;
	}

	public void setProduct(ProductItem product) {
		this.product = product;
	}
	
}
