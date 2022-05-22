package a06.p01;

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
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        } else {
            if (obj instanceof Aluno) {
                Aluno a = (Aluno) obj;
                if (nome.equals(a.nome) && email.equals(a.email)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public String toString() {
        return this.nome;
    }

}
