/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg9.pkg3;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int elementos=Integer.parseInt(JOptionPane.showInputDialog("Tntroduce elementos de la matriz"));
        
        int num_aleat[]=new int[elementos];
        
        for(int i=0;i<num_aleat.length;i++){
            
            num_aleat[i]=(int)(Math.random()*100);
            
        }
        
        for(int elem: num_aleat){
            
            System.out.println(elem);
        
        }
    }
    
}
