/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1.pkg2;

/**
 *
 * @author Mi pc
 */
public class Usos_Carros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Carro carro = new Carro(); //Instanciar una clase
        carro.setColor(JOptionPane.showInputDialog("Introduce color"));
        System.out.println(carro.datosGenerales());
        System.out.println(carro.getColor());
        carro.setAsientos_cuero(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
        System.out.println(carro.isAsientos_cuero());
        carro.setClimatizador("¿Tiene climatizador?");
        System.out.println(carro.isClimatizador());
        System.out.println(carro.getPeso_total());
        System.out.println("El precio final del carro es " + carro.precio_carro());*/
        
        //System.out.println("Este carro tiene " + renault.ruedas + " ruedas.");
        //Para video 41
        
        Carro micarro1 = new Carro();
        micarro1.setColor("Rojo");
        Furgoneta mifurgoneta1 = new Furgoneta(7, 580);
        mifurgoneta1.setColor("Blanco");
        mifurgoneta1.setAsientos_cuero("si");
        mifurgoneta1.setClimatizador("si");
        
        System.out.println(micarro1.datosGenerales() + " " + micarro1.getColor());
        System.out.println(mifurgoneta1.datosGenerales() + " " + mifurgoneta1.getDatosFurgoneta());
        
    }
    
}
