/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6.pkg1;

/**
 *
 * @author Mi pc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre="Juan";
        System.out.print("Mi nombre es "+nombre);
        System.out.print("Mi nombre tiene "+nombre.length()+" letras");
        System.out.print("La primera letra de "+nombre+" es la "+nombre.charAt(0));
        
        int ultima_letra;
        
        ultima_letra=nombre.length();
        
        System.out.print("Y la ultima letra es la "+nombre.charAt(ultima_letra-1));
    
    }
    
}