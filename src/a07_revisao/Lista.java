package a07_revisao;

public interface Lista<T> {

    public void adiciona(T elemento);
    public void adiciona(T elemento, int posicao);
    public void remove(int posicao);
    public T pega(int posicao);
    public int tamanho();
    public int busca(T elemento);
    public void remove(T elemento);
    public void removeTodos(T elemento);
    public void copia(T[] arranjo);
    public void substitui(T[] arranjo);
    public void substitui(T de, T para);
}
