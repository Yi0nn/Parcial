/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
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
