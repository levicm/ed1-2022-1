package a05.p03;

public class TesteGenerics {

    public static void main(String[] args) {
        Lista<Aluno> lista = new Lista<Aluno>();
        lista.adiciona(new Aluno("Rafael", "rafael@gmail.com"));
        lista.adiciona(new Aluno("Paulo", "paulo@gmail.com"));
        
        System.out.println(lista);
        
        Aluno aluno1 = lista.pega(1);
        System.out.println("Nome do segundo aluno: " + aluno1.getNome());        
    }

}
