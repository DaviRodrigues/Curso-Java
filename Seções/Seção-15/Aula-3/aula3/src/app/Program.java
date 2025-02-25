package app;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Program {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good Morning", "Good Afternoon", "Good Night"};
		
		Path path = Paths
				.get("")
				.toAbsolutePath()
				.resolve("src")
				.resolve("out.txt");
		
		// o true acrescenta coisa no final do arquivo
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path.toString(), true))) {
			for (String line: lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
