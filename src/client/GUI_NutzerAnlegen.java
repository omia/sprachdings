package client;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 13.01.2018
  * @author 
  */

public class GUI_NutzerAnlegen extends JFrame {
  // Anfang Attribute
  private JLabel lUsername = new JLabel();
  private JLabel lNickname = new JLabel();
  private JLabel lPasswort = new JLabel();
  private JTextField jTextField1 = new JTextField();
  private JTextField jTextField2 = new JTextField();
  private JPasswordField jPasswordField1 = new JPasswordField();
  private JButton jButton1 = new JButton();
  // Ende Attribute
  
  public GUI_NutzerAnlegen() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 300; 
    int frameHeight = 188;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Sprachdings Nutzer Erstellen");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    lUsername.setBounds(8, 8, 110, 20);
    lUsername.setText("username");
    lUsername.setForeground(Color.WHITE);
    lUsername.setFont(new Font("Dialog", Font.BOLD, 12));
    cp.add(lUsername);
    lNickname.setBounds(8, 40, 110, 20);
    lNickname.setText("Nickname");
    lNickname.setDisplayedMnemonicIndex(KeyEvent.VK_0);
    lNickname.setForeground(Color.WHITE);
    lNickname.setFont(new Font("Dialog", Font.BOLD, 12));
    cp.add(lNickname);
    lPasswort.setBounds(8, 72, 110, 20);
    lPasswort.setText("Passwort");
    lPasswort.setDisplayedMnemonicIndex(KeyEvent.VK_0);
    lPasswort.setEnabled(true);
    lPasswort.setFont(new Font("Dialog", Font.BOLD, 12));
    lPasswort.setForeground(Color.WHITE);
    cp.add(lPasswort);
    jTextField1.setBounds(128, 8, 150, 20);
    jTextField1.setForeground(Color.WHITE);
    jTextField1.setFont(new Font("Dialog", Font.PLAIN, 12));
    jTextField1.setBackground(Color.GRAY);
    cp.add(jTextField1);
    jTextField2.setBounds(128, 40, 150, 20);
    jTextField2.setEditable(true);
    jTextField2.setForeground(Color.WHITE);
    jTextField2.setFont(new Font("Dialog", Font.PLAIN, 12));
    jTextField2.setBackground(Color.GRAY);
    cp.add(jTextField2);
    jPasswordField1.setBounds(128, 72, 150, 20);
    jPasswordField1.setEditable(true);
    jPasswordField1.setEnabled(true);
    jPasswordField1.setForeground(Color.WHITE);
    jPasswordField1.setFont(new Font("Dialog", Font.PLAIN, 12));
    jPasswordField1.setBackground(Color.GRAY);
    cp.add(jPasswordField1);
    jButton1.setBounds(8, 104, 267, 25);
    jButton1.setText("jButton1");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    jButton1.setEditable(true);
    jButton1.setEnabled(true);
    jButton1.setFont(new Font("Dialog", Font.PLAIN, 12));
    jButton1.setForeground(Color.WHITE);
    jButton1.setBackground(Color.GRAY);
    jButton1.setBorderPainted(false);
    cp.add(jButton1);
    cp.setBackground(new Color(0x404040));
    // Ende Komponenten
    
    setVisible(true);
  } // end of public GUI_NutzerAnlegen
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new GUI_NutzerAnlegen();
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
    
  } // end of jButton1_ActionPerformed

  // Ende Methoden
} // end of class GUI_NutzerAnlegen
