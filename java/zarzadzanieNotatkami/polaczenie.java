/**
 * ALEKSANDRA BANASIEWICZ
 * KLASA 4PP
 * NR.1
 **/

package zarzadzanieNotatkami;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class polaczenie {

    baza baza = new baza();

    public void polaczenieZBaza() throws SQLException {

        Connection connection = null;

        try {

            String url = "jdbc:mysql://localhost:3306/";
            InputStream input = new FileInputStream("src/zarządzanieNotatkami/baza.properties");
            Properties ustawienia = new Properties();
            ustawienia.load(input);

            connection = DriverManager.getConnection(
                    url + ustawienia.getProperty("base"),
                    ustawienia.getProperty("username"),
                    ustawienia.getProperty("password"));

            System.out.println("Database connected!");

        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch(SQLException e){
            throw new IllegalStateException("Cannot connect the database!", e);
        }

        finally {

            connection = null;

        }


    }
}
