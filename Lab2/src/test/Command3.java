package test;

import javax.swing.*;

public class Command3 {
    public static void main(String[] args) {
        String name, salary;
        float sum;
        JFrame myWindow = new JFrame();

        myWindow.setSize(300, 200);
        myWindow.setTitle("My First Java Program");
        myWindow.setVisible(true);

        name = JOptionPane.showInputDialog(myWindow, "What is your name?");
        salary = JOptionPane.showInputDialog(myWindow, "What is your salary?");

        if (Float.parseFloat(salary) >= 50000) {
            sum = (Float.parseFloat(salary) * 4) / 100;
        } else if (Float.parseFloat(salary) >= 30000) {
            sum = (Float.parseFloat(salary) * 3) / 100;
        } else if (Float.parseFloat(salary) >= 10000) {
            sum = (Float.parseFloat(salary) * 1) / 100;
        } else {
            sum = (Float.parseFloat(salary) * 0) ;
        }

        JOptionPane.showMessageDialog(myWindow, name + "  has to pay " + sum + "  baht in income tax.");
    }
}