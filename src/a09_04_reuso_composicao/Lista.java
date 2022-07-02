package a09_04_reuso_composicao;

public interface Lista<T> {

    public void adiciona(T elemento);
    public void adiciona(T elemento, int posicao);
    public void remove(int posicao);
    public T pega(int posicao);
    public int tamanho();
    public int busca(T elemento);
}
