/**
 * ALEKSANDRA BANASIEWICZ
 * KLASA 4PP
 * NR.1
 **/

package zarzadzanieNotatkami;

import javax.swing.JOptionPane;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class baza {

    zapytania zapytania = new zapytania();

    public void dodajNotatke(String notka, String dataWprowadzenia, String dataWaznosci) {

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

            String zapytaniaNowyWpis = zapytania.dodawanie;

            PreparedStatement wynikZapytania = connection.prepareStatement(zapytaniaNowyWpis);

            wynikZapytania.setString(1,notka);
            wynikZapytania.setString(2,dataWprowadzenia);
            wynikZapytania.setString(3,dataWaznosci);

            wynikZapytania.executeUpdate();

            JOptionPane.showMessageDialog(
                    null,
                    "DODANO NOTATKE!",
                    "ZARZĄDZANIE NOTATKAMI",
                    JOptionPane.INFORMATION_MESSAGE
            );

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
//
//    public String wyszukajNotke(String notka) {
//
//        Connection connection = null;
//
//        try {
//
//            String url = "jdbc:mysql://localhost:3306/";
//            InputStream input = new FileInputStream("src/zarządzanieNotatkami/baza.properties");
//            Properties ustawienia = new Properties();
//            ustawienia.load(input);
//
//            connection = DriverManager.getConnection(
//                    url + ustawienia.getProperty("base"),
//                    ustawienia.getProperty("username"),
//                    ustawienia.getProperty("password"));
//
//            System.out.println("Database connected!");
//
//            String zapytanieWyszukajNotke = zapytania.wyszukajNotatke;
//
//            PreparedStatement wynikZapytania = connection.prepareStatement(zapytanieWyszukajNotke);
//
//            wynikZapytania.setString(1, notka);
//
//            Statement statement = connection.createStatement();
//
//            ResultSet wynikZapytaniaWyszukajNotke = statement.executeQuery(zapytanieWyszukajNotke);
//
//
//        } catch (FileNotFoundException ex) {
//            throw new RuntimeException(ex);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } catch (SQLException e) {
//            throw new IllegalStateException("Cannot connect the database!", e);
//        } finally {
//
//            connection = null;
//
//        }
//
//        return notka;
//    }


}
