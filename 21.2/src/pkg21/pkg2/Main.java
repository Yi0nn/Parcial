/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg21.pkg2;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class Main {
    public static void main(String[] args) {
        Reloj mireloj = new Reloj(3000,true);
        mireloj.enMarcha();
        JOptionPane.showMessageDialog(null, "Pulsa Aceptar para detener");
        System.exit(0);
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
class Reloj{
    public Reloj(int intervalo, boolean sonido){
        this.intervalo = intervalo;
        this.sonido = sonido;
    }
    
    public void enMarcha(){
        ActionListener oyente = new DameLaHora2();
        Timer mitemporizador = new Timer(intervalo, oyente);
        mitemporizador.start();
    }
    
    private int intervalo;
    private boolean sonido;
    
    private class DameLaHora2 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Date ahora = new Date();
            System.out.println("Hora cada 3 segundos: " + ahora);
            if (sonido){
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
}
