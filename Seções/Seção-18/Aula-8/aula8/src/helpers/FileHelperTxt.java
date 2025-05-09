package helpers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class FileHelperTxt extends FileHelper<Map<String, BigDecimal>> {

	public FileHelperTxt(String pathFile) {
		super(pathFile);
	}
	
	private Map<String, BigDecimal> loadDataFromFile() throws IOException {
	    Map<String, BigDecimal> data = new HashMap<>();

	    try (BufferedReader br = new BufferedReader(new FileReader(this.getPathFile()))) {
	        String line;
	        while ((line = br.readLine()) != null) {
	            String[] parts = line.split(",");
	            if (parts.length == 2) {
	                String key = parts[0].trim();
	                BigDecimal value = new BigDecimal(parts[1].trim());
	                data.put(key, value);
	            }
	        }
	    }

	    return data;
	}

	@Override
	public Map<String, BigDecimal> readFile() throws FileNotFoundException, IOException {
		return loadDataFromFile();
	}

}
