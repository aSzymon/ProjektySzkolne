/** aSzymon - gtihub */

package PeselKomunikaty;

import java.util.regex.Pattern;

public class sprawdz {

    private int Pesel;

    public int sprawdzPesel(String pesel){

        if (pesel.isEmpty()) {
            Pesel = 1;
        }

        if(pesel.length() > 0 && pesel.length() < 11){
            Pesel = 2;
        }

        if(!Pattern.matches("[0-9]+",pesel)){
            Pesel = 3;
        }

        if(pesel.length() == 11 && Pattern.matches("[0-9]+",pesel)) {
            Pesel = 4;
        }

        return Pesel;

    }


    }

