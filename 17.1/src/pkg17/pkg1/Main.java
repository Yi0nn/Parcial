/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg17.pkg1;

/**
 *
 * @author Mi pc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double acumulado;
        double interes = 0.10;
        double[][]saldo = new double[6][5];
        
        for(int i=0;i<6;i++){
            saldo[i][0] = 10000;
            acumulado = 10000;
            for(int j=1;j<5;j++){
                acumulado = acumulado+(acumulado*interes);
                saldo[i][j] = acumulado;
            }
            interes = interes + 0.01;
        }
        for (int z=0; z<6; z++){
            System.out.println();
            for (int h=0; h<5; h++){
                System.out.printf("%1.2f", saldo[z][h]);
                System.out.println();
            }
        }
    }
    
}
