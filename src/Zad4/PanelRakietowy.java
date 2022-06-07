package Zad4;

import com.sun.xml.internal.ws.api.message.Message;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PanelRakietowy extends JPanel {
        final int SREDNICA=24;
        public static int koloX=170;
        public final static int koloY = 250;
        public static int pilkaX=50;
        public static int pilkaY=50;

        public PanelRakietowy(){
            setFocusable(true);
            addKeyListener(new ObslugaKlawiatury());
        }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fill3DRect(koloX,koloY,100,10,true);
        g.fillOval(pilkaX,pilkaY,25,25);
    }

    class ObslugaKlawiatury implements KeyListener{
        public ObslugaKlawiatury(){}
        @Override
        public void keyTyped(KeyEvent e){}
        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    koloX -= 5;
                    System.out.println("Lewo" +" Stan X:"+ koloX);

                    break;
                case KeyEvent.VK_RIGHT:
                    koloX += 5;
                    System.out.println("Prawo" +" Stan X:"+ koloX);
                    break;
            }
            repaint();
            }

        @Override
        public void keyReleased(KeyEvent e) {
        }
    }

}
