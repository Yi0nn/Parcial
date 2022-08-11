/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg3.pkg4;

import java.io.File;
public class Main {
    public static void main(String[] args) {
        File archivo=new File("ejemplo_archivo");
        System.out.println(archivo.getAbsolutePath());
        String[] nombres_archivos = archivo.list();
        for(int i=0;i<nombres_archivos.length;i++){
            System.out.println(nombres_archivos[i]);           
            File f=new File(archivo.getAbsolutePath(),nombres_archivos[i]);
            if(f.isDirectory()){            
                String[] archivos_subcarpeta=f.list();                
                for(int j=0;j<archivos_subcarpeta.length;j++){                
                    System.out.println(archivos_subcarpeta[j]);   
                } 
            }        
        }
    }
    
}
