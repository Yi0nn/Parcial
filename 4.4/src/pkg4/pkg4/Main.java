/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg4.pkg4;

import java.util.ArrayList;
import java.util.Iterator;
public class Main {
    public static void main(String[] args) {
        ArrayList <Empleado> listaEmpleados=new ArrayList<Empleado>();
        listaEmpleados.add(new Empleado("Ana",45,2500));
        listaEmpleados.add(new Empleado("Antonio", 55, 2000));
        listaEmpleados.add(new Empleado("Antonio", 55, 2000));
        listaEmpleados.add(new Empleado("Jose", 35, 2200));
        listaEmpleados.add(new Empleado("Jose", 35, 2200));
        listaEmpleados.add(new Empleado("Ana",45,2500));
        listaEmpleados.add(new Empleado("Antonio", 55, 2000));
        listaEmpleados.add(new Empleado("Antonio", 55, 2000));
        listaEmpleados.add(new Empleado("Jose", 35, 2200));
        listaEmpleados.add(new Empleado("Jose", 35, 2200));
        listaEmpleados.add(new Empleado("Pedro", 22, 2200));
        listaEmpleados.add(new Empleado("Pedro", 22, 2200));
        listaEmpleados.add(new Empleado("Pedro", 22, 2200));
        listaEmpleados.add(new Empleado("Pedro", 22, 2200));
        System.out.println(listaEmpleados.size());
        Iterator <Empleado> mi_iterador=listaEmpleados.iterator();
        while(mi_iterador.hasNext()){
            System.out.println(mi_iterador.next().dameDatos());
        }
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
class Empleado{

    public Empleado(String nombre, int edad, double salario){
        this.nombre=nombre;
        this.edad=edad;
        this.salario=salario;
    }
    
    public String dameDatos(){
        return "El empleado se llama" + nombre + ". Tiene " + edad + " años." + " Y un salario de " + salario;
    }
    
    private String nombre;
    private int edad;
    private double salario;
}