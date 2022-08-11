/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg20.pkg2;

import java.awt.*;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        MarcoImagen miMarco = new MarcoImagen();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
class MarcoImagen extends JFrame{
    public MarcoImagen(){
        setTitle("Prueba con imágen");
        setBounds(400,150,500,500);
        LaminaImagen miLamina = new LaminaImagen();
        add(miLamina);
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
class LaminaImagen extends JPanel{
    public LaminaImagen(){
       try{
            imagen = ImageIO.read(new File("src/tefha/imagenes/icon1.jpg"));
        }
        catch(IOException e){
            System.out.println("La imagen no se encuentra");
        } 
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int anchuraImagen = imagen.getWidth(this);
        int alturaImagen = imagen.getHeight(this);
        g.drawImage(imagen, 0, 0, null);
        for (int i=0; i<500; i++){
            for (int j=0; j<500; j++){
                if(i+j>0){
                g.copyArea(0, 0 , anchuraImagen, alturaImagen, anchuraImagen*i, alturaImagen*j);
                }
            }
        }
    }
    private Image imagen;
}
