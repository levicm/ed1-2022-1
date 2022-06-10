package a08_02_lista_ordenada;


public class TesteListaOrdenada {

    public static void main(String[] args) {
        ListaOrdenada candidatos = new ListaOrdenada();
        
        candidatos.adiciona(new Candidato("Joao", 45, 70));
        candidatos.adiciona(new Candidato("Pedro", 40, 75));
        candidatos.adiciona(new Candidato("Marco", 25, 80));
        candidatos.adiciona(new Candidato("Gabriel", 45, 52));
        candidatos.adiciona(new Candidato("Maria", 27, 80));
        candidatos.adiciona(new Candidato("Jony", 45, 70));
        
        System.out.println(candidatos);
    }

}
