/*
 * Qtr:			Autumn 2015
 * Class:		CSC212
 * Professor:	Dr. Julian Achim
 * Programmer:	Odiscious Dozier
 * Date:		10/21/2015
 * 
 * class: 		JPanelDemo
 * extends: 	JFrame
 * implements:	ActionListener
 * 
 * Super class:			JFrame
 * Implementing class:	ActionListener
 * 
 * Use of - dialog boxes, text boxes, labels, and buttons.
 * 
 * Array of letters used to illustrate knowledge of arrays
 * with a runtime cost of O(1) in the cascading if portion 
 * of the program.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JPanelDemo extends JFrame implements ActionListener{
	
	//all the pieces to add to the JPanel
	private JLabel lblExamScore = new JLabel("Welcome! Please input your exam "
			+ "score or type ‘E’ or ‘e’ to exit: ");
    private JLabel lblLetterGrade = new JLabel("Your letter grade is: ");
    private JTextField txtResultant = new JTextField(20);
    private JTextField txtLetterGrade = new JTextField(20);
    private JButton btnCompute = new JButton("Compute letter grade");
    

	//Not using an accessor or mutator because, there is no caller; as such, 
	//there is no need to force encapsulation. 
    private String[] letters = {"A", "B", "C", "D", "F"};
    
    // create a new panel with GridBagLayout manager
    private JPanel newPanel = new JPanel(new GridBagLayout());
     
    //super class and subclass - extending, not implementing
    public JPanelDemo() {
        super("Converting your exam score to a letter grade");
         btnCompute.addActionListener(this);
        
         
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);
         
        // add components to the panel
        constraints.gridx = 0;
        constraints.gridy = 0;     
        newPanel.add(lblExamScore, constraints);
 
        constraints.gridx = 1;
        newPanel.add(txtResultant, constraints);
         
        constraints.gridx = 0;
        constraints.gridy = 1;     
        newPanel.add(lblLetterGrade, constraints);
         
        constraints.gridx = 1;
        newPanel.add(txtLetterGrade, constraints);
         
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        newPanel.add(btnCompute, constraints);
         
        // set border for the panel
        newPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Login Panel"));
         
        // add the panel to this frame
        add(newPanel);
         
        pack();
        setLocationRelativeTo(null);
        
        //do some work when button depressed
     // add the listener to the jbutton to handle the "pressed" event
    }
    
    //Event listener for when the button is clicked; implementing, not
    //extending
    public void actionPerformed(ActionEvent e) {
    	//var used to see if user inputed any data at all
    	//and if so, what type of result to return to the user
    	int check = 0;
    	
    	//try block is designed to catch exceptions and display issues 
    	//to the user such as, erroneous inputs or no input at all
    	try{
        String result = txtResultant.getText();
        txtResultant.setText("");
        
        //check for sentinel value E/e
        if(result.toLowerCase().charAt(0) == 'e')
        {
        	newPanel.setEnabled(false);
        	newPanel.setVisible(false);
        	System.exit(0);
        	return;
        }
        
        check = Integer.parseInt(result);
        }
        catch(Exception z)
        {
        	JFrame frame = new JFrame("You made a boo boo");
            frame.setSize(400, 400);
            frame.setVisible(true);
            //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JOptionPane.showMessageDialog(frame, "Oops!  You forgot to enter some value "
            		+ "for your exam score or type E/e to exit.  Click the 'OK' button to continue.");
            frame.dispose();
        }
        
        //deduce correct letter grade and 
        //set the letter grade text box
        if(check >= 90 && check <= 100)
		{
        	txtLetterGrade.setText(letters[0]);  
		}
		else if(check >= 80 && check <= 89)
		{
			txtLetterGrade.setText(letters[1]);
		}
		else if(check >= 70 && check <= 79)
		{
			txtLetterGrade.setText(letters[2]);
		}
		else if(check >= 60 && check <= 69)
		{
			txtLetterGrade.setText(letters[3]);
		}
		else 
		{
			txtLetterGrade.setText(letters[4]);
		}
    }
}
