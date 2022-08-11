/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg13.pkg1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
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
