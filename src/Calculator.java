//Importing libraries
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;



// Implimenting 'ActionListner' to listen to the keeps pressed
public class Calculator extends CalculatorExtensions implements ActionListener{
    //global variables
    JFrame programwindow;
    JLabel displaylabel;

    JButton clearButton,
            divideButton,
            multiplyButton,
            minusButton,
            sevenButton,
            eightButton,
            nineButton,
            fourButton,
            fiveButton,
            sixButton,
            oneButton,
            twoButton,
            threeButton,
            zeroButton,
            pointButton,
            backButton,
            equalButton,
            plusButton;
    
    // Variables for calculations

    String[] numberArray = new String[100];
    String[] operatorArray = new String[100];
    Float result = (float) 0;
    Float tempNumber = (float) 0;
    Boolean isOperatorClicked = false;
    int numArrayPosition = 0;
    int operatorArrayPosition = 0;
    Boolean pointIsClicked = false;
    String tempOperator;
    String finalResult;
    Boolean equalButtonClicked = false;

    // Calculator design aspects variable

    // Number Designs
    String calcFontName = "Monospace";
    int calcFontSize = 30;
    // Operators Designs


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
        

        
        /* creating fake background to adjust the main 
           display while the background color stays the same */
        JLabel displayFakeBackground = new JLabel();
        displayFakeBackground.setBackground(Color.DARK_GRAY);
        displayFakeBackground.setBounds(0,0,500, 1000);
        displayFakeBackground.setOpaque(true);
        

        // When user enter a number it will be seen here, user wont be able to click 
        displaylabel = new JLabel("0");
        // The size and location of the label
        displaylabel.setBounds(0,0, 310, 148);
        // Background color
        displaylabel.setBackground(Color.DARK_GRAY);
        displaylabel.setForeground(Color.white);
        // Align labelss
        displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displaylabel.setFont(new Font(calcFontName, Font.PLAIN, calcFontSize));
        // View all the elements on the screen
        displaylabel.setOpaque(true);
        // Adding this label to the main output window
        programwindow.add(displaylabel);
        


        // Creating buttons;

        clearButton = new JButton("C");
        clearButton.setBounds(3, 150, 77, 90);
        clearButton.setBackground(Color.black);
        clearButton.setForeground(Color.orange);
        clearButton.setFont(new Font(calcFontName, Font.PLAIN, calcFontSize));
        // when you press the button the Action listener will catch it.
        clearButton.addActionListener(this);    
        programwindow.add(clearButton);


        divideButton = new JButton("/");
        divideButton.setBounds(82, 150, 77, 90);
        divideButton.setBackground(Color.black);
        divideButton.setForeground(Color.white);
        divideButton.setFont(new Font(calcFontName, Font.PLAIN, calcFontSize));
        divideButton.addActionListener(this); 
        programwindow.add(divideButton);


        multiplyButton = new JButton("x");
        multiplyButton.setBounds(161, 150, 77, 90);
        multiplyButton.setBackground(Color.black);
        multiplyButton.setForeground(Color.white);
        multiplyButton.setFont(new Font(calcFontName, Font.PLAIN, calcFontSize));
        multiplyButton.addActionListener(this); 
        programwindow.add(multiplyButton);

        minusButton = new JButton("-");
        minusButton.setBounds(240, 150, 77, 90);
        minusButton.setBackground(Color.black);
        minusButton.setForeground(Color.white);
        minusButton.setFont(new Font(calcFontName, Font.PLAIN, calcFontSize));
        minusButton.addActionListener(this); 
        programwindow.add(minusButton);

        sevenButton = new JButton("7");
        sevenButton.setBounds(3, 242, 77, 90);
        sevenButton.setFont(new Font(calcFontName, Font.BOLD, calcFontSize));
        sevenButton.setBackground(Color.black);
        sevenButton.setForeground(Color.white);
        sevenButton.addActionListener(this); 
        programwindow.add(sevenButton);

        eightButton = new JButton("8");
        eightButton.setBounds(82, 242, 77, 90);
        eightButton.setBackground(Color.black);
        eightButton.setForeground(Color.white);
        eightButton.setFont(new Font(calcFontName, Font.BOLD, calcFontSize));
        eightButton.addActionListener(this); 
        programwindow.add(eightButton);

        nineButton = new JButton("9");
        nineButton.setBounds(161, 242, 77, 90);
        nineButton.setBackground(Color.black);
        nineButton.setForeground(Color.white);
        nineButton.setFont(new Font(calcFontName, Font.BOLD, calcFontSize));
        nineButton.addActionListener(this); 
        programwindow.add(nineButton);

        fourButton = new JButton("4");
        fourButton.setBounds(3, 334, 77, 90);
        fourButton.setBackground(Color.black);
        fourButton.setForeground(Color.white);
        fourButton.setFont(new Font(calcFontName, Font.BOLD, calcFontSize));
        fourButton.addActionListener(this); 
        programwindow.add(fourButton);


        fiveButton = new JButton("5");
        fiveButton.setBounds(82, 334, 77, 90);
        fiveButton.setBackground(Color.black);
        fiveButton.setForeground(Color.white);
        fiveButton.setFont(new Font(calcFontName, Font.BOLD, calcFontSize));
        fiveButton.addActionListener(this); 
        programwindow.add(fiveButton);

        sixButton = new JButton("6");
        sixButton.setBounds(161, 334, 77, 90);
        sixButton.setBackground(Color.black);
        sixButton.setForeground(Color.white);
        sixButton.setFont(new Font(calcFontName, Font.BOLD, calcFontSize));
        sixButton.addActionListener(this); 
        programwindow.add(sixButton);

        oneButton = new JButton("1");
        oneButton.setBounds(3, 426, 77, 90);
        oneButton.setBackground(Color.black);
        oneButton.setForeground(Color.white);
        oneButton.setFont(new Font(calcFontName, Font.BOLD, calcFontSize));
        oneButton.addActionListener(this); 
        programwindow.add(oneButton);

        twoButton = new JButton("2");
        twoButton.setBounds(82, 426, 77, 90);
        twoButton.setBackground(Color.black);
        twoButton.setForeground(Color.white);
        twoButton.setFont(new Font(calcFontName, Font.BOLD, calcFontSize));
        twoButton.addActionListener(this); 
        programwindow.add(twoButton);

        threeButton = new JButton("3");
        threeButton.setBounds(161, 426, 77, 90);
        threeButton.setBackground(Color.black);
        threeButton.setForeground(Color.white);
        threeButton.setFont(new Font(calcFontName, Font.BOLD, calcFontSize));
        threeButton.addActionListener(this); 
        programwindow.add(threeButton);

        zeroButton = new JButton("0");
        zeroButton.setBounds(3, 518, 77, 90);
        zeroButton.setBackground(Color.black);
        zeroButton.setForeground(Color.white);
        zeroButton.setFont(new Font(calcFontName, Font.BOLD, calcFontSize));
        zeroButton.addActionListener(this); 
        programwindow.add(zeroButton);

        pointButton = new JButton(".");
        pointButton.setBounds(82, 518, 77, 90);
        pointButton.setBackground(Color.black);
        pointButton.setForeground(Color.white);
        pointButton.setFont(new Font(calcFontName, Font.BOLD, calcFontSize));
        pointButton.addActionListener(this); 
        programwindow.add(pointButton);

        backButton = new JButton("<-");
        backButton.setBounds(161, 518, 77, 90);
        backButton.setBackground(Color.black);
        backButton.setForeground(Color.white);
        backButton.setFont(new Font(calcFontName, Font.BOLD, calcFontSize));
        backButton.addActionListener(this); 
        programwindow.add(backButton);

        equalButton = new JButton("=");
        equalButton.setBounds(240, 518, 77, 90);
        equalButton.setBackground(Color.orange);
        equalButton.setForeground(Color.white);
        equalButton.setFont(new Font(calcFontName, Font.BOLD, calcFontSize));
        equalButton.addActionListener(this); 
        programwindow.add(equalButton);

        plusButton = new JButton("+");
        plusButton.setBounds(240, 242, 77, 274);
        plusButton.setBackground(Color.black);
        plusButton.setForeground(Color.white);
        plusButton.setFont(new Font(calcFontName, Font.BOLD, calcFontSize));
        plusButton.addActionListener(this); 
        programwindow.add(plusButton);


        programwindow.add(displayFakeBackground);
        // To let the user see the program window
        programwindow.setVisible(true);
        // When the user close the main window the program ends.
        programwindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    // This method will catch the key presses
    @Override
    public void actionPerformed(ActionEvent e) {

        //clearing the zero on the startup screens
        if(displaylabel.getText() == "0") {
            displaylabel.setText("");

        }
        //Button functions
        if(e.getSource() == clearButton) {
            displaylabel.setText("");
            isOperatorClicked = false;
            pointIsClicked = false; 
            numArrayPosition = 0;
            operatorArrayPosition = 0;
            result = (float) 0;
            equalButtonClicked = false;
            displaylabel.setText("0");

        }
        else if(e.getSource() == backButton) {
            String tempVar = displaylabel.getText();
            // Using substring and index number to trim the last letter. 
            tempVar = tempVar.substring(0, tempVar.length() - 1);
            displaylabel.setText(tempVar);
        }
        else if (e.getSource() == plusButton) {
            operatorArray[operatorArrayPosition] = "+";
            operatorArrayPosition++;
            isOperatorClicked = true;
            pointIsClicked = false;
            
        }
        else if(e.getSource() == divideButton) {
            operatorArray[operatorArrayPosition] = "/";
            operatorArrayPosition++;
            isOperatorClicked = true;
            pointIsClicked = false;

        }
        else if(e.getSource() == multiplyButton) {
            operatorArray[operatorArrayPosition] = "*";
            operatorArrayPosition++;
            isOperatorClicked = true;
            pointIsClicked = false;
        }
        else if(e.getSource() == minusButton) {
            operatorArray[operatorArrayPosition] = "-";
            operatorArrayPosition++;
            isOperatorClicked = true;
            pointIsClicked = false;

        }
        else if(e.getSource() == sevenButton) {
            // IF operator clicked, store the number and display the fucntions number.
            if(isOperatorClicked) {
                numberArray[numArrayPosition] = displaylabel.getText();
                displaylabel.setText("7");
                numArrayPosition++;
                isOperatorClicked = false;
        
            }
            else {
                displaylabel.setText(displaylabel.getText()+"7");
            }
        }
        else if(e.getSource() == eightButton) {
            if(isOperatorClicked) {
                numberArray[numArrayPosition] = displaylabel.getText();
                displaylabel.setText("8");
                numArrayPosition++;
                isOperatorClicked = false;
            }
            else {
                displaylabel.setText(displaylabel.getText()+"8");
            }

        }
        else if(e.getSource() == nineButton) {
            if(isOperatorClicked) {
                numberArray[numArrayPosition] = displaylabel.getText();
                displaylabel.setText("9");
                numArrayPosition++;
                isOperatorClicked = false;
            }
            else {
                displaylabel.setText(displaylabel.getText()+"9");
            }

        }
        else if(e.getSource() == fourButton) {
            if(isOperatorClicked) {
                numberArray[numArrayPosition] = displaylabel.getText();
                displaylabel.setText("4");
                numArrayPosition++;
                isOperatorClicked = false;
            }
            else {
                displaylabel.setText(displaylabel.getText()+"4");
            }

        }
        else if(e.getSource() == fiveButton) {
            if(isOperatorClicked) {
                numberArray[numArrayPosition] = displaylabel.getText();
                displaylabel.setText("5");
                numArrayPosition++;
                isOperatorClicked = false;
                
            }
            else {
                displaylabel.setText(displaylabel.getText()+"5");
            }

        }
        else if(e.getSource() == sixButton) {
            if(isOperatorClicked) {
                numberArray[numArrayPosition] = displaylabel.getText();
                displaylabel.setText("6");
                numArrayPosition++;
                isOperatorClicked = false;
            }
            else {
                displaylabel.setText(displaylabel.getText()+"6");
            }

        }
        else if(e.getSource() == threeButton) {
            if(isOperatorClicked) {
                numberArray[numArrayPosition] = displaylabel.getText();
                displaylabel.setText("3");
                numArrayPosition++;
                isOperatorClicked = false;
            }
            else {
                displaylabel.setText(displaylabel.getText()+"3");
            }

        }
        else if(e.getSource() == twoButton) {
            if(isOperatorClicked) {
                numberArray[numArrayPosition] = displaylabel.getText();
                displaylabel.setText("2");
                numArrayPosition++;
                isOperatorClicked = false;
            }
            else {
                displaylabel.setText(displaylabel.getText()+"2");
            }

        }
        else if(e.getSource() == oneButton) {
            if(isOperatorClicked) {
                numberArray[numArrayPosition] = displaylabel.getText();
                displaylabel.setText("1");
                numArrayPosition++;
                isOperatorClicked = false;
            }
            else {
                displaylabel.setText(displaylabel.getText()+"1");
            }

        }
        else if(e.getSource() == zeroButton) {
            if(isOperatorClicked) {
                numberArray[numArrayPosition] = displaylabel.getText();
                displaylabel.setText("0");
                numArrayPosition++;
                isOperatorClicked = false;
            }
            else {
                displaylabel.setText(displaylabel.getText()+"0");
            }

        }
        
        else if(e.getSource() == pointButton) {
            if(pointIsClicked) {

            }
            else {
                displaylabel.setText(displaylabel.getText()+".");
                pointIsClicked = true;
            }
        }
        
        else if(e.getSource() == equalButton) {
            //Getting the last number to the array
            numberArray[numArrayPosition] = displaylabel.getText();
            // tr-cathc method is used to catch errors prevent the application from breaking. 
            try {
                
                for(int i=0; i<=numArrayPosition; i++) {
                    
                    if(result == 0) {
                        //assigning value to result for easy calsulations 
                        result = Float.parseFloat(numberArray[i]);
                        continue;
                    }
                    
                    if (equalButtonClicked) {
                        tempOperator = operatorArray[i];
                        tempNumber = Float.parseFloat(numberArray[i+1]);
                        i++;
                    }
                    else {
                        tempOperator = operatorArray[i-1];
                        tempNumber = Float.parseFloat(numberArray[i]);
                    }
                    
                    if(tempOperator == "+") {
                        result = result + tempNumber;
                        
                    }
                    else if (tempOperator == "-") {
                        result = result - tempNumber;
                    }
                    else if (tempOperator == "*") {
                        result = result * tempNumber;
                    }
                    else if (tempOperator == "/") {
                        result = result / tempNumber;
                    }
                }
            } 
            catch (ArrayIndexOutOfBoundsException x) {

                System.out.println("Exception caught: ArrayIndexOutOfBoundsException\n invalid index number in array.");
            }
            catch(NumberFormatException s) {
                System.out.println("Exception caught: NumberFormatException \n no number inputs from user");
            }
            finally {

                if(isInteger(result)) {
                    int temp = (int) Math.ceil(result);
                 finalResult = Integer.toString(temp);
                }
                else {
                   finalResult = Float.toString(result);
                }

                displaylabel.setText(finalResult);
                //Resetting variables.
                numArrayPosition = 0;
                operatorArrayPosition = 0;
                equalButtonClicked = true;
                
            }
        }
    

    }
    

    // Main function.
    public static void main(String[] args){
        //creating a one time object so that the codes in the costructors run.
        new Calculator();

        

    }
    
}
