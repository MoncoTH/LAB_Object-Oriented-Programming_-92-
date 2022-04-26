package calculator;

public class Calculator {
	private double diff,time;

	public Object diff(double num1, double num2) {
		// TODO Auto-generated method stub
		if(num1 > num2)
		return diff = num1 - num2;
		else
		return diff = num2 - num1;

	}
	
	public Object times(double num1, double num2) {
		// TODO Auto-generated method stub
		if(num1 > num2)
		return time = num1 / num2;
		else
		return time = num2 / num1;
	}
}
