package a12_pilha;

public class PilhaArranjo<T> implements Pilha<T> {
	
	private Object[] arranjo = new Object[50];
	private int topo = -1;

	@Override
	public void adiciona(T elemento) {
		topo++;
		arranjo[topo] = elemento;
	}

	@Override
	public T remove() {
		T result = null;
		if (topo > -1) {
			result = (T) arranjo[topo];
			arranjo[topo] = null;
			topo--;
		}
		return result;
	}

	@Override
	public T consulta() {
		T result = null;
		if (topo > -1) {
			result = (T) arranjo[topo];
		}
		return result;
	}

	@Override
	public int tamanho() {
		return topo + 1;
	}

	@Override
	public boolean vazia() {
		return tamanho() == 0;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i <= topo; ++i) {
			if (i > 0) {
				sb.append(", ");
			}
			sb.append(arranjo[i]);
		}
		sb.append("]");
		return sb.toString();
	}
}
