/**
 * ALEKSANDRA BANASIEWICZ
 * KLASA 4PP
 * NR.1
 **/

package zarzadzanieNotatkami;

public class zapytania {

    String dodawanie = "INSERT INTO notatki(notatka,dataWprowadzenia,dataWaznosciDo) VALUES(?,?,?)";
    String wyszukajNotatke = "SELECT * FROM notatki WHERE notatka WHERE LIKE '%?%'";
    String wyszukajPoDacieWprowadzenia = "SELECT * FROM notatki WHERE dataWprowadzenia LIKE ?";
    String wyszukajPoDacieWaznosci = "SELECT * FROM notatki WHERE dataWaznosciDo LIKE ?";
    String usunNotatke = "DELETE * FROM notatki WHERE notatka LIKE ?";
    String usunPoDacieWprowadzenia = "DELETE * FROM notatki WHERE dataWprowadzenia LIKE ?";
    String usunPoDacieWaznosci = "DELETE * FROM notatki WHERE dataWaznosciDo LIKE ?";
    String aktualizujDateWprowadzenia = "UPDATE notatki SET dataWprowadzenia = ?";
    String aktualizujDateWaznosciDo = "UPDATE notatki SET dataWaznosciDo = ?";

}
