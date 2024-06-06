package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	private Departament departament;
	
	// quando tiver uma composição de tem muitos não coloque a lista no construtor e sim instancie ela onde declarou
	private List<HourContract> contracts = new ArrayList<>();
	
	public Worker() {
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departament = departament;
	}
	
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	public Double income(int year, int month) {
		double sum = baseSalary;
		
		for (HourContract contract : contracts) {
			LocalDate contractDate = contract.getDate();
			int contractYear = contractDate.getYear();
			int contractMonth = contractDate.getMonthValue();
			
			if (contractYear == year && contractMonth == month) {
				sum += contract.totalValue();
			}
		}	
		
		return sum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Departament getDepartament() {
		return departament;
	}

	public void setDepartament(Departament departament) {
		this.departament = departament;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

}
