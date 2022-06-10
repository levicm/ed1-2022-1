package a08_01_comparable;

public class Programa {

    public static void main(String[] args) {
        encontrarMelhorCandidato();
        
        encontrarMaiorElemento();
    }

    private static void encontrarMelhorCandidato() {
        Lista<Candidato> candidatos = new ListaArranjo<Candidato>();
        
        candidatos.adiciona(new Candidato("Joao", 45, 70));
        candidatos.adiciona(new Candidato("Pedro", 40, 75));
        candidatos.adiciona(new Candidato("Marco", 25, 80));
        candidatos.adiciona(new Candidato("Gabriel", 45, 52));
        candidatos.adiciona(new Candidato("Maria", 27, 80));
        candidatos.adiciona(new Candidato("Jony", 45, 70));
        
        Candidato maior = null;
        for (int i = 0; i < candidatos.tamanho(); ++i) {
            Candidato candidato = candidatos.pega(i); 
            if (maior == null) {
                maior = candidato;
            } else {
                if (candidato.compareTo(maior) > 0) {
                    maior = candidato;
                }
            }
        }
        
        System.out.println("Candidato melhor colocado: " + maior);
    }
    
    private static void encontrarMaiorElemento() {
        Lista<Comparable> lista = new ListaArranjo<Comparable>();
        
        lista.adiciona(new Candidato("Joao", 45, 70));
        lista.adiciona(new Candidato("Pedro", 40, 75));
        lista.adiciona(new Candidato("Marco", 25, 80));
        lista.adiciona(new Candidato("Gabriel", 45, 52));
        lista.adiciona(new Candidato("Maria", 27, 80));
        lista.adiciona(new Candidato("Jony", 45, 70));
        
        Comparable maior = null;
        for (int i = 0; i < lista.tamanho(); ++i) {
            Comparable item = lista.pega(i); 
            if (maior == null) {
                maior = item;
            } else {
                if (item.compareTo(maior) > 0) {
                    maior = item;
                }
            }
        }
        
        System.out.println("Maior elemento: " + maior);
    }

    

}
