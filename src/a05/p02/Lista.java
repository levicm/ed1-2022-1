package a05.p02;

public class Lista {
    private Object[] arranjo = new Object[20];
    private int total = 0;
    
    public void adiciona(Object elemento) {
        garanteEspaco();
        arranjo[total] = elemento;
        total++;
    }
    
    public void adiciona(Object elemento, int posicao) {
        garanteEspaco();
        // Verifica se a posicao � v�lida
        if (posicao <= total) {
            // Se a posicao informada for a �ltima, 
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
            throw new RuntimeException("Posicao inv�lida: " + posicao + ". A lista tem " + total + " elementos!");
        }
    }
    
    private void garanteEspaco() {
        if (total == arranjo.length) {
            System.out.println("Arranjo lotado! Dobrando seu tamanho...");
            int novoTamanho = arranjo.length * 2;
            Object[] novoArranjo = new Object[novoTamanho];
//            System.arraycopy(arranjo, 0, novoArranjo, 0, arranjo.length);
            for (int i = 0; i < arranjo.length; ++i) {
                novoArranjo[i] = arranjo[i];
            }
            arranjo = novoArranjo;
        }
        
    }

    public void remove(int posicao) {
        // Testa se � posicao v�lida
        if (posicao < total) {
            for (int i = posicao; i < total; ++i) {
                arranjo[i] = arranjo[i + 1];
            }
            total--;
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