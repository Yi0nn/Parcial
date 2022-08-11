/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg8.pkg2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        
        Marco_radio miMarco = new Marco_radio();
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
class Marco_radio extends JFrame{
    public Marco_radio(){
        setVisible(true);
        setBounds(550,300,400,400);
        Lamina_radio lamina = new Lamina_radio();
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
class Lamina_radio extends JPanel{
    public Lamina_radio(){
        setLayout(new BorderLayout());
        texto = new JLabel("En un lugar de la Mancha de cuyo nombre...");
        add(texto, BorderLayout.CENTER);
        ButtonGroup migrupo = new ButtonGroup();
        btn1 = new JRadioButton("Pequeño", false);
        btn2 = new JRadioButton("Mediano", true);
        btn3 = new JRadioButton("Grande", false);
        btn4 = new JRadioButton("Muy grande", false);
        JPanel lamina_radio = new JPanel();
        Evento_radio mievento = new Evento_radio();
        btn1.addActionListener(mievento);
        btn2.addActionListener(mievento);
        btn3.addActionListener(mievento);
        btn4.addActionListener(mievento);
        migrupo.add(btn1);
        migrupo.add(btn2);
        migrupo.add(btn3);
        migrupo.add(btn4);
        lamina_radio.add(btn1);
        lamina_radio.add(btn2);
        lamina_radio.add(btn3);
        lamina_radio.add(btn4);
        add(lamina_radio, BorderLayout.SOUTH);
        }
        private class Evento_radio implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
        if(e.getSource()== btn1){
        texto.setFont(new Font("Serif",Font.PLAIN,10));
        }else if(e.getSource()== btn2){
        texto.setFont(new Font("Serif",Font.PLAIN,12));
        }else if(e.getSource()== btn3){
        texto.setFont(new Font("Serif",Font.PLAIN,18));
        }else if(e.getSource()== btn4){
        texto.setFont(new Font("Serif",Font.PLAIN,12));
        }
        }
    }
    public void colocarBotones(String nombre, boolean seleccionado, int tamagno){
        JRadioButton btn = new JRadioButton(nombre,seleccionado);
        migrupo.add(btn);
        lamina_botones.add(btn);
        ActionListener mievento = (ActionEvent e) -> {
            texto.setFont(new Font("Serif", Font.PLAIN, tamagno));
        };
        btn.addActionListener(mievento);
    }
    private JLabel texto;
    private JRadioButton btn1, btn2, btn3, btn4;
    private ButtonGroup migrupo;
    private JPanel lamina_botones;
}
    
