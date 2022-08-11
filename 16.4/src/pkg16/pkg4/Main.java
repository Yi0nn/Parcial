/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg16.pkg4;
import java.util.LinkedList;
import java.util.ListIterator;
public class Main {
    public static void main(String[] args) {
        LinkedList<String> paises=new LinkedList<String>();
        paises.add("España");
        paises.add("Colombia");
        paises.add("Mexico");
        paises.add("Peru");
        LinkedList<String> capitales=new LinkedList<String>();
        capitales.add("Madrid");
        capitales.add("Bogota");
        capitales.add("DF");
        capitales.add("Lima");
        ListIterator<String> iterA=paises.listIterator();
        ListIterator<String> iterB=capitales.listIterator();
        while(iterB.hasNext()){
            if(iterA.hasNext()){
                iterA.next();
            }
            iterA.add(iterB.next());
        }
        System.out.println(paises);
        iterB=capitales.listIterator();
        while(iterB.hasNext()){
            iterB.next();
            if(iterB.hasNext()){
                iterB.next();
                iterB.remove();
            }
        }
        System.out.println(capitales);
        paises.removeAll(capitales);
        System.out.println(paises);
    }
}
