package Zad6;

import javax.swing.*;
import java.awt.*;
import java.io.*;

public class PanelTekstu extends JPanel {
    public  JTextArea txtObszar ;
    public PanelTekstu(){
        super(new GridLayout(1,1));
        txtObszar = new JTextArea("1,2");
        txtObszar.setFont(new Font("Times New Roman", Font.ITALIC+Font.BOLD,26));
        add(new JScrollPane(txtObszar));
    }
    public void czytajPlik() {
        JFileChooser plikWybor = new JFileChooser();
        if(plikWybor.showOpenDialog(this)==JFileChooser.APPROVE_OPTION) {
            BufferedReader czytelnik=null;
            String wiersz;
            String bufor="";
            try {
                czytelnik= new BufferedReader(new FileReader(plikWybor.getSelectedFile()));
                while ((wiersz=czytelnik.readLine())!=null) {
                    bufor+=wiersz+"\r\n";
                }
                czytelnik.close();
            }
            catch (IOException x) {
                System.err.format("Błąd");
            }
            txtObszar.setText(bufor);
        }
    }

    public void zapiszPlik() {
        JFileChooser plikWybor = new JFileChooser();
        if(plikWybor.showSaveDialog(this)==JFileChooser.APPROVE_OPTION) {
            BufferedWriter pisarz = null;
            try {
                pisarz = new BufferedWriter(new FileWriter(plikWybor.getSelectedFile()));
                pisarz.write((txtObszar.getText()));
                pisarz.close();
            }
            catch(IOException x) {
                System.err.format("err",x);
            }
        }
    }
}
