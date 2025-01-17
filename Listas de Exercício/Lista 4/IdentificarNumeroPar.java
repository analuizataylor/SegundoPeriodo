// 1. Crie uma função que receba como parâmetro um número inteiro 
// e retorne verdadeiro se ele for par, e falso caso contrário

import java.util.Scanner;

public class IdentificarNumeroPar {

    public static void main(String[] args) {

        // criando e solicitando a entrada
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira o número: ");
        int numero = entrada.nextInt();


        // chamando funcao
        if (isPar(numero)) {
            System.out.println(numero + " é par");
        } else {
            System.out.println(numero + " é ímpar");
        }

        entrada.close();
    }

    // funcao
    public static boolean isPar(int numero) {
        return numero % 2 == 0;
    }
}
