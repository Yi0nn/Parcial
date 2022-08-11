/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg18.pkg1;

import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        Long resultado=1L;
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        for(int i=numero;i>0;i--){
            resultado=resultado*i;
        }
        System.out.println("El factorial de" + numero + " es " + resultado);
    }
    
}
