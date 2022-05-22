package a06.p01;

public class TestBusca {

    public static void main(String[] args) {
        Lista<Aluno> lista = new Lista<Aluno>();
        lista.adiciona(new Aluno("Rafael", "rafael@gmail.com"));
        lista.adiciona(new Aluno("Paulo", "paulo@gmail.com"));
        lista.adiciona(new Aluno("Guilherme", "guilherme@gmail.com"));
        lista.adiciona(new Aluno("Marcos", "marcos@gmail.com"));
        
        System.out.println(lista);
        
        Aluno chave1 = new Aluno("Guilherme", "guilherme@yahoo.com");
        Aluno chave2 = new Aluno("Guilherme", "guilherme@gmail.com");
        
        System.out.println("Busca chave 1: " + lista.busca(chave1));
        System.out.println("Busca chave 2: " + lista.busca(chave2));
    }

}
