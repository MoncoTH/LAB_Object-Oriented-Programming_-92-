package test;

import javax.swing.*;

public class Command2 {
    public static void main(String[] args) {

        String name, score, message;
        JFrame myWindow = new JFrame();
       
        myWindow.setSize(300, 200);
        myWindow.setTitle("My First Java Program");
        myWindow.setVisible(true);
       
        name = JOptionPane.showInputDialog(myWindow, "What is your name?");
        score = JOptionPane.showInputDialog(myWindow, "What is your score in Software Development?");
        
        if (Integer.parseInt(score) > 85)
        message = name + " will get grade A!";
        else if (Integer.parseInt(score) > 75)
        message = name + " will get grade B!";
        else if (Integer.parseInt(score) > 65)
        message = name + " will get grade C!";
        else if (Integer.parseInt(score) > 55)
        message = name + " will get grade D!";
        else
        message = name + " will get grade F!";
       
        JOptionPane.showMessageDialog(myWindow, message);
       
        System.exit(0);
        } 
}
