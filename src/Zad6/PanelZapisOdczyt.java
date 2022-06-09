package Zad6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class PanelZapisOdczyt extends JMenuBar {

    public PanelZapisOdczyt(){
        PanelTekstu jpanel = AplikacjaPasekMenu.panel;
        JMenu mnPlik = new JMenu("Plik"); mnPlik.setMnemonic(KeyEvent.VK_P);

        JMenuItem pzOtworz = new JMenuItem("otwórz plik", KeyEvent.VK_O);
        JMenuItem pzZapisz = new JMenuItem("Zapisz plik", KeyEvent.VK_Z);
        JMenuItem pzKoniec = new JMenuItem("Koniec", KeyEvent.VK_K);

        pzOtworz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            jpanel.czytajPlik();
            }
        });
        pzZapisz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            jpanel.zapiszPlik();
            }
        });
        pzKoniec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0) ;
            }
        });

        pzZapisz.setIcon(new ImageIcon("obrazki/ikona.gif"));
        mnPlik.add(pzOtworz); mnPlik.addSeparator(); mnPlik.add(pzZapisz); mnPlik.addSeparator(); mnPlik.add(pzKoniec);
        add(mnPlik);

    }
}
