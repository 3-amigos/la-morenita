/* Licensed to: Rafael Gómez
 * Developed by: Three Amigos
 */
package gui;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Alvaro Licea, Jr.
 * @version 0.1
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
     * in a window
     *
     */
    public Login() {
        super("Inicio");
        setFrame();
        initComponents();
        setComponentText();
        setPageTitle();
        setPanelLayouts();  
        addComponentsToPanels();
        setButtonCommands();
        addActionListeners();
        addComponentsToFrame();
        super.setVisible(true);
    }
    
    /* setFrame
     * 
     * Sets the size, default close operation, and layout of the Frame
     */
    private void setFrame() {
        super.setSize(WIDTH, HEIGHT);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLayout(new BorderLayout());
    }
    
    /* initComponents
     * 
     * Initializes all the components for this Frame
     */
    private void initComponents() {
        loginBtn = new JButton();
        exitBtn = new JButton();
        titleLbl = new JLabel();
        usrLbl = new JLabel();
        pwdLbl = new JLabel(); 
        usrTxt = new JTextField();
        pwdTxt = new JPasswordField();
        BtnPanel = new JPanel();
        credentialsPanel = new JPanel();
    }
    
    /* SetComponentText
     * 
     * Sets the text for the buttons and labels 
     */
    private void setComponentText() {
        loginBtn.setText("Iniciar");
        exitBtn.setText("Salir");
        usrLbl.setText("Nombre de Usuario");
        pwdLbl.setText("Contraseña");
        titleLbl.setText("Login to Check-Soft Prime");
    }
    
    private void setButtonCommands() {
        loginBtn.setActionCommand("Login");
        exitBtn.setActionCommand("Exit");
    }
    /* addActionListeners
     * 
     * Adds an action listeners for login and exit buttons
     */
    private void addActionListeners() {
        loginBtn.addActionListener(this);
        exitBtn.addActionListener(this);
    }
    
    /* setPageTitle
     *
     * Sets the font, alignment, and text of label to display as a title
     */
    private void setPageTitle() {
        titleLbl.setFont(new java.awt.Font("Tahoma", 0, 18));
        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("Inicio de Sesion");
    }
    
    /* setPanelLayouts
     *
     * Button panel has a flow layout, credentials panel has a 2x2 grid layout
     */
    private void setPanelLayouts() {
        BtnPanel.setLayout(new FlowLayout());         
        credentialsPanel.setLayout(new GridLayout(2,2));
    }
    
    
    /* addComponentsToPanels
     * 
     * Buttons are added to button panel, username & password labels along with
     * text fields are added to credentials panel
     */
    private void addComponentsToPanels() {
        BtnPanel.add(loginBtn);
        BtnPanel.add(exitBtn); 
        credentialsPanel.add(usrLbl);
        credentialsPanel.add(usrTxt);
        credentialsPanel.add(pwdLbl);
        credentialsPanel.add(pwdTxt);
    }
        
    /* addComponentsToFrame
     *
     * Adds button panel to south, title to north, and credentials panel to the
     * center layout
     */
    private void addComponentsToFrame() {
        super.add(titleLbl, BorderLayout.NORTH);
        super.add(BtnPanel, BorderLayout.SOUTH);
        super.add(credentialsPanel, BorderLayout.CENTER);
    }
    
    /* actionPerformed
     * 
     * If exit button action, shut down appication
     * If login button action, verify input:
     * If credentials are valid, dispose Login window and open Dashboard window
     * Otherwise display error popup and clear fields
     *
     * Params: ActionEven object representing the button clicked by user     
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Exit")){            
            System.exit(0);
        } else if (e.getActionCommand().equals("Login")) {
            /*
            TODO: query db for user & verify credentials
            
            String usr = usrTxt.getText();
            String pwd = usrTxt.getText();
            
            if(DataHandler.verifyLogin(usr, pwd) == true)
                super.dispose();
                Dashboard da = new Dashboard();
            else
                display error and do nothing
            */
            super.dispose();
            Dashboard dashboard = new Dashboard();     
            
        } else {
            System.err.println("INVALID COMMAND: " + e.getActionCommand());
        }
    }
    
}
