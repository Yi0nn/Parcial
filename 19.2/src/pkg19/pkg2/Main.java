/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg19.pkg2;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        MarcoDibujo miMarco = new MarcoDibujo();
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
class MarcoDibujo extends JFrame{
    public MarcoDibujo(){
        setTitle("- Prueba de Dibujo -");
        setSize(400,400);
        LaminaFiguras miLamina = new LaminaFiguras();
        add(miLamina);
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
class LaminaFiguras extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
        g2.draw(rectangulo);
        Ellipse2D elipse = new Ellipse2D.Double();
        elipse.setFrame(rectangulo);
        g2.draw(elipse);
        g2.draw(new Line2D.Double(100, 100, 300, 250));
        double CentroenX = rectangulo.getCenterX();
        double CentroenY = rectangulo.getCenterY();
        double radio = 150;
        Ellipse2D circulo = new Ellipse2D.Double();
        circulo.setFrameFromCenter(CentroenX, CentroenY, CentroenX+radio, CentroenY+radio);
        g2.draw(circulo);
    }
}
