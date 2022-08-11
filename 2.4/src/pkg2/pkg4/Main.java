/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg2.pkg4;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;
public class Main {
    public static void main(String[] args) {
        Administrador jefe=new Administrador("Juan",80000,2005,12,15);
        jefe.setIncentivo(500);
        Empleado[] personal=new Empleado[3];
        personal[0]=jefe;
        personal[1]=new Empleado("Ana", 25000,2008,10,1);
        personal[2]=new Empleado("Luis", 18000,2012,9,15);
        try{
        
            ObjectOutputStream escribiendo_fichero=new ObjectOutputStream(new FileOutputStream("C:/users/Desktop/java_ser/empleado.dat"));
            escribiendo_fichero.writeObject(personal);           
            escribiendo_fichero.close();            
            ObjectInputStream recuperando_fichero=new ObjectInputStream(new FileInputStream("C:/users/Desktop/java_ser/empleado.dat"));            
            Empleado[] personal_recuperando=(Empleado[]) recuperando_fichero.readObject();           
            recuperando_fichero.close();           
            for(Empleado e : personal_recuperando){            
                System.out.println(e);           
            }        
        }catch(Exception e){       
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
class Empleado implements Serializable {
    public Empleado(String n, double s, int agno, int mes, int dia){
            nombre=n;
            sueldo=s;
            GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
            fechaContrato=calendario.getTime();
    }
   
    public String getNombre(){
        return nombre;
    }
    
    public double getSueldo(){
        return sueldo;
    }
    
    public Date getfechaContrato(){
        return fechaContrato;
    }
    
    public void subirSueldo(double porcentaje){
        double aumento=sueldo*porcentaje/100;
        sueldo+=aumento;
    }
    
    public String toString(){
        return "El Nombre= " + nombre + "El sueldo= " + sueldo + "Y la fecha de contrato= " + fechaContrato;
    }
    
    private String nombre;
    private double sueldo;
    private Date fechaContrato;

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
class Administrador extends Empleado{
    private static final long serialVersionUID = -965089988079125687L;
    public Administrador(String n, double s, int agno, int mes, int dia){
        super(n,s,agno,mes,dia);
        incentivo=0;
    }
    public double getSueldo(){
        double sueldoBase=super.getSueldo();
        return sueldoBase + incentivo;
    }
    public void setIncentivo(double b){
        incentivo=b;
    }
    public String toString(){
        return super.toString() + "Incentivo=" + incentivo;
    }
    private double incentivo;
}