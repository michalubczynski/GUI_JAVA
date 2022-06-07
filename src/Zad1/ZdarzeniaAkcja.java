package Zad1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZdarzeniaAkcja  extends JPanel {
    public ZdarzeniaAkcja(){
        JButton przyciskCzerwony = new JButton("Czerwony");
        przyciskCzerwony.addActionListener(new ObslugaCzerwony());
        add(przyciskCzerwony);
        JButton przyciskZielony=new JButton("Zielony");
        przyciskZielony.addActionListener(new ActionListener() {
                                              @Override
                                              public void actionPerformed(ActionEvent e) {
                                                  setBackground(Color.GREEN);
                                              }
                                          });
                add(przyciskZielony);
    }
    class ObslugaZielony implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            setBackground(Color.GREEN);
        }
    }
    class ObslugaCzerwony implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            setBackground(Color.RED);
        }
    }
}

