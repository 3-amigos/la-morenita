/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Alvaro
 */
public class Dashboard extends JFrame implements ActionListener {

    public Dashboard() {
        super("Dashboard");
        super.setSize(500,500);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
