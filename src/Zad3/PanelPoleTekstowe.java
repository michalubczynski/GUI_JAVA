package Zad3;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class PanelPoleTekstowe extends JPanel {
    public PanelPoleTekstowe(){
        JLabel lblNaz  = new JLabel("Nazwisko");
        JTextField txtNazwisko = new JTextField();
        lblNaz.setDisplayedMnemonic(KeyEvent.VK_N);
        lblNaz.setLabelFor(txtNazwisko);
        lblNaz.setBounds(10,20,120,24);
        add(lblNaz);
        add(txtNazwisko);
        setLayout(null);
    }
}
