/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg18.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author Mi pc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Long resultado=1L;
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        for(int i=numero;i>0;i--){
            resultado=resultado*i;
        }
        System.out.println("El factorial de" + numero + " es " + resultado);
    }
    
}
