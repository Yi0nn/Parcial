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

import java.util.Date;
import java.util.GregorianCalendar;
public class Usos_Personas {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona[] laspersonas = new Persona[2];      
        
        laspersonas[0] = new Empleado2("Tefa", 45000, 2003, 12, 24);
        laspersonas[1] = new Alumno("Isadora", "Fisica");
        
        for(var p: laspersonas){
            System.out.println(p.getNombre() + ", " + p.getDescripcion());
        }
  
    }
}

    abstract class Persona{
        public  Persona (String nom){
            nombre=nom;
        }

        public String getNombre() {
            return nombre;
        }
        
        public abstract String getDescripcion();
        private String nombre;
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
    class Empleado2 extends Persona{
        public Empleado2(String nom, double sue, int agno, int mes, int dia){
           super(nom);
           sueldo = sue;
           GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
           altaContrato = calendario.getTime();
           id = nextId;
           nextId++;
        }
        
        @Override
        public String getDescripcion(){
            return "Este empleado tienen un Id: " + id + " con un sueldo " + sueldo;
        }

        public double getSueldo() {
            return sueldo;
        }

        public Date getAltaContrato() {
            return altaContrato;
        }
        
        public void setSueldo(double porcentaje){
            double aumento = sueldo*porcentaje/100;
            sueldo += aumento;
        }
        
        private  double sueldo;
        private  Date altaContrato;
        private  int id;
        private  static int nextId;
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
    class Alumno extends Persona{
        public Alumno(String nom, String car){
            super(nom);
            carrera = car;
        }
        
        @Override
        public String getDescripcion(){
            return "Este alumno está estudiando la carrera de " + carrera;
        }
        private String carrera;
        
    }

