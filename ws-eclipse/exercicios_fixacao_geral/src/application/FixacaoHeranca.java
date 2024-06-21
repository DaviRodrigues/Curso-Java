package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.ProductHeranca;
import entities.UsedProduct;

public class FixacaoHeranca {
	
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		System.out.print("Enter the number of products: ");
		int numberProducts = sc.nextInt();
		sc.nextLine();
		
		List<ProductHeranca> products = new ArrayList<>();
		
		for (int i = 0; i < numberProducts; i++) {
			System.out.println("Product #" + (i+1) + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char typeProduct = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");
			String nameProduct = sc.nextLine();
			
			System.out.print("Price: ");
			double priceProduct = sc.nextDouble();
			sc.nextLine();
			
			ProductHeranca product = null;
			
			switch (typeProduct){
			case 'c': {
				product = new ProductHeranca(nameProduct, priceProduct);
				
				break;
			}
			case 'u': {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				LocalDate manufactureDate = LocalDate.parse(sc.next(), fmt);
				
				product = new UsedProduct(nameProduct, priceProduct, manufactureDate);
				
				break;
			}
			case 'i': {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				
				product = new ImportedProduct(nameProduct, priceProduct, customsFee);
				
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + typeProduct);
			}
			
			products.add(product);
			
		}
		
		System.out.println("\nPRICE TAGS");
		for (ProductHeranca p: products) {
			System.out.println(p.priceTag());
		}
		
		sc.close();
	}

}
