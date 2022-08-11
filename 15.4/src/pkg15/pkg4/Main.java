/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg15.pkg4;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        LinkedList<String> personas=new LinkedList<String>();
        personas.add("Pepe");
        personas.add("Sandra");
        personas.add("Ana");
        personas.add("Laura");
        System.out.println(personas.size());
        ListIterator<String> it=personas.listIterator();
        it.next();
        it.add("Juan");
        for(String persona : personas){
            System.out.println(persona);
        }
    }
}
