/** aSzymon - gtihub */

package PeselKomunikaty;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class aplikacja extends JFrame {

    public JPanel createContentPane() {

        JPanel kontener = new JPanel();

        JPanel pole = new JPanel(null);
        pole.setBounds(17, 10, 450, 190);
        pole.setBackground(new Color(139, 135, 130));
        kontener.add(pole);

        JLabel tekst = new JLabel("Podaj swoj pesel :");
        tekst.setBounds(150, 10, 150, 50);
        tekst.setFont(new Font("Arial", Font.BOLD, 16));
        tekst.setOpaque(true);
        tekst.setBackground(Color.gray);
        tekst.setForeground(Color.white);
        pole.add(tekst);
        
        JTextField wpiszPesel = new JTextField();
        wpiszPesel.setBounds(50,80,350,30);
        pole.add(wpiszPesel);

        JButton zatwierdz = new JButton("Zatwierdz");
        zatwierdz.setBounds(165, 120, 120, 50);
        pole.add(zatwierdz);

        zatwierdz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                sprawdz Sprawdz = new sprawdz();
                info Info = new info();

                if (Sprawdz.sprawdzPesel(wpiszPesel.getText()) == 1){

                    JOptionPane.showMessageDialog(
                            null,
                            "<html>"+Info.komunikaty[0]+"</html>",
                            "KOMUNIKAT",
                            JOptionPane.ERROR_MESSAGE
                        );
                 }

                if (Sprawdz.sprawdzPesel(wpiszPesel.getText()) == 2) {

                    JOptionPane.showMessageDialog(
                            null,
                            "<html>" + Info.komunikaty[1] + "</html>",
                            "KOMUNIKAT",
                            JOptionPane.WARNING_MESSAGE
                    );

                }

                    if (Sprawdz.sprawdzPesel(wpiszPesel.getText()) == 3){

                        JOptionPane.showMessageDialog(
                                null,
                                "<html>"+Info.komunikaty[2]+"</html>",
                                "KOMUNIKAT",
                                JOptionPane.WARNING_MESSAGE
                        );

                    }

                if (Sprawdz.sprawdzPesel(wpiszPesel.getText()) == 4){

                        JOptionPane.showMessageDialog(
                                null,
                                "<html>"+Info.komunikaty[3]+"</html>",
                                "KOMUNIKAT",
                                JOptionPane.INFORMATION_MESSAGE
                        );

                }


            }


        });

        return kontener;
    }

    public aplikacja() {

        this.setContentPane(createContentPane());
        this.setTitle("PESEL");
        this.setSize(500, 250);
        this.setLayout(null);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        this.setVisible(true);

        }

    }


