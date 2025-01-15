// 2. Implemente uma função que calcule o fatorial de um número inteiro passado como parâmetro
// e retorne o resultado

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {

        // criando e solicitando a entrada
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira o número: ");
        int numero = entrada.nextInt();


        // chamando funcao
        Double resultado = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é " + resultado);

        entrada.close();
    }


    public static Double calcularFatorial(int numero) {

        //verificando se o numero é negativo
        if (numero < 0) {
            System.out.println("O número não pode ser negativo");
        }

        // fazendo o fatorial
        Double fatorial = 1.0;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
