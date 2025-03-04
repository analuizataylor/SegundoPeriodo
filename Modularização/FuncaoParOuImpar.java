// Criar um programa que contém um método para verificar se um número é par ou ímpar. O método deve retornar true se o número for par e false caso contrário.

import java.util.Scanner;

public class FuncaoParOuImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira um número: ");

        // recebendo o numero
        double num = entrada.nextDouble();

        // chamando a funcao no metodo main
        boolean resultado = verificarParOuImpar(num);
        System.out.println("Resultado: " + resultado);

        entrada.close();
    }

    // realizando o metodo funcao de fato
    public static boolean verificarParOuImpar(double num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
