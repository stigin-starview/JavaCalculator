//Importing libraries
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;



// Implimenting 'ActionListner' to listen to the keeps pressed
public class Calculator implements ActionListener{
    //global variables
    JFrame programwindow;
    JLabel displaylabel;

    JButton clearButton;
    JButton divideButton;
    JButton multiplyButton;
    JButton minusButton;
    JButton sevenButton; 
    JButton eightButton;
    JButton nineButton;
    JButton fourButton;
    JButton fiveButton;
    JButton sixButton;
    JButton oneButton;
    JButton twoButton;
    JButton threeButton;
    JButton zeroButton;
    JButton pointButton;
    JButton backButton;
    JButton equalButton;
    JButton plusButton;





    public Calculator() {
        // Creating and object for the main window
        programwindow = new JFrame("Java Calculator");
        // Not giving any default layout.
        programwindow.setLayout(null);
        // Size of the window
        programwindow.setSize(336, 649);
        // Location of the window when the program run.
        programwindow.setLocation(1200, 200);
        // disabling window resizing.
        programwindow.setResizable(false);


        // When user enter a number it will be seen here, user wont be able to click 
        displaylabel = new JLabel("0");
        // The size and location of the label
        displaylabel.setBounds(0,0, 320, 148);
        // Background color
        displaylabel.setBackground(Color.darkGray);
        displaylabel.setForeground(Color.white);
        // Align labelss
        displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
        // View all the elements on the screen
        displaylabel.setOpaque(true);
        // Adding this label to the main output window
        programwindow.add(displaylabel);


        // Creating buttons;

        clearButton = new JButton("C");
        clearButton.setBounds(3, 150, 77, 90);
        clearButton.setBackground(Color.darkGray);
        clearButton.setForeground(Color.white);
        // when you press the button the Action listener will catch it.
        clearButton.addActionListener(this);    
        programwindow.add(clearButton);

        divideButton = new JButton("/");
        divideButton.setBounds(82, 150, 77, 90);
        divideButton.setBackground(Color.darkGray);
        divideButton.setForeground(Color.white);
        divideButton.addActionListener(this); 
        programwindow.add(divideButton);


        multiplyButton = new JButton("x");
        multiplyButton.setBounds(161, 150, 77, 90);
        multiplyButton.setBackground(Color.darkGray);
        multiplyButton.setForeground(Color.white);
        multiplyButton.addActionListener(this); 
        programwindow.add(multiplyButton);

        minusButton = new JButton("-");
        minusButton.setBounds(240, 150, 77, 90);
        minusButton.setBackground(Color.darkGray);
        minusButton.setForeground(Color.white);
        minusButton.addActionListener(this); 
        programwindow.add(minusButton);

        sevenButton = new JButton("7");
        sevenButton.setBounds(3, 242, 77, 90);
        sevenButton.setBackground(Color.darkGray);
        sevenButton.setForeground(Color.white);
        sevenButton.addActionListener(this); 
        programwindow.add(sevenButton);

        eightButton = new JButton("8");
        eightButton.setBounds(82, 242, 77, 90);
        eightButton.setBackground(Color.darkGray);
        eightButton.setForeground(Color.white);
        eightButton.addActionListener(this); 
        programwindow.add(eightButton);

        nineButton = new JButton("9");
        nineButton.setBounds(161, 242, 77, 90);
        nineButton.setBackground(Color.darkGray);
        nineButton.setForeground(Color.white);
        nineButton.addActionListener(this); 
        programwindow.add(nineButton);

        fourButton = new JButton("4");
        fourButton.setBounds(3, 334, 77, 90);
        fourButton.setBackground(Color.darkGray);
        fourButton.setForeground(Color.white);
        fourButton.addActionListener(this); 
        programwindow.add(fourButton);


        fiveButton = new JButton("5");
        fiveButton.setBounds(82, 334, 77, 90);
        fiveButton.setBackground(Color.darkGray);
        fiveButton.setForeground(Color.white);
        fiveButton.addActionListener(this); 
        programwindow.add(fiveButton);

        sixButton = new JButton("6");
        sixButton.setBounds(161, 334, 77, 90);
        sixButton.setBackground(Color.darkGray);
        sixButton.setForeground(Color.white);
        sixButton.addActionListener(this); 
        programwindow.add(sixButton);

        oneButton = new JButton("1");
        oneButton.setBounds(3, 426, 77, 90);
        oneButton.setBackground(Color.darkGray);
        oneButton.setForeground(Color.white);
        oneButton.addActionListener(this); 
        programwindow.add(oneButton);

        twoButton = new JButton("2");
        twoButton.setBounds(82, 426, 77, 90);
        twoButton.setBackground(Color.darkGray);
        twoButton.setForeground(Color.white);
        twoButton.addActionListener(this); 
        programwindow.add(twoButton);

        threeButton = new JButton("3");
        threeButton.setBounds(161, 426, 77, 90);
        threeButton.setBackground(Color.darkGray);
        threeButton.setForeground(Color.white);
        threeButton.addActionListener(this); 
        programwindow.add(threeButton);

        zeroButton = new JButton("0");
        zeroButton.setBounds(3, 518, 77, 90);
        zeroButton.setBackground(Color.darkGray);
        zeroButton.setForeground(Color.white);
        zeroButton.addActionListener(this); 
        programwindow.add(zeroButton);

        pointButton = new JButton(".");
        pointButton.setBounds(82, 518, 77, 90);
        pointButton.setBackground(Color.darkGray);
        pointButton.setForeground(Color.white);
        pointButton.addActionListener(this); 
        programwindow.add(pointButton);

        backButton = new JButton("<==");
        backButton.setBounds(161, 518, 77, 90);
        backButton.setBackground(Color.darkGray);
        backButton.setForeground(Color.white);
        backButton.addActionListener(this); 
        programwindow.add(backButton);

        equalButton = new JButton("=");
        equalButton.setBounds(240, 518, 77, 90);
        equalButton.setBackground(Color.darkGray);
        equalButton.setForeground(Color.white);
        equalButton.addActionListener(this); 
        programwindow.add(equalButton);

        plusButton = new JButton("+");
        plusButton.setBounds(240, 242, 77, 274);
        plusButton.setBackground(Color.darkGray);
        plusButton.setForeground(Color.white);
        plusButton.addActionListener(this); 
        programwindow.add(plusButton);


        
        // To let the user see the program window
        programwindow.setVisible(true);
        // When the user close the main window the program ends.
        programwindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new Calculator();

    }
    // This method will catch the key presses
    @Override
    public void actionPerformed(ActionEvent e) {
        // programwindow.getContentPane().setBackground(Color.orange);

        if(e.getSource() == clearButton) {

        }
        else if(e.getSource() == divideButton ) {

        }
        else if(e.getSource() == multiplyButton ) {

        }
        else if(e.getSource() == minusButton ) {

        }
        else if(e.getSource() == sevenButton ) {
            displaylabel.setText("7");

        }
        else if(e.getSource() == eightButton ) {
            displaylabel.setText("8");

        }
        else if(e.getSource() == nineButton ) {
            displaylabel.setText("9");

        }
        else if(e.getSource() == fourButton ) {
            displaylabel.setText("4");

        }
        else if(e.getSource() == fiveButton ) {
            displaylabel.setText("5");

        }
        else if(e.getSource() == sixButton ) {
            displaylabel.setText("6");

        }
        else if(e.getSource() == threeButton ) {
            displaylabel.setText("3");

        }
        else if(e.getSource() == twoButton ) {
            displaylabel.setText("2");

        }
        else if(e.getSource() == oneButton ) {
            displaylabel.setText("1");

        }
        else if(e.getSource() == zeroButton ) {
            displaylabel.setText("0");

        }
        else if(e.getSource() == pointButton ) {
            displaylabel.setText(".");

        }

    }
    // @Override
    // public void actionPerformed(ActionEvent arg0) {
        
        
    // }
    
}
