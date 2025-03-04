/* 1. Construa um algoritmo que leia dois números inteiros e verifique se a divisão seja indeterminada(denominador igual a zero). Em caso afirmativo, imprima */


import java.util.Scanner;

public class DivisaoIndeterminada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n1, n2;
        double resultado; 

        System.out.println("Digite o primeiro número: ");
        n1 = entrada.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = entrada.nextInt();

        if (n2 != 0) {
            resultado = n1/n2;
            System.out.println("O resultado da divisão de " + n1 + " por " + n2 + " é de: " + resultado);
        } else {
            System.out.println("Indeterminada - não é possível dividir por zero");
        }

        entrada.close();
    }
}
