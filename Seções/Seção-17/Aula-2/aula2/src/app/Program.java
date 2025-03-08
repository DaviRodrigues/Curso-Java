package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import entities.Product;
import services.CalculationService;

public class Program {
	
	private static final List<Product> list = new ArrayList<>();
	private static final String path = Paths
			.get("")
			.toAbsolutePath()
			.resolve("src")
			.resolve("in.txt")
			.toString();
	
	public static void main(String[] args) {
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line;
			while ((line = br.readLine()) != null) {
				String[] productData = line.split(",");
				list.add(new Product(productData[0], Double.parseDouble(productData[1])));
			}
			
			Product x = CalculationService.max(list);
			System.out.println("Max: ");
			System.out.println(x);
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
