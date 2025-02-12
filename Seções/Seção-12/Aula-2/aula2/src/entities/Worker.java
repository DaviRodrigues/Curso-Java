package entities;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	private Department department;
	
	private List<HourContract> contracts = new ArrayList<>();
	
	public Worker() {}
	
	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	public Double income(Integer year, Integer month) {
		Double total = baseSalary;

		for (HourContract contract: contracts) {
			LocalDate contractDate = contract
					.getDate()
					.toInstant()
					.atZone(ZoneId.systemDefault())
					.toLocalDate();
			if (contractDate.getYear() == year && month == contractDate.getMonthValue()) {
				total += contract.totalValue();
			}
		}
		
		return total;
		
	    // return contracts.stream()
	    //        .filter(contract -> {
	    //            LocalDate contractDate = contract.getDate().toInstant()
	    //                .atZone(ZoneId.systemDefault()).toLocalDate();
	    //            return contractDate.getYear() == year && contractDate.getMonthValue() == month;
	    //       })
	    //        .map(HourContract::totalValue)
	    //        .reduce(0.0, Double::sum);
	}

	public String getName() {
		return name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}
	
}
