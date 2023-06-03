/** aSzymon - gtihub **/

package kalkulator.kalkulator;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

public class Kalkulator {

    public JPanel createContentPane() {
        JPanel kalkulator = new JPanel(new BorderLayout());

        JPanel gornyPanel = new JPanel(null);
        gornyPanel.setPreferredSize(new Dimension(400,80));
        gornyPanel.setBackground(new Color(116, 88, 118));
        kalkulator.add(gornyPanel, BorderLayout.NORTH);

        JPanel dolnyPanel = new JPanel(null);
        dolnyPanel.setBackground(new Color(163, 114, 167));
        kalkulator.add(dolnyPanel,BorderLayout.CENTER);

        JTextArea text = new JTextArea();
        text.setBounds(0, 0, 360, 80);
        text.setLineWrap(true);
        text.setFont(new Font("Times", Font.BOLD,50));
        gornyPanel.add(text);

        ImageIcon ikona1 = new ImageIcon("src/kalkulator/kalkulator/zdjecia/1.png");
        JButton jeden = new JButton(ikona1);
        jeden.setBackground(new Color(255, 174, 201));
        jeden.setBounds(0,270,90,90);
        dolnyPanel.add(jeden);

        ImageIcon ikona2 = new ImageIcon("src/kalkulator/kalkulator/zdjecia/2.png");
        JButton dwa = new JButton(ikona2);
        dwa.setBackground(new Color(255, 174, 201));
        dwa.setBounds(90,270,90,90);
        dolnyPanel.add(dwa);

        ImageIcon ikona3 = new ImageIcon("src/kalkulator/kalkulator/zdjecia/3.png");
        JButton trzy = new JButton(ikona3);
        trzy.setBackground(new Color(255, 174, 201));
        trzy.setBounds(180,270,90,90);
        dolnyPanel.add(trzy);

        ImageIcon ikonaDodaj = new ImageIcon("src/kalkulator/kalkulator/zdjecia/plus.png");
        JButton plus = new JButton(ikonaDodaj);
        plus.setBackground(new Color(255, 174, 201));
        plus.setBounds(180,360,90,90);
        dolnyPanel.add(plus);

        ImageIcon ikona4 = new ImageIcon("src/kalkulator/kalkulator/zdjecia/4.png");
        JButton cztery = new JButton(ikona4);
        cztery.setBackground(new Color(255, 174, 201));
        cztery.setBounds(0,180,90,90);
        dolnyPanel.add(cztery);

        ImageIcon ikona5 = new ImageIcon("src/kalkulator/kalkulator/zdjecia/5.png");
        JButton piec = new JButton(ikona5);
        piec.setBackground(new Color(255, 174, 201));
        piec.setBounds(90,180,90,90);
        dolnyPanel.add(piec);

        ImageIcon ikona6 = new ImageIcon("src/kalkulator/kalkulator/zdjecia/6.png");
        JButton szesc = new JButton(ikona6);
        szesc.setBackground(new Color(255, 174, 201));
        szesc.setBounds(180,180,90,90);
        dolnyPanel.add(szesc);

        ImageIcon ikonaOdjac = new ImageIcon("src/kalkulator/kalkulator/zdjecia/minus.png");
        JButton minus = new JButton(ikonaOdjac);
        minus.setBackground(new Color(255, 174, 201));
        minus.setBounds(270,360,90,90);
        dolnyPanel.add(minus);

        ImageIcon ikona7 = new ImageIcon("src/kalkulator/kalkulator/zdjecia/7.png");
        JButton siedem = new JButton(ikona7);
        siedem.setBackground(new Color(255, 174, 201));
        siedem.setBounds(0,90,90,90);
        dolnyPanel.add(siedem);

        ImageIcon ikona8 = new ImageIcon("src/kalkulator/kalkulator/zdjecia/8.png");
        JButton osiem = new JButton(ikona8);
        osiem.setBackground(new Color(255, 174, 201));
        osiem.setBounds(90,90,90,90);
        dolnyPanel.add(osiem);

        ImageIcon ikona9 = new ImageIcon("src/kalkulator/kalkulator/zdjecia/9.png");
        JButton dziewiec = new JButton(ikona9);
        dziewiec.setBackground(new Color(255, 174, 201));
        dziewiec.setBounds(180,90,90,90);
        dolnyPanel.add(dziewiec);

        ImageIcon ikonaMnoz = new ImageIcon("src/kalkulator/kalkulator/zdjecia/razy.png");
        JButton mnozenie = new JButton(ikonaMnoz);
        mnozenie.setBackground(new Color(255, 174, 201));
        mnozenie.setBounds(270,270,90,90);
        dolnyPanel.add(mnozenie);

        ImageIcon ikona0 = new ImageIcon("src/kalkulator/kalkulator/zdjecia/0.png");
        JButton zero = new JButton(ikona0);
        zero.setBackground(new Color(255, 174, 201));
        zero.setBounds(0,360,90,90);
        dolnyPanel.add(zero);

        ImageIcon ikonaPierwiastekKwiadratowy = new ImageIcon("src/kalkulator/kalkulator/zdjecia/pierwiastekKwaratowy.png");
        JButton pierwiastekKwadratowy = new JButton(ikonaPierwiastekKwiadratowy);
        pierwiastekKwadratowy.setBackground(new Color(255, 174, 201));
        pierwiastekKwadratowy.setBounds(0,0,90,90);
        dolnyPanel.add(pierwiastekKwadratowy);

        ImageIcon ikonaPierwiastekSzescienny = new ImageIcon("src/kalkulator/kalkulator/zdjecia/pierwiastekSzescienny.png");
        JButton pierwiastekSzescienny = new JButton(ikonaPierwiastekSzescienny);
        pierwiastekSzescienny.setBackground(new Color(255, 174, 201));
        pierwiastekSzescienny.setBounds(90,0,90,90);
        dolnyPanel.add(pierwiastekSzescienny);

        ImageIcon ikonaPodziel = new ImageIcon("src/kalkulator/kalkulator/zdjecia/podzielic.png");
        JButton dzielenie = new JButton(ikonaPodziel);
        dzielenie.setBackground(new Color(255, 174, 201));
        dzielenie.setBounds(270,180,90,90);
        dolnyPanel.add(dzielenie);

        ImageIcon ikonaKwadratLiczby = new ImageIcon("src/kalkulator/kalkulator/zdjecia/kwadratLiczby.png");
        JButton KwadratLiczby = new JButton(ikonaKwadratLiczby);
        KwadratLiczby.setBackground(new Color(255, 174, 201));
        KwadratLiczby.setBounds(270,90,90,90);
        dolnyPanel.add(KwadratLiczby);

        ImageIcon ikonaLogarytm10 = new ImageIcon("src/kalkulator/kalkulator/zdjecia/logarytmZpodstawa10.png");
        JButton Logarytm10 = new JButton(ikonaLogarytm10);
        Logarytm10.setBackground(new Color(255, 174, 201));
        Logarytm10.setBounds(180,0,90,90);
        dolnyPanel.add(Logarytm10);

        ImageIcon ikonaLogarytmX = new ImageIcon("src/kalkulator/kalkulator/zdjecia/logarytmZPostawaX.png");
        JButton LogarytmX = new JButton(ikonaLogarytmX);
        LogarytmX.setBackground(new Color(255, 174, 201));
        LogarytmX.setBounds(270,0,90,90);
        dolnyPanel.add(LogarytmX);

        ImageIcon ikonaRownaSie = new ImageIcon("src/kalkulator/kalkulator/zdjecia/rownaSie.png");
        JButton rownaSie = new JButton(ikonaRownaSie);
        rownaSie.setBackground(new Color(255, 174, 201));
        rownaSie.setBounds(90,360,90,90);
        dolnyPanel.add(rownaSie);

        gornyPanel.setLayout(new GridLayout(1, 1));
        dolnyPanel.setLayout(new GridLayout(5, 4));

        return kalkulator;
    }

    public Kalkulator() {
        JFrame frame = new JFrame("KALKULATOR - ALEKSANRA BANASIEWICZ");
        frame.setContentPane(createContentPane());
        frame.setSize(375, 567);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
    }
}
