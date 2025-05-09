package helpers;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;

public abstract class FileHelper<T> {
	
	private String pathFile;
	
	public FileHelper(String pathFile) {
		this.pathFile = Objects.requireNonNull(pathFile, "pathFile não pode ser null");
	}
	
	public abstract T readFile() throws FileNotFoundException, IOException;

	public String getPathFile() {
		return pathFile;
	}

	public void setPathFile(String pathFile) {
		this.pathFile = pathFile;
	}
}
