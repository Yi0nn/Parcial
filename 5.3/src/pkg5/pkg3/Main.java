/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg5.pkg3;
import java.awt.*;
import javax.swing.*;
public class Main {

    public static void main(String[] args) {
        MarcoMuelle mimarco=new MarcoMuelle();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
class MarcoMuelle extends JFrame{
    public MarcoMuelle(){
        setBounds(300,400,1000,350);
        LaminaMuelle milamina=new LaminaMuelle();
        add(milamina);
        setVisible(true);
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
class LaminaMuelle extends JPanel{
    public LaminaMuelle(){
        JButton boton1=new JButton("boton 1");
        JButton boton2=new JButton("boton 2");
        JButton boton3=new JButton("boton 3");
        SpringLayout milayout=new SpringLayout();
        setLayout(milayout);
        add(boton1);
        add(boton2);
        add(boton3);
        Spring mimuelle=Spring.constant(0,10,100);
        Spring muelle_rigido=Spring.constant(80);
        milayout.putConstraint(SpringLayout.WEST, boton1, mimuelle, SpringLayout.WEST, this);
        milayout.putConstraint(SpringLayout.WEST, boton2, muelle_rigido, SpringLayout.EAST, boton1);
        milayout.putConstraint(SpringLayout.WEST, boton3, muelle_rigido, SpringLayout.EAST, boton2);
        milayout.putConstraint(SpringLayout.EAST, this, mimuelle, SpringLayout.EAST, boton3);
    }
}
}