
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Mainframe extends JFrame {
 
 public Mainframe (String title) {
  super(title);
  
  // Set layout manager
  setLayout(new BorderLayout());
  
  // create swing component
  final JTextArea textArea = new JTextArea();
  JButton button    = new JButton("Click me!");
  
  // Add Swing components to content pane
  Container c = getContentPane();
  
  c.add(textArea, BorderLayout.CENTER);
  c.add(button, BorderLayout.SOUTH);
  
  // Add behaviour
  button.addActionListener(new ActionListener() {

   @Override
   public void actionPerformed(ActionEvent e) {
    textArea.append("Hello\n");     
    
   }
   
  });
  
 }

}