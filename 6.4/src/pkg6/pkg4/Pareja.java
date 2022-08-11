
package pkg6.pkg4;

public class Pareja<T> {
    
    public Pareja(){
    
        primero=null;
    
    }
    
    public void setPrimero(T nuevoValor){
    
        primero=nuevoValor;
    
    }
    
    public T getPrimero(){
    
        return primero;
    
    }
    
    private T primero;
    
}
