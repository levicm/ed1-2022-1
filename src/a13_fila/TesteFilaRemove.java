package a13_fila;

public class TesteFilaRemove {

	public static void main(String[] args) {
		Fila<Aluno> fila = new FilaLigada<Aluno>();

		fila.adiciona(new Aluno("João", "joao@gmail.com"));
		fila.adiciona(new Aluno("Maria", "maria@gmail.com"));
		fila.adiciona(new Aluno("Joana", "joana@gmail.com"));


		Aluno primeiro = fila.remove();
		System.out.println(primeiro);
		System.out.println(primeiro.toString().equals("João"));		
		System.out.println(fila.tamanho());
		System.out.println(fila.tamanho() == 2);
	}

}
