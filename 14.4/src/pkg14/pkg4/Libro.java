/*
 ──────▄▀▄─────▄▀▄
─────▄█░░▀▀▀▀▀░░█▄
─▄▄──█░░░░░░░░░░░█──▄▄
█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

Stefhania Noguera Romero

Curso Pildoras Informaticas 

Codigo: 202125854
 */
package pkg14.pkg4;

public class Libro {
    public Libro(String titulo, String autor, int ISBN){
        this.titulo=titulo;
        this.autor=autor;
        this.ISBN=ISBN;
    
    }
    public String getDatos(){
        return "El titulo es: " + titulo + ". El autor es: " + autor + ". Y el ISBN es: " + ISBN;
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.ISBN;
        return hash;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        return this.ISBN == other.ISBN;
    }
    private String titulo;
    private String autor;
    private int ISBN;
}
