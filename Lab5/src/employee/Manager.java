package employee;

public class Manager extends Employee {
	private double tax;
	public void calTaxs(){
		if(income > 50000)
		tax = (4 * income) / 100;
		else
		tax = (3 * income) / 100;
	}
	public double getTaxs(){
		return tax;
	}
}
