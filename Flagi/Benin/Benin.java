/** aSzymon - gtihub */

package Flagi.Benin;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;

class PanelDoRysowania extends JPanel{

    public void paintComponent(Graphics g){

        g.setColor(new Color(0,136,80));
        g.fillRect(0,0,1520,910);

        g.setColor(new Color(252,210,14));
        g.fillRect(500,0,1012,455);

        g.setColor(new Color(233,8,41));
        g.fillRect(500,455,1012,455);

    }
}

public class Benin extends JFrame{

    private PanelDoRysowania rysuj = new PanelDoRysowania();

    public Benin() {

        this.setTitle("Flaga Beninu");
        this.setVisible(true);

        this.setSize(1520,910);

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
