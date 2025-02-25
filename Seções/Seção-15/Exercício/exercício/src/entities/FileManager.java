package entities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
	
	public static Path currentPath() {
		return Paths.get("").toAbsolutePath();
	}
	
	private String path;
	private List<Item> listItens = new ArrayList<>();
	
	public FileManager() {}
	
	public FileManager(String path) {
		this.path = path;
	}
			
	private String getNewPathFile() {
		String dirPath = FileManager.currentPath().resolve("out").toString();
		
		File directory = new File(dirPath);
		if (!directory.exists()) {
			directory.mkdir();
		}

		return Paths.get(dirPath, "summary.csv").toString();
	}
	
	public void writeNewFile() throws IOException {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(getNewPathFile()))) {
			for (Item item: listItens) {
				bw.write(item.getName() + "," + item.calculateTotalItem());
				bw.newLine();
			}
		}
	}
	
	public List<Item> readFile() throws FileNotFoundException, IOException {
		listItens.clear();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line;
			
			while ((line = br.readLine()) != null) {
				String[] dataInFile = line.split(",");
				listItens.add(new Item(dataInFile[0], Double.parseDouble(dataInFile[1]), Integer.parseInt(dataInFile[2])));
			}
			
			return listItens;
		}
	}
}
