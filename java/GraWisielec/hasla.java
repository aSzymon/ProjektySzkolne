/** aSzymon - gtihub */

package GraWisielec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class hasla {

    public String slowo1;
    public String slowo2;
    public String slowo3;
    public String slowo4;
    public String slowo5;
    public String slowo6;
    public String slowo7;
    public String slowo8;
    public String slowo9;
    public String slowo10;

    {

        try {

            InputStream input = new FileInputStream("src\\GraWisielec\\hasla.properties");

            Properties ustawienia = new Properties();
            ustawienia.load(input);

            slowo1 = ustawienia.getProperty("slowo1");
            slowo2 = ustawienia.getProperty("slowo2");
            slowo3 = ustawienia.getProperty("slowo3");
            slowo4 = ustawienia.getProperty("slowo4");
            slowo5 = ustawienia.getProperty("slowo5");
            slowo6 = ustawienia.getProperty("slowo6");
            slowo7 = ustawienia.getProperty("slowo7");
            slowo8 = ustawienia.getProperty("slowo8");
            slowo9 = ustawienia.getProperty("slowo9");
            slowo10 = ustawienia.getProperty("slowo10");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
