package services;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Comparator;
import java.util.List;

import models.Product;

public class ProductService {
	private List<Product> products;

	public ProductService(List<Product> products) {
		this.products = products;
	}
	
	public BigDecimal averageProducts() {
	    int size = products.size();
	    if (size == 0) return BigDecimal.ZERO;
		
		return fullPriceProducts().divide(
				BigDecimal.valueOf(size),
				2,
				RoundingMode.HALF_UP
		);
	}
 	
	public List<Product> sortedProducts(BigDecimal filteredPrice) {
		return products.stream()
				.filter((Product p) -> p.getPrice().compareTo(filteredPrice) < 0)
				.sorted(Comparator.comparing(Product::getName).reversed())
				.toList();
	}
	
	public BigDecimal fullPriceProducts() {
		return products.stream()
				.map(Product::getPrice)
				.reduce(BigDecimal.ZERO, BigDecimal::add);
	}
	
}
