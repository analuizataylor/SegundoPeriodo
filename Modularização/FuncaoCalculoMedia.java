// aula 03/10/2024

// : Criar um programa que calcula a média de três números, utilizando um método com retorno
que faz o cálculo da média

import java.util.Scanner;

public class FuncaoCalculoMedia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n1, n2, n3;
        System.out.println("Insira um número: ");
        n1 = entrada.nextDouble();
        System.out.println("Insira um número: ");
        n2 = entrada.nextDouble();
        System.out.println("Insira um número: ");
        n3 = entrada.nextDouble();
        double media = calcularMedia(n1, n2, n3);
        System.out.println("A média é: " + media);

        entrada.close();
    }

    public static double calcularMedia(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }
}
