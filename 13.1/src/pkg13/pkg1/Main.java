/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg13.pkg1;

import java.util.Scanner;

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
        
        int aleatorio=(int)(Math.random()*100);
        Scanner entrada=new Scanner(System.in);
        int numero=0;
        int intentos=0;
        while(numero!=aleatorio){
            intentos++;               
            System.out.println("Introduce un número,por favor");
            numero=entrada.nextInt();
            if(aleatorio<numero){
                System.out.println("Más bajo");
            } else if(aleatorio>numero){
                System.out.println("Más alto");
            }
        }
        System.out.println("Correcto. Lo has conseguido en " + intentos + " intentos");
    }
    
}
