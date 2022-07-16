package a10_01;


public class TesteAdiciona {

    /**
     * Esperado:
     * [Rafael, Paulo, Joao]
     * @param args
     */
    public static void main(String[] args) {
        ListaLigada<Aluno> lista = new ListaLigada<Aluno>();
        lista.adiciona(new Aluno("Rafael", "rafael@gmail.com"));
        lista.adiciona(new Aluno("Paulo", "paulo@gmail.com"));
        lista.adiciona(new Aluno("Joao", "joao@gmail.com"));
        
        System.out.println(lista);
        String esperado = "[Rafael, Paulo, Joao]";
        String str = lista.toString();
        
        System.out.println(esperado.equals(str));
    }

}
