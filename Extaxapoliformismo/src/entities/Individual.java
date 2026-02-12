package entities;

public class Individual extends TaxPayer{
	public Double HealthExpenditures;
	
	public Individual() {}
	
	
	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		HealthExpenditures = healthExpenditures;
	}


	public Double getHealthExpenditures() {
		return HealthExpenditures;
	}


	public void setHealthExpenditures(Double healthExpenditures) {
		HealthExpenditures = healthExpenditures;
	}


	@Override
	public Double tax() {
		double total;

        if (getAnualIncome() < 20000.0) {
            total = getAnualIncome() * 0.15;
        } else {
            total = getAnualIncome() * 0.25;
        }

        total -= HealthExpenditures * 0.5;

        if (total < 0) {
            total = 0.0;
        }

        return total;

	}
}
