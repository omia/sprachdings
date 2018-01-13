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

public class GUI_Login extends JFrame {
  // Anfang Attribute
  private JTextField jTFBenutzername = new JTextField();
  private JLabel lBittemeldedichmitdeiemSprachdingsKontoan = new JLabel();
  private JPasswordField jPFPasswort = new JPasswordField();
  private JLabel lBenutzername = new JLabel();
  private JLabel lPasswort = new JLabel();
  private JButton bAnmelden = new JButton();
  private JButton bNeuesSprachdingsKontoanlegen = new JButton();
  private JLabel lServer = new JLabel();
  private JTextField jTFServer = new JTextField();
  // Ende Attribute
  
  public GUI_Login() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 348; 
    int frameHeight = 218;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Sprachdings Login");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jTFBenutzername.setBounds(168, 80, 150, 20);
    jTFBenutzername.setFont(new Font("Dialog", Font.PLAIN, 12));
    jTFBenutzername.setForeground(Color.WHITE);
    jTFBenutzername.setBackground(Color.GRAY);
    cp.add(jTFBenutzername);
    lBittemeldedichmitdeiemSprachdingsKontoan.setBounds(16, 8, 298, 28);
    lBittemeldedichmitdeiemSprachdingsKontoan.setText("Bitte melde dich mit deiem Sprachdings Konto an ");
    lBittemeldedichmitdeiemSprachdingsKontoan.setForeground(Color.WHITE);
    lBittemeldedichmitdeiemSprachdingsKontoan.setFont(new Font("Dialog", Font.BOLD, 12));
    cp.add(lBittemeldedichmitdeiemSprachdingsKontoan);
    jPFPasswort.setBounds(168, 112, 150, 20);
    jPFPasswort.setFont(new Font("Dialog", Font.PLAIN, 12));
    jPFPasswort.setForeground(Color.WHITE);
    jPFPasswort.setBackground(Color.GRAY);
    cp.add(jPFPasswort);
    lBenutzername.setBounds(16, 80, 110, 20);
    lBenutzername.setText("Benutzername");
    lBenutzername.setDisplayedMnemonicIndex(KeyEvent.VK_0);
    lBenutzername.setForeground(Color.WHITE);
    lBenutzername.setFont(new Font("Dialog", Font.BOLD, 12));
    cp.add(lBenutzername);
    lPasswort.setBounds(16, 112, 110, 20);
    lPasswort.setText("Passwort");
    lPasswort.setDisplayedMnemonicIndex(KeyEvent.VK_0);
    lPasswort.setEnabled(true);
    lPasswort.setForeground(Color.WHITE);
    lPasswort.setFont(new Font("Dialog", Font.BOLD, 12));
    cp.add(lPasswort);
    bAnmelden.setBounds(240, 144, 75, 25);
    bAnmelden.setText("Anmelden");
    bAnmelden.setMargin(new Insets(2, 2, 2, 2));
    bAnmelden.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bAnmelden_ActionPerformed(evt);
      }
    });
    bAnmelden.setBorderPainted(false);
    bAnmelden.setBackground(Color.GRAY);
    bAnmelden.setFont(new Font("Dialog", Font.BOLD, 12));
    bAnmelden.setForeground(Color.WHITE);
    cp.add(bAnmelden);
    bNeuesSprachdingsKontoanlegen.setBounds(8, 144, 227, 25);
    bNeuesSprachdingsKontoanlegen.setText("Neues Sprachdings Konto anlegen");
    bNeuesSprachdingsKontoanlegen.setMargin(new Insets(2, 2, 2, 2));
    bNeuesSprachdingsKontoanlegen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bNeuesSprachdingsKontoanlegen_ActionPerformed(evt);
      }
    });
    bNeuesSprachdingsKontoanlegen.setBackground(Color.GRAY);

    bNeuesSprachdingsKontoanlegen.setBorderPainted(false);
    bNeuesSprachdingsKontoanlegen.setFont(new Font("Dialog", Font.BOLD, 12));
    bNeuesSprachdingsKontoanlegen.setForeground(Color.WHITE);
    cp.add(bNeuesSprachdingsKontoanlegen);
    cp.setBackground(new Color(0x404040));
    lServer.setBounds(16, 48, 110, 20);
    lServer.setText("Server");
    lServer.setFont(new Font("Dialog", Font.BOLD, 12));
    lServer.setForeground(Color.WHITE);
    cp.add(lServer);
    jTFServer.setBounds(168, 48, 150, 20);
    jTFServer.setBackground(Color.GRAY);
    cp.add(jTFServer);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public GUI_Login
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new GUI_Login();
  } // end of main
  
  public void bAnmelden_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
    
  } // end of bAnmelden_ActionPerformed

  public void bNeuesSprachdingsKontoanlegen_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
    
  } // end of bNeuesSprachdingsKontoanlegen_ActionPerformed

  // Ende Methoden
} // end of class GUI_Login

