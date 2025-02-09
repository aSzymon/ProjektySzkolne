/** aSzymon - gtihub **/

package kalkulator.packt;

import java.util.Scanner;

public class wykonanie implements wywolanie {

    Scanner scan = new Scanner(System.in);

    @Override
    public double dodawanie() {

        System.out.println("");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("-=-=-=-=-= DODAWANIE =-=-=-=-=-");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("");

        System.out.println("Podaj pierwszy skladnik : ");
        double skladnik1 = scan.nextDouble();

        System.out.println("Podaj drogi skladnik : ");
        double skladnik2 = scan.nextDouble();

        System.out.println("suma :");
        return skladnik1+skladnik2;
    }

    @Override
    public double odejmowanie() {

        System.out.println("");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("-=-=-=-=- ODEJMOWANIE -=-=-=-=-");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("");

        System.out.println("Podaj odjemna : ");
        double odjemna = scan.nextDouble();

        System.out.println("Podaj odjemnik : ");
        double odjemnik = scan.nextDouble();

        System.out.println("roznica :");
        return odjemna-odjemnik;
    }

    @Override
    public double dzielenie() {

        System.out.println("");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("-=-=-=-=-= DZIELENIE =-=-=-=-=-");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("");

        System.out.println("Podaj dzielna : ");
        double dzielna = scan.nextDouble();

        System.out.println("Podaj dzielnik : ");
        double dzielnik = scan.nextDouble();

        if(dzielna==0) {

            throw new ArithmeticException("Nie dziel przez 0");

        }

        System.out.print("iloraz : ");
        return dzielna/dzielnik;
    }

    @Override
    public double mnozenie() {

        System.out.println("");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("-=-=-=-=-=- MNOŻENIE -=-=-=-=-=");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("");

        System.out.println("Podaj pierwszy czynnik : ");
        double czynnik1 = scan.nextDouble();

        System.out.println("Podaj drogi czunnik : ");
        double czynnik2 = scan.nextDouble();

        System.out.print("Iloczyn : ");
        return czynnik1*czynnik2;
    }

    @Override
    public double pierwiastkowanieKwadratowe() {

        System.out.println("");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("-=- PIERWIASTKOWANIE KWADRATOWE -=-");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("");

        System.out.println("Podaj liczbe do spierwiastkowania kwadratowego : ");
        double pierwiastekKwaratowy = scan.nextDouble();

        if (pierwiastekKwaratowy<0) {

            throw new ArithmeticException("Liczba nie moze byc mniejsza od 0");

        }

        System.out.print("Pierwiastek kwadratowy liczby : ");
        return Math.sqrt(pierwiastekKwaratowy);
    }

    @Override
    public double pierwiastkowanieSzescienne() {

        System.out.println("");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("-=- PIERWIASTKOWANIE SZCZESCIENNE -=-");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("");

        System.out.println("Podaj liczbe do spierwiastkowania szcześciennego : ");
        double pierwiastekSzescienny = scan.nextDouble();

        if (pierwiastekSzescienny<0) {

            throw new ArithmeticException("Liczba nie moze byc mniejsza od 0");

        }

        System.out.print("Pierwiastek szescienny liczby : ");
        return Math.cbrt(pierwiastekSzescienny);
    }

    @Override
    public double potegowanie() {

        System.out.println("");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("-=-=-=-=- POTĘGOWANIE -=-=-=-=-");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("");

        System.out.println("Podaj podstawe : ");
        double podstawa = scan.nextDouble();

        System.out.println("Podaj index : ");
        double index = scan.nextDouble();

        if (podstawa==0 && index==0) {

            throw new ArithmeticException("podstawa i index nie moga byc rowne 0");

        }

        System.out.print("wynik potegowania : ");
        return Math.pow(podstawa,index);
    }

    @Override
    public double logarytm10() {

        System.out.println("");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("-=-= LOGARYTM Z PODSTAWĄ 10 -=-");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("");

        System.out.println("Podaj index gorny logarytmu : ");
        double logarytmIndexGorny = scan.nextDouble();

        System.out.print("wynik logarytmu : ");
        return Math.log(logarytmIndexGorny);
    }

    @Override
    public double logarytmZPodstawaN() {

        System.out.println("");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("-=-LOGARYTM Z PODSTAWĄ I INDEXEM-=-");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("");

        System.out.println("Podaj podstawe logarytmu: ");
        double podstawaLogarytmu = scan.nextDouble();

        System.out.println("Podaj index gorny logarytmu : ");
        double indexGornyLogarytmu = scan.nextDouble();

        if (podstawaLogarytmu==0 && indexGornyLogarytmu==0) {

            throw new ArithmeticException("podstawa i index nie moga byc rowne 0");

        }

        System.out.print("wynik logarytmu : ");
        return (Math.log(podstawaLogarytmu))/(Math.log(indexGornyLogarytmu));
    }

    public static void main(String[] args) {

        new wykonanie();

    }

}
