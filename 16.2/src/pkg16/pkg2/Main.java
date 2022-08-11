/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg16.pkg2;
import java.awt.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        FrameSpinner mimarco = new FrameSpinner();
        mimarco.setVisible(true);
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
class FrameSpinner extends JFrame{
    public FrameSpinner(){
        setBounds(550,350,550,350);
        setVisible(true);
        add(new LaminaSpinner());
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
class LaminaSpinner extends JPanel{
    public LaminaSpinner(){
        JSpinner control = new JSpinner(new SpinnerNumberModel(5,0,10,1){
            public Object getNextValue(){
               return super.getPreviousValue();
            }
            public Object getPreviousValue(){
               return super.getNextValue();
            }
        });
        Dimension d = new Dimension(200,20);
        control.setPreferredSize(d);
        add(control);
    }
}
    