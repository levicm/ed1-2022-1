package a12_pilha;

public class Peca {
    private String nome;
    
    public Peca(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    @Override
    public String toString() {
        return this.nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else {
            if (obj instanceof Peca) {
                Peca aluno = (Peca) obj;
                return nome.equals(aluno.getNome());
            }
        }
        return false;
    }
}
