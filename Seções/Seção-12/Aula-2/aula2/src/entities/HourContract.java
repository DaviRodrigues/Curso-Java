package entities;

import java.util.Date;

public class HourContract {
	
	private Date date;
	private Double valuePerHour;
	private Integer hours;
	
	public HourContract() {}
	
	public HourContract(Date date, Double valuePerHour, Integer hours) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}

	public Double totalValue() {
		return hours * valuePerHour;
	}

	public Date getDate() {
		return date;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public Integer getHours() {
		return hours;
	}

	@Override
	public String toString() {
		return "HourContract [date=" + date + ", valuePerHour=" + valuePerHour + ", hours=" + hours + "]";
	}
}
