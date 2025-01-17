// 3. Crie uma função que receba como parâmetro um vetor de números inteiros 
// e retorne o valor máximo contido no vetor.

import java.util.Scanner;

public class ValorMaximoVetor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicita o tamanho do vetor
        System.out.println("Digite o tamanho do vetor: ");

        int tamanho = entrada.nextInt();
        int[] vetor = new int[tamanho];

        // Preenche o vetor com valores do usuário
        System.out.println("Digite os valores do vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = entrada.nextInt();
        }

        // Chama a função que retorna o valor máximo
        int maximo = encontrarMaximo(vetor);

        System.out.println("O valor máximo do vetor é: " + maximo);
        entrada.close();
    }

    // Função para encontrar o valor máximo no vetor
    public static int encontrarMaximo(int[] vetor) {
        int max = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > max) {
                max = vetor[i];
            }
        }
        return max;
    }
}
