/* 2. Faça um algoritmo que leia um número inteiro e verifique se ele é par ou ímpar. Imprima uma mensagemcorrespondente ao resultado. Se o número for zero, imprima: “o valor é zero”. */

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.println("Digite um número: ");
        num = entrada.nextInt();

        if (num != 0) {
            if (num % 2 == 0) {
                System.out.println("O número é par");
            } else {
                System.out.print("O número é impar");
        }
        } else {
            System.out.println("O número é zero");
        }

        entrada.close();
    }
}
