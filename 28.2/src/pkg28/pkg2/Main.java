/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg28.pkg2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        MarcoCombo miMarco = new MarcoCombo();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoCombo extends JFrame{
    MarcoCombo(){
        setVisible(true);
        setBounds(550,300,550,400);
        LaminaCombo lamina = new LaminaCombo();
        add(lamina);
    }
}

class LaminaCombo extends JPanel{
    public LaminaCombo(){
        setLayout(new BorderLayout());
        texto = new JLabel("En un lugar de la Macha de cuyo nombre...");
        texto.setFont(new Font("Serif", Font.PLAIN, 18));
        add(texto, BorderLayout.CENTER);
        JPanel lamina_norte = new JPanel();
        micombo = new JComboBox();
        micombo.setEditable(true);
        micombo.addItem("Serif");
        micombo.addItem("SansSerif");
        micombo.addItem("Monospaced");
        micombo.addItem("Dialog");
        Evento_combo mievento = new Evento_combo();
        micombo.addActionListener(mievento);
        lamina_norte.add(micombo);
        add(lamina_norte, BorderLayout.NORTH);
    }
    private class Evento_combo implements ActionListener{
        public void actionPerformed(ActionEvent e){
            texto.setFont(new Font((String)micombo.getSelectedItem(), Font.PLAIN,18));
        }
    }
    private JLabel texto;
    private JComboBox micombo;
}
    