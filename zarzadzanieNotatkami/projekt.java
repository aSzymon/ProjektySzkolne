/**
 * ALEKSANDRA BANASIEWICZ
 * KLASA 4PP
 * NR.1
 **/

package zarzadzanieNotatkami;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class projekt {

    polaczenie polaczenie = new polaczenie();

    baza baza = new baza();

    public JPanel createContentPane() {
        JPanel grafika = new JPanel();

        JPanel tlo = new JPanel(null);
        tlo.setBounds(0, 0, 600, 500);
        tlo.setBackground(new Color(89, 60, 66));
        grafika.add(tlo);

        /* PANEL BOCZNY */

        JPanel panelBoczny = new JPanel(null);
        panelBoczny.setBounds(0,0,200,500);
        panelBoczny.setBackground(new Color(89, 60, 66));
        panelBoczny.setVisible(true);
        tlo.add(panelBoczny);

        Border empty = BorderFactory.createEmptyBorder();

        //-----------------------------------------------------------------------
        /* POLE DZIALANIA */

        JPanel poleDzialania = new JPanel(null);
        poleDzialania.setBounds(200,83,384,278);
        poleDzialania.setBackground(new Color(168, 95, 109));
        poleDzialania.setVisible(true);
        tlo.add(poleDzialania);

        Border obramowanie = BorderFactory.createLineBorder(new Color(89, 60, 66),3);

        //-----------------------------------------------------------------------

        JPanel panelInformacja = new JPanel(null);
        panelInformacja.setBounds(85,50,225,120);
        panelInformacja.setBackground(new Color(201, 106, 126));
        panelInformacja.setVisible(false);
        panelInformacja.setBorder(obramowanie);
        poleDzialania.add(panelInformacja);

        JLabel tytulInfo = new JLabel("ZARZĄDZANIE NOTATKAMI");
        tytulInfo.setBounds(7,0,300,50);
        tytulInfo.setFont(new Font("Arial",Font.BOLD,16));
        tytulInfo.setVisible(true);
        panelInformacja.add(tytulInfo);

        JLabel imieNazwisko = new JLabel("ALEKSANDRA BANASIEWICZ");
        imieNazwisko.setBounds(15,20,200,50);
        imieNazwisko.setFont(new Font("Arial",Font.BOLD,14));
        imieNazwisko.setVisible(true);
        panelInformacja.add(imieNazwisko);

        JLabel klasa = new JLabel("KLASA 4PP");
        klasa.setBounds(77,37,300,50);
        klasa.setFont(new Font("Arial",Font.BOLD,14));
        klasa.setVisible(true);
        panelInformacja.add(klasa);

        JButton infoPrzycisk = new JButton("OK");
        infoPrzycisk.setBounds(10,78,210,30);
        infoPrzycisk.setBackground(new Color(166, 105, 118));
        infoPrzycisk.setFont(new Font("Arial",Font.BOLD,20));
        infoPrzycisk.setBorder(obramowanie);
        infoPrzycisk.setVisible(true);
        panelInformacja.add(infoPrzycisk);

        //-----------------------------------------------------------------------

        JButton polaczZBaza = new JButton("POŁĄCZ Z BAZĄ");
        polaczZBaza.setBounds(0,0,197,70);
        polaczZBaza.setBackground(new Color(157, 85, 100));
        polaczZBaza.setFont(new Font("Arial",Font.ROMAN_BASELINE,20));
        polaczZBaza.setBorder(empty);
        polaczZBaza.setVisible(true);
        panelBoczny.add(polaczZBaza);

        //-----------------------------------------------------------------------

        JButton dodajPrzycisk = new JButton("DODAJ NOTATKE");
        dodajPrzycisk.setBounds(0,70,197,70);
        dodajPrzycisk.setBackground(new Color(166, 105, 118));
        dodajPrzycisk.setFont(new Font("Arial",Font.ROMAN_BASELINE,20));
        dodajPrzycisk.setBorder(empty);
        dodajPrzycisk.setVisible(true);
        panelBoczny.add(dodajPrzycisk);

        //-----------------------------------------------------------------------

        JButton wyszukajPrzycisk = new JButton("WYSZUKAJ...");
        wyszukajPrzycisk.setBounds(0,140,197,80);
        wyszukajPrzycisk.setBackground(new Color(157, 85, 100));
        wyszukajPrzycisk.setFont(new Font("Arial",Font.ROMAN_BASELINE,20));
        wyszukajPrzycisk.setToolTipText("<html><i><b>ROZWIŃ ABY ZOBACZYĆ DOSTĘPNE OPCJE</b></i></html>");
        wyszukajPrzycisk.setBorder(empty);
        wyszukajPrzycisk.setVisible(true);
        panelBoczny.add(wyszukajPrzycisk);

        //-----------------------------------------------------------------------

        JButton usunPrzycisk = new JButton("USUŃ...");
        usunPrzycisk.setBounds(0,220,197,70);
        usunPrzycisk.setBackground(new Color(166, 105, 118));
        usunPrzycisk.setFont(new Font("Arial",Font.ROMAN_BASELINE,20));
        usunPrzycisk.setToolTipText("<html><i><b>ROZWIŃ ABY ZOBACZYĆ DOSTĘPNE OPCJE</b></i></html>");
        usunPrzycisk.setBorder(empty);
        usunPrzycisk.setVisible(true);
        panelBoczny.add(usunPrzycisk);

        //-----------------------------------------------------------------------

        JButton aktualizujPrzycisk = new JButton("AKTUALIZUJ...");
        aktualizujPrzycisk.setBounds(0,290,197,70);
        aktualizujPrzycisk.setBackground(new Color(157, 85, 100));
        aktualizujPrzycisk.setFont(new Font("Arial",Font.ROMAN_BASELINE,20));
        aktualizujPrzycisk.setBorder(empty);
        aktualizujPrzycisk.setToolTipText("<html><i><b>ROZWIŃ ABY ZOBACZYĆ DOSTĘPNE OPCJE</b></i></html>");
        aktualizujPrzycisk.setVisible(true);
        panelBoczny.add(aktualizujPrzycisk);

        //-----------------------------------------------------------------------
        /* BANNER */

        JPanel baner = new JPanel(null);
        baner.setBounds(200,0,400,80);
        baner.setBackground(new Color(147, 77, 92));
        baner.setVisible(true);
        tlo.add(baner);

        JLabel tytul = new JLabel("ZARZĄDZANIE NOTATKAMI");
        tytul.setBounds(65,20,300,40);
        tytul.setFont(new Font("Arial",Font.BOLD,20));
        tytul.setVisible(true);
        baner.add(tytul);

        ImageIcon ikonaInfo = new ImageIcon("src/zarządzanieNotatkami/informacja.png");
        JButton info = new JButton(ikonaInfo);
        info.setBounds(345,5,35,35);
        info.setBackground(new Color(147, 77, 92));
        info.setFont(new Font("Arial",Font.ROMAN_BASELINE,20));
        info.setBorder(empty);
        info.setToolTipText("<html><i><b>INFORMACJA</b></i></html>");
        info.setVisible(true);
        baner.add(info);

        //-----------------------------------------------------------------------

        /* PANEL BOCZNY */

        //-----------------------------------------------------------------------

        /* WYSZUKAJ */

        JPanel panelWyszukaj = new JPanel(null);
        panelWyszukaj.setBounds(-3,55,150,143);
        panelWyszukaj.setBackground(new Color(141, 77, 89));
        panelWyszukaj.setVisible(false);
        panelWyszukaj.setBorder(obramowanie);
        poleDzialania.add(panelWyszukaj);

        JButton przyciskWyszukajNotkeOpcja = new JButton("NOTATKĘ");
        przyciskWyszukajNotkeOpcja.setBounds(0,3,147,47);
        przyciskWyszukajNotkeOpcja.setBackground(new Color(166, 105, 118));
        przyciskWyszukajNotkeOpcja.setFont(new Font("Arial",Font.BOLD,10));
        przyciskWyszukajNotkeOpcja.setBorder(empty);
        przyciskWyszukajNotkeOpcja.setVisible(true);
        panelWyszukaj.add(przyciskWyszukajNotkeOpcja);

        JButton przyciskWyszukajPoDacieWprowadzeniaOpcja = new JButton("PO DACIE WPROWADZENIA");
        przyciskWyszukajPoDacieWprowadzeniaOpcja.setBounds(0,50,147,47);
        przyciskWyszukajPoDacieWprowadzeniaOpcja.setBackground(new Color(157, 85, 100));
        przyciskWyszukajPoDacieWprowadzeniaOpcja.setFont(new Font("Arial",Font.BOLD,10));
        przyciskWyszukajPoDacieWprowadzeniaOpcja.setBorder(empty);
        przyciskWyszukajPoDacieWprowadzeniaOpcja.setVisible(true);
        panelWyszukaj.add(przyciskWyszukajPoDacieWprowadzeniaOpcja);

        JButton przyciskWyszukajPoDacieWaznosciOpcja = new JButton("PO DACIE WAŻNOŚCI");
        przyciskWyszukajPoDacieWaznosciOpcja.setBounds(0,97,147,44);
        przyciskWyszukajPoDacieWaznosciOpcja.setBackground(new Color(166, 105, 118));
        przyciskWyszukajPoDacieWaznosciOpcja.setFont(new Font("Arial",Font.BOLD,10));
        przyciskWyszukajPoDacieWaznosciOpcja.setBorder(empty);
        przyciskWyszukajPoDacieWaznosciOpcja.setVisible(true);
        panelWyszukaj.add(przyciskWyszukajPoDacieWaznosciOpcja);

        JButton minimalizujWyszukaj = new JButton("‹");
        minimalizujWyszukaj.setBounds(147,55,15,30);
        minimalizujWyszukaj.setBackground(new Color(133, 75, 87));
        minimalizujWyszukaj.setFont(new Font("Arial",Font.BOLD,28));
        minimalizujWyszukaj.setBorder(empty);
        minimalizujWyszukaj.setToolTipText("ZAMKNIJ ZAKŁADKĘ");
        minimalizujWyszukaj.setVisible(false);
        poleDzialania.add(minimalizujWyszukaj);

        //-----------------------------------------------------------------------

        /* AKTUALIZUJ */

        JPanel panelAktualizacji = new JPanel(null);
        panelAktualizacji.setBounds(-3,178,150,100);
        panelAktualizacji.setBackground(new Color(141, 77, 89));
        panelAktualizacji.setVisible(false);
        panelAktualizacji.setBorder(obramowanie);
        poleDzialania.add(panelAktualizacji);

        JButton poleAktualizujDateWprowadzeniaOpcja = new JButton("DATE WPROWADZENIA");
        poleAktualizujDateWprowadzeniaOpcja.setBounds(0,3,147,47);
        poleAktualizujDateWprowadzeniaOpcja.setBackground(new Color(166, 105, 118));
        poleAktualizujDateWprowadzeniaOpcja.setFont(new Font("Arial",Font.BOLD,10));
        poleAktualizujDateWprowadzeniaOpcja.setBorder(empty);
        poleAktualizujDateWprowadzeniaOpcja.setVisible(true);
        panelAktualizacji.add(poleAktualizujDateWprowadzeniaOpcja);

        JButton poleAktualizujDateWaznosciDoOpcja = new JButton("DATE WAŻNOŚCI DO");
        poleAktualizujDateWaznosciDoOpcja.setBounds(0,50,147,47);
        poleAktualizujDateWaznosciDoOpcja.setBackground(new Color(157, 85, 100));
        poleAktualizujDateWaznosciDoOpcja.setFont(new Font("Arial",Font.BOLD,10));
        poleAktualizujDateWaznosciDoOpcja.setBorder(empty);
        poleAktualizujDateWaznosciDoOpcja.setVisible(true);
        panelAktualizacji.add(poleAktualizujDateWaznosciDoOpcja);

        JButton minimalizujAktualizuj = new JButton("‹");
        minimalizujAktualizuj.setBounds(147,178,15,30);
        minimalizujAktualizuj.setBackground(new Color(133, 75, 87));
        minimalizujAktualizuj.setFont(new Font("Arial",Font.BOLD,28));
        minimalizujAktualizuj.setBorder(empty);
        minimalizujAktualizuj.setToolTipText("ZAMKNIJ ZAKŁADKĘ");
        minimalizujAktualizuj.setVisible(false);
        poleDzialania.add(minimalizujAktualizuj);

        //-----------------------------------------------------------------------

        /* USUN */

        JPanel panelUsun = new JPanel(null);
        panelUsun.setBounds(-3,130,150,148);
        panelUsun.setBackground(new Color(141, 77, 89));
        panelUsun.setVisible(false);
        panelUsun.setBorder(obramowanie);
        poleDzialania.add(panelUsun);

        JButton przyciskUsunNotkeOpcja = new JButton("NOTATKĘ");
        przyciskUsunNotkeOpcja.setBounds(0,3,147,47);
        przyciskUsunNotkeOpcja.setBackground(new Color(166, 105, 118));
        przyciskUsunNotkeOpcja.setFont(new Font("Arial",Font.BOLD,10));
        przyciskUsunNotkeOpcja.setBorder(empty);
        przyciskUsunNotkeOpcja.setVisible(true);
        panelUsun.add(przyciskUsunNotkeOpcja);

        JButton przyciskUsunPoDacieWprowadzeniaOpcja = new JButton("PO DACIE WPROWADZENIA");
        przyciskUsunPoDacieWprowadzeniaOpcja.setBounds(0,50,147,47);
        przyciskUsunPoDacieWprowadzeniaOpcja.setBackground(new Color(157, 85, 100));
        przyciskUsunPoDacieWprowadzeniaOpcja.setFont(new Font("Arial",Font.BOLD,10));
        przyciskUsunPoDacieWprowadzeniaOpcja.setBorder(empty);
        przyciskUsunPoDacieWprowadzeniaOpcja.setVisible(true);
        panelUsun.add(przyciskUsunPoDacieWprowadzeniaOpcja);

        JButton przyciskUsunPoDacieWaznosciOpcja = new JButton("PO DACIE WAŻNOŚCI");
        przyciskUsunPoDacieWaznosciOpcja.setBounds(0,97,147,47);
        przyciskUsunPoDacieWaznosciOpcja.setBackground(new Color(166, 105, 118));
        przyciskUsunPoDacieWaznosciOpcja.setFont(new Font("Arial",Font.BOLD,10));
        przyciskUsunPoDacieWaznosciOpcja.setBorder(empty);
        przyciskUsunPoDacieWaznosciOpcja.setVisible(true);
        panelUsun.add(przyciskUsunPoDacieWaznosciOpcja);

        JButton minimalizujUsun = new JButton("‹");
        minimalizujUsun.setBounds(147,130,15,30);
        minimalizujUsun.setBackground(new Color(133, 75, 87));
        minimalizujUsun.setFont(new Font("Arial",Font.BOLD,28));
        minimalizujUsun.setBorder(empty);
        minimalizujUsun.setToolTipText("ZAMKNIJ ZAKŁADKĘ");
        minimalizujUsun.setVisible(false);
        poleDzialania.add(minimalizujUsun);

        //-----------------------------------------------------------------------

        /*RZECZY DO DODAWANIA NOTATKI*/

        JPanel tloDodajNotatke = new JPanel(null);
        tloDodajNotatke.setBounds(0,0,384,278);
        tloDodajNotatke.setBackground(new Color(168, 95, 109));
        tloDodajNotatke.setVisible(false);
        poleDzialania.add(tloDodajNotatke);

        JLabel tytulDodajNotatke = new JLabel("DODAJ NOTATKE");
        tytulDodajNotatke.setBounds(0,-20,384,100);
        tytulDodajNotatke.setHorizontalAlignment(JLabel.CENTER);
        tytulDodajNotatke.setFont(new Font("Arial",Font.ROMAN_BASELINE,22));
        tytulDodajNotatke.setVisible(true);
        tloDodajNotatke.add(tytulDodajNotatke);

        JLabel wartoscNapisNotatkaDodajNotke = new JLabel("PODAJ TREŚĆ NOTATKI :");
        wartoscNapisNotatkaDodajNotke.setBounds(9,17,300,100);
        wartoscNapisNotatkaDodajNotke.setFont(new Font("Arial",Font.ROMAN_BASELINE,18));
        wartoscNapisNotatkaDodajNotke.setVisible(true);
        tloDodajNotatke.add(wartoscNapisNotatkaDodajNotke);

        JTextArea wartoscNotatkaDodajNotke = new JTextArea();
        wartoscNotatkaDodajNotke.setBounds(10,77,362,50);
        wartoscNotatkaDodajNotke.setFont(new Font("Arial",Font.ITALIC,18));
        wartoscNotatkaDodajNotke.setOpaque(true);
        wartoscNotatkaDodajNotke.setLineWrap(true);
        wartoscNotatkaDodajNotke.setVisible(true);
        tloDodajNotatke.add(wartoscNotatkaDodajNotke);

        JLabel wartoscNapisDataWaznosciDoDodajNotke = new JLabel("PODAJ DATE WAŻNOŚCI NOTKI :");
        wartoscNapisDataWaznosciDoDodajNotke.setBounds(9,90,300,100);
        wartoscNapisDataWaznosciDoDodajNotke.setFont(new Font("Arial",Font.ROMAN_BASELINE,18));
        wartoscNapisDataWaznosciDoDodajNotke.setVisible(true);
        tloDodajNotatke.add(wartoscNapisDataWaznosciDoDodajNotke);

        JTextArea wartoscDataWaznosciDoDodajNotke = new JTextArea();
        wartoscDataWaznosciDoDodajNotke.setBounds(10,150,200,30);
        wartoscDataWaznosciDoDodajNotke.setFont(new Font("Arial",Font.ITALIC,18));
        wartoscDataWaznosciDoDodajNotke.setOpaque(true);
        wartoscDataWaznosciDoDodajNotke.setVisible(true);
        tloDodajNotatke.add(wartoscDataWaznosciDoDodajNotke);

        JLabel wartoscNapisDataWprowadzeniaDoDodajNotke = new JLabel("PODAJ DATE WPROWADZENIA NOTKI :");
        wartoscNapisDataWprowadzeniaDoDodajNotke.setBounds(9,150,350,100);
        wartoscNapisDataWprowadzeniaDoDodajNotke.setFont(new Font("Arial",Font.ROMAN_BASELINE,18));
        wartoscNapisDataWprowadzeniaDoDodajNotke.setVisible(true);
        tloDodajNotatke.add(wartoscNapisDataWprowadzeniaDoDodajNotke);

        JTextArea wartoscDataWprowadzeniaDoDodajNotke = new JTextArea();
        wartoscDataWprowadzeniaDoDodajNotke.setBounds(10,210,200,30);
        wartoscDataWprowadzeniaDoDodajNotke.setFont(new Font("Arial",Font.ITALIC,18));
        wartoscDataWprowadzeniaDoDodajNotke.setOpaque(true);
        wartoscDataWprowadzeniaDoDodajNotke.setVisible(true);
        tloDodajNotatke.add(wartoscDataWprowadzeniaDoDodajNotke);

        JButton dodajDodajNotke = new JButton("DODAJ NOTATKE");
        dodajDodajNotke.setBounds(230,225,135,30);
        dodajDodajNotke.setBackground(new Color(133, 75, 87));
        dodajDodajNotke.setFont(new Font("Arial",Font.BOLD,15));
        dodajDodajNotke.setBorder(empty);
        dodajDodajNotke.setToolTipText("DODAJ NOTATKE");
        dodajDodajNotke.setVisible(true);
        tloDodajNotatke.add(dodajDodajNotke);

        //-----------------------------------------------------------------------

        /* WYSZUKAJ NOTKE */

        JPanel tloWyszukajNotke = new JPanel(null);
        tloWyszukajNotke.setBounds(0,0,384,278);
        tloWyszukajNotke.setBackground(new Color(168, 95, 109));
        tloWyszukajNotke.setVisible(false);
        poleDzialania.add(tloWyszukajNotke);

        JLabel tytulWyszukajNotke = new JLabel("WYSZKUAJ NOTKE");
        tytulWyszukajNotke.setBounds(0,-20,384,100);
        tytulWyszukajNotke.setHorizontalAlignment(JLabel.CENTER);
        tytulWyszukajNotke.setFont(new Font("Arial",Font.ROMAN_BASELINE,22));
        tytulWyszukajNotke.setVisible(true);
        tloWyszukajNotke.add(tytulWyszukajNotke);

        JLabel wartoscNapisWyszukajNotke = new JLabel("PODAJ ZAWARTOŚĆ NOTKI :");
        wartoscNapisWyszukajNotke.setBounds(9,17,300,100);
        wartoscNapisWyszukajNotke.setFont(new Font("Arial",Font.ROMAN_BASELINE,18));
        wartoscNapisWyszukajNotke.setVisible(true);
        tloWyszukajNotke.add(wartoscNapisWyszukajNotke);

        JTextArea wartoscWyszukajNotke = new JTextArea();
        wartoscWyszukajNotke.setBounds(10,77,362,90);
        wartoscWyszukajNotke.setFont(new Font("Arial",Font.ITALIC,18));
        wartoscWyszukajNotke.setOpaque(true);
        wartoscWyszukajNotke.setVisible(true);
        tloWyszukajNotke.add(wartoscWyszukajNotke);

        JButton przyciskWyszukajNotke = new JButton("WYSZKUAJ NOTKE");
        przyciskWyszukajNotke.setBounds(120,180,150,30);
        przyciskWyszukajNotke.setBackground(new Color(133, 75, 87));
        przyciskWyszukajNotke.setFont(new Font("Arial",Font.BOLD,15));
        przyciskWyszukajNotke.setBorder(empty);
        przyciskWyszukajNotke.setToolTipText("DODAJ NOTATKE");
        przyciskWyszukajNotke.setVisible(true);
        tloWyszukajNotke.add(przyciskWyszukajNotke);

        //-----------------------------------------------------------------------

        /* WYSZKUAJ PO DACIE WPROWADZENIA */

        JPanel tloWyszukajPoDacieWprowadzenia = new JPanel(null);
        tloWyszukajPoDacieWprowadzenia.setBounds(0,0,384,278);
        tloWyszukajPoDacieWprowadzenia.setBackground(new Color(168, 95, 109));
        tloWyszukajPoDacieWprowadzenia.setVisible(false);
        poleDzialania.add(tloWyszukajPoDacieWprowadzenia);

        JLabel tytulWyszukajPoDacieWprowadzenia = new JLabel("WYSZKUAJ PO DACIE WPROWADZENIA");
        tytulWyszukajPoDacieWprowadzenia.setBounds(0,-20,384,100);
        tytulWyszukajPoDacieWprowadzenia.setHorizontalAlignment(JLabel.CENTER);
        tytulWyszukajPoDacieWprowadzenia.setFont(new Font("Arial",Font.ROMAN_BASELINE,19));
        tytulWyszukajPoDacieWprowadzenia.setVisible(true);
        tloWyszukajPoDacieWprowadzenia.add(tytulWyszukajPoDacieWprowadzenia);

        JLabel wartoscWyszukajNapisPoDacieWprowadzenia = new JLabel("PODAJ DATE WPROWADZENIA :");
        wartoscWyszukajNapisPoDacieWprowadzenia.setBounds(9,17,300,100);
        wartoscWyszukajNapisPoDacieWprowadzenia.setFont(new Font("Arial",Font.ROMAN_BASELINE,18));
        wartoscWyszukajNapisPoDacieWprowadzenia.setVisible(true);
        tloWyszukajPoDacieWprowadzenia.add(wartoscWyszukajNapisPoDacieWprowadzenia);

        JTextArea wartoscWyszukajPoDacieWprowadzenia= new JTextArea();
        wartoscWyszukajPoDacieWprowadzenia.setBounds(10,80,200,30);
        wartoscWyszukajPoDacieWprowadzenia.setFont(new Font("Arial",Font.ITALIC,18));
        wartoscWyszukajPoDacieWprowadzenia.setOpaque(true);
        wartoscWyszukajPoDacieWprowadzenia.setVisible(true);
        tloWyszukajPoDacieWprowadzenia.add(wartoscWyszukajPoDacieWprowadzenia);

        JButton przyciskWyszukajPoDacieWprowadzenia = new JButton("WYSZKUAJ");
        przyciskWyszukajPoDacieWprowadzenia.setBounds(120,130,150,30);
        przyciskWyszukajPoDacieWprowadzenia.setBackground(new Color(133, 75, 87));
        przyciskWyszukajPoDacieWprowadzenia.setFont(new Font("Arial",Font.BOLD,15));
        przyciskWyszukajPoDacieWprowadzenia.setBorder(empty);
        przyciskWyszukajPoDacieWprowadzenia.setToolTipText("DODAJ NOTATKE");
        przyciskWyszukajPoDacieWprowadzenia.setVisible(true);
        tloWyszukajPoDacieWprowadzenia.add(przyciskWyszukajPoDacieWprowadzenia);


        //-----------------------------------------------------------------------
        /* WYSZKUAJ PO DACIE WAŻNOŚCI */

        JPanel tloPoDacieWaznosci = new JPanel(null);
        tloPoDacieWaznosci.setBounds(0,0,384,278);
        tloPoDacieWaznosci.setBackground(new Color(168, 95, 109));
        tloPoDacieWaznosci.setVisible(false);
        poleDzialania.add(tloPoDacieWaznosci);

        JLabel tytulPoDacieWaznosci = new JLabel("WYSZKUAJ PO DACIE WAŻNOŚCI");
        tytulPoDacieWaznosci.setBounds(0,-20,384,100);
        tytulPoDacieWaznosci.setHorizontalAlignment(JLabel.CENTER);
        tytulPoDacieWaznosci.setFont(new Font("Arial",Font.ROMAN_BASELINE,19));
        tytulPoDacieWaznosci.setVisible(true);
        tloPoDacieWaznosci.add(tytulPoDacieWaznosci);

        JLabel wartoscNapisPoDacieWaznosci = new JLabel("PODAJ DATE WAŻNOŚCI :");
        wartoscNapisPoDacieWaznosci.setBounds(9,17,300,100);
        wartoscNapisPoDacieWaznosci.setFont(new Font("Arial",Font.ROMAN_BASELINE,18));
        wartoscNapisPoDacieWaznosci.setVisible(true);
        tloPoDacieWaznosci.add(wartoscNapisPoDacieWaznosci);

        JTextArea wartoscPoDacieWaznosci= new JTextArea();
        wartoscPoDacieWaznosci.setBounds(10,80,200,30);
        wartoscPoDacieWaznosci.setFont(new Font("Arial",Font.ITALIC,18));
        wartoscPoDacieWaznosci.setOpaque(true);
        wartoscPoDacieWaznosci.setVisible(true);
        tloPoDacieWaznosci.add(wartoscPoDacieWaznosci);

        JButton przyciskPoDacieWaznosci = new JButton("WYSZKUAJ");
        przyciskPoDacieWaznosci.setBounds(120,130,150,30);
        przyciskPoDacieWaznosci.setBackground(new Color(133, 75, 87));
        przyciskPoDacieWaznosci.setFont(new Font("Arial",Font.BOLD,15));
        przyciskPoDacieWaznosci.setBorder(empty);
        przyciskPoDacieWaznosci.setToolTipText("DODAJ NOTATKE");
        przyciskPoDacieWaznosci.setVisible(true);
        tloPoDacieWaznosci.add(przyciskPoDacieWaznosci);

        //-----------------------------------------------------------------------

        /* USUWANIE NOTKI */

        JPanel tloUsunNotke = new JPanel(null);
        tloUsunNotke.setBounds(0,0,384,278);
        tloUsunNotke.setBackground(new Color(168, 95, 109));
        tloUsunNotke.setVisible(false);
        poleDzialania.add(tloUsunNotke);

        JLabel tytulUsunNotke = new JLabel("USUN NOTKE");
        tytulUsunNotke.setBounds(0,-20,384,100);
        tytulUsunNotke.setHorizontalAlignment(JLabel.CENTER);
        tytulUsunNotke.setFont(new Font("Arial",Font.ROMAN_BASELINE,22));
        tytulUsunNotke.setVisible(true);
        tloUsunNotke.add(tytulUsunNotke);

        JLabel wartoscNapisUsunNotke = new JLabel("PODAJ ZAWARTOŚĆ NOTKI :");
        wartoscNapisUsunNotke.setBounds(9,17,300,100);
        wartoscNapisUsunNotke.setFont(new Font("Arial",Font.ROMAN_BASELINE,18));
        wartoscNapisUsunNotke.setVisible(true);
        tloUsunNotke.add(wartoscNapisUsunNotke);

        JTextArea wartoscUsunNotke = new JTextArea();
        wartoscUsunNotke.setBounds(10,77,362,90);
        wartoscUsunNotke.setFont(new Font("Arial",Font.ITALIC,18));
        wartoscUsunNotke.setOpaque(true);
        wartoscUsunNotke.setVisible(true);
        tloUsunNotke.add(wartoscUsunNotke);

        JButton przyciskUsunNotke = new JButton("USUN NOTKE");
        przyciskUsunNotke.setBounds(120,180,150,30);
        przyciskUsunNotke.setBackground(new Color(133, 75, 87));
        przyciskUsunNotke.setFont(new Font("Arial",Font.BOLD,15));
        przyciskUsunNotke.setBorder(empty);
        przyciskUsunNotke.setToolTipText("USUN NOTATKE");
        przyciskUsunNotke.setVisible(true);
        tloUsunNotke.add(przyciskUsunNotke);

        //-----------------------------------------------------------------------

        /* USUN NOTKI PO DACIE WPROWADZENIA */

        JPanel tloUsunPoDacieWprowadzenia = new JPanel(null);
        tloUsunPoDacieWprowadzenia.setBounds(0,0,384,278);
        tloUsunPoDacieWprowadzenia.setBackground(new Color(168, 95, 109));
        tloUsunPoDacieWprowadzenia.setVisible(false);
        poleDzialania.add(tloUsunPoDacieWprowadzenia);

        JLabel tytulUsunPoDacieWprowadzenia = new JLabel("USUN PO DACIE WPROWADZENIA");
        tytulUsunPoDacieWprowadzenia.setBounds(0,-20,384,100);
        tytulUsunPoDacieWprowadzenia.setHorizontalAlignment(JLabel.CENTER);
        tytulUsunPoDacieWprowadzenia.setFont(new Font("Arial",Font.ROMAN_BASELINE,19));
        tytulUsunPoDacieWprowadzenia.setVisible(true);
        tloUsunPoDacieWprowadzenia.add(tytulUsunPoDacieWprowadzenia);

        JLabel wartoscUsunNapisPoDacieWprowadzenia = new JLabel("PODAJ DATE WPROWADZENIA :");
        wartoscUsunNapisPoDacieWprowadzenia.setBounds(9,17,300,100);
        wartoscUsunNapisPoDacieWprowadzenia.setFont(new Font("Arial",Font.ROMAN_BASELINE,18));
        wartoscUsunNapisPoDacieWprowadzenia.setVisible(true);
        tloUsunPoDacieWprowadzenia.add(wartoscUsunNapisPoDacieWprowadzenia);

        JTextArea wartoscUsunPoDacieWprowadzenia= new JTextArea();
        wartoscUsunPoDacieWprowadzenia.setBounds(10,80,200,30);
        wartoscUsunPoDacieWprowadzenia.setFont(new Font("Arial",Font.ITALIC,18));
        wartoscUsunPoDacieWprowadzenia.setOpaque(true);
        wartoscUsunPoDacieWprowadzenia.setVisible(true);
        tloUsunPoDacieWprowadzenia.add(wartoscUsunPoDacieWprowadzenia);

        JButton przyciskUsunPoDacieWprowadzenia = new JButton("USUN NOTATKE");
        przyciskUsunPoDacieWprowadzenia.setBounds(120,130,150,30);
        przyciskUsunPoDacieWprowadzenia.setBackground(new Color(133, 75, 87));
        przyciskUsunPoDacieWprowadzenia.setFont(new Font("Arial",Font.BOLD,15));
        przyciskUsunPoDacieWprowadzenia.setBorder(empty);
        przyciskUsunPoDacieWprowadzenia.setToolTipText("USUN NOTATKE");
        przyciskUsunPoDacieWprowadzenia.setVisible(true);
        tloUsunPoDacieWprowadzenia.add(przyciskUsunPoDacieWprowadzenia);

        //-----------------------------------------------------------------------

        /* USUN NOTATKE PO DACIE WAŻNOŚCI */

        JPanel tloUsunPoDacieWaznosci = new JPanel(null);
        tloUsunPoDacieWaznosci.setBounds(0,0,384,278);
        tloUsunPoDacieWaznosci.setBackground(new Color(168, 95, 109));
        tloUsunPoDacieWaznosci.setVisible(false);
        poleDzialania.add(tloUsunPoDacieWaznosci);

        JLabel tytulUsunPoDacieWaznosci = new JLabel("USUN PO DACIE WAŻNOŚCI");
        tytulUsunPoDacieWaznosci.setBounds(0,-20,384,100);
        tytulUsunPoDacieWaznosci.setHorizontalAlignment(JLabel.CENTER);
        tytulUsunPoDacieWaznosci.setFont(new Font("Arial",Font.ROMAN_BASELINE,19));
        tytulUsunPoDacieWaznosci.setVisible(true);
        tloUsunPoDacieWaznosci.add(tytulUsunPoDacieWaznosci);

        JLabel wartoscUsunNapisPoDacieWaznosci = new JLabel("PODAJ DATE WAŻNOŚCI :");
        wartoscUsunNapisPoDacieWaznosci.setBounds(9,17,300,100);
        wartoscUsunNapisPoDacieWaznosci.setFont(new Font("Arial",Font.ROMAN_BASELINE,18));
        wartoscUsunNapisPoDacieWaznosci.setVisible(true);
        tloUsunPoDacieWaznosci.add(wartoscUsunNapisPoDacieWaznosci);

        JTextArea wartoscUsunPoDacieWaznosci= new JTextArea();
        wartoscUsunPoDacieWaznosci.setBounds(10,80,200,30);
        wartoscUsunPoDacieWaznosci.setFont(new Font("Arial",Font.ITALIC,18));
        wartoscUsunPoDacieWaznosci.setOpaque(true);
        wartoscUsunPoDacieWaznosci.setVisible(true);
        tloUsunPoDacieWaznosci.add(wartoscUsunPoDacieWaznosci);

        JButton przyciskUsunPoDacieWaznosci = new JButton("USUN NOTATKE");
        przyciskUsunPoDacieWaznosci.setBounds(120,130,150,30);
        przyciskUsunPoDacieWaznosci.setBackground(new Color(133, 75, 87));
        przyciskUsunPoDacieWaznosci.setFont(new Font("Arial",Font.BOLD,15));
        przyciskUsunPoDacieWaznosci.setBorder(empty);
        przyciskUsunPoDacieWaznosci.setToolTipText("DODAJ NOTATKE");
        przyciskUsunPoDacieWaznosci.setVisible(true);
        tloUsunPoDacieWaznosci.add(przyciskUsunPoDacieWaznosci);

        //-----------------------------------------------------------------------

        /* AKTUALIZUJ PO DACIE WPROWADZENIA */

        JPanel tloAktualizujPoDacieWprowadzenia = new JPanel(null);
        tloAktualizujPoDacieWprowadzenia.setBounds(0,0,384,278);
        tloAktualizujPoDacieWprowadzenia.setBackground(new Color(168, 95, 109));
        tloAktualizujPoDacieWprowadzenia.setVisible(false);
        poleDzialania.add(tloAktualizujPoDacieWprowadzenia);

        JLabel tytulAktualizujPoDacieWprowadzenia = new JLabel("AKTUALIZUJ PO DACIE WPROWADZENIA");
        tytulAktualizujPoDacieWprowadzenia.setBounds(0,-20,384,100);
        tytulAktualizujPoDacieWprowadzenia.setHorizontalAlignment(JLabel.CENTER);
        tytulAktualizujPoDacieWprowadzenia.setFont(new Font("Arial",Font.ROMAN_BASELINE,19));
        tytulAktualizujPoDacieWprowadzenia.setVisible(true);
        tloAktualizujPoDacieWprowadzenia.add(tytulAktualizujPoDacieWprowadzenia);

        JLabel wartoscAktualizujNapisPoDacieWprowadzenia = new JLabel("PODAJ DATE WPROWADZENIA :");
        wartoscAktualizujNapisPoDacieWprowadzenia.setBounds(9,17,300,100);
        wartoscAktualizujNapisPoDacieWprowadzenia.setFont(new Font("Arial",Font.ROMAN_BASELINE,18));
        wartoscAktualizujNapisPoDacieWprowadzenia.setVisible(true);
        tloAktualizujPoDacieWprowadzenia.add(wartoscAktualizujNapisPoDacieWprowadzenia);

        JTextArea wartoscAktualizujPoDacieWprowadzenia= new JTextArea();
        wartoscAktualizujPoDacieWprowadzenia.setBounds(10,80,200,30);
        wartoscAktualizujPoDacieWprowadzenia.setFont(new Font("Arial",Font.ITALIC,18));
        wartoscAktualizujPoDacieWprowadzenia.setOpaque(true);
        wartoscAktualizujPoDacieWprowadzenia.setVisible(true);
        tloAktualizujPoDacieWprowadzenia.add(wartoscAktualizujPoDacieWprowadzenia);

        JButton przyciskAktualizujPoDacieWprowadzenia = new JButton("AKTUALIZUJ");
        przyciskAktualizujPoDacieWprowadzenia.setBounds(120,130,150,30);
        przyciskAktualizujPoDacieWprowadzenia.setBackground(new Color(133, 75, 87));
        przyciskAktualizujPoDacieWprowadzenia.setFont(new Font("Arial",Font.BOLD,15));
        przyciskAktualizujPoDacieWprowadzenia.setBorder(empty);
        przyciskAktualizujPoDacieWprowadzenia.setToolTipText("AKTUALIZUJ");
        przyciskAktualizujPoDacieWprowadzenia.setVisible(true);
        tloAktualizujPoDacieWprowadzenia.add(przyciskAktualizujPoDacieWprowadzenia);

        //-----------------------------------------------------------------------

        /* AKTUALIZUJ PO DACIE WAŻNOŚCI */

        JPanel tloAktualizujPoDacieWaznosci = new JPanel(null);
        tloAktualizujPoDacieWaznosci.setBounds(0,0,384,278);
        tloAktualizujPoDacieWaznosci.setBackground(new Color(168, 95, 109));
        tloAktualizujPoDacieWaznosci.setVisible(false);
        poleDzialania.add(tloAktualizujPoDacieWaznosci);

        JLabel tytulAktualizujPoDacieWaznosci = new JLabel("AKTUALIZUJ PO DACIE WAŻNOŚCI");
        tytulAktualizujPoDacieWaznosci.setBounds(0,-20,384,100);
        tytulAktualizujPoDacieWaznosci.setHorizontalAlignment(JLabel.CENTER);
        tytulAktualizujPoDacieWaznosci.setFont(new Font("Arial",Font.ROMAN_BASELINE,19));
        tytulAktualizujPoDacieWaznosci.setVisible(true);
        tloAktualizujPoDacieWaznosci.add(tytulAktualizujPoDacieWaznosci);

        JLabel wartoscAktualizujNapisPoDacieWaznosci = new JLabel("PODAJ DATE WAŻNOŚCI :");
        wartoscAktualizujNapisPoDacieWaznosci.setBounds(9,17,300,100);
        wartoscAktualizujNapisPoDacieWaznosci.setFont(new Font("Arial",Font.ROMAN_BASELINE,18));
        wartoscAktualizujNapisPoDacieWaznosci.setVisible(true);
        tloAktualizujPoDacieWaznosci.add(wartoscAktualizujNapisPoDacieWaznosci);

        JTextArea wartoscAktualizujPoDacieWaznosci= new JTextArea();
        wartoscAktualizujPoDacieWaznosci.setBounds(10,80,200,30);
        wartoscAktualizujPoDacieWaznosci.setFont(new Font("Arial",Font.ITALIC,18));
        wartoscAktualizujPoDacieWaznosci.setOpaque(true);
        wartoscAktualizujPoDacieWaznosci.setVisible(true);
        tloAktualizujPoDacieWaznosci.add(wartoscAktualizujPoDacieWaznosci);

        JButton przyciskAktualizujPoDacieWaznosci = new JButton("AKTUALIZUJ");
        przyciskAktualizujPoDacieWaznosci.setBounds(120,130,150,30);
        przyciskAktualizujPoDacieWaznosci.setBackground(new Color(133, 75, 87));
        przyciskAktualizujPoDacieWaznosci.setFont(new Font("Arial",Font.BOLD,15));
        przyciskAktualizujPoDacieWaznosci.setBorder(empty);
        przyciskAktualizujPoDacieWaznosci.setToolTipText("AKTUALIZUJ");
        przyciskAktualizujPoDacieWaznosci.setVisible(true);
        tloAktualizujPoDacieWaznosci.add(przyciskAktualizujPoDacieWaznosci);

        //-----------------------------------------------------------------------

        info.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                panelInformacja.setVisible(true);

                infoPrzycisk.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        panelInformacja.setVisible(false);

                    }
                });

            }
        });

        //-----------------------------------------------------------------------

        polaczZBaza.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                panelAktualizacji.setVisible(false);
                minimalizujAktualizuj.setVisible(false);

                minimalizujUsun.setVisible(false);
                panelUsun.setVisible(false);

                panelWyszukaj.setVisible(false);
                minimalizujWyszukaj.setVisible(false);

                try{

                    polaczenie.polaczenieZBaza();

                }catch(SQLException ec){
                    throw new RuntimeException(ec);
                }

            }
        });

        //-----------------------------------------------------------------------

        dodajPrzycisk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                panelAktualizacji.setVisible(false);
                minimalizujAktualizuj.setVisible(false);

                minimalizujUsun.setVisible(false);
                panelUsun.setVisible(false);

                panelWyszukaj.setVisible(false);
                minimalizujWyszukaj.setVisible(false);

                tloWyszukajNotke.setVisible(false);
                tloDodajNotatke.setVisible(true);
                tloWyszukajPoDacieWprowadzenia.setVisible(false);
                tloPoDacieWaznosci.setVisible(false);
                tloUsunNotke.setVisible(false);
                tloUsunPoDacieWprowadzenia.setVisible(false);
                tloUsunPoDacieWaznosci.setVisible(false);
                tloAktualizujPoDacieWprowadzenia.setVisible(false);
                tloAktualizujPoDacieWaznosci.setVisible(false);

            }
        });

        dodajDodajNotke.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String wartoscNotki = wartoscNotatkaDodajNotke.getText();
                String wartoscWaznosciNotki = wartoscDataWaznosciDoDodajNotke.getText();
                String wartoscDatyWprowadzeniaNotki = wartoscDataWprowadzeniaDoDodajNotke.getText();

                baza.dodajNotatke(wartoscNotki,wartoscDatyWprowadzeniaNotki,wartoscWaznosciNotki);

                System.out.println("dodano");

                wartoscNotatkaDodajNotke.setText("");
                wartoscDataWaznosciDoDodajNotke.setText("");

            }
        });

        //-----------------------------------------------------------------------

        wyszukajPrzycisk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                panelWyszukaj.setVisible(true);
                minimalizujWyszukaj.setVisible(true);

                panelAktualizacji.setVisible(false);
                minimalizujAktualizuj.setVisible(false);

                minimalizujUsun.setVisible(false);
                panelUsun.setVisible(false);

                minimalizujWyszukaj.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        panelWyszukaj.setVisible(false);
                        minimalizujWyszukaj.setVisible(false);

                    }
                });

            }
        });

        przyciskWyszukajNotkeOpcja.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tloWyszukajNotke.setVisible(true);
                tloDodajNotatke.setVisible(false);
                tloWyszukajPoDacieWprowadzenia.setVisible(false);
                tloPoDacieWaznosci.setVisible(false);
                tloUsunNotke.setVisible(false);
                tloUsunPoDacieWprowadzenia.setVisible(false);
                tloUsunPoDacieWaznosci.setVisible(false);
                tloAktualizujPoDacieWprowadzenia.setVisible(false);
                tloAktualizujPoDacieWaznosci.setVisible(false);

                przyciskWyszukajNotke.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {


                    }
                });

                panelWyszukaj.setVisible(false);
                panelAktualizacji.setVisible(false);
                panelUsun.setVisible(false);

                minimalizujWyszukaj.setVisible(false);
                minimalizujUsun.setVisible(false);
                minimalizujAktualizuj.setVisible(false);

            }
        });

        przyciskWyszukajPoDacieWprowadzeniaOpcja.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tloWyszukajNotke.setVisible(false);
                tloDodajNotatke.setVisible(false);
                tloWyszukajPoDacieWprowadzenia.setVisible(true);
                tloPoDacieWaznosci.setVisible(false);
                tloUsunNotke.setVisible(false);
                tloUsunPoDacieWprowadzenia.setVisible(false);
                tloUsunPoDacieWaznosci.setVisible(false);
                tloAktualizujPoDacieWprowadzenia.setVisible(false);
                tloAktualizujPoDacieWaznosci.setVisible(false);

                panelWyszukaj.setVisible(false);
                panelAktualizacji.setVisible(false);
                panelUsun.setVisible(false);

                minimalizujWyszukaj.setVisible(false);
                minimalizujUsun.setVisible(false);
                minimalizujAktualizuj.setVisible(false);

                przyciskWyszukajPoDacieWprowadzenia.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        wartoscWyszukajPoDacieWprowadzenia.setText("");

                    }
                });

            }
        });

        przyciskWyszukajPoDacieWaznosciOpcja.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tloWyszukajNotke.setVisible(false);
                tloDodajNotatke.setVisible(false);
                tloWyszukajPoDacieWprowadzenia.setVisible(false);
                tloPoDacieWaznosci.setVisible(true);
                tloUsunNotke.setVisible(false);
                tloUsunPoDacieWprowadzenia.setVisible(false);
                tloUsunPoDacieWaznosci.setVisible(false);
                tloAktualizujPoDacieWprowadzenia.setVisible(false);
                tloAktualizujPoDacieWaznosci.setVisible(false);

                panelWyszukaj.setVisible(false);
                panelAktualizacji.setVisible(false);
                panelUsun.setVisible(false);

                minimalizujWyszukaj.setVisible(false);
                minimalizujUsun.setVisible(false);
                minimalizujAktualizuj.setVisible(false);

            }
        });

        //-----------------------------------------------------------------------

        aktualizujPrzycisk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                panelAktualizacji.setVisible(true);
                minimalizujAktualizuj.setVisible(true);

                minimalizujUsun.setVisible(false);
                panelUsun.setVisible(false);

                panelWyszukaj.setVisible(false);
                minimalizujWyszukaj.setVisible(false);

                minimalizujAktualizuj.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        panelAktualizacji.setVisible(false);
                        minimalizujAktualizuj.setVisible(false);

                    }
                });

            }
        });

        //-----------------------------------------------------------------------

        usunPrzycisk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                panelUsun.setVisible(true);
                minimalizujUsun.setVisible(true);

                panelAktualizacji.setVisible(false);
                minimalizujAktualizuj.setVisible(false);

                panelWyszukaj.setVisible(false);
                minimalizujWyszukaj.setVisible(false);

                minimalizujUsun.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        minimalizujUsun.setVisible(false);
                        panelUsun.setVisible(false);

                    }
                });

            }
        });

        przyciskUsunNotkeOpcja.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                panelWyszukaj.setVisible(false);
                panelAktualizacji.setVisible(false);
                panelUsun.setVisible(false);

                minimalizujWyszukaj.setVisible(false);
                minimalizujUsun.setVisible(false);
                minimalizujAktualizuj.setVisible(false);

                tloWyszukajNotke.setVisible(false);
                tloDodajNotatke.setVisible(false);
                tloWyszukajPoDacieWprowadzenia.setVisible(false);
                tloPoDacieWaznosci.setVisible(false);
                tloUsunNotke.setVisible(true);
                tloUsunPoDacieWprowadzenia.setVisible(false);
                tloUsunPoDacieWaznosci.setVisible(false);
                tloAktualizujPoDacieWprowadzenia.setVisible(false);
                tloAktualizujPoDacieWaznosci.setVisible(false);

                przyciskUsunNotke.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        wartoscUsunNotke.setText("");

                    }
                });

            }
        });

        przyciskUsunPoDacieWprowadzeniaOpcja.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                panelWyszukaj.setVisible(false);
                panelAktualizacji.setVisible(false);
                panelUsun.setVisible(false);

                minimalizujWyszukaj.setVisible(false);
                minimalizujUsun.setVisible(false);
                minimalizujAktualizuj.setVisible(false);

                tloWyszukajNotke.setVisible(false);
                tloDodajNotatke.setVisible(false);
                tloWyszukajPoDacieWprowadzenia.setVisible(false);
                tloPoDacieWaznosci.setVisible(false);
                tloUsunNotke.setVisible(false);
                tloUsunPoDacieWprowadzenia.setVisible(true);
                tloUsunPoDacieWaznosci.setVisible(false);
                tloAktualizujPoDacieWprowadzenia.setVisible(false);
                tloAktualizujPoDacieWaznosci.setVisible(false);

                przyciskUsunNotke.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        wartoscUsunPoDacieWprowadzenia.setText("");

                    }
                });

            }
        });

        przyciskUsunPoDacieWaznosciOpcja.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                panelWyszukaj.setVisible(false);
                panelAktualizacji.setVisible(false);
                panelUsun.setVisible(false);

                minimalizujWyszukaj.setVisible(false);
                minimalizujUsun.setVisible(false);
                minimalizujAktualizuj.setVisible(false);

                tloWyszukajNotke.setVisible(false);
                tloDodajNotatke.setVisible(false);
                tloWyszukajPoDacieWprowadzenia.setVisible(false);
                tloPoDacieWaznosci.setVisible(false);
                tloUsunNotke.setVisible(false);
                tloUsunPoDacieWprowadzenia.setVisible(false);
                tloUsunPoDacieWaznosci.setVisible(true);
                tloAktualizujPoDacieWprowadzenia.setVisible(false);
                tloAktualizujPoDacieWaznosci.setVisible(false);

                przyciskUsunNotke.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        wartoscUsunPoDacieWaznosci.setText("");

                    }
                });

            }
        });

        //-----------------------------------------------------------------------

        poleAktualizujDateWprowadzeniaOpcja.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                panelWyszukaj.setVisible(false);
                panelAktualizacji.setVisible(false);
                panelUsun.setVisible(false);

                minimalizujWyszukaj.setVisible(false);
                minimalizujUsun.setVisible(false);
                minimalizujAktualizuj.setVisible(false);

                tloWyszukajNotke.setVisible(false);
                tloDodajNotatke.setVisible(false);
                tloWyszukajPoDacieWprowadzenia.setVisible(false);
                tloPoDacieWaznosci.setVisible(false);
                tloUsunNotke.setVisible(false);
                tloUsunPoDacieWprowadzenia.setVisible(false);
                tloUsunPoDacieWaznosci.setVisible(false);
                tloAktualizujPoDacieWprowadzenia.setVisible(true);
                tloAktualizujPoDacieWaznosci.setVisible(false);

                przyciskUsunNotke.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        wartoscAktualizujPoDacieWprowadzenia.setText("");

                    }
                });

            }
        });

        poleAktualizujDateWaznosciDoOpcja.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                panelWyszukaj.setVisible(false);
                panelAktualizacji.setVisible(false);
                panelUsun.setVisible(false);

                minimalizujWyszukaj.setVisible(false);
                minimalizujUsun.setVisible(false);
                minimalizujAktualizuj.setVisible(false);

                tloWyszukajNotke.setVisible(false);
                tloDodajNotatke.setVisible(false);
                tloWyszukajPoDacieWprowadzenia.setVisible(false);
                tloPoDacieWaznosci.setVisible(false);
                tloUsunNotke.setVisible(false);
                tloUsunPoDacieWprowadzenia.setVisible(false);
                tloUsunPoDacieWaznosci.setVisible(false);
                tloAktualizujPoDacieWprowadzenia.setVisible(false);
                tloAktualizujPoDacieWaznosci.setVisible(true);

                przyciskUsunNotke.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        wartoscAktualizujPoDacieWaznosci.setText("");

                    }
                });

            }
        });

        //-----------------------------------------------------------------------

        return grafika;
    }

    public projekt() {

        JFrame frame = new JFrame("ZARZĄDZANIE NOTATKAMI");
        frame.setContentPane(createContentPane());
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ikona.png")));
        frame.setSize(600, 400);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);

    }

}
