import Zad3.PanelLista;
import Zad4.PanelRakietowy;
import javafx.application.Application;
import javafx.scene.layout.Pane;

import javax.swing.*;
import java.awt.*;

public class Aplikacja {

    PanelRakietowy panel ;
    JFrame okno;
    Timer timer;
    boolean odbicieOdGory=true;
    boolean odbicieOdLewa=true;
    boolean odbicieOdPrawa=false;
    boolean odbicieOdRakiety=false;
    boolean CzyPrzegrana=false;
    int skret=1;
    int rakietaX= PanelRakietowy.koloX;
    int rakietaY= PanelRakietowy.koloY;
    public void updatePilka(){

        if(PanelRakietowy.pilkaY > PanelRakietowy.koloY ){
            JOptionPane.showMessageDialog(okno,"PRZEGRALES");
            System.exit(0);
/*            System.out.println("pilka: X:"+PanelRakietowy.pilkaX + " Rakieta: X:"+PanelRakietowy.koloX);
            System.out.println("pilka: Y:"+PanelRakietowy.pilkaY + " Rakieta: Y:"+PanelRakietowy.koloY);
            okno.dispose();*/
            //CzyPrzegrana=true;

        }
        if(odbicieOdGory==true ){
            PanelRakietowy.pilkaY+=1;
            PanelRakietowy.pilkaX+=skret;
            if(PanelRakietowy.pilkaY==PanelRakietowy.koloY-20 && (PanelRakietowy.pilkaX>=PanelRakietowy.koloX-20 && PanelRakietowy.pilkaX<=PanelRakietowy.koloX+80 )){
                odbicieOdGory=false;
                odbicieOdRakiety=true;
            }
            if(PanelRakietowy.pilkaY==PanelRakietowy.koloY-20 && (PanelRakietowy.pilkaX<PanelRakietowy.koloX-20 || PanelRakietowy.pilkaX>PanelRakietowy.koloX+80 )){
                CzyPrzegrana=true;
                System.out.println("pilka: X:"+PanelRakietowy.pilkaX + " Rakieta: X:"+PanelRakietowy.koloX);
            }
        }

        if(odbicieOdRakiety==true){
            PanelRakietowy.pilkaY-=1;
            if(PanelRakietowy.pilkaY<=0){
                odbicieOdGory=true;
                odbicieOdRakiety=false;
            }
        }
        if(PanelRakietowy.pilkaX==0){
            skret=1;
        }
        if (PanelRakietowy.pilkaX== panel.getWidth()-20){
            skret=-1;
        }


        panel.repaint();
    };
    public void zrobOkno(){
        timer = new Timer(10,e -> {updatePilka();});
        timer.start();
        okno = new JFrame("Aplikacja");
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new PanelRakietowy();
        panel.setBackground(Color.CYAN);

        okno.setContentPane(panel);
        okno.setBounds(100,50,460,350);
        okno.setVisible(true);
        okno.setResizable(false);
        //JOptionPane.showMessageDialog(null,"Gotowa do pracy","Start",JOptionPane.INFORMATION_MESSAGE);

    }


}

