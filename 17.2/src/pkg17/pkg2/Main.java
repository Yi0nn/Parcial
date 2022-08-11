/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg17.pkg2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {MarcoAccion miMarco = new MarcoAccion();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
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
class MarcoAccion extends JFrame{
    public MarcoAccion(){
        setTitle("- Prueba Acciones -");
        setBounds(400,100,400,400);
        PanelAccion lamina = new PanelAccion();
        add(lamina);
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
class PanelAccion extends JPanel{
    public PanelAccion(){
       AccionColor accionRosa = new AccionColor("Rosa", new ImageIcon("src/imagenes/pinkbtn1.png"), Color.PINK);
       AccionColor accionGris = new AccionColor("Gris", new ImageIcon("src/imagenes/greybtn1.png"), Color.darkGray);
       AccionColor accionBlanco = new AccionColor("Blanco", new ImageIcon("src/imagenes/whitnebtn1.png"), Color.white);
       add(new JButton(accionRosa));
       add(new JButton(accionGris));
       add(new JButton(accionBlanco));
       InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
       mapaEntrada.put(KeyStroke.getKeyStroke("ctrl R"), "fondo_rosa");
       mapaEntrada.put(KeyStroke.getKeyStroke("ctrl G"), "fondo_gris");
       mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "fondo_blanco");
       ActionMap mapaAccion = getActionMap();
       mapaAccion.put("fondo_rosa", accionRosa);
       mapaAccion.put("fondo_gris", accionGris);
       mapaAccion.put("fondo_blanco", accionBlanco);
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
class AccionColor extends AbstractAction{
    public AccionColor(String nombre, Icon icono, Color color_boton){
        putValue(Action.NAME, nombre);
        putValue(Action.SMALL_ICON, icono);
        putValue(Action.SHORT_DESCRIPTION, "Poner la lamina de color " + nombre);
        putValue("color_de_fondo", color_boton);
    }
    public void actionPerformed (ActionEvent e){
        Color c = (Color)getValue("color_de_fondo");
        setBackground(c);
        System.out.println("Nombre: " + getValue(Action.NAME));
    }
}
}

