package test;

public class BankAccount {
     protected double balance = 0;
     protected void setBalance(double amount){
          balance = amount;
     }
     public double checkBalance(){
          return balance;
     }
     public void deposit(double amount){
          balance = balance + amount;
     }
     public void withdraw(double amount){
          if(balance > amount) balance = balance - amount;
     }
}
