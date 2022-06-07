package Zad1;

import javax.swing.*;

public class PanelPrzycisk extends JPanel {
    public PanelPrzycisk(){
        String[] napisy = {"<html><i><font color='red',size=28>S</font>tart</i></html>","Stop","Naprzod","Wstecz"};
        for(String napis :napisy)
            add(new JButton(napis));
    }
}
