/*
 * Login
 * 
 * This class represents the first window that will display to the user.
 * This class takes in a username and password input and verifies via a
 * query if the user credentials are correct. Once verified, this page will
 * be disposed, and the Dashboard window will open.
 * 
 */
package gui;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Alvaro
 * 
 */
public class Login extends JFrame implements ActionListener {
    //login and exit buttons
    private JButton loginBtn;
    private JButton exitBtn;
    
    //uesrname pasword & title labels
    private JLabel titleLbl;
    private JLabel usrLbl;
    private JLabel pwdLbl;
    
    //text fields for username and password
    private JTextField usrTxt;
    private JPasswordField pwdTxt;
   
    //panels for buttons and for credentials
    private JPanel BtnPanel;
    private JPanel credentialsPanel;

    //height and width of window
    public static final int WIDTH = 400;
    public static final int HEIGHT = 200;
    
    /*
     * Login
     * 
     * Constructs a window by initializing swing components and displaying them
     *
     */
    public Login() {
        super("Inicio");
        setWindow();
        initComponents();
        setComponentText();
        setPageTitle();
        setPanelLayouts();  
        addComponentsToPanels();
        addActionListeners();
        addComponentsToFrame();
        super.setVisible(true);
    }
    
    /*
     * setFrame
     * 
     * Sets the size, default close operation, and layout of the Frame
     */
    private void setWindow() {
        super.setSize(WIDTH, HEIGHT);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLayout(new BorderLayout());
    }
    
    private void initComponents() {
        initButtons();
        initLabels();
        initPanels();
        initFields();          
    }
    
    private void initButtons() {
        loginBtn = new JButton();
        exitBtn = new JButton();
    }
    
    private void initLabels() {
        titleLbl = new JLabel();
        usrLbl = new JLabel();
        pwdLbl = new JLabel(); 
    }
    
    private void initFields() {
        usrTxt = new JTextField();
        pwdTxt = new JPasswordField();
    }
    
    private void initPanels() {
        BtnPanel = new JPanel();
        credentialsPanel = new JPanel();
    }
    
    private void setComponentText() {
        loginBtn.setText("Login");
        exitBtn.setText("Exit");
        usrLbl.setText("Username");
        pwdLbl.setText("Password");
        titleLbl.setText("Login to Check-Soft Prime");
    }
    
    private void addActionListeners() {
        loginBtn.addActionListener(this);
        exitBtn.addActionListener(this);
    }
    private void setPageTitle() {
        titleLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("Login to Check-Soft Prime");
    }
    
    private void setPanelLayouts() {
        BtnPanel.setLayout(new FlowLayout());         
        credentialsPanel.setLayout(new GridLayout(2,2));
    }
    
    private void addComponentsToPanels() {
        BtnPanel.add(loginBtn);
        BtnPanel.add(exitBtn); 
        credentialsPanel.add(usrLbl);
        credentialsPanel.add(usrTxt);
        credentialsPanel.add(pwdLbl);
        credentialsPanel.add(pwdTxt);
    }
    
    private void addComponentsToFrame() {
        super.add(titleLbl, BorderLayout.NORTH);
        super.add(BtnPanel, BorderLayout.SOUTH);
        super.add(credentialsPanel, BorderLayout.CENTER);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Exit")){            
            System.exit(0);
        } else if (e.getActionCommand().equals("Login")) {
            /*
            TODO: query db for user & verify credentials
            
            */
            
            System.out.println(usrTxt.getText());
            System.out.println(pwdTxt.getText());
        } else {
            System.err.println("Error: invalid command " + e.getActionCommand());
        }
    }
    
}
