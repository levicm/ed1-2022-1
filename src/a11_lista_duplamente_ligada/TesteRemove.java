package a11_lista_duplamente_ligada;


public class TesteRemove {

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
        String esperado = "[Pedro, Rafael, Maria, Paulo, Joao, Marcos]";
        lista.remove(0);
        lista.remove(2);
        lista.remove(3);
        System.out.println(lista);

        esperado = "[Rafael, Maria, Joao]";
        String str = lista.toString();
        
        System.out.println(esperado.equals(str));
    }

}
