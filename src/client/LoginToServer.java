package client;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 20.01.2018
  * @author 
  */

public class LoginToServer extends JFrame {
  // Anfang Attribute
  private JLabel lUsername = new JLabel();
  private JTextField jTextField1 = new JTextField();
  private JLabel lPasswort = new JLabel();
  private JTextField jTextField2 = new JTextField();
  private JButton bLogin = new JButton();
  // Ende Attribute
  
  public LoginToServer() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 300; 
    int frameHeight = 128;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("LoginToServer");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    lUsername.setBounds(8, 8, 110, 20);
    lUsername.setText("Username");
    cp.add(lUsername);
    jTextField1.setBounds(128, 8, 150, 20);
    cp.add(jTextField1);
    lPasswort.setBounds(8, 32, 110, 20);
    lPasswort.setText("Passwort");
    cp.add(lPasswort);
    jTextField2.setBounds(128, 32, 150, 20);
    cp.add(jTextField2);
    bLogin.setBounds(8, 56, 267, 25);
    bLogin.setText("Login");
    bLogin.setMargin(new Insets(2, 2, 2, 2));
    bLogin.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bLogin_ActionPerformed(evt);
      }
    });
    cp.add(bLogin);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public LoginToServer
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new LoginToServer();
  } // end of main
  
  public void bLogin_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
    
  } // end of bLogin_ActionPerformed

  // Ende Methoden
} // end of class LoginToServer

