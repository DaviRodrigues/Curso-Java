package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class ComposicaoJava {
	
    private static Scanner sc = new Scanner(System.in);
    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        
        String departmentName = readDepartmentName();
        Worker worker = readWorkerData(departmentName);
        readContracts(worker);
        calculateAndPrintIncome(worker);
        
        sc.close();
    }

    private static String readDepartmentName() {
        System.out.print("Enter department's name: ");
        
        return sc.nextLine();
    }

    private static Worker readWorkerData(String departmentName) {
    	System.out.println();
    	
        System.out.println("Enter worker data: ");
        
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();
        sc.nextLine();
        
        System.out.println();
        
        return new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Departament(departmentName));
    }

    private static void readContracts(Worker worker) {
        System.out.print("How many contracts to this worker? ");
        int qtContracts = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < qtContracts; i++) {
            System.out.println("Enter contract #" + (i + 1) + " data:");
            
            System.out.print("Date (DD/MM/YYYY): ");
            LocalDate contractDate = LocalDate.parse(sc.next(), fmt);
            
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            sc.nextLine();
            
            System.out.println();
            
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }
    }

    private static void calculateAndPrintIncome(Worker worker) {
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartament().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
    }

}
