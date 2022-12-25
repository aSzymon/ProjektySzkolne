/** aSzymon - gtihub */

package PESELBMIKALKULATORY;

import java.util.regex.Pattern;

public class dzialania {

    public float obliczBmi(float waga,float wzrost) {

        float WynikBmi = (float) (waga/Math.pow(wzrost/100,2));

        return WynikBmi;

    }


    public boolean isPesel(String pesel){

//        boolean SprawdzPesel;
//
//        if (pesel.length() == 11 && Pattern.matches("[0-9]+", pesel)) {
//            SprawdzPesel = true;
//        }else{
//            SprawdzPesel = false;
//        }
//
//        return SprawdzPesel;

        return pesel.length() == 11 && Pattern.matches("[0-9]+",pesel);

    }

}
