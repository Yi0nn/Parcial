/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg14.pkg4;

public class UsoLibro {
    public static void main(String[] args) {
        Libro libro1=new Libro("P en java","Juan",25);
        Libro libro2=new Libro("P en java","Juan",25);
        if(libro1.equals(libro2)){
            System.out.println("Es el mismo libro");
            System.out.println(libro1.hashCode());
            System.out.println(libro2.hashCode());
        }else{
            System.out.println("No es el mismo libro");
            System.out.println(libro1.hashCode());
            System.out.println(libro2.hashCode());
        }
    }
}
