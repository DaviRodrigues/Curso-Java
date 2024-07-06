package entities;

public class Individual extends TaxPayer {
	
	private Double healthExpenditures;
	
	public Individual() {
		super();
	}
	
	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		if (super.getAnualIncome() < 20_000) {
			return (super.getAnualIncome() * 0.15) - (getHealthExpenditures() * 0.5);
		} else {
			return (super.getAnualIncome() * 0.25) - (getHealthExpenditures() * 0.5);
		}
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

}
