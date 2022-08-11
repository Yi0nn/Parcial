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

public class Cliente {
    public Cliente(String nombre, String n_cuenta, double saldo){
        this.nombre=nombre;
        this.n_cuenta=n_cuenta;
        this.saldo=saldo;
    }
    private String nombre;
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setN_cuenta(String n_cuenta) {
        this.n_cuenta = n_cuenta;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.saldo) ^ (Double.doubleToLongBits(this.saldo) >>> 32));
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
        final Cliente other = (Cliente) obj;
        return Double.doubleToLongBits(this.saldo) == Double.doubleToLongBits(other.saldo);
    }
    public String getNombre() {
        return nombre;
    }
    public String getN_cuenta() {
        return n_cuenta;
    }
    public double getSaldo() {
        return saldo;
    }
    private String n_cuenta;
    private double saldo;
}
