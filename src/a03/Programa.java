package a03;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US); 
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com a quantidade de produtos: ");
        int qtd = sc.nextInt();
//        System.out.println();
        
        Produto[] prods = new Produto[qtd];
        for (int i = 0; i < qtd; ++i) {
            sc.nextLine();
            System.out.print("Entre com o nome do produto: ");
            String nome = sc.nextLine();
//            System.out.println();
            System.out.print("Entre com o preco do produto: ");
            double preco = sc.nextDouble();
//            System.out.println();
            Produto produto = new Produto(nome, preco);
            prods[i] = produto;
        }
        
        double soma = 0;
        for (Produto produto : prods) {
            soma += produto.getPreco();
        }
        double media = soma / qtd;
        
        System.out.println("PRECO MEDIO: " + media);
        
        sc.close();
    }

}
