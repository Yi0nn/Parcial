/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg10.pkg2;
import java.awt.event.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        MarcoRaton miMarco = new MarcoRaton();
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
class MarcoRaton extends JFrame{
    public MarcoRaton(){
        setVisible(true);
        setBounds(400,100,400,400);
        EventosDeRaton3 eventoRaton3 = new EventosDeRaton3();
        addMouseMotionListener(eventoRaton3);
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
class EventosDeRaton implements MouseListener{
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Has hecho click");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Acabas de presionar");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Acabas de levantar");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Acabas de entrar");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Acabas de salir");
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
class EventosDeRaton2 extends MouseAdapter{
  public void mousePressed(MouseEvent e){
    if(e.getModifiersEx()== MouseEvent.BUTTON1_DOWN_MASK){
        System.out.println("Has pulsado el botón izquierdo");
    }else if(e.getModifiersEx()== MouseEvent.BUTTON2_DOWN_MASK){
        System.out.println("Has pulsado la rueda del ratón");
    } else if(e.getModifiersEx()== MouseEvent.BUTTON3_DOWN_MASK){
        System.out.println("Has pulsado el botón derecho");
    }
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
class EventosDeRaton3 implements MouseMotionListener{
    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("Estas arrastrando");
    }
    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("Estas moviendo");
    }
}
