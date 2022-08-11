/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg7.pkg2;

import java.awt.event.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        MarcoArea miMarco = new MarcoArea();
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
class MarcoArea extends JFrame{
    public MarcoArea() {
        setBounds(500,300,500,350);
        LaminaArea lamina = new LaminaArea();
        add(lamina);
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
class LaminaArea extends JPanel{
    public LaminaArea(){
        area = new JTextArea(8,20);
        JScrollPane laminaBarras = new JScrollPane(area);
        //area.setLineWrap(true);
        add(laminaBarras);
        JButton btn1 = new JButton("OK");
        btn1.addActionListener(new GestionaArea());
        add(btn1);
    }
    private class GestionaArea implements ActionListener{
        public void actionPerformed(ActionEvent e){
            System.out.println(area.getText());
        }
    }
    private JTextArea area;
}

