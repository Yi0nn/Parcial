/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg12.pkg1;

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
        String clave="Stefhania";
        String pass="";
        while(clave.equals(pass)== false){
        
            pass=JOptionPane.showInputDialog("Introduce la contraseña,por favor");
            
            if(clave.equals(pass)== false){
                System.out.println("Contraseña incorrecta");
            }
        }
        System.out.println("Contraseña correcta.Acceso permitido");
    }
    
}
