/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg12.pkg2;

import java.awt.event.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        
        MarcoVentana miMarco = new MarcoVentana();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MarcoVentana miMarco2 = new MarcoVentana();
        miMarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        miMarco.setTitle("Ventana 1");
        miMarco2.setTitle("Ventana 2");
        miMarco.setBounds(200,200,500,350);
        miMarco2.setBounds(700,200,500,350);
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
class MarcoVentana extends JFrame{
    public MarcoVentana(){
        setVisible(true);
        M_Ventana oyente_ventana = new M_Ventana();
        addWindowListener(oyente_ventana);
        
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
class M_Ventana implements WindowListener{
    public void windowActivated(WindowEvent e){
        System.out.println("Ventana activada");
    }
    public void windowClosed(WindowEvent e){
    System.out.println("La ventana ha sido cerrada");
    }
    public void windowClosing(WindowEvent e){
        System.out.println("Cerrando Ventana");
    }
    public void windowDeactivated(WindowEvent e){
        System.out.println("Ventana desactivada");
    }
    public void windowDeiconified(WindowEvent e){
        System.out.println("Ventana restaurada");
    }
    public void windowIconified(WindowEvent e){
       System.out.println("Ventana minimizada");
   }
    public void windowOpened(WindowEvent e){
       System.out.println("Ventana abierta");
    }
}
    