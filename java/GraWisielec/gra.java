/** aSzymon - gtihub */

package GraWisielec;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class gra {

    Random random = new Random();
    zdjeciaWisielca zdjeciaWisielca = new zdjeciaWisielca();
    hasla haslo = new hasla();

    String[] slowa = {haslo.slowo1,haslo.slowo2,haslo.slowo3,haslo.slowo4, haslo.slowo5, haslo.slowo6, haslo.slowo7, haslo.slowo8, haslo.slowo9,haslo.slowo10};

    JMenuBar pasekMenu;
    JMenu menuGra;
    JMenuItem nowaGra;
    JMenuItem info;
    JMenuItem wyjscie;

    int nieUdaneProby;

    public boolean dobraLitera = false;
    public int dlugoscSlowa;
    public String wylosowaneSlowo;
    public char[] zamienionaLitera;


    public JPanel createContentPane() {
        JPanel oknoGry = new JPanel();

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

        /* OPCJE MENU */

        pasekMenu = new JMenuBar();

        menuGra = new JMenu("GRA");
        pasekMenu.add(menuGra);

        nowaGra = new JMenuItem("NOWA");
        menuGra.add(nowaGra);
        info = new JMenuItem("INFO");
        menuGra.add(info);
        wyjscie = new JMenuItem("EXIT");
        menuGra.add(wyjscie);

        /* WYGLAD */

        JPanel tlo = new JPanel(null);
        tlo.setBounds(0, 0, 600, 300);
        tlo.setBackground(new Color(r, g, b));
        oknoGry.add(tlo);

        /* ----------------------------------------------------------- */

        JLabel miejsceWisielca1 = new JLabel(zdjeciaWisielca.wisielec1);
        miejsceWisielca1.setBounds(400, 20, 170, 200);
        miejsceWisielca1.setBackground(new Color(140, 122, 255));
        miejsceWisielca1.setVisible(true);
        tlo.add(miejsceWisielca1);

        JLabel miejsceWisielca2 = new JLabel(zdjeciaWisielca.wisielec2);
        miejsceWisielca2.setBounds(400, 20, 170, 200);
        miejsceWisielca2.setBackground(new Color(140, 122, 255));
        miejsceWisielca2.setVisible(false);
        tlo.add(miejsceWisielca2);

        JLabel miejsceWisielca3 = new JLabel(zdjeciaWisielca.wisielec3);
        miejsceWisielca3.setBounds(400, 20, 170, 200);
        miejsceWisielca3.setBackground(new Color(140, 122, 255));
        miejsceWisielca3.setVisible(false);
        tlo.add(miejsceWisielca3);

        JLabel miejsceWisielca4 = new JLabel(zdjeciaWisielca.wisielec4);
        miejsceWisielca4.setBounds(400, 20, 170, 200);
        miejsceWisielca4.setBackground(new Color(140, 122, 255));
        miejsceWisielca4.setVisible(false);
        tlo.add(miejsceWisielca4);

        JLabel miejsceWisielca5 = new JLabel(zdjeciaWisielca.wisielec5);
        miejsceWisielca5.setBounds(400, 20, 170, 200);
        miejsceWisielca5.setBackground(new Color(140, 122, 255));
        miejsceWisielca5.setVisible(false);
        tlo.add(miejsceWisielca5);

        JLabel miejsceWisielca6 = new JLabel(zdjeciaWisielca.wisielec6);
        miejsceWisielca6.setBounds(400, 20, 170, 200);
        miejsceWisielca6.setBackground(new Color(140, 122, 255));
        miejsceWisielca6.setVisible(false);
        tlo.add(miejsceWisielca6);

        JLabel miejsceWisielca7 = new JLabel(zdjeciaWisielca.wisielec7);
        miejsceWisielca7.setBounds(400, 20, 170, 200);
        miejsceWisielca7.setBackground(new Color(140, 122, 255));
        miejsceWisielca7.setVisible(false);
        tlo.add(miejsceWisielca7);

        JLabel miejsceWisielca8 = new JLabel(zdjeciaWisielca.wisielec8);
        miejsceWisielca8.setBounds(400, 20, 170, 200);
        miejsceWisielca8.setBackground(new Color(140, 122, 255));
        miejsceWisielca8.setVisible(false);
        tlo.add(miejsceWisielca8);

        JLabel miejsceWisielca9 = new JLabel(zdjeciaWisielca.wisielec9);
        miejsceWisielca9.setBounds(400, 20, 170, 200);
        miejsceWisielca9.setBackground(new Color(140, 122, 255));
        miejsceWisielca9.setVisible(false);
        tlo.add(miejsceWisielca9);

        JLabel miejsceWisielca10 = new JLabel(zdjeciaWisielca.wisielec10);
        miejsceWisielca10.setBounds(400, 20, 170, 200);
        miejsceWisielca10.setBackground(new Color(140, 122, 255));
        miejsceWisielca10.setVisible(false);
        tlo.add(miejsceWisielca10);

        JLabel miejsceWisielca11 = new JLabel(zdjeciaWisielca.wisielec11);
        miejsceWisielca11.setBounds(400, 20, 170, 200);
        miejsceWisielca11.setBackground(new Color(140, 122, 255));
        miejsceWisielca11.setVisible(false);
        tlo.add(miejsceWisielca11);

        JLabel miejsceWisielca12 = new JLabel(zdjeciaWisielca.wisielec12);
        miejsceWisielca12.setBounds(400, 20, 170, 200);
        miejsceWisielca12.setBackground(new Color(140, 122, 255));
        miejsceWisielca12.setVisible(false);
        tlo.add(miejsceWisielca12);

        /* ----------------------------------------------------------- */

        JLabel hasloDoZgadniecia = new JLabel("");
        hasloDoZgadniecia.setBounds(30,10,350,100);
        hasloDoZgadniecia.setFont(new Font("Arial", Font.BOLD, 40));
        hasloDoZgadniecia.setBackground(Color.white);
        hasloDoZgadniecia.setHorizontalAlignment(JLabel.CENTER);
        tlo.add(hasloDoZgadniecia);

        JButton przycisk = new JButton("SPRAWDŹ LITERE");
        przycisk.setBounds(220,110,150,40);
        tlo.add(przycisk);

        JTextArea pole = new JTextArea();
        pole.setBounds(40,110,150,40);
        pole.setFont(new Font("Arial", Font.BOLD, 30));
        pole.setVisible(true);
        tlo.add(pole);

        pole.setEditable(false);
        pole.setText("");
        hasloDoZgadniecia.setText("");

        /* DZIALANIE I LISTENERY */

        nowaGra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                miejsceWisielca1.setVisible(true);
                miejsceWisielca2.setVisible(false);
                miejsceWisielca3.setVisible(false);
                miejsceWisielca4.setVisible(false);
                miejsceWisielca5.setVisible(false);
                miejsceWisielca6.setVisible(false);
                miejsceWisielca7.setVisible(false);
                miejsceWisielca8.setVisible(false);
                miejsceWisielca9.setVisible(false);
                miejsceWisielca10.setVisible(false);
                miejsceWisielca11.setVisible(false);
                miejsceWisielca12.setVisible(false);

                nieUdaneProby = 0;

                for (int i = 0; i < 1; i++) {

                    int liczba = random.nextInt(9);
                    System.out.println("index : " + liczba);

                    wylosowaneSlowo = slowa[liczba];
                    System.out.println("haslo : " + wylosowaneSlowo);

                    dlugoscSlowa = wylosowaneSlowo.length();
                    System.out.println("ile liter jest w hasle : " + dlugoscSlowa);

                    zamienionaLitera = new char[dlugoscSlowa];

                }

                pole.setEditable(true);
                pole.setText("");
                hasloDoZgadniecia.setText("");

                for (int j = 0; j < dlugoscSlowa; j++) {

                    zamienionaLitera[j] = '_';
                    System.out.print(zamienionaLitera[j] = '_');

                }

                String podlogiHaslo = String.valueOf(zamienionaLitera);
                hasloDoZgadniecia.setText(podlogiHaslo);

            }
        });

        przycisk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                char pobranaLitera = pole.getText().charAt(0);
                System.out.println(pobranaLitera);

                dobraLitera = false;

                for (int i = 0; i < wylosowaneSlowo.length(); i++) {

                    if(wylosowaneSlowo.charAt(i) == pobranaLitera){

                        zamienionaLitera[i] = pobranaLitera;

                        String zmiana = String.valueOf(zamienionaLitera);

                        hasloDoZgadniecia.setText(zmiana);

                        dobraLitera = true;

                    }
                }

                if(dobraLitera == false) {

                    nieUdaneProby++;

                }


                if (wylosowaneSlowo.equals(String.valueOf(zamienionaLitera))) {

                    System.out.println("Wygrałeś!");

                    JOptionPane.showMessageDialog(
                            null,
                            "WYGRALES! :D",
                            "GRA W WISIELCA",
                            JOptionPane.INFORMATION_MESSAGE
                    );

                    pole.setEditable(false);
                    pole.setText("");

                }

            }});


        info.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(
                        null,
                        "Wykonawca : aSzymon",
                        "GRA W WISIELCA",
                        JOptionPane.INFORMATION_MESSAGE
                );

            }
        });

        przycisk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (nieUdaneProby == 1) {

                    System.out.println("nieUdaneProby : 1");

                    miejsceWisielca2.setVisible(true);
                    miejsceWisielca1.setVisible(false);

                }

                if (nieUdaneProby == 2) {

                    System.out.println("nieUdaneProby : 2");

                    miejsceWisielca3.setVisible(true);
                    miejsceWisielca2.setVisible(false);


                }

                if (nieUdaneProby == 3) {

                    System.out.println("nieUdaneProby : 3");

                    miejsceWisielca4.setVisible(true);
                    miejsceWisielca3.setVisible(false);


                }

                if (nieUdaneProby == 4) {

                    System.out.println("nieUdaneProby : 4");

                    miejsceWisielca5.setVisible(true);
                    miejsceWisielca4.setVisible(false);

                }

                if (nieUdaneProby == 5) {

                    System.out.println("nieUdaneProby : 5");

                    miejsceWisielca6.setVisible(true);
                    miejsceWisielca5.setVisible(false);

                }

                if (nieUdaneProby == 6) {

                    System.out.println("nieUdaneProby : 6");

                    miejsceWisielca7.setVisible(true);
                    miejsceWisielca6.setVisible(false);

                }

                if (nieUdaneProby == 7) {

                    System.out.println("nieUdaneProby : 7");

                    miejsceWisielca8.setVisible(true);
                    miejsceWisielca7.setVisible(false);

                }

                if (nieUdaneProby == 8) {

                    System.out.println("nieUdaneProby : 8");

                    miejsceWisielca9.setVisible(true);
                    miejsceWisielca8.setVisible(false);

                }

                if (nieUdaneProby == 9) {

                    System.out.println("nieUdaneProby : 9");

                    miejsceWisielca10.setVisible(true);
                    miejsceWisielca9.setVisible(false);

                }

                if (nieUdaneProby == 10) {

                    System.out.println("nieUdaneProby : 10");

                    miejsceWisielca11.setVisible(true);
                    miejsceWisielca10.setVisible(false);

                }

                if (nieUdaneProby == 11) {

                    System.out.println("nieUdaneProby : 11");

                    miejsceWisielca12.setVisible(true);
                    miejsceWisielca11.setVisible(false);

                }

                if(nieUdaneProby == 11){

                    JOptionPane.showMessageDialog(
                            null,
                            "PRZEGRALES",
                            "GRA W WISIELCA",
                            JOptionPane.INFORMATION_MESSAGE
                    );

                    pole.setEditable(false);

                }

            }
        });


        return oknoGry;

    }


    public gra() {

        JFrame frame = new JFrame("GRA W WISIELCA");
        frame.setContentPane(createContentPane());
        frame.setSize(600, 300);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
        frame.setJMenuBar(pasekMenu);

        wyjscie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame.dispose();

            }
        });


    }
}
