package test;

import java.util.Scanner;

public class Command3 {
    public static void main(String[] args) {
        float n1,n2,sum,len;
        int end, code;
        String msg = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your password: ");
        msg = input.nextLine();

        end = msg.length();
        code = msg.indexOf("v");

        if(code == -1){
            System.out.print("Enter the 1st floating-point number:");
            n1 = input.nextFloat();
            System.out.print("Enter the 2nd floating-point number:");
            n2 = input.nextFloat();
            sum = n1 + n2;
        }
        else{
            System.out.print("Enter a floating-point number: ");
            n1 = input.nextFloat();
            len = msg.length();
            sum = n1 + len;
        }
        System.out.print(sum+msg);
    }
}