/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg26.pkg2;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
public class Main {
    public static void main(String[] args) {
        Frame_Sliders2 mimarco = new Frame_Sliders2();
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
class Frame_Sliders2 extends JFrame{
    public Frame_Sliders2(){
        setBounds(550,400,550,350);
        Lamina_Sliders2 milamina = new Lamina_Sliders2();
        add(milamina);
        setVisible(true);
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
class Lamina_Sliders2 extends JPanel{
    public Lamina_Sliders2(){
        setLayout(new BorderLayout());
        rotulo = new JLabel("En un lugar de la Mancha de cuyo nombre...");
        add(rotulo, BorderLayout.CENTER);
        control = new JSlider(8,50,12);
        control.setMajorTickSpacing(20);
        control.setMinorTickSpacing(5);
        control.setPaintTicks(true);
        control.setPaintLabels(true);
        control.setFont(new Font("Serif", Font.ITALIC, 10));
        control.addChangeListener((ChangeListener) new EventoSlider());
        JPanel laminaSlider = new JPanel();
        laminaSlider.add(control);
        add(laminaSlider, BorderLayout.NORTH);
    }
    private class EventoSlider implements ChangeListener{
        public void stateChanged(ChangeEvent e){
            rotulo.setFont(new Font("Serif", Font.PLAIN,control.getValue()));
        }
    }
    private JLabel rotulo;
    private JSlider control;
    private static int contador;
}
