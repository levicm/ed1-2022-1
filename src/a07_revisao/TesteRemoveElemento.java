package a07_revisao;

public class TesteRemoveElemento {

    public static void main(String[] args) {
        Lista<Aluno> lista = new ListaArranjo<Aluno>();
        lista.adiciona(new Aluno("Rafael", "rafael@gmail.com"));
        lista.adiciona(new Aluno("Paulo", "paulo@gmail.com"));
        lista.adiciona(new Aluno("Guilherme", "guilherme@gmail.com"));
        lista.adiciona(new Aluno("Marcos", "marcos@gmail.com"));
        
        System.out.println(lista);
        
        Aluno chave1 = new Aluno("Guilherme", "guilherme@yahoo.com");
        System.out.println("Tentando remover " + chave1);
        lista.remove(chave1);
        System.out.println(lista);
        
        Aluno chave2 = new Aluno("Guilherme", "guilherme@gmail.com");
        System.out.println("Tentando remover " + chave2);
        lista.remove(chave2);
        System.out.println(lista);
    }

}
