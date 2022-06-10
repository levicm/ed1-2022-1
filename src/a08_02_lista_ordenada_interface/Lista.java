package a08_02_lista_ordenada_interface;

public interface Lista<T> {

    public void adiciona(T elemento);
    public void adiciona(T elemento, int posicao);
    public void remove(int posicao);
    public T pega(int posicao);
    public int tamanho();
    public int busca(T elemento);
}
