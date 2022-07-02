package a09_02_busca_binaria;

public class TesteListaOrdenada {

    public static void main(String[] args) {
        Lista<Candidato> candidatos = new ListaOrdenada<Candidato>();
        
        candidatos.adiciona(new Candidato("Joao", 45, 70));
        candidatos.adiciona(new Candidato("Pedro", 40, 75));
        candidatos.adiciona(new Candidato("Marco", 25, 80));
        candidatos.adiciona(new Candidato("Gabriel", 45, 52));
        candidatos.adiciona(new Candidato("Maria", 27, 80));
        candidatos.adiciona(new Candidato("Jony", 45, 70));
        candidatos.adiciona(new Candidato("Marta", 48, 75));
        candidatos.adiciona(new Candidato("André", 25, 60));
        candidatos.adiciona(new Candidato("Maurício", 32, 69));
        candidatos.adiciona(new Candidato("Silvia", 58, 48));
        candidatos.adiciona(new Candidato("Airton", 44, 74));
        
        System.out.println(candidatos);

        Candidato cand1 = new Candidato("Airton", 48, 75);
        System.out.println(candidatos.busca(cand1));
        Candidato cand2 = new Candidato("Gustavo", 45, 70);
        System.out.println(candidatos.busca(cand2));
        Candidato cand3 = new Candidato("Paulo", 60, 85);
        System.out.println(candidatos.busca(cand3));

    }

}
