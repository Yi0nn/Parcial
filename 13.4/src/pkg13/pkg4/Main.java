/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg13.pkg4;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        Banco b=new Banco();
        for(int i=0;i<100;i++){
            EjecucionTransferencias r=new EjecucionTransferencias(b,i,2000);
            Thread t=new Thread(r);
            t.start();
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
class Banco{
    public Banco(){
        cuentas=new double[100];
        for(int i=0;i<cuentas.length;i++){
            cuentas[i]=2000;
        }
        saldoSuficiente=cierreBanco.newCondition();
    }
    
    public void transferencia(int cuentaOrigen, int cuentaDestino, double cantidad){
        
        cierreBanco.lock();
        try{
        if(cuentas[cuentaOrigen]<cantidad){//evalua que el saldo no es inferior a la cuenta de origen
            System.out.println("-------------------CANTIDAD INSUFICIENTE:" + cuentaOrigen + ".....SALDO:" + cuentas[cuentaOrigen]+"...." + cantidad);
            return;
        }else{
            System.out.println("-------------------CANTIDAD OK---------" + cuentaOrigen);
        }
        
        System.out.println(Thread.currentThread());
        cuentas[cuentaOrigen]-=cantidad; //dinero que sale de la cuenta de origen
        System.out.printf("%10.2f de %d para %d", cantidad, cuentaOrigen, cuentaDestino);
        cuentas[cuentaDestino]+=cantidad;
        System.out.printf("%10.2f de %d para %d", getSaldoTotal());
    
    }finally{
        
            cierreBanco.unlock();
            
     }}
    
    public double getSaldoTotal(){
        double suma_cuentas=0;
        for(double a: cuentas){
            suma_cuentas+=a;
        }
        return suma_cuentas;
    }
    private final double[] cuentas;
    private Lock cierreBanco=new ReentrantLock();
    private Condition saldoSuficiente;
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
class EjecucionTransferencias implements Runnable{
    public EjecucionTransferencias(Banco b, int de, double max){
        banco=b;
        deLaCuenta=de;
        cantidadMax=max;
    }
    @Override
    public void run() {
    try{
        while(true){
            int paraLaCuenta=(int)(100*Math.random());
            double cantidad=cantidadMax*Math.random();
            banco.transferencia(deLaCuenta, paraLaCuenta, cantidad);
                Thread.sleep((int)(Math.random()*10));
        }        
        }catch(InterruptedException e){}
    }
    private Banco banco;
    private int deLaCuenta;
    private double cantidadMax;
}