/** aSzymon - gtihub */

package PESELBMIKALKULATORY;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class okno extends JFrame {

    JLabel tekst;
    JLabel tekstpesel;

    JTextArea poleTekstowePESEL;
    JButton przyciskSprawdzPESEL;

    JLabel wzrost;
    JLabel waga;

    JTextArea poleTekstoweBMI1;
    JTextArea poleTekstoweBMI2;

    JButton przyciskSprawdzBMI;

    JLabel wynikPesel;
    JLabel wynikBmiBmi;

    public void initComponents() {
        Container kontener = this.getContentPane();

        /* DO PESELU */

        tekstpesel = new JLabel();
        tekstpesel.setBounds(40, 200, 100, 30);
        tekstpesel.setBackground(new Color(1, 15, 18));
        tekstpesel.setFont(new Font("Arial", Font.BOLD, 16));
        tekstpesel.setForeground(Color.black);
        tekstpesel.setText("Podaj Pesel");
        tekstpesel.setHorizontalAlignment(JLabel.CENTER);
        tekstpesel.setOpaque(true);
        tekstpesel.setVisible(false);
        kontener.add(tekstpesel);

        poleTekstowePESEL = new JTextArea();
        poleTekstowePESEL.setBounds(150, 200, 100, 30);
        poleTekstowePESEL.setLineWrap(true);
        poleTekstowePESEL.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
        poleTekstowePESEL.setVisible(false);
        poleTekstowePESEL.setOpaque(true);
        kontener.add(poleTekstowePESEL);

        przyciskSprawdzPESEL = new JButton("Sprawdź PESEL");
        przyciskSprawdzPESEL.setBounds(80, 250, 150, 20);
        przyciskSprawdzPESEL.setVisible(false);
        kontener.add(przyciskSprawdzPESEL);

        wynikPesel = new JLabel();
        wynikPesel.setBounds(250, 300, 150, 30);
        wynikPesel.setBackground(Color.white);
        wynikPesel.setFont(new Font("Arial", Font.BOLD, 16));
        wynikPesel.setForeground(Color.black);
        wynikPesel.setHorizontalAlignment(JLabel.CENTER);
        wynikPesel.setOpaque(true);
        wynikPesel.setVisible(false);
        kontener.add(wynikPesel);

        /* DO BMI */

        wzrost = new JLabel("Wzrost");
        wzrost.setHorizontalAlignment(JLabel.CENTER);
        wzrost.setBounds(520, 180, 100, 40);
        wzrost.setFont(new Font("Arial", Font.BOLD, 16));
        wzrost.setForeground(Color.black);
        wzrost.setVisible(false);
        kontener.add(wzrost);

        waga = new JLabel("Waga");
        waga.setHorizontalAlignment(JLabel.CENTER);
        waga.setFont(new Font("Arial", Font.BOLD, 16));
        waga.setBounds(520, 220, 100, 40);
        waga.setForeground(Color.black);
        waga.setVisible(false);
        kontener.add(waga);

        poleTekstoweBMI1 = new JTextArea();
        poleTekstoweBMI1.setBounds(610, 185, 100, 30);
        poleTekstoweBMI1.setLineWrap(true);
        poleTekstoweBMI1.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
        poleTekstoweBMI1.setVisible(false);
        poleTekstoweBMI1.setOpaque(true);
        kontener.add(poleTekstoweBMI1);

        poleTekstoweBMI2 = new JTextArea();
        poleTekstoweBMI2.setBounds(610, 225, 100, 30);
        poleTekstoweBMI2.setLineWrap(true);
        poleTekstoweBMI2.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
        poleTekstoweBMI2.setVisible(false);
        poleTekstoweBMI2.setOpaque(true);
        kontener.add(poleTekstoweBMI2);

        przyciskSprawdzBMI = new JButton("Sprawdź BMI");
        przyciskSprawdzBMI.setBounds(555, 275, 150, 20);
        przyciskSprawdzBMI.setVisible(false);
        kontener.add(przyciskSprawdzBMI);

        wynikBmiBmi = new JLabel();
        wynikBmiBmi.setBounds(390, 300, 150, 30);
        wynikBmiBmi.setBackground(Color.white);
        wynikBmiBmi.setFont(new Font("Arial", Font.BOLD, 16));
        wynikBmiBmi.setForeground(Color.black);
        wynikBmiBmi.setHorizontalAlignment(JLabel.CENTER);
        wynikBmiBmi.setOpaque(true);
        wynikBmiBmi.setVisible(false);
        kontener.add(wynikBmiBmi);

        /* DO RESZTY RZECZY */

        tekst = new JLabel();
        tekst.setBounds(330, 30, 150, 50);
        tekst.setBackground(Color.white);
        tekst.setText("Kalkulatory");
        tekst.setHorizontalAlignment(JLabel.CENTER);
        tekst.setOpaque(true);
        kontener.add(tekst);

        JCheckBox pesel = new JCheckBox("PESEL");
        pesel.setBounds(180, 110, 100, 40);
        pesel.setBackground(Color.black);
        pesel.setForeground(Color.white);
        pesel.setHorizontalAlignment(JLabel.CENTER);
        kontener.add(pesel);

        JCheckBox bmi = new JCheckBox("BMI");
        bmi.setBounds(530, 110, 100, 40);
        bmi.setBackground(Color.black);
        bmi.setForeground(Color.white);
        bmi.setHorizontalAlignment(JLabel.CENTER);
        kontener.add(bmi);

        /* LISTENER */



        ActionListener CheckboxListner = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (pesel.isSelected()) {


                    tekstpesel.setVisible(true);
                    poleTekstowePESEL.setVisible(true);
                    przyciskSprawdzPESEL.setVisible(true);
                    wynikPesel.setVisible(true);

                    waga.setVisible(false);
                    poleTekstoweBMI1.setVisible(false);
                    wzrost.setVisible(false);
                    poleTekstoweBMI2.setVisible(false);
                    przyciskSprawdzBMI.setVisible(false);
                    wynikBmiBmi.setVisible(false);


                } else if (bmi.isSelected()) {


                    tekstpesel.setVisible(false);
                    poleTekstowePESEL.setVisible(false);
                    przyciskSprawdzPESEL.setVisible(false);
                    wynikPesel.setVisible(false);

                    waga.setVisible(true);
                    poleTekstoweBMI1.setVisible(true);
                    wzrost.setVisible(true);
                    poleTekstoweBMI2.setVisible(true);
                    przyciskSprawdzBMI.setVisible(true);
                    wynikBmiBmi.setVisible(true);


                } else {


                    tekstpesel.setVisible(false);
                    poleTekstowePESEL.setVisible(false);
                    przyciskSprawdzPESEL.setVisible(false);
                    wynikPesel.setVisible(false);

                    waga.setVisible(false);
                    poleTekstoweBMI1.setVisible(false);
                    wzrost.setVisible(false);
                    poleTekstoweBMI2.setVisible(false);
                    przyciskSprawdzBMI.setVisible(false);
                    wynikBmiBmi.setVisible(false);

                }
            }


        };
        pesel.addActionListener(CheckboxListner);
        bmi.addActionListener(CheckboxListner);

        ActionListener CheckboxListner2= new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



            }};

        przyciskSprawdzPESEL.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dzialania dzialania = new dzialania();
                String myPesel = poleTekstowePESEL.getText();

                if (dzialania.isPesel(myPesel) == true) {
                    wynikPesel.setText("Pesel jest poprawny");
                } else {
                    wynikPesel.setText("Pesel jest błędny");
                }
            }
        });

        przyciskSprawdzBMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dzialania dzialania = new dzialania();

                String TekstWzrost = poleTekstoweBMI1.getText();
                String tekstWaga = poleTekstoweBMI2.getText();

                float wzrostNaLiczbe = Float.parseFloat(TekstWzrost);
                float wagaNaLiczbe = Float.parseFloat(tekstWaga);

                float wynikBmi = dzialania.obliczBmi(wagaNaLiczbe, wzrostNaLiczbe);

                if (wynikBmi < 16) {

                    wynikBmiBmi.setText("wygłodzenie");
                    wynikBmiBmi.setForeground(Color.black);

                } else if (wynikBmi > 16 && wynikBmi < 16.99) {

                    wynikBmiBmi.setText("wychudzenie");
                    wynikBmiBmi.setForeground(Color.black);

                } else if (wynikBmi > 17 && wynikBmi < 18.99) {

                    wynikBmiBmi.setText("niedowaga");
                    wynikBmiBmi.setForeground(Color.blue);

                } else if (wynikBmi > 18.5 && wynikBmi < 24.99) {

                    wynikBmiBmi.setText("wartość prawidłowa");
                    wynikBmiBmi.setForeground(Color.green);

                } else if (wynikBmi > 25 && wynikBmi < 29.99) {

                    wynikBmiBmi.setText("nadwaga");
                    wynikBmiBmi.setForeground(Color.red);

                } else if (wynikBmi > 30 && wynikBmi < 34.99) {

                    wynikBmiBmi.setText("1 stopień otyłości");
                    wynikBmiBmi.setForeground(Color.black);

                } else if (wynikBmi > 35 && wynikBmi < 39.99) {

                    wynikBmiBmi.setText("2 stopień otyłości");
                    wynikBmiBmi.setForeground(Color.black);

                } else if (wynikBmi > 40) {

                    wynikBmiBmi.setText("otyłość skrajna");
                    wynikBmiBmi.setForeground(Color.black);

                }

            }
        });

    }

    public okno() {

        this.setDefaultLookAndFeelDecorated(true);

        this.setLocationRelativeTo(null);
        this.setTitle("pesel bmi kalkulator");
        this.setSize(800, 400);
        this.setResizable(false);
        this.setFont(new Font("Arial", Font.BOLD, 16));
        this.setDefaultCloseOperation(3);
        this.getContentPane().setBackground(new Color(1, 15, 18));
        this.setLayout(null);
        this.initComponents();
        this.setVisible(true);
    }

}