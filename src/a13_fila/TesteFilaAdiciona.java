package a13_fila;

public class TesteFilaAdiciona {

	public static void main(String[] args) {
		Fila<Aluno> fila = new FilaLigada<Aluno>();

		fila.adiciona(new Aluno("João", "joao@gmail.com"));
		fila.adiciona(new Aluno("Maria", "maria@gmail.com"));
		fila.adiciona(new Aluno("Joana", "joana@gmail.com"));
		System.out.println(fila);

		System.out.println(fila.toString().equals("[João, Maria, Joana]"));
	}

}
