package a09_03_reuso_heranca;

public class ListaOrdenada<T extends Comparable<T>> extends ListaArranjo<T> {

    public void adiciona(T elemento) {
        boolean inseriuNoMeio = false;
        // Procura a posição correta para inserir
        for (int i = 0; i < tamanho(); ++i) {
            if (elemento.compareTo(pega(i)) < 0) {
                super.adiciona(elemento, i);
                inseriuNoMeio = true;
                break;
            }
        }
        if (!inseriuNoMeio) {
            // Insere no final
            super.adiciona(elemento);
        }
    }

    @Override
    public void adiciona(T elemento, int posicao) {
        adiciona(elemento);
    }
}
