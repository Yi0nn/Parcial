/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
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
