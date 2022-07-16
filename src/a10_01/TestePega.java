package a10_01;

public class TestePega {

    public static void main(String[] args) {
        ListaLigada<Aluno> lista = new ListaLigada<Aluno>();
        lista.adiciona(new Aluno("Rafael", "rafael@gmail.com"));
        lista.adiciona(new Aluno("Paulo", "paulo@gmail.com"));
        lista.adiciona(new Aluno("Joao", "joao@gmail.com"));
        lista.adiciona(new Aluno("Maria", "maria@gmail.com"));
        lista.adiciona(new Aluno("Pedro", "pedro@gmail.com"));
        
        System.out.println(lista);
        String esperado = "Joao";
        String str = lista.pega(2).toString();
        
        System.out.println(esperado.equals(str));
    }

}
