package a09_03_reuso_heranca;

public class ListaOrdenadaBinaria<T extends Comparable<T>> extends ListaOrdenada<T> {

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
