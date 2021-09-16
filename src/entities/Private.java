package entities;

public class Private extends Person {

	private Double healthExpense;

	public Private() {
	}

	public Private(String name, Double anualIncome, Double healthExpense) {
		super(name, anualIncome);
		this.healthExpense = healthExpense;
	}

	public Double getHealthExpense() {
		return healthExpense;
	}

	public void setHealthExpense(Double healthExpense) {
		this.healthExpense = healthExpense;
	}

	@Override
	public double tax() {
		double amount;
		if (super.getAnualIncome() < 20000.0) {
			amount = super.getAnualIncome() * 0.15 - this.healthExpense * 0.50;
		} else {
			amount = super.getAnualIncome() * 0.25 - this.healthExpense * 0.50;
		}
		return amount;
	}
}
