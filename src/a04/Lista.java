package a04;

public class Lista {
    private Aluno[] arranjo = new Aluno[100];
    private int totalDeAlunos = 0;
    
    public void adiciona(Aluno aluno) {
        arranjo[totalDeAlunos] = aluno;
        totalDeAlunos++;
    }
    
    public void adiciona(Aluno aluno, int posicao) {
        // Verifica se a posicao é válida
        if (posicao <= totalDeAlunos) {
            // Se a posicao informada for a última, 
            // pode-se usar o adiciona(Aluno)
            if (posicao == totalDeAlunos) {
                arranjo[posicao] = aluno;
            } else {
                for (int i = totalDeAlunos; i > posicao; --i) {
                    arranjo[i] = arranjo[i - 1];
                }
                arranjo[posicao] = aluno;
            }
            totalDeAlunos++;
        }
    }
    
    public void remove(int posicao) {
        // Testa se é posicao válida
        if (posicao < totalDeAlunos) {
            for (int i = posicao; i < totalDeAlunos; ++i) {
                arranjo[i] = arranjo[i + 1];
            }
            totalDeAlunos--;
        }
    }
   
    public Aluno pega(int posicao) {
        if (posicao < totalDeAlunos) {
            return arranjo[posicao];
        } else {
            return null;
        }
    }
    
    public int tamanho() {
        return totalDeAlunos;
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer("[");
        for (int i = 0; i < totalDeAlunos; ++i) {
            if (i > 0) {
                result.append(", ");
            }
            result.append(arranjo[i].toString());
        }
        result.append("]");
        return result.toString();
    }
}
