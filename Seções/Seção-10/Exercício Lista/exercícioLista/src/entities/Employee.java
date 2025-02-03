package entities;

public class Employee {
	
	private Integer id;
	private String name;
	private Double salary;
	
	public Employee() {}
	
	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void increaseSalaryPerPercentage(double percentage) {
		double plusSalary = salary * (percentage / 100);
		salary += plusSalary;
	}

	public Integer getId() { return id; }

	public String getName() { return name; }

	public Double getSalary() { return salary; }
	
	@Override
	public String toString() {
	    return id + ", " + name + ", " + String.format("%.2f", salary);
	}
	
}