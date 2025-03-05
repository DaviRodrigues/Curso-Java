package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		String path = Paths.get("").toAbsolutePath().resolve("in.txt").toString();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String employeeCsv;
			
			while ((employeeCsv = br.readLine()) != null) {
				String[] fields = employeeCsv.split(",");
				String name = fields[0];
				double salary = Double.parseDouble(fields[1]);	
				
				list.add(new Employee(name, salary));
			}
			
			Collections.sort(list);
			for (Employee emp : list) System.out.println(emp.getName() + ", " + emp.getSalary());
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}
}
