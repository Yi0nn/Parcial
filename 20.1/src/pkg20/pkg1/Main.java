/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg20.pkg1;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Empleados trabajador1 = new Empleados("Rose");
        Empleados trabajador2 = new Empleados("Jennie");
        Empleados trabajador3 = new Empleados("Alya");
        Empleados trabajador4 = new Empleados("Lila");
        trabajador1.setSeccion("RRHH");
        System.out.println(trabajador1.getDatos()+ trabajador2.getDatos()+ trabajador3.getDatos() + trabajador4.getDatos()); 
        System.out.println(Empleados.getNextId());    
    }
    
}

class Empleados{
    public Empleados(String name){
        nombre = name;
        seccion = "Administracción";
        id = nextId;
        nextId++;

    }
    
    public void setSeccion(String seccion){
        this.seccion = seccion;
    }
       
    public String getDatos(){
        return "El nombre es " + nombre + ", la sección es " + seccion + " y el id es " + id;
    }
    
    public static String getNextId(){
        return "El Id siguiente es: " + nextId;
    }
    
    private final String nombre;
    private String seccion;
    private int id;
    private static int nextId=1;
}