package a10_01;

public class Celula<T> {
    private T elemento;
    private Celula<T> proximo;
    
    public Celula(T elemento, Celula<T> proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }
    
    public Celula(T elemento) {
        this.elemento = elemento;
    }
    
    public void setProximo(Celula<T> proximo) {
        this.proximo = proximo;
    }
    
    public Celula<T> getProximo() {
        return proximo;
    }

    public T getElemento() {
        return elemento;
    }
}
