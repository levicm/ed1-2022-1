package a09_04_reuso_composicao;

public class ListaOrdenada<T extends Comparable<T>> implements Lista<T> {
    
    private ListaArranjo<T> lista = new ListaArranjo<T>();

    public void adiciona(T elemento) {
        boolean inseriuNoMeio = false;
        // Procura a posição correta para inserir
        for (int i = 0; i < tamanho(); ++i) {
            if (elemento.compareTo(pega(i)) < 0) {
                lista.adiciona(elemento, i);
                inseriuNoMeio = true;
                break;
            }
        }
        if (!inseriuNoMeio) {
            // Insere no final
            lista.adiciona(elemento);
        }
    }

    @Override
    public void adiciona(T elemento, int posicao) {
        adiciona(elemento);
    }

    @Override
    public void remove(int posicao) {
        lista.remove(posicao);
    }

    @Override
    public T pega(int posicao) {
        return lista.pega(posicao);
    }

    @Override
    public int tamanho() {
        return lista.tamanho();
    }

    @Override
    public int busca(T elemento) {
        int instrucoes = 0;

        int esquerda = 0;
        int direita = tamanho() - 1;
        try {
            while (esquerda <= direita) {
                int meio = (esquerda + direita) / 2;
                instrucoes++;
                int result = elemento.compareTo(pega(meio));
                if (result == 0) {
                    return meio;
                } else if (result < 0) {
                    // Se o elemento procurado for menor que o meio,
                    // vai pra esquerda
                    direita = meio - 1;
                } else {
                    // Se o elemento procurado for meior que o meio,
                    // vai pra direita
                    esquerda = meio + 1;
                }
            }
            return -1;
        } finally {
            System.out.println("Instrucoes: " + instrucoes);
        }
    }
}
