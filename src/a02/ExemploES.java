package a02;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ExemploES {

    public static void main(String[] args) throws IOException {
        System.out.println("Olá Mundo!");

        // Streams
        FileOutputStream fos = new FileOutputStream("teste.dat");
        fos.write(65);
        fos.write(66);
        fos.write(67);
        fos.write(68);
        fos.close();
        
        // Com buffer e podendo escrever dados mais estruturados
        DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("arquivo.dat")));
        dos.writeChars("Teste de escrita em arquivo!");
        dos.close();
        
        // Print e Printf
        System.out.print("Escreve e não faz a quebra de linha. ");
        System.out.println("O próximo texto vai pra linha seguinte.");
        String nome = "João";
        float nota = 9.4567f;
        Object[] arg = new Object[] {nome, new Float(nota)};
        System.out.printf("O aluno %s tirou nota %.1f%n", arg);
        
        
        // Entrada de dados
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com a segunda nota: ");
        float nota2 = sc.nextFloat();
        System.out.println("A nota 2 foi: " + nota2);
//        sc.close();
        
        // Leitura de muitos valores na mesma linha
        Scanner sc2 = new Scanner(System.in);
        String x;
        int y;
        double z;
        
        x = sc2.next();
        y = sc2.nextInt();
        z = sc2.nextDouble();
        sc.close();
        System.out.println("X=" + x + " Y=" + y + " Z=" + z);
    }

}
