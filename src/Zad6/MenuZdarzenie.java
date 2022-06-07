package Zad6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuZdarzenie implements ActionListener {
    String komunikat;
    MenuZdarzenie(String komunikat) {
        this.komunikat = komunikat;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, komunikat, "Zdarzenie", JOptionPane.INFORMATION_MESSAGE);
    }
}
