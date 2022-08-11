/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg23.pkg1;
import java.util.Scanner;
public class Main {
    enum Talla {
        MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
        private Talla(String abrev){
            this.abrev = abrev;
        }
        public String getAbrev(){
            return abrev;
        }
        private String abrev;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, MUY_GRANDE");
        String entrada_datos = entrada.next().toUpperCase();
        Talla talla = Enum.valueOf(Talla.class, entrada_datos);
        System.out.println("Talla = " + talla);
        System.out.println("Abreviatura = " + talla.getAbrev());
    }
}
