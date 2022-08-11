/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg8.pkg1;

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
       Scanner entrada= new Scanner(System.in);
       
       System.out.print("Introduce tu nombre por favor");
       
       String nombre_usuario=entrada.nextLine();
       
       System.out.println("Introduce edad, por favor");
       
       int edad=entrada.nextInt();
       
       System.out.print("Hola "+ nombre_usuario+" El ano que viene tendras"+(edad+1)+" anos");
    }
    
}
