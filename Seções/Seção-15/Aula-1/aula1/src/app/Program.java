package app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Program {

	public static void main(String[] args) {
		Path currentPath = Paths
				.get("")
				.toAbsolutePath()
				.resolve("src")
				.resolve("in.txt");
		
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(currentPath.toString());
			br = new BufferedReader(fr);
			
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			try {
				if (br != null) br.close();
				if (fr != null) fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		
		
		
	}

}
