/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg5.pkg4;

import java.io.File;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList archivos=new ArrayList(5);
        archivos.add("Juan");
        archivos.add("Maria");
        archivos.add("Ana");
        archivos.add("Sandra");
        archivos.add(new File("gestion_Pedidos.accdb"));
        String nombrePersona=(String)archivos.get(4);
        System.out.println(nombrePersona);
    }
}
