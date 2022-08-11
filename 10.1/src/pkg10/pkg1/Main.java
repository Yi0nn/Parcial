/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg10.pkg1;

import java.util.Scanner;

/**
 *
 * @author Mi pc
 */
public class Main {

    public static void main(String[] args) {
       Scanner entrada=new Scanner(System.in);
       System.out.print("intodice tu edad por favor");
       int edad=entrada.nextInt();
       if(edad<18){
           
           System.out.println("Eres un adolecente");
       
       }else if(edad<40){
           
           System.out.println("Eres joven");
           
       }else if(edad<65){
           
           System.out.println("Eres maduro");
           
       }else{
           
           System.out.println("cuidate");
       }
       
    }
    
}
