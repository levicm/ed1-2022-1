package a04.teste;

import a04.Aluno;
import a04.Lista;

public class TesteTamanho {

    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.adiciona(new Aluno("Rafael", "rafael@gmail.com"));
        lista.adiciona(new Aluno("Paulo", "paulo@gmail.com"));
        
        boolean ok = lista.tamanho() == 2;
        if (ok) {
            System.out.println("Teste Ok!");
        } else {
            System.out.println("Teste falhou!");
        }
    }

}
