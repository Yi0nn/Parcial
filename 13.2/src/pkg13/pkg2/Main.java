/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg13.pkg2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        MarcoFoco miMarco = new MarcoFoco();
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
class MarcoFoco extends JFrame{
    public MarcoFoco(){
        setVisible(true);
        setBounds(400,100,400,400);
        add(new LaminaFoco());
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
class LaminaFoco extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        setLayout(null);
        cuadro1 = new JTextField();
        cuadro2 = new JTextField();
        cuadro1.setBounds(120, 50, 150, 20);
        cuadro2.setBounds(120, 90, 150, 20);
        add(cuadro1);
        add(cuadro2);
        LanzaFocos foco = new LanzaFocos();
        cuadro1.addFocusListener(foco);
    }
    private class LanzaFocos implements FocusListener{
       @Override
       public void focusGained(FocusEvent e) {
       }
       @Override
       public void focusLost(FocusEvent e) {
           String email = cuadro1.getText();
           boolean comprobacion = false;
           for(int i=0; i<email.length(); i++){
               if(email.charAt(i)=='@'){
                   comprobacion = true;
               }
           }
           if (comprobacion){
               System.out.println("Correcto");
           } else {
               System.out.println("Incorrecto");
           }
       }
}
    JTextField cuadro1;
    JTextField cuadro2;
}
