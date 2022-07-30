package a12_pilha;

public class TestePilha {

	public static void main(String[] args) {
		PilhaArranjo<Peca> pilha = new PilhaArranjo<Peca>();
		
		System.out.println(pilha);
		System.out.println(pilha.vazia());
		
		pilha.adiciona(new Peca("Grade frontal"));
		pilha.adiciona(new Peca("Porca"));
		pilha.adiciona(new Peca("Helice"));
		pilha.adiciona(new Peca("Grade do fundo"));
		pilha.adiciona(new Peca("Carcaça do Motor"));

		System.out.println(pilha);
		System.out.println(pilha.vazia());
		System.out.println(pilha.tamanho());
		System.out.println(pilha.consulta());
		System.out.println(pilha.tamanho());
		System.out.println(pilha.remove());
		System.out.println(pilha.tamanho());
		System.out.println(pilha);
		System.out.println(pilha.remove());
		System.out.println(pilha);
		System.out.println(pilha.remove());
		System.out.println(pilha);
		System.out.println(pilha.remove());
		System.out.println(pilha);
		System.out.println(pilha.remove());
		System.out.println(pilha);
		System.out.println(pilha.vazia());
	}

}
