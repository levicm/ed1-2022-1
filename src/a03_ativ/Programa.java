package a03_ativ;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    final static int QUANTIDADE = 10;

    public static void main(String[] args) {
        Aluguel[] alugueis = new Aluguel[QUANTIDADE];
        
        Locale.setDefault(Locale.US); 
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos quartos serão alugados?");
        int qtd = sc.nextInt();
        
        for (int i = 0; i < qtd; ++i) {
            sc.nextLine();
            System.out.println("Aluguel #" + (i+1));
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int quarto = sc.nextInt();
            
            Aluguel aluguel = new Aluguel(nome, email);
            alugueis[quarto] = aluguel;

            System.out.println();
        }
        sc.close();
        
        System.out.println("Quartos ocupados:");
        for (int i = 0; i < alugueis.length; i++) {
            if (alugueis[i] != null) {
                System.out.println(i + ": " + alugueis[i].getNome() + ", " + alugueis[i].getEmail());
            }
        }

    }

}
