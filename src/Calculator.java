import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator {

    public Calculator() {
        // Creating and object for the main window
        JFrame programwindow = new JFrame("Java Calculator");
        // Not giving any default layout.
        programwindow.setLayout(null);
        // Size of the window
        programwindow.setSize(336, 649);
        // Location of the window when the program run.
        programwindow.setLocation(1200, 200);


        // When user enter a number it will be seem here, user wont be able to click 
        JLabel displaylabel = new JLabel("0");
        // The size and location of the label
        displaylabel.setBounds(0,0, 320, 148);
        // Background color
        displaylabel.setBackground(Color.darkGray);
        displaylabel.setForeground(Color.white);
        // Align label
        displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
        // View all the elements on the screen
        displaylabel.setOpaque(true);
        // Adding this label to the main output window
        programwindow.add(displaylabel);


        // Creating buttons;

        JButton clearButton = new JButton("C");
        clearButton.setBounds(3, 150, 77, 90);
        clearButton.setBackground(Color.darkGray);
        clearButton.setForeground(Color.white);
        programwindow.add(clearButton);

        JButton divideButton = new JButton("÷");
        divideButton.setBounds(82, 150, 77, 90);
        divideButton.setBackground(Color.darkGray);
        divideButton.setForeground(Color.white);
        programwindow.add(divideButton);


        JButton multiplyButton = new JButton("x");
        multiplyButton.setBounds(161, 150, 77, 90);
        multiplyButton.setBackground(Color.darkGray);
        multiplyButton.setForeground(Color.white);
        programwindow.add(multiplyButton);

        JButton minusButton = new JButton("-");
        minusButton.setBounds(240, 150, 77, 90);
        minusButton.setBackground(Color.darkGray);
        minusButton.setForeground(Color.white);
        programwindow.add(minusButton);

        JButton sevenButton = new JButton("7");
        sevenButton.setBounds(3, 242, 77, 90);
        sevenButton.setBackground(Color.darkGray);
        sevenButton.setForeground(Color.white);
        programwindow.add(sevenButton);

        JButton eightButton = new JButton("8");
        eightButton.setBounds(82, 242, 77, 90);
        eightButton.setBackground(Color.darkGray);
        eightButton.setForeground(Color.white);
        programwindow.add(eightButton);

        JButton nineButton = new JButton("9");
        nineButton.setBounds(161, 242, 77, 90);
        nineButton.setBackground(Color.darkGray);
        nineButton.setForeground(Color.white);
        programwindow.add(nineButton);

        JButton fourButton = new JButton("4");
        fourButton.setBounds(3, 334, 77, 90);
        fourButton.setBackground(Color.darkGray);
        fourButton.setForeground(Color.white);
        programwindow.add(fourButton);


        JButton fiveButton = new JButton("5");
        fiveButton.setBounds(82, 334, 77, 90);
        fiveButton.setBackground(Color.darkGray);
        fiveButton.setForeground(Color.white);
        programwindow.add(fiveButton);

        JButton sixButton = new JButton("6");
        sixButton.setBounds(161, 334, 77, 90);
        sixButton.setBackground(Color.darkGray);
        sixButton.setForeground(Color.white);
        programwindow.add(sixButton);

        JButton oneButton = new JButton("1");
        oneButton.setBounds(3, 426, 77, 90);
        oneButton.setBackground(Color.darkGray);
        oneButton.setForeground(Color.white);
        programwindow.add(oneButton);

        JButton twoButton = new JButton("2");
        twoButton.setBounds(82, 426, 77, 90);
        twoButton.setBackground(Color.darkGray);
        twoButton.setForeground(Color.white);
        programwindow.add(twoButton);

        JButton threeButton = new JButton("3");
        threeButton.setBounds(161, 426, 77, 90);
        threeButton.setBackground(Color.darkGray);
        threeButton.setForeground(Color.white);
        programwindow.add(threeButton);

        JButton zeroButton = new JButton("0");
        zeroButton.setBounds(3, 518, 77, 90);
        zeroButton.setBackground(Color.darkGray);
        zeroButton.setForeground(Color.white);
        programwindow.add(zeroButton);

        JButton pointButton = new JButton(".");
        pointButton.setBounds(82, 518, 77, 90);
        pointButton.setBackground(Color.darkGray);
        pointButton.setForeground(Color.white);
        programwindow.add(pointButton);

        JButton backButton = new JButton("<==");
        backButton.setBounds(161, 518, 77, 90);
        backButton.setBackground(Color.darkGray);
        backButton.setForeground(Color.white);
        programwindow.add(backButton);

        JButton equalButton = new JButton("=");
        equalButton.setBounds(240, 518, 77, 90);
        equalButton.setBackground(Color.darkGray);
        equalButton.setForeground(Color.white);
        programwindow.add(equalButton);

        JButton plusButton = new JButton("+");
        plusButton.setBounds(240, 242, 77, 274);
        plusButton.setBackground(Color.darkGray);
        plusButton.setForeground(Color.white);
        programwindow.add(plusButton);


        
        // To let the user see the program window
        programwindow.setVisible(true);
        // When the user close the main window the program ends.
        programwindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new Calculator();

    }
    
}
