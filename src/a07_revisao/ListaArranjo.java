package a07_revisao;

public class ListaArranjo<T> implements Lista<T> {
    private T[] arranjo = (T[]) new Object[20];
    private int total = 0;
    
    public void adiciona(T elemento) {
        garanteEspaco();
        arranjo[total] = elemento;
        total++;
    }
    
    public void adiciona(T elemento, int posicao) {
        garanteEspaco();
        // Verifica se a posicao é válida
        if (posicao <= total) {
            // Se a posicao informada for a última, 
            // pode-se usar o adiciona(Object)
            if (posicao == total) {
                arranjo[posicao] = elemento;
            } else {
                for (int i = total; i > posicao; --i) {
                    arranjo[i] = arranjo[i - 1];
                }
                arranjo[posicao] = elemento;
            }
            total++;
        } else {
            throw new RuntimeException("Posicao inválida: " + posicao + ". A lista tem " + total + " elementos!");
        }
    }
    
    private void garanteEspaco() {
        if (total == arranjo.length) {
            System.out.println("Arranjo lotado! Dobrando seu tamanho...");
            int novoTamanho = arranjo.length * 2;
            T[] novoArranjo = (T[]) new Object[novoTamanho];
//            System.arraycopy(arranjo, 0, novoArranjo, 0, arranjo.length);
            for (int i = 0; i < arranjo.length; ++i) {
                novoArranjo[i] = arranjo[i];
            }
            arranjo = novoArranjo;
        }
        
    }

    public void remove(int posicao) {
        // Testa se é posicao válida
        if (posicao < total) {
            for (int i = posicao; i < total; ++i) {
                arranjo[i] = arranjo[i + 1];
            }
            total--;
        }
    }
   
    public T pega(int posicao) {
        if (posicao < total) {
            return arranjo[posicao];
        } else {
            return null;
        }
    }
    
    public int tamanho() {
        return total;
    }
    
    public int busca(T elemento) {
        int result = -1;
        for (int i = 0; i < arranjo.length; i++) {
            if (elemento.equals(arranjo[i])) {
                result = i;
                break;
            }
        }
        return result;
    }

    @Override
    public void remove(T elemento) {
        int posicao = busca(elemento);
        if (posicao > -1) {
            remove(posicao);
        }
    }

    public void removeTodos_old(T elemento) {
        int posicao = busca(elemento);
        while (posicao > -1) {
            remove(posicao);
            posicao = busca(elemento);
        }
    }

    public void removeTodos(T elemento) {
        T[] novoArranjo = (T[]) new Object[arranjo.length];
        int posicao = 0;
        for (int i = 0; i < total; ++i) {
            if (!elemento.equals(arranjo[i])) {
                novoArranjo[posicao++] = arranjo[i];
            }
        }
        arranjo = novoArranjo;
        total = posicao;
    }

    @Override
    public void copia(T[] arranjo) {
        for (int i = 0; i < arranjo.length; i++) {
            adiciona(arranjo[i]);
        }
    }

    @Override
    public void substitui(T[] arranjo) {
        this.arranjo = arranjo;
        total = arranjo.length;
    }
    
    public void substitui(T de, T para) {
        for (int i = 0; i < total; ++i) {
            if (de.equals(arranjo[i])) {
                arranjo[i] = para;
            }
        }
    }
    
    @Override
    public String toString() {
        StringBuffer result = new StringBuffer("[");
        for (int i = 0; i < total; ++i) {
            if (i > 0) {
                result.append(", ");
            }
            result.append(arranjo[i]);
        }
        result.append("]");
        return result.toString();
    }
    
    public boolean igual(Lista lista) {
        boolean resultado = false;
        if (this.tamanho() == lista.tamanho()) {
            for (int i = 0; i < this.total; ++i) {
                if (!pega(i).equals(lista.pega(i))) {
                    resultado =  false;
                    break;
                }
                resultado = true;
            }
        }
        return resultado;
    }
    
    public boolean igual(ListaArranjo lista) {
        boolean resultado = false;
        if (this.total == lista.total) {
            for (int i = 0; i < this.total; ++i) {
                if (!pega(i).equals(lista.pega(i))) {
                    resultado =  false;
                    break;
                }
                resultado = true;
            }
        }
        return resultado;
    }
    
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else {
            if (obj instanceof Lista) {
                Lista lista = (Lista) obj;
                if (tamanho() == lista.tamanho()) {
                    for (int i = 0; i < tamanho(); ++i) {
                        if (!pega(i).equals(lista.pega(i))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }
    }
}
