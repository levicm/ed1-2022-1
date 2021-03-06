package a09_02_busca_binaria;

public class ListaOrdenada<T extends Comparable<T>> implements Lista<T> {
    private Object[] arranjo = new Object[20];
    private int total = 0;

    public void adiciona(T elemento) {
        garanteEspaco();
        boolean inseriuNoMeio = false;
        // Procura a posi??o correta para inserir
        for (int i = 0; i < total; ++i) {
            if (elemento.compareTo((T) arranjo[i]) < 0) {
                // Faz o deslocamento
                for (int j = total; j > i; j--) {
                    arranjo[j] = arranjo[j - 1];
                }
                // Insere o 1novo elemento na posi??o correta
                arranjo[i] = elemento;
                inseriuNoMeio = true;
                break;
            }
        }
        if (!inseriuNoMeio) {
            // Insere no final
            arranjo[total] = elemento;
        }
        total++;
    }

    @Override
    public void adiciona(T elemento, int posicao) {
        adiciona(elemento);
    }

    private void garanteEspaco() {
        if (total == arranjo.length) {
            System.out.println("Arranjo lotado! Dobrando seu tamanho...");
            int novoTamanho = arranjo.length * 2;
            Object[] novoArranjo = new Object[novoTamanho];
            for (int i = 0; i < arranjo.length; ++i) {
                novoArranjo[i] = arranjo[i];
            }
            arranjo = (T[]) novoArranjo;
        }

    }

    public T pega(int posicao) {
        if (posicao < total) {
            return (T) arranjo[posicao];
        } else {
            return null;
        }
    }

    public int tamanho() {
        return total;
    }

    @Override
    public void remove(int posicao) {
        // Testa se ? posicao v?lida
        if (posicao < total) {
            for (int i = posicao; i < total; ++i) {
                arranjo[i] = arranjo[i + 1];
            }
            total--;
        }
    }

    @Override
    public int busca(T elemento) {
        int instrucoes = 0;

        int esquerda = 0;
        int direita = total - 1;
        try {
            while (esquerda <= direita) {
                int meio = (esquerda + direita) / 2;
                instrucoes++;
                int result = elemento.compareTo((T) arranjo[meio]);
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

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer("[");
        for (int i = 0; i < total; ++i) {
            if (i > 0) {
                result.append(", ");
            }
            result.append(arranjo[i].toString());
        }
        result.append("]");
        return result.toString();
    }
}
