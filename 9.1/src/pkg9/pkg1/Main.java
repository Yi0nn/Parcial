/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg9.pkg1;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
       
        String num1= JOptionPane.showInputDialog("Introduce el numero");
        
        double num2= Double.parseDouble(num1);
        
        System.out.print("La raiz de "+ num2+"es ;");
        System.out.printf("%1.2f", Math.sqrt(num2));
    }
    
    
}
