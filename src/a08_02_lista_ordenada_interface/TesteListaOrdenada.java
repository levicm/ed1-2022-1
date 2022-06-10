package a08_02_lista_ordenada_interface;


public class TesteListaOrdenada {

    public static void main(String[] args) {
        Lista<Candidato> candidatos = new ListaOrdenada<Candidato>();
        
        candidatos.adiciona(new Candidato("Joao", 45, 70));
        candidatos.adiciona(new Candidato("Pedro", 40, 75));
        candidatos.adiciona(new Candidato("Marco", 25, 80));
        candidatos.adiciona(new Candidato("Gabriel", 45, 52));
        candidatos.adiciona(new Candidato("Maria", 27, 80));
        candidatos.adiciona(new Candidato("Jony", 45, 70));
        
        System.out.println(candidatos);
    }

}
