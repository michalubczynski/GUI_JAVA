package Zad2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class PanelPisanie extends JPanel {
    private String komunikat = "Witaj to ja";
    private Font czcionka=new Font("Times New Roman",Font.ITALIC+Font.BOLD,36);
    private FontMetrics pomiar = getFontMetrics(czcionka);
    public PanelPisanie(){
        setBackground(Color.WHITE);
        //setForeground(Color.BLACK);
    }
    public void paintComponent(Graphics g){
        Random randomGenerator = new Random();
        super.paintComponent(g);
        g.setFont(czcionka);
        int x= getSize().width;
        int y = getSize().height;
        //g.drawString(komunikat,x,y);

        for(int i=10; i < x-20; i+=20 ){
            for(int j=10; j< y-20; j+=20){
                int red = randomGenerator.nextInt(256);
                int green = randomGenerator.nextInt(256);
                int blue = randomGenerator.nextInt(256);
                Color randomColour = new Color(red,green,blue);
                g.setColor(randomColour);
                g.fillRoundRect(i,j,20,20,20,20);
            }
        }




    }
}
