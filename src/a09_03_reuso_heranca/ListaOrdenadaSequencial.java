package a09_03_reuso_heranca;

public class ListaOrdenadaSequencial<T extends Comparable<T>> extends ListaOrdenada<T> {

    public int busca(T elemento) {
        int instrucoes = 0;
        try {
            for (int i = 0; i < tamanho(); i++) {
                instrucoes++;
                int result = elemento.compareTo((T) pega(i));
                if (result == 0) {
                    return i;
                } else if (result < 0) {
                    // Pára no meio da busca se o elemento for menor que o que
                    // está na estrutura
                    return -1;
                }
            }
            return -1;
        } finally {
            System.out.println("Instrucoes: " + instrucoes);
        }
    }
}
