package a09_03_reuso_heranca;

public interface Lista<T> {

    public void adiciona(T elemento);
    public void adiciona(T elemento, int posicao);
    public void remove(int posicao);
    public T pega(int posicao);
    public int tamanho();
    public int busca(T elemento);
}
