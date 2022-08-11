/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg7.pkg4;

import java.util.GregorianCalendar;
public class Main {

    public static void main(String[] args) {
        String nombres[]={"Jose","Maria","Pepe"};
        System.out.println(MisMatrices.getMenor(nombres));
        GregorianCalendar fechas[]={new GregorianCalendar(2015,07,12),
            new GregorianCalendar(2015,07,12),
            new GregorianCalendar(2015,07,12)
        };
        System.out.println(MisMatrices.getMenor(fechas));
    }
}
/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
class MisMatrices {
    public static <T extends Comparable> T getMenor(T[]a){
        if(a==null || a.length==0){
            return null;
        }
        T elementoMenor=a[0];
        for(int i=1;i<a.length;i++){
            if(elementoMenor.compareTo(a[i])>0){
                elementoMenor=a[i];
            }
        }
        return elementoMenor;
    }
}