/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg7.pkg3;
import javax.swing.*;
public class Lamina_Botones extends JPanel{
    public Lamina_Botones(String titulo, String [] opciones){
        setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), titulo));
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        ButtonGroup grupo=new ButtonGroup();
        for(int i=0; i<opciones.length; i++){
            JRadioButton bot=new JRadioButton(opciones[i]);
            bot.setActionCommand(opciones[i]);
            add(bot);
            grupo.add(bot);
            bot.setSelected(i==0);
        }
    }
    public String dameSeleccion(){
        return grupo.getSelection().getActionCommand();
    }
    private ButtonGroup grupo;
}
