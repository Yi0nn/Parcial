/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg14.pkg1;

public class Main {
    public static void main(String[] args) {
        int[][]matrix=new int[4][5];
        matrix[0][0]=10;
        matrix[0][1]=21;
        matrix[0][2]=22;
        matrix[0][3]=9;
        matrix[0][4]=1;
        matrix[1][0]=15;
        matrix[1][1]=31;
        matrix[1][2]=30;
        matrix[1][3]=5;
        matrix[1][4]=13;
        matrix[2][0]=11;
        matrix[2][1]=2;
        matrix[2][2]=49;
        matrix[2][3]=17;
        matrix[2][4]=8;
        matrix[3][0]=92;
        matrix[3][1]=14;
        matrix[3][2]=4;
        matrix[3][3]=42;
        matrix[3][4]=55;
        //System.out.println("valor almacenado en la posición2,3"+matrix[2][3]);
        for(int i=0;i<4;i++){
            System.out.println();
            for(int j=0;j<5;j++){
                System.out.print(matrix[i][j] + " ");
            }
        }
        int [][] matrix2={
            {10,15,18,19,21},
            {5,25,37,41,15},
            {7,19,32,14,90},
            {85,2,7,40,27}   
        };
        for(int[]fila:matrix2){
            System.out.println();
            for(int z:fila){
                System.out.print(z + " ");
            }
        }    
    }
    
}
