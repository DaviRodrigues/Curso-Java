package app;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Program {
	
	final static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		Map<Integer, Set<Number>> classMap = new HashMap<>();
		Set<Number> uniqueStudents = new HashSet<>();
		
		System.out.println("How many classes do you teach?");
		int qttClasses = sc.nextInt();
		
		for (int i=1; i <= qttClasses; i++) {
			Set<Number> classCourse = new HashSet<>();
			
			System.out.println("How many students for course " + i + "?");
			int qttStudents = sc.nextInt();
			
			for (int j=1; j <= qttStudents; j++) {
				int idStudent = sc.nextInt();
				classCourse.add(idStudent);
				uniqueStudents.add(idStudent);
			}
		
			classMap.put(i, classCourse);
		}
		
        System.out.println("\nStudent count per class:");
        for (Map.Entry<Integer, Set<Number>> entry : classMap.entrySet()) {
            System.out.println("Class " + entry.getKey() + ": " + entry.getValue().size() + " students");
        }
		
		System.out.println("Total unique students: " + uniqueStudents.size());
		
		sc.close();
	}

}
