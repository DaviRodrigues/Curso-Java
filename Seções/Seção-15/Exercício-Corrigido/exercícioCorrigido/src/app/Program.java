package app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws ParseException {
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter a file path: ");
		String sourceFileStr = sc.nextLine();
		
		File sourceFile = new File(sourceFileStr);
		String sourceFolderStr = sourceFile.getParent();
		
        File outFolder = new File(sourceFolderStr + "\\out");
        if (!outFolder.exists()) {
            if (!outFolder.mkdir()) {
                System.out.println("Error creating directory: " + outFolder.getAbsolutePath());
                return;
            }
        }
		
		String targetFileStr = sourceFolderStr.concat("\\out\\summary.csv");
		
		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
			String itemCsv, name;
			double price;
			int quantity;
			
			while ((itemCsv = br.readLine()) != null) {
				String[] fields = itemCsv.split(",");
				name = fields[0];
				price = Double.parseDouble(fields[1]);
				quantity = Integer.parseInt(fields[2]);
				
				list.add(new Product(name, price, quantity));
			}
			
		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
			for (Product item: list) {
				bw.write(item
						.getName()
						.concat(",")
						.concat(String.format("%.2f", item.total())));
				bw.newLine();
			}
			
			System.out.println(targetFileStr.concat(" Created"));
		} catch (IOException e) {
			System.out.println("Error writing file: " + e.getMessage());
		}

		sc.close();
	}

}
