/** aSzymon - gtihub */

package Oceny;

import javax.swing.*;

public class okno {

    private String jakaSrednia;
    private float floatSrednia;

    okno(){

        jakaSrednia = JOptionPane.showInputDialog(
                null,
                "Podaj Srednia :",
                "Srednia",
                JOptionPane.INFORMATION_MESSAGE
        );

    floatSrednia = Float.parseFloat(jakaSrednia);

        if (floatSrednia > 0 && floatSrednia < 2) {
            JOptionPane.showMessageDialog(
              null,
              "Powtarzasz klase",
              "komunikat",
                    JOptionPane.ERROR_MESSAGE
            );
        }

        if (floatSrednia >= 2 && floatSrednia < 3) {
            JOptionPane.showMessageDialog(
                    null,
                    "udalo sie",
                    "komunikat",
                    JOptionPane.WARNING_MESSAGE
            );
        }

        if (floatSrednia >= 3 && floatSrednia < 4) {
            JOptionPane.showMessageDialog(
                    null,
                    "mozna bylo lepiej",
                    "komunikat",
                    JOptionPane.QUESTION_MESSAGE
            );
        }

        if (floatSrednia >= 4 && floatSrednia < 6) {
            JOptionPane.showMessageDialog(
                    null,
                    "jest okej. Powtorz za rok ten wyczyn",
                    "komunikat",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }

        if (floatSrednia >= 7) {
            JOptionPane.showMessageDialog(
                    null,
                    "nie ma takiej średniej",
                    "komunikat",
                    JOptionPane.WARNING_MESSAGE
            );

            new okno();

        }

    }

}
