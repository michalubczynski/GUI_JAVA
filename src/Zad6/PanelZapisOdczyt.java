package Zad6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class PanelZapisOdczyt extends JMenuBar {
    public PanelZapisOdczyt(){
        JMenu mnPlik = new JMenu("Plik"); mnPlik.setMnemonic(KeyEvent.VK_P);

        JMenuItem pzOtworz = new JMenuItem("otwórz plik", KeyEvent.VK_O);
        JMenuItem pzZapisz = new JMenuItem("Zapisz plik", KeyEvent.VK_Z);
        JMenuItem pzKoniec = new JMenuItem("Koniec", KeyEvent.VK_K);

        pzZapisz.setIcon(new ImageIcon("obrazki/ikona.gif"));
        mnPlik.add(pzOtworz); mnPlik.addSeparator(); mnPlik.add(pzZapisz); mnPlik.addSeparator(); mnPlik.add(pzKoniec); JMenuItem pzKopiuj = new JMenuItem("Kopiuj", KeyEvent.VK_N);
        pzKopiuj.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        JMenuItem pzWytnij = new JMenuItem("Wytnij", KeyEvent.VK_K);
        pzWytnij.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        JMenuItem pzWklej = new JMenuItem("Wklej", KeyEvent.VK_E);
        pzWklej.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK));
        pzKopiuj.addActionListener(new MenuZdarzenie(pzKopiuj.getText()));
        add(mnPlik);


    }
}
