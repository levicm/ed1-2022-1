package a07_revisao;

public class TesteRemoveTodos {

    public static void main(String[] args) {
        Lista<Aluno> lista = new ListaArranjo<Aluno>();
        lista.adiciona(new Aluno("Rafael", "rafael@gmail.com"));
        lista.adiciona(new Aluno("Paulo", "paulo@gmail.com"));
        lista.adiciona(null);
        lista.adiciona(new Aluno("Guilherme", "guilherme@gmail.com"));
        lista.adiciona(new Aluno("Marcos", "marcos@gmail.com"));
        lista.adiciona(new Aluno("Guilherme", "guilherme@gmail.com"));
        lista.adiciona(new Aluno("Maria", "maria@gmail.com"));
        lista.adiciona(new Aluno("Guilherme", "guilherme@gmail.com"));
        lista.adiciona(new Aluno("Carlos", "carlos@gmail.com"));

        System.out.println(lista.pega(2));
        
        System.out.println(lista);
        
        Aluno chave1 = new Aluno("Guilherme", "guilherme@gmail.com");
        System.out.println("Tentando remover " + chave1);
        lista.removeTodos(chave1);
        System.out.println(lista);
    }

}
