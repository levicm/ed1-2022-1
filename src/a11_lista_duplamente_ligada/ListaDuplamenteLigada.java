package a11_lista_duplamente_ligada;

public class ListaDuplamenteLigada<T> {

	private Celula<T> inicio;
	private Celula<T> fim;
	
	int total;
	
	public void adicionaNoComeco(T elemento) {
		Celula<T> nova = new Celula<T>(elemento);
		if (total == 0) {
			inicio = nova;
			fim = nova;
		} else {
			inicio.setAnterior(nova);
			nova.setProximo(inicio);
			inicio = nova;
		}
		total++;
	}
	
	public void adiciona(T elemento) {
		if (total == 0) {
			adicionaNoComeco(elemento);
		} else {
			Celula<T> nova = new Celula<T>(elemento);
			nova.setAnterior(fim);
			fim.setProximo(nova);
			fim = nova;
			total++;
		}
	}
	
	public void adiciona(T elemento, int posicao) {
		if (posicao == 0) {
			adicionaNoComeco(elemento);
		} else if (posicao == total) {
			adiciona(elemento);
		} else {
			if (posicaoOcupada(posicao)) {
				Celula<T> nova = new Celula<T>(elemento);
	
				Celula<T> atual = pegaCelula(posicao);
				Celula<T> anterior = atual.getAnterior();
	
				anterior.setProximo(nova);
				nova.setAnterior(anterior);
				
				atual.setAnterior(nova);
				nova.setProximo(atual);
				total++;
			}
		}
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

	public void remove(int posicao) {
		if (total == 1) {
			inicio = null;
			fim = null;
 		} else if (posicao == 0) {
 			inicio = inicio.getProximo();
 			inicio.setAnterior(null);
 		} else if (posicao == total - 1) {
 			fim = fim.getAnterior();
 			fim.setProximo(null);
 		} else {
 			Celula<T> atual = pegaCelula(posicao);
 			Celula<T> antes = atual.getAnterior();
 			Celula<T> depois = atual.getProximo();
 			
 			depois.setAnterior(antes);
 			antes.setProximo(depois);
 		}
		total--;
	}
	
	public int tamanho() {
		return total;
	}
	
	public T pega(int posicao) {
		return pegaCelula(posicao).getElemento();
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
