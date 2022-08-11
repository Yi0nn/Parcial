/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg18.pkg2;

import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        MarcoPruebaArea miMarco = new MarcoPruebaArea();
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
class MarcoPruebaArea extends JFrame{
    public MarcoPruebaArea(){
        setTitle("Probando Área de texto");
        setBounds(500,300,500,350);
        setLayout(new BorderLayout());
        laminaBotones = new JPanel();
        btnInsertar = new JButton("Insertar");
        btnInsertar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                areaTexto.append("Soñar no te servirá de nada si olvidas vivir ");
            }
        });
        laminaBotones.add(btnInsertar);
        btnSaltoLinea = new JButton("Salto línea");
        btnSaltoLinea.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                boolean saltar =! areaTexto.getLineWrap();
                areaTexto.setLineWrap(saltar);
                btnSaltoLinea.setText(saltar ? "Quitar salto" : "Salto Linea");
            }
        });
        laminaBotones.add(btnSaltoLinea);
        add(laminaBotones, BorderLayout.SOUTH);
        areaTexto = new JTextArea(8,20);
        laminaConBarras = new JScrollPane(areaTexto);
        add(laminaConBarras, BorderLayout.CENTER);
    }
    private JPanel laminaBotones;
    private JButton btnInsertar, btnSaltoLinea;
    private JTextArea areaTexto;
    private JScrollPane laminaConBarras;
}
