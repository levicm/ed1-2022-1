package a04.teste;

import a04.Aluno;
import a04.Lista;

public class TesteAdicionaNaPosicao {

    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.adiciona(new Aluno("Rafael", "rafael@gmail.com"));
        lista.adiciona(new Aluno("Paulo", "paulo@gmail.com"));
        lista.adiciona(new Aluno("Maria", "maria@gmail.com"), 1);
        lista.adiciona(new Aluno("João", "joão@gmail.com"), 0);
        lista.adiciona(new Aluno("Helena", "helena@gmail.com"), 4);
        
        System.out.println(lista);
        
        if (lista.toString().equals("[João, Rafael, Maria, Paulo, Helena]")) {
            System.out.println("Teste Ok!");
        } else {
            System.out.println("Teste falhou!");
        }
    }

}
