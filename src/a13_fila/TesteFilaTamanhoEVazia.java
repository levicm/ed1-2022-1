package a13_fila;

public class TesteFilaTamanhoEVazia {

	public static void main(String[] args) {
		Fila<Aluno> fila = new FilaLigada<Aluno>();

		System.out.println(fila.tamanho() == 0);
		System.out.println(fila.vazia() == true);
		fila.adiciona(new Aluno("João", "joao@gmail.com"));
		fila.adiciona(new Aluno("Maria", "maria@gmail.com"));
		fila.adiciona(new Aluno("Joana", "joana@gmail.com"));
		System.out.println(fila.tamanho() == 3);
		System.out.println(fila.vazia() == false);


		fila.remove();
		System.out.println(fila.tamanho() == 2);
		System.out.println(fila.vazia() == false);

		fila.remove();
		fila.remove();

		System.out.println(fila.tamanho() == 0);
		System.out.println(fila.vazia() == true);
	}

}
