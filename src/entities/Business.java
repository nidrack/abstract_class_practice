package entities;

public class Business extends Person {

	private Integer employees;

	public Business() {
	}

	public Business(String name, Double anualIncome, Integer employees) {
		super(name, anualIncome);
		this.employees = employees;
	}

	public Integer getEmployees() {
		return employees;
	}

	public void setEmployees(Integer employees) {
		this.employees = employees;
	}

	@Override
	public double tax() {
		double amount;
		if (employees > 10) {
			amount = super.getAnualIncome() * 0.14;
		} else {
			amount = super.getAnualIncome() * 0.16;
		}
		return amount;
	}
}
