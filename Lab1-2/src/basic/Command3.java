package basic;

import javax.swing.*;

public class Command3 {
    public static void main(String[] args) {
        String name, old, occupation, skill;
        JFrame myWindow = new JFrame();
        myWindow.setSize(500, 250);
        myWindow.setTitle("Message");
        myWindow.setVisible(true);

        name = JOptionPane.showInputDialog(myWindow, "What is your name?");
        old = JOptionPane.showInputDialog(myWindow, "How old are you?");
        occupation = JOptionPane.showInputDialog(myWindow, "What is your occupation?");
        skill = JOptionPane.showInputDialog(myWindow, "What is your special skill?");

        JOptionPane.showMessageDialog(myWindow, "Name: " + name + "\n" + "Age: " + old + " year" + "\n" + "Occupation: " + occupation + "\n" + "Special Skill: " + skill);
    }
}
