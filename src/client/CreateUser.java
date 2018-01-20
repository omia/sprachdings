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

public class CreateUser extends JFrame {
  // Anfang Attribute
  private JLabel lUsername = new JLabel();
  private JLabel lNickname = new JLabel();
  private JLabel lPasswort = new JLabel();
  private JButton bAddUser = new JButton();
  private JTextField jTF_Username = new JTextField();
  private JTextField jTFNickname = new JTextField();
  private JTextField jTF_Passwort = new JTextField();
  // Ende Attribute
  
  public CreateUser() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 300; 
    int frameHeight = 182;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("CreateUser");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    lUsername.setBounds(8, 8, 110, 20);
    lUsername.setText("Username");
    cp.add(lUsername);
    lNickname.setBounds(8, 40, 110, 20);
    lNickname.setText("Nickname");
    cp.add(lNickname);
    lPasswort.setBounds(16, 64, 110, 20);
    lPasswort.setText("Passwort");
    cp.add(lPasswort);
    bAddUser.setBounds(8, 104, 267, 25);
    bAddUser.setText("add User");
    bAddUser.setMargin(new Insets(2, 2, 2, 2));
    bAddUser.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bAddUser_ActionPerformed(evt);
      }
    });
    cp.add(bAddUser);
    jTF_Username.setBounds(128, 8, 150, 20);
    cp.add(jTF_Username);
    jTFNickname.setBounds(128, 40, 150, 20);
    cp.add(jTFNickname);
    jTF_Passwort.setBounds(128, 72, 150, 20);
    cp.add(jTF_Passwort);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public CreateUser
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new CreateUser();
  } // end of main
  
  public void bAddUser_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
    
  } // end of bAddUser_ActionPerformed

  // Ende Methoden
} // end of class CreateUser

