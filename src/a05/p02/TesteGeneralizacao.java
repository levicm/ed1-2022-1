package a05.p02;

public class TesteGeneralizacao {

    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.adiciona(new Aluno("Rafael", "rafael@gmail.com"));
        lista.adiciona(new Aluno("Paulo", "paulo@gmail.com"));
        
        System.out.println(lista);
        
        Aluno aluno1 = (Aluno) lista.pega(1);
        System.out.println("Nome do segundo aluno: " + aluno1.getNome());
        
        lista.adiciona("Teste de objeto");
        Aluno aluno2 = (Aluno) lista.pega(2);
        System.out.println("Nome do segundo aluno: " + aluno1.getNome());
    }

}
