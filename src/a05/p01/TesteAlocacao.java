package a05.p01;

public class TesteAlocacao {

    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        Lista lista = new Lista();
        for (int i = 0; i < 120000; ++i) {
            Aluno aluno = new Aluno("Nome " + i, "nome" + i + "@gmail.com");
            lista.adiciona(aluno);
        }
//        System.out.println(lista);
        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Tempo: " + tempo);
    }

}
