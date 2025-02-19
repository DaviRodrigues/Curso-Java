package app;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Path currentPath = Paths
				.get("")
				.toAbsolutePath()
				.resolve("src")
				.resolve("in.txt");
		
		
		File file = currentPath.toFile();
		
		try (Scanner sc = new Scanner(file)) {
			while (sc.hasNextLine()) System.out.println(sc.nextLine());
		} catch (FileNotFoundException e) {
            System.out.println("Error opening file: " + e.getMessage());
        }

	}

}
