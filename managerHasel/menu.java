/** aSzymon - gtihub */

package managerHasel;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;

public class menu {

    JMenuBar pasekMenu;

    JMenu bazy;
    JMenu szukaj;
    JMenu info;

    /* ZMIENNE BAZY */

    JMenuItem testPoaczenia;
    JMenuItem nowyWpis;
    JMenuItem usunWpis;
    JMenuItem zamknij;

    /* ZMIENNE SZUKAJ */

    JMenuItem wgLoginu;
    JMenuItem wgAdresu;

    /* ZMIENNE INFO */

    JMenuItem help;

    /**
     * klasa menu służy do ustawienia pol menu
     * @author aSzymon
     * */

    public menu() {

        /* TWORZENIE MENU */

        pasekMenu = new JMenuBar();

        bazy = new JMenu("BAZY");
        szukaj = new JMenu("SZUKAJ");
        info = new JMenu("INFO");

        /* TWORZENIE OPCJI DO MENU */

        /* BAZY MENU */

        testPoaczenia = new JMenuItem("TEST POLACZENIA");
        bazy.add(testPoaczenia);

        nowyWpis = new JMenuItem("NOWY WPIS");
        bazy.add(nowyWpis);

        usunWpis = new JMenuItem("USUN WPIS");
        bazy.add(usunWpis);

        zamknij = new JMenuItem("ZAMKNIJ");
        bazy.add(zamknij);

        /* SZUKAJ MENU */

        wgLoginu = new JMenuItem("WEDLUG LOGINU");
        szukaj.add(wgLoginu);

        wgAdresu = new JMenuItem("WEDLUG ADRESU");
        szukaj.add(wgAdresu);

        /* INFO MENU */

        help = new JMenuItem("HELP");
        info.add(help);

        /* TWORZENIE SKROTOW */

        bazy.setMnemonic(KeyEvent.VK_B);
        szukaj.setMnemonic(KeyEvent.VK_S);
        info.setMnemonic(KeyEvent.VK_I);

        testPoaczenia.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, KeyEvent.CTRL_DOWN_MASK));
        nowyWpis.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));
        usunWpis.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, KeyEvent.CTRL_DOWN_MASK));
        zamknij.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_DOWN_MASK));

        wgLoginu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, KeyEvent.CTRL_DOWN_MASK));
        wgAdresu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.CTRL_DOWN_MASK));

        help.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, KeyEvent.CTRL_DOWN_MASK));

        /* DODAWANIE DO MENU OPCJI */

        pasekMenu.add(bazy);
        pasekMenu.add(szukaj);
        pasekMenu.add(info);

    }

    /**
     * klasa menu służy pobierania klasy menu
     * @author aSzymon
     * */


    public JMenuBar getMenu(){
        return pasekMenu;
    }

}
