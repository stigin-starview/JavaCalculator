import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Calculator {

    public Calculator() {
        JFrame programwindow = new JFrame("Java Calculator");
        programwindow.setLayout(null);
        // Size of the window
        programwindow.setSize(340, 600);
        // Location of the window when the program run.
        programwindow.setLocation(1200, 200);


        // when user enter a number it will be seem here, user wont be able to click 
        JLabel displaylabel = new JLabel("0");
        displaylabel.setBounds(40, 50, 340, 100);
        displaylabel.setBackground(Color.lightGray);
        displaylabel.setOpaque(true);
        programwindow.add(displaylabel);

        // To let the user see the program window
        programwindow.setVisible(true);
        // when the user close the main window the program ends.
        programwindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new Calculator();

    }
    
}
