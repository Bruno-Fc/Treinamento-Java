package entities;

public class Legal extends Person {

	private Integer numEmployee;

	public Legal() {
		super();
	}

	public Legal(String name, Double income, Integer numEmployee) {
		super(name, income);
		this.numEmployee = numEmployee;
	}

	public Integer getNumEmployee() {
		return numEmployee;
	}

	public void setNumEmployee(Integer numEmployee) {
		this.numEmployee = numEmployee;
	}

	@Override
	public Double tax() {
		double impost = 0.0;
		if (getNumEmployee() <= 10) {
			return impost = getIncome() * 0.16;
		}
		if (getNumEmployee() > 10) {
			return impost = getIncome() * 0.14;
		}
		 return impost;

	}

	public String toString() {
		return getName() + ": $" + String.format("%.2f", tax());
	}
}
