/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg10.pkg4;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.*;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        JFrame marco=new MarcoRebote();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
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
class PelotaHilos implements Runnable{
    public PelotaHilos (Pelota unaPelota, Component unComponente){
        pelota=unaPelota;
        componente=unComponente;
    }
    public void run(){
        System.out.println("Estado del hilo al comenzar: " + Thread.currentThread().isInterrupted());
        while(!Thread.currentThread().isInterrupted()){
            pelota.mueve_pelota(componente.getBounds());
            componente.paint(componente.getGraphics());
            try{
                Thread.sleep(4);
            } catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Estado del hilo al terminar: " + Thread.currentThread().isInterrupted());
    }
    private Pelota pelota;
    private Component componente;

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
class Pelota{
    public void mueve_pelota(Rectangle2D limites){
        x+=dx;
        y+=dy;
        if(x<limites.getMinX()){
            x=limites.getMinX();
            dx=-dx;
        }
        if(x + TAMX>=limites.getMaxX()){
            x=limites.getMaxX() - TAMX;
            dx=-dx;
        }
        if(y<limites.getMinY()){
            y=limites.getMinY();
            dy=-dy;
        }
        if(y + TAMY>=limites.getMaxY()){
            y=limites.getMaxY()-TAMY;
            dy=-dy;
        }
    }
    public Ellipse2D getShape(){
        return new Ellipse2D.Double(x,y,TAMX,TAMY);
    }
    private static final int TAMX=15;
    private static final int TAMY=15;
    private double x=0;
    private double y=0;
    private double dx=0;
    private double dy=0;
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
class LaminaPelota extends JPanel{
    public void add(Pelota b){
        pelotas.add(b);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D)g;
        for(Pelota b: pelotas){
            g2.fill(b.getShape());
        }
    }
    private ArrayList<Pelota> pelotas=new ArrayList<Pelota>();
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
class MarcoRebote extends JFrame{
    public MarcoRebote(){   
        setBounds(600,300,400,350);
        setTitle("Rebotes");
        lamina=new LaminaPelota();
        add(lamina, BorderLayout.CENTER);
        JPanel laminaBotones=new JPanel();
        arranca1=new JButton("Hilo1");
        arranca1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evento){
                comienza_el_juego(evento);
            }
        });
        laminaBotones.add(arranca1);
        arranca2=new JButton("Hilo2");
        arranca2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evento){
                comienza_el_juego(evento);
            }
        });
        laminaBotones.add(arranca2);
        arranca3=new JButton("Hilo3");
        arranca2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evento){
                comienza_el_juego(evento);
            }
        });
        laminaBotones.add(arranca3); 
        detener1=new JButton("Detener1");
        detener1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evento){
                detener(evento);
            }
        });
        
        laminaBotones.add(detener1);
        detener2=new JButton("Detener2");
        detener2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evento){
                detener(evento);
            }
        
        });
        
        laminaBotones.add(detener3);
        detener3=new JButton("Detener3");
        detener3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evento){
                detener(evento);
            }
        
        });
        
        laminaBotones.add(detener3);
    }
    
    public void comienza_el_juego(ActionEvent e){
        Pelota pelota=new Pelota();
        lamina.add(pelota);
        Runnable r=new PelotaHilos(pelota, lamina);
        if(e.getSource().equals(arranca1)){
            t1=new Thread(r);
            t1.start();
        }else if(e.getSource().equals(arranca2)){
            t2=new Thread(r);
            t2.start();
        }else if(e.getSource().equals(arranca3)){
            t3=new Thread(r);
            t3.start();
        }
    }
    
    public void detener(ActionEvent e){
        if(e.getSource().equals(detener1)){
        t1.interrupt();
        }else if(e.getSource().equals(detener2)){
        t2.interrupt();
        }else if(e.getSource().equals(detener3)){
        t3.interrupt();
        }
    
    }
    
    Thread t1,t2,t3;
    JButton arranca1, arranca2, arranca3, detener1, detener2, detener3;
    private LaminaPelota lamina;

}