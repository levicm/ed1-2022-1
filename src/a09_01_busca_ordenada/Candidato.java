package a09_01_busca_ordenada;

public class Candidato implements Comparable<Candidato> {

    private String nome;
    private int idade;
    private int nota;

    public Candidato(String nome, int idade) {
        super();
        this.nome = nome;
        this.idade = idade;
    }

    public Candidato(String nome, int idade, int nota) {
        super();
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }
    
    public String getNome() {
        return nome;
    }
    
    public int getIdade() {
        return idade;
    }

    public int getNota() {
        return nota;
    }
    
    @Override
    public String toString() {
        return this.nome + " (" + this.idade + "): " + this.nota;
    }

    @Override
    public int compareTo(Candidato o) {
        if (nota > o.nota) {
            return 1;
        } else if (nota < o.nota) {
            return -1;
        } else {
            if (idade > o.idade) {
                return 1;
            } else if (idade < o.idade) {
                return -1;
            }
        }
        return 0;
    }
    
}
