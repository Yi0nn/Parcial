/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg8.pkg3;

import javax.swing.JOptionPane;
public class Main {
    
    public static void main(String[] args) {
        int [] mi_matriz=new int[5];
        mi_matriz[0]=5;
        mi_matriz[1]=38;
        mi_matriz[2]=15;
        mi_matriz[3]=92;
        mi_matriz[4]=71;
        mi_matriz[5]=81;
        for(int i=0;i<5;i++){
            System.out.println("Posicion" + i + " = " + mi_matriz[i]);
        }
     String nombre=JOptionPane.showInputDialog("Introduce tu nombre");
     int edad=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
     System.out.println("Hola " + nombre + " Tienes " + edad + " años " + " El programa termino su ejecucion");
    }
}
