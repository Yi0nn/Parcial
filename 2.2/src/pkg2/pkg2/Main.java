/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg2.pkg2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        MarcoCalculadora miMarco = new MarcoCalculadora();
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
class MarcoCalculadora extends JFrame{
    public MarcoCalculadora(){
        setTitle("- Calculadora -");
        setBounds(500, 200, 450, 300);
        LaminaCalculadora lamina = new LaminaCalculadora();
        add(lamina);
    }
}

class LaminaCalculadora extends JPanel{
    public LaminaCalculadora(){
        principio = true;
        setLayout(new BorderLayout());
        pantalla = new JButton("0");
        pantalla.setEnabled(false);
        add(pantalla, BorderLayout.NORTH);
        lamina2 = new JPanel();
        lamina2.setLayout(new GridLayout(4,4));
        ActionListener insertar = new InsertaNumero();
        ActionListener orden = new AccionOrden();
        
        ponerbtn("7", insertar);
        ponerbtn("8", insertar);
        ponerbtn("9", insertar);
        ponerbtn("/", orden);
        ponerbtn("4", insertar);
        ponerbtn("5", insertar);
        ponerbtn("6", insertar);
        ponerbtn("*", orden);
        ponerbtn("1", insertar);
        ponerbtn("2", insertar);
        ponerbtn("3", insertar);
        ponerbtn("-", orden);
        ponerbtn("0", insertar);
        ponerbtn(".", insertar);
        ponerbtn("=", orden);
        ponerbtn("+", orden);
        add(lamina2, BorderLayout.CENTER);
        ultimaOperacion = "=";

    }
    private void ponerbtn(String rotulo, ActionListener oyente){
        JButton btn = new JButton(rotulo);
        btn.addActionListener(oyente);
        lamina2.add(btn);
    }
    private class InsertaNumero implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            String entrada = e.getActionCommand();
            if(principio){
                pantalla.setText("");
                principio = false;
            }
            pantalla.setText(pantalla.getText() + entrada);
        }
    }
    
    private class AccionOrden implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            String operacion = e.getActionCommand();
            calcular(Double.parseDouble(pantalla.getText()));
            ultimaOperacion = operacion;
            principio = true;
        }
        public void calcular(double x){
            if(ultimaOperacion.equals("+")){
                resultado +=x;
            } else if (ultimaOperacion.equals("-")){
                resultado -=x;
            } else if (ultimaOperacion.equals("*")){
                resultado *=x;
            }else if (ultimaOperacion.equals("/")){
                resultado /=x;
            }else if (ultimaOperacion.equals("=")){
                resultado = x;
            }
            pantalla.setText("" + resultado);
        }
    }
    private JPanel lamina2;
    private JButton pantalla;
    private boolean principio;
    private double resultado;
    private String ultimaOperacion;
}

