/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg25.pkg2;

import java.awt.event.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        MarcoVentana2 miMarco = new MarcoVentana2();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MarcoVentana2 miMarco2 = new MarcoVentana2();
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
class MarcoVentana2 extends JFrame{
    public MarcoVentana2(){
        setVisible(true);
        addWindowListener(new M_Ventana2());
        
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
class M_Ventana2 extends WindowAdapter{
    
    public void windowIconified(WindowEvent e){
       System.out.println("Ventana minimizada");
    }
}
