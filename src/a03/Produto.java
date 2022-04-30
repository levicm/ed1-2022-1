package a03;

public class Produto {
    String nome;
    double preco;
    
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    // Métodos getters
    public String getNome() {
        return this.nome;
    }
    
    public double getPreco() {
        return this.preco;
    }

}
