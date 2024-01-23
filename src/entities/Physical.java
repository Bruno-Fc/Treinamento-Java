package entities;

public class Physical extends Person{
	
	private Double health;
	
	public Physical(){
		super();
	}

	public Physical(String name, Double income, Double health) {
		super(name, income);
		this.health = health;
		
	}

	public Double getHealth() {
		return health;
	}

	public void setHealth(Double health) {
		this.health = health;
	}
	
	@Override
	public  Double tax() {
		double impost = 0.0;
		if(getIncome() < 20000.00) {
			 impost = getIncome() * 0.15;
		}
		if(getIncome() >= 20000.00) {
			 impost = getIncome() * 0.25;
		}
		return impost = impost - (health * 0.5);
		//tinha coloca um return impost aqui
	}
	
	public String toString() {
		return getName() + ": $" + String.format("%.2f", tax());
	}

}
