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

public class Chat extends JFrame {
  // Anfang Attribute

  private JComboBox jComboBox1                  = new JComboBox();

  private DefaultComboBoxModel jComboBox1Model  = new DefaultComboBoxModel();
  private JTextArea jTextArea1                  = new JTextArea("");
  private JScrollPane jTextArea1ScrollPane      = new JScrollPane(jTextArea1);
  private JTextArea jTextArea2                  = new JTextArea("");
  private JScrollPane jTextArea2ScrollPane      = new JScrollPane(jTextArea2);

  private JButton bFreundeslistebearbeiten = new JButton();
  private JButton bVerbindungtrennen       = new JButton();
  private JButton bSendenGlobalerChat      = new JButton();
  private JButton bSendenPirvaterChat      = new JButton();
  private JButton bAkt                     = new JButton();
  private JButton bGruppeerstellen         = new JButton();

  private JLabel lGlobalChat    = new JLabel();
  private JLabel lPrivaterChat  = new JLabel();
  private JLabel lServer_Status = new JLabel();

  private JTextField jTF_GlobalChat   = new JTextField();
  private JTextField jTF_PrivaterChat = new JTextField();
  private JTextField jTFServer_Status = new JTextField();



  // Ende Attribute
  
  public Chat() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 604; 
    int frameHeight = 559;
    setSize(frameWidth, frameHeight);
    Dimension jTFPrivaterChat = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (jTFPrivaterChat.width - getSize().width) / 2;
    int y = (jTFPrivaterChat.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Chat");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    lGlobalChat.setBounds(8, 72, 270, 20);
    lGlobalChat.setText("Global Chat");
    lGlobalChat.setHorizontalTextPosition(SwingConstants.CENTER);
    lGlobalChat.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(lGlobalChat);

    lServer_Status.setBounds(8,8,90,20);
    lServer_Status.setText("Serverstatus: ");
    lServer_Status.setHorizontalTextPosition(SwingConstants.CENTER);
    lServer_Status.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(lServer_Status);

    lPrivaterChat.setBounds(296, 72, 270, 20);
    lPrivaterChat.setHorizontalTextPosition(SwingConstants.CENTER);
    lPrivaterChat.setHorizontalAlignment(SwingConstants.CENTER);
    lPrivaterChat.setText("Privater Chat");
    cp.add(lPrivaterChat);

    jComboBox1.setModel(jComboBox1Model);
    jComboBox1.setBounds(288, 104, 278, 20);
    cp.add(jComboBox1);

    jTextArea1ScrollPane.setBounds(288, 136, 280, 284);
    jTextArea1.setEditable(false);
    cp.add(jTextArea1ScrollPane);

    jTextArea2ScrollPane.setBounds(8, 136, 272, 284);
    jTextArea2.setEditable(false);
    cp.add(jTextArea2ScrollPane);

    jTF_PrivaterChat.setBounds(288, 424, 278, 20);
    cp.add(jTF_PrivaterChat);

    jTF_GlobalChat.setBounds(8, 424, 270, 20);
    cp.add(jTF_GlobalChat);

    jTFServer_Status.setBounds( 90 ,8, 120,20);
    jTFServer_Status.setEditable(false);
    cp.add(jTFServer_Status);

    bFreundeslistebearbeiten.setBounds(288, 8, 155, 25);
    bFreundeslistebearbeiten.setText("Freundesliste bearbeiten");
    bFreundeslistebearbeiten.setMargin(new Insets(2, 2, 2, 2));
    bFreundeslistebearbeiten.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bFreundeslistebearbeiten_ActionPerformed(evt);
      }
    });
    cp.add(bFreundeslistebearbeiten);
    bVerbindungtrennen.setBounds(288, 40, 275, 25);
    bVerbindungtrennen.setText("Verbindung trennen");
    bVerbindungtrennen.setMargin(new Insets(2, 2, 2, 2));
    bVerbindungtrennen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bVerbindungtrennen_ActionPerformed(evt);
      }
    });
    cp.add(bVerbindungtrennen);



    bSendenGlobalerChat.setBounds(8, 448, 267, 25);
    bSendenGlobalerChat.setText("senden");
    bSendenGlobalerChat.setMargin(new Insets(2, 2, 2, 2));
    bSendenGlobalerChat.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bSendenGlobalerChat_ActionPerformed(evt);
      }
    });
    cp.add(bSendenGlobalerChat);

    bSendenPirvaterChat.setBounds(288, 448, 275, 25);
    bSendenPirvaterChat.setText("senden");
    bSendenPirvaterChat.setMargin(new Insets(2, 2, 2, 2));
    bSendenPirvaterChat.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bSendenPirvaterChat_ActionPerformed(evt);
      }
    });
    cp.add(bSendenPirvaterChat);

    bAkt.setBounds(224, 8, 51, 20);
    bAkt.setText("akt");
    bAkt.setMargin(new Insets(2, 2, 2, 2));
    bAkt.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bAkt_ActionPerformed(evt);
      }
    });
    cp.add(bAkt);
    bGruppeerstellen.setBounds(448, 8, 115, 25);
    bGruppeerstellen.setText("Gruppe erstellen");
    bGruppeerstellen.setMargin(new Insets(2, 2, 2, 2));
    bGruppeerstellen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bGruppeerstellen_ActionPerformed(evt);
      }
    });
    cp.add(bGruppeerstellen);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public Chat
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new Chat();
  } // end of main
  
  public void bFreundeslistebearbeiten_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
    
  } // end of bFreundeslistebearbeiten_ActionPerformed

  public void bVerbindungtrennen_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
    
  } // end of bVerbindungtrennen_ActionPerformed

  public void bSendenGlobalerChat_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
    
  } // end of bSendenGlobalerChat_ActionPerformed

  public void bSendenPirvaterChat_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
    
  } // end of bSendenPirvaterChat_ActionPerformed

  public void bAkt_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
    
  } // end of bAkt_ActionPerformed

  public void bGruppeerstellen_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
    
  } // end of bGruppeerstellen_ActionPerformed

  // Ende Methoden
} // end of class Chat

