package employee;

public class Employee {
	protected double income;
	int id;

	public void setID(int stdID){
		id  = stdID;
	}
	public int getID(){
		return id;
	}
	public void setIncome(double stdINCOME){
		income = stdINCOME;
	}
	public double getIncome(){
		return income;
	}
}
