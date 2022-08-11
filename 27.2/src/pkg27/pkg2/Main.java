/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg27.pkg2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        MarcoCheck miMarco = new MarcoCheck();
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
class MarcoCheck extends JFrame{
    public MarcoCheck(){
        setTitle("Prueba checkss");
        setBounds(550,300,550,350);
        LaminaCheck lamina = new LaminaCheck();
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
class LaminaCheck extends JPanel {
    public LaminaCheck(){
        
        setLayout(new BorderLayout());
        Font letra = new Font("Serif", Font.PLAIN, 24);
        texto = new JLabel("En un lugar de la Mancha de cuyo nombre...");
        System.out.println("Hola");
        texto.setFont(letra);
        JPanel laminaTexto = new JPanel();
        laminaTexto.add(texto);
        add(laminaTexto, BorderLayout.CENTER);
        check1 = new JCheckBox("Negrita");
        check2 = new JCheckBox("Cursiva");
        check1.addActionListener(new ManejaChecks());
        check2.addActionListener(new ManejaChecks());
        JPanel laminachecks = new JPanel();
        laminachecks.add(check1);
        laminachecks.add(check2);
        add(laminachecks, BorderLayout.SOUTH);
    }
    private class ManejaChecks implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            int tipo = 0;
            if(check1.isSelected()) tipo+=Font.BOLD;
            if(check2.isSelected()) tipo+=Font.ITALIC;
            texto.setFont(new Font("Serif", tipo, 24));
        }
    }
    private JCheckBox check1, check2;
    private JLabel texto;
}