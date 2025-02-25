package app;

import entities.FileManager;

public class Program {

	public static void main(String[] args) {
		
		String actuallyFile = FileManager.currentPath()
				.resolve("summary.csv")
				.toString();
		
		FileManager fileManager = new FileManager(actuallyFile);
		
		try {
			fileManager.readFile();
			
			fileManager.writeNewFile();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
