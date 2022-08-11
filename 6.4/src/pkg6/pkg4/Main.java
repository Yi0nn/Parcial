/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg6.pkg4;
public class Main {

    public static void main(String[] args) {
        Pareja<String> una=new Pareja<String>();
        una.setPrimero("Juan");
        System.out.println(una.getPrimero());
        Persona pers1=new Persona("Ana");
        Pareja<Persona> otra=new Pareja<Persona>();
        otra.setPrimero(pers1);
        System.out.println(otra.getPrimero());
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
class Persona{

    public Persona(String nombre){
        this.nombre=nombre;
    }
    
    public String toString(){
        return nombre;
    }
    private String nombre;
}