package a06.p01;

import a04.Aluno;

public class TesteEquals {

    public static void main(String[] args) {
        Aluno a = new Aluno("Marcos", "marcos@gmail.com");
        Aluno b = new Aluno("Marcos", "marcos@gmail.com");
        Aluno c = new Aluno("Marcos", "marcos@yahoo.com");
        Aluno d = new Aluno("Joao", "joao@yahoo.com");
        
        System.out.println(a.equals(a));
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.equals(d));
        System.out.println(a.equals("Marcos"));
        System.out.println(a.equals(null));
    }

}
