import javax.swing.JFrame;
import javax.swing.SwingUtilities;
public class StudentFormCLass {

 public static void main(String[] args) {
  
  SwingUtilities.invokeLater(new Runnable(){
   public void run (){

    JFrame frame = new JFrame("Student Details");
    
    frame.setSize(400, 500);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true); 
   }
  });