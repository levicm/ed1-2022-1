package a11_lista_duplamente_ligada;


public class TesteBusca {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ListaDuplamenteLigada<Aluno> lista = new ListaDuplamenteLigada<Aluno>();
        lista.adiciona(new Aluno("Rafael", "rafael@gmail.com"));
        lista.adiciona(new Aluno("Paulo", "paulo@gmail.com"));
        lista.adiciona(new Aluno("Joao", "joao@gmail.com"));
        lista.adiciona(new Aluno("Maria", "maria@gmail.com"), 1);
        lista.adiciona(new Aluno("Pedro", "pedro@gmail.com"), 0);
        lista.adiciona(new Aluno("Marcos", "marcos@gmail.com"), 5);
        
        System.out.println(lista);
        String str = "[Pedro, Rafael, Maria, Paulo, Joao, Marcos]";
        
        Aluno aluno = new Aluno("Joao", "joao@gmail.com");
        int esperado = 4;
        int posicao = lista.busca(aluno);
        System.out.println(posicao);
       
        System.out.println(esperado == posicao);
    }

}
