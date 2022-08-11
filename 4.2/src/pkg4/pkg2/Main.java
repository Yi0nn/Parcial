/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg4.pkg2;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class Main {
    public static void main(String[] args) {
        MarcoPassword miMarco = new MarcoPassword();
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
class MarcoPassword extends JFrame{
    public MarcoPassword(){
        setBounds(400,300,550,400);
        LaminaPassword lamina = new LaminaPassword();
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
class LaminaPassword extends JPanel {
    public LaminaPassword(){
        setLayout(new BorderLayout());
        JPanel lamina_superior = new JPanel();
        lamina_superior.setLayout(new GridLayout(2,2));
        add(lamina_superior, BorderLayout.NORTH);
        JLabel etiqueta1 = new JLabel("Usuario");
        JLabel etiqueta2 = new JLabel("Contraseña");
        JTextField c_usuario = new JTextField(15);
        Comprueba_pass mi_evento = new Comprueba_pass();
        c_contraseña = new JPasswordField(15);
        c_contraseña.getDocument().addDocumentListener(mi_evento);
        lamina_superior.add(etiqueta1);
        lamina_superior.add(c_usuario);
        lamina_superior.add(etiqueta2);
        lamina_superior.add(c_contraseña);
        JButton enviar = new JButton("Enviar");
        add(enviar, BorderLayout.SOUTH);
    }
    
    private class Comprueba_pass implements DocumentListener{

        @Override
        public void insertUpdate(DocumentEvent e) {
            char [] contra;
            contra = c_contraseña.getPassword();
            if(contra.length<8 || contra.length>12){
                c_contraseña.setBackground(Color.red);
            } else {
                c_contraseña.setBackground(Color.WHITE);
            }
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            char [] contra;
            contra = c_contraseña.getPassword();
            if(contra.length<8 || contra.length>12){
                c_contraseña.setBackground(Color.red);
            } else {
                c_contraseña.setBackground(Color.WHITE);
            }
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
        }
        
    }
    JPasswordField c_contraseña;
}  

