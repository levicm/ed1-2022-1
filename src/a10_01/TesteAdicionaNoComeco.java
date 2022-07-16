package a10_01;


public class TesteAdicionaNoComeco {

    /**
     * Esperado:
     * [Rafael, Paulo, Joao]
     * @param args
     */
    public static void main(String[] args) {
        ListaLigada<Aluno> lista = new ListaLigada<Aluno>();
        lista.adicionaNoComeco(new Aluno("Rafael", "rafael@gmail.com"));
        lista.adicionaNoComeco(new Aluno("Paulo", "paulo@gmail.com"));
        lista.adicionaNoComeco(new Aluno("Joao", "joao@gmail.com"));

        System.out.println(lista);
        String esperada = "[Joao, Paulo, Rafael]";
        String str = lista.toString();
        
        System.out.println(esperada.equals(str));
    }

}
