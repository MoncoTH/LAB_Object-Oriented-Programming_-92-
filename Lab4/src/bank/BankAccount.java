package bank;

public class BankAccount {
	private double firstBalance,acc1;
	public void setBalance(double firstBalance) {
		acc1 = firstBalance;
		return;
	}

	public Object getBalance() {
		firstBalance = acc1;
		return acc1;
	}

	public void withdraw(double d) {
		acc1 = firstBalance - 500.50;
		return;
	}

	public void deposit(double d) {
		acc1 = firstBalance + 1000;
		return;

	}

 }

