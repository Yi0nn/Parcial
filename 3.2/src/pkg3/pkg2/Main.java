/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg3.pkg2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        MarcoEstado miMarco = new MarcoEstado();
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
class MarcoEstado extends JFrame{
    public MarcoEstado(){
        setVisible(true);
        setBounds(400,100,500,500);
        CambiaEstado nuevo_estado = new CambiaEstado();
        addWindowStateListener(nuevo_estado);
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
class CambiaEstado implements WindowStateListener{
    public void windowStateChanged(WindowEvent e){
        if(e.getNewState() == Frame.MAXIMIZED_BOTH){
            System.out.println("La ventana está a pantalla completa");
        } else if (e.getNewState() == Frame.NORMAL){
            System.out.println("La ventana está normal");
        } else if (e.getNewState() == Frame.ICONIFIED){
            System.out.println("La ventana está minimizada");
        }
    }
}