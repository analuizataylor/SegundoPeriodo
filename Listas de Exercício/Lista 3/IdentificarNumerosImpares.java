/* 7) Apresentar todos os valores numéricos inteiros ímpares situados na faixa de 0 a n, onde n é um número fornecido pelo usuário do programa. A verificação se o número é ímpar será feita dentro do loop. Caso o número seja ímpar, mostre-o, não sendo, passe para o próximo número. */

import java.util.Scanner;

public class IdentificarNumerosPares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n;
        System.out.println("Insira um número: ");
        n = entrada.nextInt();
        
        for (int i=0; i < n; i++) {
            //System.out.println(i);
            if (i % 2 != 0) {
                System.out.println(i + " é impar");
            } 
            
        }
    }
}
