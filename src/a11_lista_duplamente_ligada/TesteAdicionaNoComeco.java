package a11_lista_duplamente_ligada;


public class TesteAdicionaNoComeco {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ListaDuplamenteLigada<Aluno> lista = new ListaDuplamenteLigada<Aluno>();
        lista.adicionaNoComeco(new Aluno("Rafael", "rafael@gmail.com"));
        lista.adicionaNoComeco(new Aluno("Paulo", "paulo@gmail.com"));
        lista.adicionaNoComeco(new Aluno("Joao", "joao@gmail.com"));

        System.out.println(lista);
        String esperada = "[Joao, Paulo, Rafael]";
        String str = lista.toString();
        
        System.out.println(esperada.equals(str));
    }

}
