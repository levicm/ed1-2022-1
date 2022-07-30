package a12_pilha;

public interface Pilha<T> {

	public void adiciona(T elemento);
	public T remove();
	public T consulta();
	public int tamanho();
	public boolean vazia();
}
