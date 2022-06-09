package Zad6;

import Zad4.PanelRakietowy;
import javafx.scene.layout.Pane;

import javax.swing.*;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class AplikacjaPasekMenu extends JFrame implements AdjustmentListener {
    JFrame okno;
    JMenuBar menuBar;
    public static PanelTekstu panel;


    public void zrobOkno(){
        panel = new PanelTekstu();
        okno = new JFrame("Zad6.Aplikacja");
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menuBar = new PanelZapisOdczyt();
        menuBar.setBackground(Color.GRAY);

        okno.setJMenuBar(menuBar);
        okno.setBounds(100,50,460,350);
        okno.setVisible(true);
        okno.setContentPane(panel);
    }
    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {

    }
}
