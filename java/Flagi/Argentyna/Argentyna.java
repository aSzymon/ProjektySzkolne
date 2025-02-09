/** aSzymon - gtihub */

package Flagi.Argentyna;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;

class PanelDoRysowania extends JPanel{

    public void paintComponent(Graphics g){

        g.setColor(new Color(116,171,222));
        g.fillRect(0,0,1500,900);

        g.setColor(new Color(255,255,255));
        g.fillRect(0,0,1500,600);

        g.setColor(new Color(116,171,222));
        g.fillRect(0,0,1500,300);

        g.setColor(new Color(245,180,13));
        g.fillOval(600,320,260,260);

    }

}

public class Argentyna extends JFrame {

    private PanelDoRysowania rysuj = new PanelDoRysowania();

    public Argentyna() {

        this.setTitle("Flaga Argentyny");
        this.setVisible(true);

        this.setSize(1500,900);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().add(rysuj);
        this.setResizable(false);

        int szerokosc = Toolkit.getDefaultToolkit().getScreenSize().width;
        int wysokosc = Toolkit.getDefaultToolkit().getScreenSize().height;

        int szerokoscRamki = this.getSize().width;
        int wysokoscRamki = this.getSize().height;

        this.setLocation((szerokosc-szerokoscRamki)/2,(wysokosc-wysokoscRamki)/2);

    }

}
