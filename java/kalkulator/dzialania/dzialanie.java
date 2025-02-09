/** aSzymon - gtihub **/

package kalkulator.dzialania;

import kalkulator.packt.wykonanie;

public class dzialanie {

    public static void main(String[] args) {

        wykonanie wykonanie = new wykonanie();

        System.out.println(wykonanie.dodawanie());

        System.out.println(wykonanie.odejmowanie());

        System.out.println(wykonanie.dzielenie());

        System.out.println(wykonanie.mnozenie());

        System.out.println(wykonanie.pierwiastkowanieKwadratowe());

        System.out.println(wykonanie.pierwiastkowanieSzescienne());

        System.out.println(wykonanie.potegowanie());

        System.out.println(wykonanie.logarytm10());

        System.out.println(wykonanie.logarytmZPodstawaN());

    }

}
