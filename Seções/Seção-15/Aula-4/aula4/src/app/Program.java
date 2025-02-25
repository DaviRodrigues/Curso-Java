package app;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a folder path: ");
			String strPath = sc.nextLine();
			
			File path = new File(strPath);
			
			File[] folders = path.listFiles(File::isDirectory);
			File[] arquives = path.listFiles(File::isFile);
			
			System.out.println("Folders:");
			
			for (File folder: folders) {
				System.out.println(folder);
			}
			
			System.out.println("Files:");
			
			for (File arquive: arquives) {
				System.out.println(arquive);
			}
			
			boolean success = new File(path + "\\subdir").mkdir();
			System.out.println("Directory created successfully: " + success);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
