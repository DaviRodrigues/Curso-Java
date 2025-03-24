package services;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class File {
	
	public static BufferedReader reader(String path) throws FileNotFoundException {
		if (path == null) throw new IllegalArgumentException("Error: path is null. Try again");
		
		return new BufferedReader(new FileReader(path));
	}
	
}
