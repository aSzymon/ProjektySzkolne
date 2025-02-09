/** aSzymon - gtihub */

package testMyszki;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;


public class okno {

    int klik = 0;

    Random random = new Random();

    public JPanel createContentPane() {
        JPanel oknoTestMyszki = new JPanel();

        JPanel kwadrat = new JPanel(null);
        kwadrat.setBounds(340, 200, 100, 100);
        kwadrat.setBackground(Color.white);
        oknoTestMyszki.add(kwadrat);

        MouseListener myMouseListner = new MouseListener() {
            @Override
            public void mouseClicked (MouseEvent e) {

                /* ZMIANA KOLORU KWADRATU PO KLIKNIECIU */

                if(kwadrat.getBackground() == Color.white || kwadrat.getBackground() == Color.black){
                    kwadrat.setBackground(Color.red);

                } else {
                    kwadrat.setBackground(Color.black);
                }

                klik++;

                System.out.println("Ile klikniec : "+klik);

                /* LOSOWANIE LICZBY DO POROWNANIA */

                int losowanieLiczby = random.nextInt(20);

                for (int i = 0; i < 1; i++){

                    System.out.println("Liczba wylosowana : "+losowanieLiczby);
                    System.out.println("");

                }

                /* JESLI KLICZBA WYLOSOWANA JEST RÓWNA ILOSCI KLIKNIEC, WYSWIETL KOMUNIKAT I WYZERUJ KLIKNIECIA */

                if (losowanieLiczby == klik) {

                    JOptionPane.showMessageDialog(
                            null,
                            "Nie można wyrać koloru",
                            "komunikat",
                            JOptionPane.ERROR_MESSAGE
                    );

                    kwadrat.setBackground(Color.white);
                    klik = 0;

                }

                /* ZEROWANIE KLIKNIEC JESLI DOJDA DO 20 */

                if (klik == 20) {

                    klik = 0;

                }

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
                //System.out.println("KURSOR w kwadracie");
            }

            @Override
            public void mouseExited (MouseEvent e) {
                //System.out.println("KURSOR poza kwadratem");
            }

        };

        kwadrat.addMouseListener(myMouseListner);

        return oknoTestMyszki;

    }


    public okno() {

        JFrame frame = new JFrame("Okno do testowania myszki");
        frame.setContentPane(createContentPane());
        frame.setSize(800, 600);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);

    }

}
