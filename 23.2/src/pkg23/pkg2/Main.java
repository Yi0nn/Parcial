/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg23.pkg2;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        MarcoColor miMarco = new MarcoColor();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
class MarcoColor extends JFrame{
    public MarcoColor(){
        setTitle("Prueba con colores");
        setSize(400,400);
        LaminaColor miLamina = new LaminaColor();
        add(miLamina);
        miLamina.setBackground(SystemColor.window);
    }
}
/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
class LaminaColor extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
        g2.setPaint(Color.blue);
        g2.draw(rectangulo);
        g2.fill(rectangulo);
        Ellipse2D elipse = new Ellipse2D.Double();
        elipse.setFrame(rectangulo);
        Color micolor = new Color(125, 189, 200);
        g2.setPaint(micolor);
        g2.fill(elipse);
    }
}