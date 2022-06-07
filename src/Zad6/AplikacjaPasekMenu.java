package Zad6;

import Zad4.PanelRakietowy;

import javax.swing.*;
import java.awt.*;

public class AplikacjaPasekMenu {
    JFrame okno;
    JMenuBar menuBar;

    public void zrobOkno(){
        okno = new JFrame("Zad6.Aplikacja");
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menuBar = new PanelZapisOdczyt();
        menuBar.setBackground(Color.GRAY);

        okno.setJMenuBar(menuBar);
        okno.setBounds(100,50,460,350);
        okno.setVisible(true);
        okno.setContentPane(new PanelTekstu());
    }
}
