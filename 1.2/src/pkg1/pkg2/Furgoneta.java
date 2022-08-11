/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg1.pkg2;
public class Furgoneta extends Carro {
    public static void main(String[] args) {
        // TODO code application logic here
    }
    private int capacidad_carga;
    private int plazas_extra;
    public Furgoneta(int plazas_extra, int capacidad_carga){
        super(); // LLama al constructor de la clase padre
        this.capacidad_carga = capacidad_carga;
        this.plazas_extra = plazas_extra;
    }
    
    public String getDatosFurgoneta(){
        return "La capacidad de carga es: " + capacidad_carga + " y las plazas son: " + plazas_extra;
    }
}