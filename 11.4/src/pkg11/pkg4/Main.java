/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg11.pkg4;
public class Main {
    public static void main(String[] args) {
        HilosVarios hilo1=new HilosVarios();      
        HilosVarios hilo2=new HilosVarios();       
        hilo1.start();
        try{
            hilo1.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        hilo2.start();
        try{
            hilo2.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Terminadas las tareas");
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
class HilosVarios extends Thread{

    public void run(){
        for(int i=0;i<15;i++){
            System.out.println("Ejecutando hilo" + getName());            
            try{
            Thread.sleep(500);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        }
    }
}