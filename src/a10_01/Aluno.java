package a10_01;

public class Aluno {
    private String nome;
    private String email;
    
    public Aluno(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getEmail() {
        return email;
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
            if (obj instanceof Aluno) {
                Aluno aluno = (Aluno) obj;
                return nome.equals(aluno.getNome());
            }
        }
        return false;
    }
}
