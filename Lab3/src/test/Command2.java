package test;

import java.util.Scanner;

public class Command2 {
	public static void main(String[] args) {

		int len, num1, num2, code;
		String msg = "", subMsg = "";
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your message (more than 3 charaters): ");
		msg = input.nextLine();

		System.out.print("Enter your 1st number : ");
		num1 = input.nextInt();

		System.out.print("Enter your 2nd number : ");
		num2 = input.nextInt();
		len = msg.length();

		if (len > 6) {
			code = num1 * num2;
		} else {
			code = num1 + num2;
		}
		subMsg = msg.substring(2, len);
		System.out.print("Your password is " + subMsg + code);
	}
}