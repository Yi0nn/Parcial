/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1.pkg2;

/**
 *
 * @author Mi pc
 */
public class Furgoneta extends Carro {

    /**
     * @param args the command line arguments
     */
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