package a10_01;

public class ListaLigada<T> {
    private Celula<T> inicio;
    private int total = 0;
    
    public void adiciona(T elemento) {
        if (inicio == null) {
            adicionaNoComeco(elemento);
        } else {
            Celula<T> atual = inicio;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            Celula<T> nova = new Celula<T>(elemento);
            atual.setProximo(nova);
            total++;
        }
    }
    public void adiciona(T elemento, int posicao) {
        if (posicao == 0) {
            adicionaNoComeco(elemento);
        } else if (posicao == total) {
            adiciona(elemento);
        } else {
            Celula<T> anterior = pegaCelula(posicao - 1);
            Celula<T> nova = new Celula<T>(elemento, anterior.getProximo());
            anterior.setProximo(nova);
            total++;
        }
        
    }
    public void adicionaNoComeco(T elemento) {
        Celula<T> celula = new Celula<T>(elemento);
        celula.setProximo(inicio);
        inicio = celula;
        total++;
    }
    
    public void remove(int posicao) {
        if (posicaoOcupada(posicao)) {
            if (posicao == 0) {
                inicio = inicio.getProximo();
            } else {
                Celula<T> anterior = pegaCelula(posicao - 1);
                Celula<T> remover = anterior.getProximo();
                anterior.setProximo(remover.getProximo());
            }
            total--;
        }
    }
    
    public T pega(int posicao) {
        if (posicaoOcupada(posicao)) {
            return pegaCelula(posicao).getElemento();
        }
        return null;
    }

    private Celula<T> pegaCelula(int posicao) {
        Celula<T> atual = inicio;
        for (int i = 0; i < posicao && atual != null; ++i) {
            atual = atual.getProximo();
        }
        return atual;
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < total;
    }

    public int tamanho() {
        return total;
    }
    public int busca(T elemento) {
        Celula<T> celula = inicio;
        for (int i = 0; i < total && celula != null; ++i) {
            if (celula.getElemento().equals(elemento)) {
                return i;
            }
            celula = celula.getProximo();
        }
        return -1;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Celula<T> celula = inicio;
        while (celula != null) {
            if (sb.length() > 1) {
                sb.append(", ");
            }
            sb.append(celula.getElemento());
            celula = celula.getProximo();
        }
        sb.append("]");
        return sb.toString();
    }

}
