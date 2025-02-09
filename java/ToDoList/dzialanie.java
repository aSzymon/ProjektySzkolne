/** aSzymon - gtihub */

package ToDoList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class dzialanie {

    int y = 10;

    public JPanel createContentPane() {
        JPanel dzialanieToDoList = new JPanel();

        JPanel tlo = new JPanel(null);
        tlo.setBounds(0, 0, 370, 620);
        tlo.setBackground(new Color(206, 118, 46));
        dzialanieToDoList.add(tlo);

        JPanel baner = new JPanel(null);
        baner.setBounds(0, 0, 370, 60);
        baner.setBackground(new Color(148, 122, 93));
        tlo.add(baner);

        JLabel tytul = new JLabel("To Do List");
        tytul.setBounds(25,5,300,50);
        tytul.setHorizontalAlignment(JLabel.CENTER);
        tytul.setFont(new Font("Arial",Font.ITALIC,28));
        tytul.setVisible(true);
        baner.add(tytul);

        JPanel poleDzialan = new JPanel(null);
        poleDzialan.setBounds(0, 60, 370, 450);
        poleDzialan.setBackground(new Color(183, 155, 123));
        tlo.add(poleDzialan);

        JPanel dodawanie = new JPanel(null);
        dodawanie.setBounds(0, 510, 370, 110);
        dodawanie.setBackground(new Color(148, 122, 93));
        tlo.add(dodawanie);

        Border empty = BorderFactory.createEmptyBorder();

        JTextArea poleDoWpisywania = new JTextArea();
        poleDoWpisywania.setBounds(10,10,270,50);
        poleDoWpisywania.setFont(new Font("Arial",Font.ITALIC,32));
        poleDoWpisywania.setBorder(empty);
        poleDoWpisywania.setOpaque(true);
        poleDoWpisywania.setVisible(true);
        dodawanie.add(poleDoWpisywania);

        Border obramowanie = BorderFactory.createLineBorder(new Color(110, 87, 62),3);

        JButton przycisk = new JButton(">");
        przycisk.setBounds(293,10,50,50);
        przycisk.setBackground(new Color(138, 118, 97));
        przycisk.setFont(new Font("Arial",Font.BOLD,28));
        przycisk.setBorder(obramowanie);
        przycisk.setToolTipText("DODAJ ZADANIE");
        przycisk.setVisible(true);
        dodawanie.add(przycisk);

        przycisk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String pobranyTekst = poleDoWpisywania.getText();


                    if(pobranyTekst.equals("")) {

                        JOptionPane.showMessageDialog(null,
                                "WYPEŁNIJ POLE",
                                "Informacja",
                                JOptionPane.INFORMATION_MESSAGE);
                    } else {

                        JCheckBox checkBox = new JCheckBox(pobranyTekst);
                        checkBox.setBounds(5, y,343, 50);
                        checkBox.setFont(new Font("Arial",Font.ROMAN_BASELINE,19));
                        poleDzialan.add(checkBox);

                        y = y + 60;

                        poleDzialan.repaint();

                    }

                poleDoWpisywania.setText("");

            }
        });

        return dzialanieToDoList;
    }

    public dzialanie() {

        JFrame frame = new JFrame("TO DO LIST");
        frame.setContentPane(createContentPane());
        frame.setSize(370, 620);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);

    }

}
