package employee;

public class Worker extends Employee{
	private double bonus;
	public void calBonus() {
		if(id >= 100)
		bonus = income / 3;
		else
		bonus = income / 2;
	}
	
	public Object getBonus() {
		return bonus;
	}

}
