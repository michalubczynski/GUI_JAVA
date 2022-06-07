package Zad1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zadanie1_lab5 {
    public static void zrobOkno() {

        JFrame okno = new JFrame("Zad1");
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setBounds(100, 50, 460, 350);
        okno.setVisible(true);


        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.GRAY);

        okno.setContentPane(jPanel);

        JButton jButton = new JButton("Wybierz kolor!");
        jPanel.add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color color = JColorChooser.showDialog(null, "Wybierz kolor", jPanel.getBackground());
                jPanel.setBackground(color);
            }
        });
    }
}