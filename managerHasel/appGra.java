/** aSzymon - gtihub */

package managerHasel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * klasa appGra zwraca czesc graficzna jak i dzialanie programu
 * @author aSzymon
 * */

public class appGra {

    sql sqlZapytania = new sql();
    menu menu = new menu();
    Connection connection;

    /**
     * klasa createContentPane odpowiada za czesc graficzna kodu
     * @author aSzymon
     * */

    public JPanel createContentPane() {
        JPanel okno = new JPanel();

        JPanel tlo = new JPanel(null);
        tlo.setBounds(0, 0, 250, 350);
        tlo.setBackground(new Color(206, 161, 171, 255));
        okno.add(tlo);

        /* USUN WPIS */

        JLabel usunNapis = new JLabel("USUN");
        usunNapis.setBounds(90,15,60,20);
        usunNapis.setFont(new Font("Arial",Font.BOLD,20));
        usunNapis.setVisible(false);
        tlo.add(usunNapis);

        JPanel podzielenieUsun1 = new JPanel(null);
        podzielenieUsun1.setBounds(10,45,210,3);
        podzielenieUsun1.setBackground(Color.DARK_GRAY);
        podzielenieUsun1.setVisible(false);
        tlo.add(podzielenieUsun1);

        JLabel usunLogin = new JLabel("LOGIN");
        usunLogin.setBounds(85,60,150,20);
        usunLogin.setFont(new Font("Arial",Font.BOLD,20));
        usunLogin.setVisible(false);
        tlo.add(usunLogin);

        JTextArea usunLoginPole = new JTextArea();
        usunLoginPole.setBounds(30,90,170,25);
        usunLoginPole.setFont(new Font("Arial",Font.BOLD,20));
        usunLoginPole.setVisible(false);
        tlo.add(usunLoginPole);

        JButton usunLoginPrzycisk = new JButton("USUN");
        usunLoginPrzycisk.setBounds(70,125,90,25);
        usunLoginPrzycisk.setFont(new Font("Arial",Font.BOLD,16));
        usunLoginPrzycisk.setVisible(false);
        tlo.add(usunLoginPrzycisk);

        JPanel podzielenieUsun2 = new JPanel(null);
        podzielenieUsun2.setBounds(10,160,210,2);
        podzielenieUsun2.setBackground(Color.DARK_GRAY);
        podzielenieUsun2.setVisible(false);
        tlo.add(podzielenieUsun2);

        JLabel usunPassword = new JLabel("PASSWORD");
        usunPassword.setBounds(60,175,150,20);
        usunPassword.setFont(new Font("Arial",Font.BOLD,20));
        usunPassword.setVisible(false);
        tlo.add(usunPassword);

        JTextArea usunPasswordPole = new JTextArea();
        usunPasswordPole.setBounds(30,205,170,25);
        usunPasswordPole.setFont(new Font("Arial",Font.BOLD,20));
        usunPasswordPole.setVisible(false);
        tlo.add(usunPasswordPole);

        JButton usunPasswordPrzycisk = new JButton("USUN");
        usunPasswordPrzycisk.setBounds(70,240,90,25);
        usunPasswordPrzycisk.setFont(new Font("Arial",Font.BOLD,16));
        usunPasswordPrzycisk.setVisible(false);
        tlo.add(usunPasswordPrzycisk);

        /* NOWY WPIS */

        JLabel nowyWpisLogin = new JLabel("LOGIN* :");
        nowyWpisLogin.setBounds(90,10,100,40);
        nowyWpisLogin.setFont(new Font("Arial",Font.BOLD,16));
        nowyWpisLogin.setVisible(false);
        tlo.add(nowyWpisLogin);

        JTextArea nowyWpisPoleLogin = new JTextArea();
        nowyWpisPoleLogin.setBounds(45,50,140,30);
        nowyWpisPoleLogin.setFont(new Font("Arial",Font.BOLD,20));
        nowyWpisPoleLogin.setVisible(false);
        tlo.add(nowyWpisPoleLogin);

        JLabel nowyWpisPassword = new JLabel("PASSWORD* :");
        nowyWpisPassword.setBounds(65,80,140,40);
        nowyWpisPassword.setFont(new Font("Arial",Font.BOLD,16));
        nowyWpisPassword.setVisible(false);
        tlo.add(nowyWpisPassword);

        JTextArea nowyWpisPolePassword = new JTextArea();
        nowyWpisPolePassword.setBounds(45,120,140,30);
        nowyWpisPolePassword.setFont(new Font("Arial",Font.BOLD,20));
        nowyWpisPolePassword.setVisible(false);
        tlo.add(nowyWpisPolePassword);

        JLabel nowyWpisURL = new JLabel("URL :");
        nowyWpisURL.setBounds(100,150,100,40);
        nowyWpisURL.setFont(new Font("Arial",Font.BOLD,16));
        nowyWpisURL.setVisible(false);
        tlo.add(nowyWpisURL);

        JTextArea nowyWpisPoleURL = new JTextArea();
        nowyWpisPoleURL.setBounds(45,190,140,30);
        nowyWpisPoleURL.setFont(new Font("Arial",Font.BOLD,20));
        nowyWpisPoleURL.setVisible(false);
        tlo.add(nowyWpisPoleURL);

        JButton nowyWpisPrzycisk = new JButton("DODAJ");
        nowyWpisPrzycisk.setBounds(70,240,90,30);
        nowyWpisPrzycisk.setFont(new Font("Arial",Font.BOLD,15));
        nowyWpisPrzycisk.setVisible(false);
        tlo.add(nowyWpisPrzycisk);

        /* WG LOGIN */

        JLabel wgLoginu = new JLabel("SZUKAJ WEDLUG LOGINU");
        wgLoginu.setBounds(15,10,250,40);
        wgLoginu.setFont(new Font("Arial",Font.BOLD,16));
        wgLoginu.setVisible(false);
        tlo.add(wgLoginu);

        JTextArea wgLoginuPole = new JTextArea();
        wgLoginuPole.setBounds(45,55,140,30);
        wgLoginuPole.setFont(new Font("Arial",Font.BOLD,20));
        wgLoginuPole.setVisible(false);
        tlo.add(wgLoginuPole);

        JButton wgLoginuPrzycisk = new JButton("SZUKAJ");
        wgLoginuPrzycisk.setBounds(60,100,110,30);
        wgLoginuPrzycisk.setFont(new Font("Arial",Font.BOLD,15));
        wgLoginuPrzycisk.setVisible(false);
        tlo.add(wgLoginuPrzycisk);

        /* WG ADRESU */

        JLabel wgAdresu = new JLabel("SZUKAJ WEDLUG ADRESU");
        wgAdresu.setBounds(10,10,250,40);
        wgAdresu.setFont(new Font("Arial",Font.BOLD,16));
        wgAdresu.setVisible(false);
        tlo.add(wgAdresu);

        JTextArea wgAdresuPole = new JTextArea();
        wgAdresuPole.setBounds(45,55,140,30);
        wgAdresuPole.setFont(new Font("Arial",Font.BOLD,20));
        wgAdresuPole.setVisible(false);
        tlo.add(wgAdresuPole);

        JButton wgAdresuPrzycisk = new JButton("SZUKAJ");
        wgAdresuPrzycisk.setBounds(60,100,110,30);
        wgAdresuPrzycisk.setFont(new Font("Arial",Font.BOLD,15));
        wgAdresuPrzycisk.setVisible(false);
        tlo.add(wgAdresuPrzycisk);

        /* LISTENERY */

        menu.help.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(
                        null,
                        "aSzymon\nAPLIKACJA 'MANAGER HASEL' 1.0",
                        "MENADZER HASEL",
                        JOptionPane.INFORMATION_MESSAGE
                );

            }
        });

        menu.wgLoginu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nowyWpisLogin.setVisible(false);
                nowyWpisPoleLogin.setVisible(false);
                nowyWpisPassword.setVisible(false);
                nowyWpisPolePassword.setVisible(false);
                nowyWpisURL.setVisible(false);
                nowyWpisPoleURL.setVisible(false);
                nowyWpisPrzycisk.setVisible(false);

                usunNapis.setVisible(false);
                podzielenieUsun1.setVisible(false);
                usunLogin.setVisible(false);
                usunLoginPole.setVisible(false);
                usunLoginPrzycisk.setVisible(false);
                podzielenieUsun2.setVisible(false);
                usunPassword.setVisible(false);
                usunPasswordPole.setVisible(false);
                usunPasswordPrzycisk.setVisible(false);

                wgLoginu.setVisible(true);
                wgLoginuPole.setVisible(true);
                wgLoginuPrzycisk.setVisible(true);

                wgAdresu.setVisible(false);
                wgAdresuPole.setVisible(false);
                wgAdresuPrzycisk.setVisible(false);

            }
        });

        wgLoginuPrzycisk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String wgLoginuWartosc = wgLoginuPole.getText();
                String[][] dane = new String[60][4];
                Connection connection;

                if (wgLoginuWartosc.isEmpty()){

                    System.out.println("UZUPELNIJ POLE");

                    JOptionPane.showMessageDialog(
                            null,
                            "        UZUPELNIJ POLE!",
                            "MENADZER HASEL",
                            JOptionPane.INFORMATION_MESSAGE
                    );

                } else {

                    String url = "jdbc:sqlite:c:/bazy/menadzer/";
                    String filename = "menadzer.db";

                    try {

                        connection = DriverManager.getConnection(url + filename);

                        String zapytaniaWgLoginu = sqlZapytania.zapytaniaSQL[3];

                        PreparedStatement zapytanie = connection.prepareStatement(zapytaniaWgLoginu);
                        zapytanie.setString(1, "%" + wgLoginuWartosc + "%");

                        ResultSet wynikZapytania = zapytanie.executeQuery();

                        int i = 0;

                        while (wynikZapytania.next()) {
                            String lpTAB = Integer.toString(i + 1);
                            String loginTAB = wynikZapytania.getString("login");
                            String passwordTAB = wynikZapytania.getString("password");
                            String linkURLTAB = wynikZapytania.getString("linkURL");
                            System.out.println(lpTAB+" "+ loginTAB+" " + " " + passwordTAB);
                            dane[i][0] = lpTAB;
                            dane[i][1] = loginTAB;
                            dane[i][2] = passwordTAB;
                            dane[i][3] = linkURLTAB;

                            System.out.println(i);
                            i++;
                        }

                        String[] column = {"L.p", "LOGIN", "PASSWORD", "LINK URL"};
                        JFrame f = new JFrame("MENADZER HASEL");
                        JTable jt = new JTable(dane, column);

                        jt.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                        jt.getColumnModel().getColumn(0).setPreferredWidth(180);
                        jt.getColumnModel().getColumn(1).setPreferredWidth(200);
                        jt.getColumnModel().getColumn(2).setPreferredWidth(200);
                        jt.getColumnModel().getColumn(3).setPreferredWidth(200);
                        jt.setBounds(30, 40, 800, 300);


                        JScrollPane sp = new JScrollPane(jt);
                        f.add(sp);
                        f.setSize(800, 400);
                        f.setVisible(true);

                    } catch (SQLException ex) {

                        throw new IllegalStateException("UZUPELNIJ POLA", ex);

                    } finally {
                        connection = null;
                    }

                }


            }
        });

        menu.wgAdresu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                nowyWpisLogin.setVisible(false);
                nowyWpisPoleLogin.setVisible(false);
                nowyWpisPassword.setVisible(false);
                nowyWpisPolePassword.setVisible(false);
                nowyWpisURL.setVisible(false);
                nowyWpisPoleURL.setVisible(false);
                nowyWpisPrzycisk.setVisible(false);

                usunNapis.setVisible(false);
                podzielenieUsun1.setVisible(false);
                usunLogin.setVisible(false);
                usunLoginPole.setVisible(false);
                usunLoginPrzycisk.setVisible(false);
                podzielenieUsun2.setVisible(false);
                usunPassword.setVisible(false);
                usunPasswordPole.setVisible(false);
                usunPasswordPrzycisk.setVisible(false);

                wgLoginu.setVisible(false);
                wgLoginuPole.setVisible(false);
                wgLoginuPrzycisk.setVisible(false);

                wgAdresu.setVisible(true);
                wgAdresuPole.setVisible(true);
                wgAdresuPrzycisk.setVisible(true);
            }
        });

        wgAdresuPrzycisk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String wgAdresuWartosc = wgAdresuPole.getText();

                connection = null;

                if (wgAdresuWartosc.isEmpty()){

                    System.out.println("UZUPELNIJ POLE");

                    JOptionPane.showMessageDialog(
                            null,
                            "        UZUPELNIJ POLE!",
                            "MENADZER HASEL",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                } else {

                    String url = "jdbc:sqlite:C:\\bazy\\menadzer\\";
                    String filename = "menadzer.db";

                    try {

                        connection = DriverManager.getConnection(url + filename);

                        String zapytaniaWgAdresu = sqlZapytania.zapytaniaSQL[4];


                        PreparedStatement zapytanie = connection.prepareStatement(zapytaniaWgAdresu);
                        zapytanie.setString(1, "%" + wgAdresuWartosc + "%");
                        ResultSet wynikZapytania = zapytanie.executeQuery();

                        String[][] dane = new String[60][4];

                        int i = 0;

                        while (wynikZapytania.next()) {
                            String lpTAB = String.valueOf(i + 1);
                            String loginTAB = wynikZapytania.getString("login");
                            String passwordTAB = wynikZapytania.getString("password");
                            String linkURLTAB = wynikZapytania.getString("linkURL");

                            dane[i][0] = lpTAB;
                            dane[i][1] = loginTAB;
                            dane[i][2] = passwordTAB;
                            dane[i][3] = linkURLTAB;
                            i++;
                        }

                        String[] column = {"L.p", "LOGIN", "PASSWORD", "LINK URL"};
                        JFrame f = new JFrame("MENADZER HASEL");
                        JTable jt = new JTable(dane, column);

                        jt.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                        jt.getColumnModel().getColumn(0).setPreferredWidth(180);
                        jt.getColumnModel().getColumn(1).setPreferredWidth(200);
                        jt.getColumnModel().getColumn(2).setPreferredWidth(200);
                        jt.getColumnModel().getColumn(3).setPreferredWidth(200);
                        jt.setBounds(30, 40, 800, 300);


                        JScrollPane sp = new JScrollPane(jt);
                        f.add(sp);
                        f.setSize(800, 400);
                        f.setVisible(true);



                    } catch (SQLException ex) {

                        throw new IllegalStateException("UZUPELNIJ POLA", ex);

                    }
                    finally {
                        connection = null;
                    }

                }

            }
        });

        menu.nowyWpis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                nowyWpisLogin.setVisible(true);
                nowyWpisPoleLogin.setVisible(true);
                nowyWpisPassword.setVisible(true);
                nowyWpisPolePassword.setVisible(true);
                nowyWpisURL.setVisible(true);
                nowyWpisPoleURL.setVisible(true);
                nowyWpisPrzycisk.setVisible(true);

                usunNapis.setVisible(false);
                podzielenieUsun1.setVisible(false);
                usunLogin.setVisible(false);
                usunLoginPole.setVisible(false);
                usunLoginPrzycisk.setVisible(false);
                podzielenieUsun2.setVisible(false);
                usunPassword.setVisible(false);
                usunPasswordPole.setVisible(false);
                usunPasswordPrzycisk.setVisible(false);

                wgLoginu.setVisible(false);
                wgLoginuPole.setVisible(false);
                wgLoginuPrzycisk.setVisible(false);

                wgAdresu.setVisible(false);
                wgAdresuPole.setVisible(false);
                wgAdresuPrzycisk.setVisible(false);
            }
        });

        nowyWpisPrzycisk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String login = nowyWpisPoleLogin.getText();
                String password= nowyWpisPolePassword.getText();

                connection = null;

                if (login.isEmpty() || password.isEmpty()){

                    System.out.println("UZUPELNIJ WSZYSTKIE POLA");

                    JOptionPane.showMessageDialog(
                            null,
                            "WYMAGANE POLA NIE MOGA BYC PUSTE!",
                            "MENADZER HASEL",
                            JOptionPane.INFORMATION_MESSAGE
                    );

                } else {

                    try {

                        String url = "jdbc:sqlite:C:\\bazy\\menadzer\\";
                        String filename = "menadzer.db";

                        connection = DriverManager.getConnection(url + filename);

                        String zapytaniaNowyWpis = sqlZapytania.zapytaniaSQL[0];

                        PreparedStatement wynikZapytania = connection.prepareStatement(zapytaniaNowyWpis);

                        wynikZapytania.setString(1,login);
                        wynikZapytania.setString(2,password);

                        wynikZapytania.executeUpdate();

                        JOptionPane.showMessageDialog(
                                null,
                                "DODANO WPIS!",
                                "MENADZER HASEL",
                                JOptionPane.INFORMATION_MESSAGE
                        );

                        nowyWpisPoleLogin.setText("");
                        nowyWpisPolePassword.setText("");
                        nowyWpisPoleURL.setText("");

                    } catch (SQLException ex) {

                        throw new IllegalStateException("NIE MOZNA DODAC DO BAZY", ex);

                    }
                    finally {
                        connection = null;
                    }

                }

            }
        });

        menu.usunWpis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                nowyWpisLogin.setVisible(false);
                nowyWpisPoleLogin.setVisible(false);
                nowyWpisPassword.setVisible(false);
                nowyWpisPolePassword.setVisible(false);
                nowyWpisURL.setVisible(false);
                nowyWpisPoleURL.setVisible(false);
                nowyWpisPrzycisk.setVisible(false);

                usunNapis.setVisible(true);
                podzielenieUsun1.setVisible(true);
                usunLogin.setVisible(true);
                usunLoginPole.setVisible(true);
                usunLoginPrzycisk.setVisible(true);
                podzielenieUsun2.setVisible(true);
                usunPassword.setVisible(true);
                usunPasswordPole.setVisible(true);
                usunPasswordPrzycisk.setVisible(true);

                wgLoginu.setVisible(false);
                wgLoginuPole.setVisible(false);
                wgLoginuPrzycisk.setVisible(false);

                wgAdresu.setVisible(false);
                wgAdresuPole.setVisible(false);
                wgAdresuPrzycisk.setVisible(false);
            }
        });

        usunLoginPrzycisk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String login = usunLoginPole.getText();

                connection = null;

                if (login.isEmpty()){

                    System.out.println("UZUPELNIJ WYMAGANE POLE");

                    JOptionPane.showMessageDialog(
                            null,
                            "UZUPEŁNIJ WYMAGANE POLE!",
                            "MENADZER HASEL",
                            JOptionPane.INFORMATION_MESSAGE
                    );


                } else {

                    try {

                        String url = "jdbc:sqlite:C:\\bazy\\menadzer\\";
                        String filename = "menadzer.db";

                        connection = DriverManager.getConnection(url + filename);

                        String zapytaniaUsunWpisLogin = sqlZapytania.zapytaniaSQL[1];

                        PreparedStatement wynikZapytania = connection.prepareStatement(zapytaniaUsunWpisLogin);

                        wynikZapytania.setString(1,login);

                        wynikZapytania.execute();

                        JOptionPane.showMessageDialog(
                                null,
                                "USUNIETO WPIS!",
                                "MENADZER HASEL",
                                JOptionPane.INFORMATION_MESSAGE
                        );

                        usunPasswordPole.setText("");
                        usunLoginPole.setText("");

                    } catch (SQLException ex) {

                        throw new IllegalStateException("NIE MOZNA USUNAC Z BAZY", ex);

                    }
                    finally {
                        connection = null;
                    }

                }

            }
        });

        usunPasswordPrzycisk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String password = usunPasswordPole.getText();

                connection = null;

                if (password.isEmpty()){

                    System.out.println("UZUPELNIJ WYMAGANE POLE");

                    JOptionPane.showMessageDialog(
                            null,
                            "UZUPEŁNIJ WYMAGANE POLE!",
                            "MENADZER HASEL",
                            JOptionPane.INFORMATION_MESSAGE
                    );

                } else {

                    try {

                        String url = "jdbc:sqlite:C:\\bazy\\menadzer\\";
                        String filename = "menadzer.db";

                        connection = DriverManager.getConnection(url + filename);

                        String zapytaniaUsunWpisPassword = sqlZapytania.zapytaniaSQL[2];

                        PreparedStatement wynikZapytania = connection.prepareStatement(zapytaniaUsunWpisPassword);

                        wynikZapytania.setString(1,password);

                        wynikZapytania.execute();

                        JOptionPane.showMessageDialog(
                                null,
                                "USUNIETO WPIS!",
                                "MENADZER HASEL",
                                JOptionPane.INFORMATION_MESSAGE
                        );

                    } catch (SQLException ex) {

                        throw new IllegalStateException("NIE MOZNA USUNAC Z BAZY", ex);

                    }
                    finally {
                        connection = null;
                    }

                }

            }
        });

        menu.testPoaczenia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                connection = null;

                File sciezka = new File("C:\\bazy\\menadzer\\menadzer.db");

                if (!sciezka.exists()){

                    System.out.println("NIE MA TAKIEGO PLIKU / ZLA SCIEZKA");

                    JOptionPane.showMessageDialog(
                            null,
                            "NIE MA TAKIEGO PLIKU",
                            "MENADZER HASEL",
                            JOptionPane.INFORMATION_MESSAGE
                    );

                } else {

                    try {

                        String url = "jdbc:sqlite:C:\\bazy\\menadzer\\";
                        String filename = "menadzer.db";

                        connection = DriverManager.getConnection(url + filename);

                        System.out.println("POLACZONO Z BAZA!");

                        JOptionPane.showMessageDialog(
                                null,
                                "     POLACZONO Z BAZA",
                                "MENADZER HASEL",
                                JOptionPane.INFORMATION_MESSAGE
                        );

                    } catch (SQLException ex) {

                        throw new IllegalStateException("NIE MOZNA POŁĄCZYĆ Z BAZA!", ex);

                    }
                    finally {
                        connection = null;
                    }

                }

            }
        });

        return okno;

    }

    /**
     * klasa appGra odpowiada za otwieranie okna
     * @author aSzymon
     * */

    public appGra() {

        JFrame frame = new JFrame("MANADZER HASEL");
        frame.setContentPane(createContentPane());
        frame.setSize(250, 350);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setJMenuBar(menu.getMenu());

        menu.zamknij.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame.dispose();

            }
        });

    }

}
