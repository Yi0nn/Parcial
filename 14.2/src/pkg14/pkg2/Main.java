/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg14.pkg2;

import java.awt.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Marco_Layout miMarco = new Marco_Layout();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
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
class Marco_Layout extends JFrame{
    public Marco_Layout(){
        setTitle("Prueba acciones");
        setBounds(400,100,400,400);
        Panel_Layout lamina = new Panel_Layout();
        Panel_Layout2 lamina2 = new Panel_Layout2();
        add(lamina, BorderLayout.NORTH);
        add(lamina2, BorderLayout.SOUTH);
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
class Panel_Layout extends JPanel{
    public Panel_Layout(){
        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(new JButton("Rosa"));
        add(new JButton("Gris"));
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
class Panel_Layout2 extends JPanel{
    public Panel_Layout2(){
        setLayout(new BorderLayout());
        add(new JButton("Blanco"), BorderLayout.WEST);
        add(new JButton("Cyan"), BorderLayout.EAST);
        add(new JButton("Magenta"), BorderLayout.CENTER);
    }
}
