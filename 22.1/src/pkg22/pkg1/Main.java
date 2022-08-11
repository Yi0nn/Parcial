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
        // TODO code application logic here
        //String[]paises={"Estado Unidos", "Canadá", "México", "Panamá", "Haití", "Jamaica", "Perú", "República Dominicana", "Cuba", "Caribe", "Groenlandia", "El Salvador", "Puerto Rico", "Colombia", "Venezuela", "Honduras", "Guayana"};
        String[]paises=new String[8];
        for(int i=0;i<8;i++){
            paises[i]=JOptionPane.showInputDialog("Introduce país " + (i+1));
        }
        for (String elemento:paises){
            System.out.println("País: "+ elemento);
        }
        
        //Otro ejemplo 
        
        /*int[]matriz_aleatorios=new int[150];
        for(int i=0;i<matriz_aleatorios.length;i++){
        matriz_aleatorios[i]=(int)Math.round(Math.random()*100);
        }
        for(int numeros:matriz_aleatorios){
        System.out.print(numeros + " ");
        }*/
    }
    
}
