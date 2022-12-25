/** aSzymon - gtihub */

package GraWGanianego;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class okno {

    Random random = new Random();

    int najechano = 1;

    public JPanel createContentPane() {
        JPanel oknoDoGry = new JPanel();

        /* LOSOWANIE KOLORU RGB */

        int r = random.nextInt(255);

        for (int i = 0; i < 1; i++){

            System.out.println("");
            System.out.println("kolor red: "+r);

        }

        int g = random.nextInt(255);

        for (int j = 0; j < 1; j++){

            System.out.println("kolor green: "+g);

        }

        int b = random.nextInt(255);

        for (int k = 0; k < 1; k++){

            System.out.println("kolor blue: "+b);
            System.out.println("");

        }

        JPanel kwadrat = new JPanel(null);
        kwadrat.setBounds(10, 10, 50, 50);
        kwadrat.setBackground(new Color(r, g, b));
        oknoDoGry.add(kwadrat);

        MouseListener myMouseListner = new MouseListener() {
            @Override
            public void mouseClicked (MouseEvent e) {
                //System.out.println("Klawisz myszy wciśnięty");
            }

            @Override
            public void mousePressed (MouseEvent e) {
                //System.out.println("Klawisz myszy wciśnięty");
            }

            @Override
            public void mouseReleased (MouseEvent e) {
                //System.out.println("Klawisz myszy zwolniony");
            }

            @Override
            public void mouseEntered (MouseEvent e) {
                System.out.println("KURSOR w kwadracie");

                System.out.println("");
                System.out.println("najechano na kwadrat poraz : "+najechano);
                najechano++;

                /* LOSOWANIE KOLORU RGB */

                int r = random.nextInt(255);

                for (int i = 0; i < 1; i++){

                    System.out.println("");
                    System.out.println("kolor red: "+r);

                }

                int g = random.nextInt(255);

                for (int j = 0; j < 1; j++){

                    System.out.println("kolor green: "+g);

                }

                int b = random.nextInt(255);

                for (int k = 0; k < 1; k++){

                    System.out.println("kolor blue: "+b);
                    System.out.println("");

                }

                /* LOSOWANIE MIEJSCA KWADRATU */

                int x = random.nextInt(700);

                for (int m = 0; m < 1; m++){

                    System.out.println("miejsce x w oknie "+x);

                }

                int y = random.nextInt(700);

                for (int n = 0; n < 1; n++){

                    System.out.println("miejsce x w oknie "+y);

                }

                /* MECHANIZM WYGRALES/PRZEGRALES */

                if (najechano == 100) {

                    JOptionPane.showMessageDialog(
                            null,
                            "Przegrałeś! Spróbuj jeszcze raz",
                            "komunikat",
                            JOptionPane.ERROR_MESSAGE
                    );

                    najechano = 0;

                }

                if (kwadrat.getBackground() == Color.white) {

                    JOptionPane.showMessageDialog(
                            null,
                            "Wygrałeś! Gratuluje :D Możesz zagrać jeszcze raz",
                            "komunikat",
                            JOptionPane.INFORMATION_MESSAGE
                    );

                    System.out.println("");
                    System.out.println("jest biały");

                    najechano = 0;

                } else {

                    System.out.println("");
                    System.out.println("nie jest biały");

                }


                kwadrat.setBackground(new Color(r, g, b));
                kwadrat.setBounds(x, y, 50, 50);

            }

            @Override
            public void mouseExited (MouseEvent e) {
//                System.out.println("KURSOR poza kwadratem");
            }

        };

        kwadrat.addMouseListener(myMouseListner);

        return oknoDoGry;

    }


    public okno() {

        JFrame frame = new JFrame("Gra w ganianego");
        frame.setContentPane(createContentPane());
        frame.setSize(800, 800);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);

    }

}


