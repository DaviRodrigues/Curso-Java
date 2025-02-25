package entities;

public class Item {
	
	private String name;
	private Double unitPrice;
	private Integer quantity;
	
	public Item() {}

	public Item(String name, Double unitPrice, Integer quantity) {
		this.name = name;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}
	
	public Double calculateTotalItem() {
		return quantity * unitPrice;
	}

	public String getName() {
		return name;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public Integer getQuantity() {
		return quantity;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", unitPrice=" + unitPrice + ", quantity=" + quantity + "]";
	}
	
}
