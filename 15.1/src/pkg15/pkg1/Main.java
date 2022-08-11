/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg15.pkg1;

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
        boolean arroba=false;
        String mail=JOptionPane.showInputDialog("Introduce mail");
        for(int i=0;i<mail.length();i++){
            if(mail.charAt(i)=='@'){
                arroba=true;
            }
        }
        if(arroba == true){
            System.out.println("Es correcto");
        }else{
            System.out.println("No es correcto");
        }
    }
    
}
