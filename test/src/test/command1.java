package test;

import java.util.Scanner;

public class command1 {
    public static void main(String[] args) {
        CDAccount acc1 = new CDAccount();
        acc1.setBalance(6000.00);
        System.out.printf("1:Balance =%f\n",acc1.checkBalance());
        acc1.deposit(1500.00);
        acc1.deposit(500.00);
        System.out.printf("2:Balance =%f\n",acc1.checkBalance());
        acc1.calinterest();
        System.out.printf("3:Balance =%f\n",acc1.getinterest());
        acc1.withdraw(900.00);
        System.out.printf("4:Balance =%f\n",acc1.checkBalance());
    }
}
