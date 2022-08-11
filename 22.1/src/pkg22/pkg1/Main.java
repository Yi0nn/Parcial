/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg22.pkg1;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String[]paises=new String[8];
        for(int i=0;i<8;i++){
            paises[i]=JOptionPane.showInputDialog("Introduce país " + (i+1));
        }
        for (String elemento:paises){
            System.out.println("País: "+ elemento);
        }
    }
}
