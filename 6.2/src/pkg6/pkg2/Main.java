/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg6.pkg2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Marco marco1 = new Marco();
        marco1.setVisible(true);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 
}

class Marco extends JFrame{
    public Marco(){
        setBounds(520,250,300,300);
        setTitle("Ventana");
    }
}
