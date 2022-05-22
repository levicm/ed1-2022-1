package a05.p02;

public class TesteAdicionaNaPosicao {

    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.adiciona(new Aluno("Rafael", "rafael@gmail.com"));
        lista.adiciona(new Aluno("Paulo", "paulo@gmail.com"));
        lista.adiciona(new Aluno("Joao", "joao@gmail.com"), 2);
        
        System.out.println(lista);

        lista.adiciona(new Aluno("Maria", "maria@gmail.com"), 5);

        System.out.println(lista);
    }

}
