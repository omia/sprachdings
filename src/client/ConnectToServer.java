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

public class ConnectToServer extends JFrame {
  // Anfang Attribute
  private JLabel lServerIP = new JLabel();
  private JTextField jTextField1 = new JTextField();
  private JTextField jTextField2 = new JTextField();
  private JLabel lServerPort = new JLabel();
  private JLabel abel1 = new JLabel();
  private JTextArea jTextArea1 = new JTextArea("");
    private JScrollPane jTextArea1ScrollPane = new JScrollPane(jTextArea1);
  private JButton jButton1 = new JButton();
  // Ende Attribute
  
  public ConnectToServer() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 300; 
    int frameHeight = 248;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("ConnectToServer");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    lServerIP.setBounds(8, 8, 110, 20);
    lServerIP.setText("Server IP");
    cp.add(lServerIP);
    jTextField1.setBounds(128, 8, 150, 20);
    cp.add(jTextField1);
    jTextField2.setBounds(128, 40, 150, 20);
    cp.add(jTextField2);
    lServerPort.setBounds(8, 40, 110, 20);
    lServerPort.setText("Server Port");
    cp.add(lServerPort);
    jTextArea1ScrollPane.setBounds(8, 96, 272, 100);
    cp.add(jTextArea1ScrollPane);
    jButton1.setBounds(8, 64, 272, 25);
    jButton1.setText("jButton1");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public ConnectToServer
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new ConnectToServer();
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
    
  } // end of jButton1_ActionPerformed

  // Ende Methoden
} // end of class ConnectToServer

