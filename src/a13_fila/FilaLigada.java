package a13_fila;

public class FilaLigada<T> implements Fila<T> {
	
	private Celula<T> inicio;
	private Celula<T> fim;
	
	private int total;
	
	@Override
	public void adiciona(T elemento) {
		Celula<T> nova = new Celula<T>(elemento);
		if (total == 0) {
			inicio = nova;
		} else {
			fim.setProximo(nova);
			nova.setAnterior(fim);
		}
		fim = nova;
		total++;
	}

	@Override
	public T remove() {
		T result = null;
		if (total > 0) {
			result = inicio.getElemento();
			if (total == 1) {
				inicio = null;
				fim = null;
			} else {
				inicio = inicio.getProximo();
				inicio.setAnterior(null);
			}
			total--;
		}
		return result;
	}

	@Override
	public T consulta() {
		if (inicio != null) {
			return inicio.getElemento();
		}
		return null;
	}

	@Override
	public int tamanho() {
		return total;
	}

	@Override
	public boolean vazia() {
		return total == 0;
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
