package Zad6;

import javax.swing.*;
import java.awt.*;

public class PanelTekstu extends JPanel {
    public PanelTekstu(){
        super(new GridLayout(1,1));
        JTextArea txtObszar = new JTextArea("1,2");
        txtObszar.setFont(new Font("Times New Roman", Font.ITALIC+Font.BOLD,26));
        add(new JScrollPane(txtObszar));
    }
}
