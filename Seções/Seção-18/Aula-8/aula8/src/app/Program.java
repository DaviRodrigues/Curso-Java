package app;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import helpers.FileHelperTxt;
import models.Product;
import services.ProductService;
import utils.GenericFactory;

public class Program {

	public static void main(String[] args) {
		
		String actuallyFile = "E:\\Codigos\\Curso-Java\\Seções\\Seção-18\\Aula-8\\aula8\\src\\files\\in.txt";
		
		try {
			FileHelperTxt fileHelper = new FileHelperTxt(actuallyFile);
			Map<String, BigDecimal> rawData = fileHelper.readFile();
			
			GenericFactory<String, BigDecimal, Product> factory =
				    new GenericFactory<>((name, price) -> new Product(name, price));
			
			List<Product> products = factory.fromMap(rawData);
			ProductService productService = new ProductService(products);
			
			BigDecimal totalProducts = productService.fullPriceProducts(); 
			BigDecimal avgProducts = productService.averageProducts();
			
			System.out.println("Preço total: R$ " + totalProducts);
			System.out.println("Preço médio dos produtos: R$" + avgProducts);
			
			System.out.println("Produtos ordenados meno que a média:");
			productService.sortedProducts(avgProducts).forEach((Product p) ->
				System.out.println(p.getName()));
		} catch (Exception e) {
			System.err.println("Erro ao processar o arquivo: " + e.getMessage());
		}

		
		
		
		

	}

}
