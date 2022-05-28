package a07_revisao;

public class TesteCopia {

    public static void main(String[] args) {
        Lista<Aluno> lista = new ListaArranjo<Aluno>();
        lista.adiciona(new Aluno("Rafael", "rafael@gmail.com"));
        lista.adiciona(new Aluno("Paulo", "paulo@gmail.com"));
        lista.adiciona(new Aluno("Guilherme", "guilherme@gmail.com"));
        lista.adiciona(new Aluno("Marcos", "marcos@gmail.com"));

        System.out.println(lista);

        Aluno[] arranjo = new Aluno[] { 
                new Aluno("Maria", "maria@gmail.com"), 
                new Aluno("João", "joão@gmail.com"),
                new Aluno("Carlos", "carlos@gmail.com") };

        lista.copia(arranjo);
        System.out.println(lista);
        
//        testeVolume();
    }
    
    public static void testeVolume() {
        Lista<Aluno> lista = new ListaArranjo<Aluno>();

        System.out.println(lista);

        int tamanho = 100000;
        Aluno[] arranjo = new Aluno[tamanho];
        for (int i = 0; i < tamanho; ++i) {
            arranjo[i] = new Aluno("Nome " + i, "nome"+i+"@gmail.com");
        }
        
        lista.copia(arranjo);
        System.out.println(lista);
    }

}
