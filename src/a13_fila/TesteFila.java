package a13_fila;

public class TesteFila {

	public static void main(String[] args) {
		Fila<Aluno> fila = new FilaLigada<Aluno>();

		System.out.println(fila);
		System.out.println(fila.toString().equals("[]"));

		System.out.println(fila.vazia() == true);

		fila.adiciona(new Aluno("João", "joao@gmail.com"));
		fila.adiciona(new Aluno("Maria", "maria@gmail.com"));
		fila.adiciona(new Aluno("Joana", "joana@gmail.com"));

		System.out.println(fila);
		System.out.println(fila.toString().equals("[João, Maria, Joana]"));

		System.out.println(fila.tamanho());
		System.out.println(fila.tamanho() == 3);

		System.out.println(fila.vazia() == false);

		System.out.println(fila.consulta());
		System.out.println(fila.consulta().toString().equals("João"));

		Aluno primeiro = fila.remove();
		System.out.println(primeiro);
		System.out.println(primeiro.toString().equals("João"));
		
		System.out.println(fila.tamanho());
		System.out.println(fila.tamanho() == 2);
	}

}
