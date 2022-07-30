package a13_fila;

public class Celula<T> {
    private T elemento;
    private Celula<T> proximo;
    private Celula<T> anterior;
    
    public Celula(T elemento, Celula<T> proximo, Celula<T> anterior) {
        this.elemento = elemento;
        this.proximo = proximo;
        this.anterior = anterior;
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

    public void setAnterior(Celula<T> anterior) {
		this.anterior = anterior;
	}
    
    public Celula<T> getAnterior() {
		return anterior;
	}
    
    public T getElemento() {
        return elemento;
    }
}
