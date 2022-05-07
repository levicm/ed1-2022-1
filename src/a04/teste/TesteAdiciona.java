package a04.teste;

import a04.Aluno;
import a04.Lista;

public class TesteAdiciona {

    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.adiciona(new Aluno("Rafael", "rafael@gmail.com"));
        lista.adiciona(new Aluno("Paulo", "paulo@gmail.com"));
        
        System.out.println(lista);
    }

}
