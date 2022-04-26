package student;

import java.util.Scanner;

public class Command2 {
    public static void main(String[] args) {

        String name = "", id = "";
        Scanner input = new Scanner(System.in);

        Student std1 = new Student();
        System.out.printf("Enter your name: ");
        name = input.nextLine();

        System.out.print("Enter your ID number : ");
        id = input.nextLine();

        std1.setStdName(name);
        System.out.print("\n" + "Login: " + std1.getLogin(id));

        System.out.print("\n" + "Password: " + std1.getPassword());
    }
}
