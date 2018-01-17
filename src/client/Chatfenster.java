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

public class Chatfenster extends JFrame {
  // Anfang Attribute
  private JComboBox jComboBox1 = new JComboBox();
    private DefaultComboBoxModel jComboBox1Model = new DefaultComboBoxModel();
  private JLabel lGlobalerChat = new JLabel();
  private JLabel lPrivaterChatmit = new JLabel();
  private JLabel lServer = new JLabel();
  private JLabel jLServerAdress = new JLabel();
  private JLabel jLServerStatus = new JLabel();
  private JTextField jTFNickname = new JTextField();
  private JLabel lNickname1 = new JLabel();
  private JTextField jTextField1 = new JTextField();
  private JTextField jTextField2 = new JTextField();
  private JButton bNicknameAndern = new JButton();

  // Ende Attribute
  
  public Chatfenster() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 650; 
    int frameHeight = 298;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Sprachdings");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    

    jComboBox1.setModel(jComboBox1Model);
    jComboBox1.setBounds(326, 115, 150, 20);
    cp.add(jComboBox1);
    lGlobalerChat.setBounds(12, 90, 110, 20);
    lGlobalerChat.setText("Globaler Chat");
    lGlobalerChat.setFont(new Font("Dialog", Font.BOLD, 12));
    lGlobalerChat.setForeground(Color.WHITE);
    cp.add(lGlobalerChat);
    lPrivaterChatmit.setBounds(326, 90, 110, 20);
    lPrivaterChatmit.setText("Privater Chat mit :");
    lPrivaterChatmit.setFont(new Font("Dialog", Font.BOLD, 12));
    lPrivaterChatmit.setForeground(Color.WHITE);
    cp.add(lPrivaterChatmit);
    lServer.setBounds(16, 16, 110, 20);
    lServer.setText("Server:");
    lServer.setFont(new Font("Dialog", Font.BOLD, 12));
    lServer.setForeground(Color.WHITE);
    cp.add(lServer);
    jLServerAdress.setBounds(136, 16, 110, 20);
    jLServerAdress.setText("");
    cp.add(jLServerAdress);
    jLServerStatus.setBounds(256, 16, 110, 20);
    jLServerStatus.setText("");
    cp.add(jLServerStatus);
    jTFNickname.setBounds(128, 48, 150, 20);
    jTFNickname.setBackground(Color.GRAY);
    cp.add(jTFNickname);
    lNickname1.setBounds(16, 48, 110, 20);
    lNickname1.setText("Nickname:");
    lNickname1.setFont(new Font("Dialog", Font.BOLD, 12));
    lNickname1.setForeground(Color.WHITE);
    cp.add(lNickname1);
    jTextField1.setBounds(12, 455, 300, 20);
    cp.add(jTextField1);
    jTextField2.setBounds(326, 455, 300, 20);
    cp.add(jTextField2);
    bNicknameAndern.setBounds(288, 48, 75, 25);
    bNicknameAndern.setText("�ndern");
    bNicknameAndern.setMargin(new Insets(2, 2, 2, 2));
    bNicknameAndern.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bNicknameAndern_ActionPerformed(evt);
      }
    });

    bNicknameAndern.setBorderPainted(false);
    bNicknameAndern.setBackground(Color.GRAY);
    cp.add(bNicknameAndern);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public Chatfenster
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new Chatfenster();
  } // end of main
  
  public void bNicknameAndern_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
    
  } // end of bNicknameAndern_ActionPerformed

  // Ende Methoden
} // end of class Chatfenster

