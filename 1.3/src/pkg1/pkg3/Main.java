/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg1.pkg3;
import java.awt.event.*;
import java.awt.*;

import javax.swing.*;
import javax.swing.text.*;
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        
        MenuProcesador_II mimarco=new MenuProcesador_II();        
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
class MenuProcesador_II extends JFrame{
    
    public MenuProcesador_II(){
    setBounds(500,300,550,400);
    LaminaProcesador_II milamina=new LaminaProcesador_II();    
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
class LaminaProcesador_II extends JPanel{

    public LaminaProcesador_II(){
    
    setLayout(new BorderLayout()); 
    JPanel laminamenu=new JPanel();   
    JMenuBar mibarra=new JMenuBar();   
    JMenu fuente=new JMenu("Fuente");    
    JMenu estilo=new JMenu("Estilo");   
    JMenu tamagno=new JMenu("Tamano");
    JMenuItem arial=new JMenuItem("Arial");    
    arial.addActionListener(new ActionListener(){
    
        public void actionPerformed(ActionEvent e) {
           miarea.setFont(new Font("Arial",Font.PLAIN,12));
        }
    
    });
    
    JMenuItem courier=new JMenuItem("Courier");   
    courier.addActionListener(new ActionListener(){  
        
        public void actionPerformed(ActionEvent e) {
           miarea.setFont(new Font("Courier",Font.PLAIN,12));
        }
    
    });
    
    
    JMenuItem verdana=new JMenuItem("Verdana"); 
    verdana.addActionListener(new ActionListener(){
    
        public void actionPerformed(ActionEvent e) {
           miarea.setFont(new Font("Verdana",Font.PLAIN,12));
        }
    
    });
    
    fuente.add(arial);  
    fuente.add(courier);   
    fuente.add(verdana);    
    JMenuItem negrita=new JMenuItem("Negrita");  
    JMenuItem cursiva=new JMenuItem("Cursiva");   
    fuente.add(negrita);   
    fuente.add(cursiva);  
    JMenuItem tam_12=new JMenuItem("12"); 
    JMenuItem tam_16=new JMenuItem("16");    
    JMenuItem tam_20=new JMenuItem("20"); 
    JMenuItem tam_24=new JMenuItem("24");
    fuente.add(tam_12);    
    fuente.add(tam_16);    
    fuente.add(tam_20);    
    fuente.add(tam_24);    
    mibarra.add(fuente);   
    mibarra.add(estilo);    
    mibarra.add(tamagno);    
    laminamenu.add(mibarra);    
    add(laminamenu,BorderLayout.NORTH);    
    miarea=new JTextPane();    
    add(miarea,BorderLayout.CENTER);    
    }
   
    JTextPane miarea;
  
}