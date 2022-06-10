package a08_02_lista_ordenada;

public class ListaOrdenada {
    private Object[] arranjo = new Object[20];
    private int total = 0;

    public void adiciona(Comparable elemento) {
        garanteEspaco();
        boolean inseriuNoMeio = false;
        // Procura a posição correta para inserir
        for (int i = 0; i < total; ++i) {
            if (elemento.compareTo(arranjo[i]) < 0) {
                // Faz o deslocamento
                for (int j = total; j > i; j--) {
                    arranjo[j] = arranjo[j - 1];
                }
                // Insere o 1novo elemento na posição correta
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

    private void garanteEspaco() {
        if (total == arranjo.length) {
            System.out.println("Arranjo lotado! Dobrando seu tamanho...");
            int novoTamanho = arranjo.length * 2;
            Object[] novoArranjo = new Object[novoTamanho];
            for (int i = 0; i < arranjo.length; ++i) {
                novoArranjo[i] = arranjo[i];
            }
            arranjo = novoArranjo;
        }

    }

    public Object pega(int posicao) {
        if (posicao < total) {
            return arranjo[posicao];
        } else {
            return null;
        }
    }

    public int tamanho() {
        return total;
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
