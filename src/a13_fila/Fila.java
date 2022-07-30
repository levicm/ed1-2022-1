package a13_fila;

public interface Fila<T> {
	
	public void adiciona(T elemento);
	public T remove();
	public T consulta();
	public int tamanho();
	public boolean vazia();
}
