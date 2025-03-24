package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

import entities.LogEntry;
import services.File;

public class Program {

	public static void main(String[] args) {
		
		String currentPath = Paths.get("").toAbsolutePath().toString();
		
		Set<LogEntry> set = new HashSet<>();
		
		try (BufferedReader br = File.reader(currentPath + "\\in.txt")) {
			String line;
			while((line = br.readLine()) != null) {
				String[] fields = line.split(" ");
				
				set.add(new LogEntry(fields[0], fields[1]));
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		System.out.println("Total users: " + set.size());

	}

}
