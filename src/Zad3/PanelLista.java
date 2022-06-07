package Zad3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelLista extends JPanel {
    public PanelLista() {
        String[] temp = {"Celcjusz", "Fahrenheit", "Kelvin"};

        JComboBox<String> wej = new JComboBox<String>(temp);
        wej.setEditable(true);
        wej.setBounds(20,20,160,30);
        JComboBox<String> wyj = new JComboBox<String>(temp);
        wyj.setSelectedIndex(1);
        wyj.setBounds(20,120,160,30);
        Button but = new Button("Przelicz");
        but.setBounds(20,70,160,30);
        JTextField wejlicz = new JTextField();
        wejlicz.setBounds(190,20,160,30);
        add(wejlicz);
        JTextField wyjlicz = new JTextField();
        wyjlicz.setEditable(false);
        wyjlicz.setBounds(190,120,160,30);
        add(wyjlicz);
        add(but);
        add(wej);
        add(wyj);

        but.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double Wynik=0;//= Double.parseDouble(wejlicz.getText());;
                switch (wej.getSelectedIndex()){

                    case 0://Celcujsz
                        switch (wyj.getSelectedIndex()){
                            case 0:
                                Wynik = Double.parseDouble(wejlicz.getText());
                                break;
                            case 1:
                                Wynik = (Double.parseDouble(wejlicz.getText())*9)/5+32;
                                break;
                            case 2:
                                Wynik = Double.parseDouble(wejlicz.getText())+273.15;
                                break;
                        }
                        break;
                    case 1://Fahrenheit
                        switch (wyj.getSelectedIndex()){
                            case 0:
                                Wynik = (Double.parseDouble(wejlicz.getText())-32)/1.8;
                                break;
                            case 1:
                                Wynik = Double.parseDouble(wejlicz.getText());
                                break;
                            case 2:
                                Wynik = (Double.parseDouble(wejlicz.getText())+459.67)*(5.0/9.0);
                                break;
                        }

                        break;
                    case 2://Kelvin
                        switch (wyj.getSelectedIndex()){
                            case 0:
                                Wynik = Double.parseDouble(wejlicz.getText())-273.15;
                                break;
                            case 1:
                                Wynik = (Double.parseDouble(wejlicz.getText())-273.15)*1.8+32;
                                break;
                            case 2:
                                Wynik = Double.parseDouble(wejlicz.getText());
                                break;
                        }
                        break;
                }

                wyjlicz.setText("Wynik: "+Wynik);
            }
        });
        setLayout(null);




    }



}
