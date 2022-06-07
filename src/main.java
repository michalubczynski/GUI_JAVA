import Zad4.Aplikacja;
import Zad6.AplikacjaPasekMenu;

import javax.swing.*;

public class main {

        public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    new AplikacjaPasekMenu().zrobOkno();
                }
            });
        }

}
