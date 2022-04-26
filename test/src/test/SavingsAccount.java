package test;

public class SavingsAccount extends BankAccount {
     private double interest = 0;
     private void calinterest(){
          interest = balance * 0.0075;

     }
     public double getInterest(){
          return interest;
     }
}
