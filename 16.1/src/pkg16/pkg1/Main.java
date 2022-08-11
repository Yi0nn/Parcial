/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg16.pkg1;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        int arroba=0;
        boolean punto=false;
        String mail=JOptionPane.showInputDialog("Introduce mail");
        for(int i=0;i<mail.length();i++){
            if(mail.charAt(i)=='@'){
            arroba ++;
            }
            if(mail.charAt(i)=='.'){
            punto=true;
            }
        }
        if(arroba ==1 && punto == true){
            System.out.println("Es correcto");
        }else{
            System.out.println("Es correcto");
        }
    }
    
}
