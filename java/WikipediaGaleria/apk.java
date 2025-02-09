/** aSzymon - gtihub */

package WikipediaGaleria;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class apk {

    zdjecia zdjecia = new zdjecia();
    dane dane = new dane();

    public JPanel createContentPane() {
        JPanel grafika = new JPanel(new BorderLayout());

        Border empty = BorderFactory.createEmptyBorder();
        Border obramowanie = BorderFactory.createLineBorder(new Color(148, 148, 148),3);

        JPanel tlo = new JPanel(null);
        tlo.setPreferredSize(new Dimension(900, 600));
        tlo.setBackground(new Color(171, 171, 171, 255));
        grafika.add(tlo, BorderLayout.CENTER);

        JPanel panel = new JPanel(null);
        panel.setBounds(0,20,200,460);
        panel.setBackground(new Color(150, 150, 150, 255));
        tlo.add(panel);

        JPanel obraz = new JPanel(null);
        obraz.setBounds(250,30,585,200);
        obraz.setBackground(new Color(206, 206, 206, 255));
        obraz.setVisible(false);
        tlo.add(obraz);

        JLabel zdjecie1 = new JLabel(zdjecia.zd1);
        zdjecie1.setBounds(0,0,585,200);
        zdjecie1.setVisible(false);
        obraz.add(zdjecie1);

        JLabel zdjecie2 = new JLabel(zdjecia.zd2);
        zdjecie2.setBounds(0,0,585,200);
        zdjecie2.setVisible(false);
        obraz.add(zdjecie2);

        JLabel zdjecie3 = new JLabel(zdjecia.zd3);
        zdjecie3.setBounds(0,0,585,200);
        zdjecie3.setVisible(false);
        obraz.add(zdjecie3);

        JLabel zdjecie4 = new JLabel(zdjecia.zd4);
        zdjecie4.setBounds(0,0,585,200);
        zdjecie4.setVisible(false);
        obraz.add(zdjecie4);

        JLabel zdjecie5 = new JLabel(zdjecia.zd5);
        zdjecie5.setBounds(0,0,585,200);
        zdjecie5.setVisible(false);
        obraz.add(zdjecie5);

        JLabel zdjecie6 = new JLabel(zdjecia.zd6);
        zdjecie6.setBounds(0,0,585,200);
        zdjecie6.setVisible(false);
        obraz.add(zdjecie6);

        JLabel zdjecie7 = new JLabel(zdjecia.zd7);
        zdjecie7.setBounds(0,0,585,200);
        zdjecie7.setVisible(false);
        obraz.add(zdjecie7);

        JLabel zdjecie8 = new JLabel(zdjecia.zd8);
        zdjecie8.setBounds(0,0,585,200);
        zdjecie8.setVisible(false);
        obraz.add(zdjecie8);

        JLabel zdjecie9 = new JLabel(zdjecia.zd9);
        zdjecie9.setBounds(0,0,585,200);
        zdjecie9.setVisible(false);
        obraz.add(zdjecie9);

        JPanel tresc = new JPanel(null);
        tresc.setBounds(250,250,585,270);
        tresc.setBackground(new Color(205, 205, 205, 255));
        tresc.setVisible(false);
        tlo.add(tresc);

        JTextArea poleTresci = new JTextArea();
        poleTresci.setText("");
        poleTresci.setBounds(0,0,585,270);
        poleTresci.setFont(new Font("Arial",Font.ITALIC,18));
        poleTresci.setOpaque(false);
        poleTresci.setEditable(false);
        poleTresci.setBorder(obramowanie);
        poleTresci.setLineWrap(true);
        poleTresci.setVisible(false);
        tresc.add(poleTresci);

        JButton clear = new JButton("CLEAR");
        clear.setBounds(25,500,150,40);
        clear.setBackground(new Color(244, 94, 184, 255));
        clear.setFont(new Font("Arial",Font.BOLD,15));
        clear.setBorder(empty);
        clear.setToolTipText("WYCZYSC");
        clear.setVisible(false);
        tlo.add(clear);

        JButton guzik1 = new JButton("1");
        guzik1.setBounds(25,10,150,40);
        guzik1.setBackground(new Color(162, 106, 238, 255));
        guzik1.setFont(new Font("Arial",Font.BOLD,15));
        guzik1.setBorder(empty);
        guzik1.setToolTipText("Bitwa pod Grunwaldem");
        guzik1.setVisible(true);
        panel.add(guzik1);

        JButton guzik2 = new JButton("2");
        guzik2.setBounds(25,60,150,40);
        guzik2.setBackground(new Color(94, 106, 244, 255));
        guzik2.setFont(new Font("Arial",Font.BOLD,15));
        guzik2.setBorder(empty);
        guzik2.setToolTipText("Bitwa Warszawska");
        guzik2.setVisible(true);
        panel.add(guzik2);

        JButton guzik3 = new JButton("3");
        guzik3.setBounds(25,110,150,40);
        guzik3.setBackground(new Color(94, 159, 243, 255));
        guzik3.setFont(new Font("Arial",Font.BOLD,15));
        guzik3.setBorder(empty);
        guzik3.setToolTipText("Bitwa stalingradzka");
        guzik3.setVisible(true);
        panel.add(guzik3);

        JButton guzik4 = new JButton("4");
        guzik4.setBounds(25,160,150,40);
        guzik4.setBackground(new Color(94, 220, 242, 255));
        guzik4.setFont(new Font("Arial",Font.BOLD,15));
        guzik4.setBorder(empty);
        guzik4.setToolTipText("Muchomor czerwony");
        guzik4.setVisible(true);
        panel.add(guzik4);

        JButton guzik5 = new JButton("5");
        guzik5.setBounds(25,210,150,40);
        guzik5.setBackground(new Color(94, 241, 190, 255));
        guzik5.setFont(new Font("Arial",Font.BOLD,15));
        guzik5.setBorder(empty);
        guzik5.setToolTipText("Gołąbek zielonawy");
        guzik5.setVisible(true);
        panel.add(guzik5);

        JButton guzik6 = new JButton("6");
        guzik6.setBounds(25,260,150,40);
        guzik6.setBackground(new Color(121, 240, 94, 255));
        guzik6.setFont(new Font("Arial",Font.BOLD,15));
        guzik6.setBorder(empty);
        guzik6.setToolTipText("Gąska zielonka");
        guzik6.setVisible(true);
        panel.add(guzik6);

        JButton guzik7 = new JButton("7");
        guzik7.setBounds(25,310,150,40);
        guzik7.setBackground(new Color(234, 239, 94, 255));
        guzik7.setFont(new Font("Arial",Font.BOLD,15));
        guzik7.setBorder(empty);
        guzik7.setToolTipText("Rabat");
        guzik7.setVisible(true);
        panel.add(guzik7);

        JButton guzik8 = new JButton("8");
        guzik8.setBounds(25,360,150,40);
        guzik8.setBackground(new Color(238, 166, 94, 255));
        guzik8.setFont(new Font("Arial",Font.BOLD,15));
        guzik8.setBorder(empty);
        guzik8.setToolTipText("Addis Abeba");
        guzik8.setVisible(true);
        panel.add(guzik8);

        JButton guzik9 = new JButton("9");
        guzik9.setBounds(25,410,150,40);
        guzik9.setBackground(new Color(237, 94, 94, 255));
        guzik9.setFont(new Font("Arial",Font.BOLD,15));
        guzik9.setBorder(empty);
        guzik9.setToolTipText("Wagadugu");
        guzik9.setVisible(true);
        panel.add(guzik9);

        /* ---------------------------------------------- */

        guzik1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                zdjecie1.setVisible(true);
                poleTresci.setText(dane.bitwaPodGrunwaldem[0]);

                obraz.setVisible(true);
                poleTresci.setVisible(true);
                tresc.setVisible(true);
                clear.setVisible(true);

                zdjecie2.setVisible(false);
                zdjecie3.setVisible(false);
                zdjecie4.setVisible(false);
                zdjecie5.setVisible(false);
                zdjecie6.setVisible(false);
                zdjecie7.setVisible(false);
                zdjecie8.setVisible(false);
                zdjecie9.setVisible(false);

            }
        });

        guzik2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                zdjecie2.setVisible(true);
                poleTresci.setText(dane.bitwaWarszawska[0]);

                obraz.setVisible(true);
                poleTresci.setVisible(true);
                tresc.setVisible(true);
                clear.setVisible(true);

                zdjecie1.setVisible(false);
                zdjecie3.setVisible(false);
                zdjecie4.setVisible(false);
                zdjecie5.setVisible(false);
                zdjecie6.setVisible(false);
                zdjecie7.setVisible(false);
                zdjecie8.setVisible(false);
                zdjecie9.setVisible(false);

            }
        });

        guzik3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                zdjecie3.setVisible(true);
                poleTresci.setText(dane.bitwaStalingradzka[0]);

                obraz.setVisible(true);
                poleTresci.setVisible(true);
                tresc.setVisible(true);
                clear.setVisible(true);

                zdjecie1.setVisible(false);
                zdjecie2.setVisible(false);
                zdjecie4.setVisible(false);
                zdjecie5.setVisible(false);
                zdjecie6.setVisible(false);
                zdjecie7.setVisible(false);
                zdjecie8.setVisible(false);
                zdjecie9.setVisible(false);

            }
        });

        guzik4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                zdjecie4.setVisible(true);
                poleTresci.setText(dane.muchomor[0]);

                obraz.setVisible(true);
                poleTresci.setVisible(true);
                tresc.setVisible(true);
                clear.setVisible(true);

                zdjecie1.setVisible(false);
                zdjecie2.setVisible(false);
                zdjecie3.setVisible(false);
                zdjecie5.setVisible(false);
                zdjecie6.setVisible(false);
                zdjecie7.setVisible(false);
                zdjecie8.setVisible(false);
                zdjecie9.setVisible(false);

            }
        });

        guzik5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                zdjecie5.setVisible(true);
                poleTresci.setText(dane.golabekZielonawy[0]);

                obraz.setVisible(true);
                poleTresci.setVisible(true);
                tresc.setVisible(true);
                clear.setVisible(true);

                zdjecie1.setVisible(false);
                zdjecie2.setVisible(false);
                zdjecie3.setVisible(false);
                zdjecie4.setVisible(false);
                zdjecie6.setVisible(false);
                zdjecie7.setVisible(false);
                zdjecie8.setVisible(false);
                zdjecie9.setVisible(false);
            }
        });

        guzik6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                zdjecie6.setVisible(true);
                poleTresci.setText(dane.gaskaZielona[0]);

                obraz.setVisible(true);
                poleTresci.setVisible(true);
                tresc.setVisible(true);
                clear.setVisible(true);

                zdjecie1.setVisible(false);
                zdjecie2.setVisible(false);
                zdjecie3.setVisible(false);
                zdjecie4.setVisible(false);
                zdjecie5.setVisible(false);
                zdjecie7.setVisible(false);
                zdjecie8.setVisible(false);
                zdjecie9.setVisible(false);
            }
        });

        guzik7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                zdjecie7.setVisible(true);
                poleTresci.setText(dane.rabat[0]);

                obraz.setVisible(true);
                poleTresci.setVisible(true);
                tresc.setVisible(true);
                clear.setVisible(true);

                zdjecie1.setVisible(false);
                zdjecie2.setVisible(false);
                zdjecie3.setVisible(false);
                zdjecie4.setVisible(false);
                zdjecie5.setVisible(false);
                zdjecie6.setVisible(false);
                zdjecie8.setVisible(false);
                zdjecie9.setVisible(false);
            }
        });

        guzik8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                zdjecie8.setVisible(true);
                poleTresci.setText(dane.addisAbeba[0]);

                obraz.setVisible(true);
                poleTresci.setVisible(true);
                tresc.setVisible(true);
                clear.setVisible(true);

                zdjecie1.setVisible(false);
                zdjecie2.setVisible(false);
                zdjecie3.setVisible(false);
                zdjecie4.setVisible(false);
                zdjecie5.setVisible(false);
                zdjecie6.setVisible(false);
                zdjecie7.setVisible(false);
                zdjecie9.setVisible(false);

            }
        });

        guzik9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                zdjecie9.setVisible(true);
                poleTresci.setText(dane.wagadugu[0]);

                obraz.setVisible(true);
                poleTresci.setVisible(true);
                tresc.setVisible(true);
                clear.setVisible(true);

                zdjecie1.setVisible(false);
                zdjecie2.setVisible(false);
                zdjecie3.setVisible(false);
                zdjecie4.setVisible(false);
                zdjecie5.setVisible(false);
                zdjecie6.setVisible(false);
                zdjecie7.setVisible(false);
                zdjecie8.setVisible(false);

            }
        });

        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                obraz.setVisible(false);
                poleTresci.setVisible(false);
                tresc.setVisible(false);
                clear.setVisible(false);

                zdjecie1.setVisible(false);
                zdjecie2.setVisible(false);
                zdjecie3.setVisible(false);
                zdjecie4.setVisible(false);
                zdjecie5.setVisible(false);
                zdjecie6.setVisible(false);
                zdjecie7.setVisible(false);
                zdjecie8.setVisible(false);
                zdjecie9.setVisible(false);

            }
        });

        return grafika;
    }

    public apk() {

        JFrame frame = new JFrame("Wikipedia/Galeria");
        frame.setContentPane(createContentPane());
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
        frame.setSize(900,600);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);

    }

}
