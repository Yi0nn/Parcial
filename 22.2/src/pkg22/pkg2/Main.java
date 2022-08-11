/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg22.pkg2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        MarcoTexto miMarco = new MarcoTexto();
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
class MarcoTexto extends JFrame{
    public MarcoTexto(){
        setBounds(600,200,600,350);
        LaminaTexto lamina = new LaminaTexto();
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
class LaminaTexto extends JPanel{
    public LaminaTexto(){
        setLayout(new BorderLayout());
        JPanel lamina2 = new JPanel();
        lamina2.setLayout(new FlowLayout());
        resultado = new JLabel("", JLabel.CENTER);
        JLabel texto1 = new JLabel("E-mail: ");
        lamina2.add(texto1);
        txt1 = new JTextField(20);
        lamina2.add(txt1);
        add(resultado, BorderLayout.CENTER);
        JButton btn1 = new JButton("Comprobar");
        DameTexto evento = new DameTexto();
        btn1.addActionListener(evento);
        lamina2.add(btn1);
        add(lamina2, BorderLayout.NORTH);
    }
    private class DameTexto implements ActionListener{
        public void actionPerformed(ActionEvent e){
            int correcto = 0;
            String email =txt1.getText().trim();
            for(int i=0; i<email.length(); i++){
                if(email.charAt(i)=='@'){
                    correcto++;
                }
            }
            if(correcto!=1){
                resultado.setText("Incorrecto");
            } else {
                resultado.setText("Correcto");
            }
        }
    }
    private JTextField txt1;
    private JLabel resultado;
}
