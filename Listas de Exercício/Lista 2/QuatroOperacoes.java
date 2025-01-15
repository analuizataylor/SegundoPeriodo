/* 3. Faça um algoritmo que leia dois números inteiros e mostre um menu com quatro operações (+, -, *, /) para o usuário escolher. Imprima o resultado da opção escolhida. Caso o usuário digite uma opção inválida, mostrar mensagem de erro. */



import java.util.Scanner;

public class QuatroOperacoes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcao;
        double n1;
        double n2;
        double resultado;

        System.out.println("""
            \n** Calculadora**
            1 - Soma
            2 - Subtração
            3 - Multiplicação
            4 - Divisão
            """);

        System.out.println("Digite a opção desejada: ");
        opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite o primeiro número que deseja somar: ");
                n1 = entrada.nextDouble();
                System.out.println("Digite o segundo número que deseja somar: ");
                n2 = entrada.nextDouble();

                resultado = n1 + n2;
                System.out.println("A soma dos números resulta em: " + resultado);
                break;

            case 2:
                System.out.println("Digite o primeiro número que deseja subtrair: ");
                n1 = entrada.nextDouble();
                System.out.println("Digite o segundo número que deseja subtrair: ");
                n2 = entrada.nextDouble();

                resultado = n1 - n2;
                System.out.println("A subtração resulta em: " + resultado);
                break;

            case 3:
                System.out.println("Digite o primeiro número que deseja multiplicar: ");
                n1 = entrada.nextDouble();
                System.out.println("Digite o segundo número que deseja multiplicar: ");
                n2 = entrada.nextDouble();

                resultado = n1 * n2;
                System.out.println("A multiplicação resulta em: " + resultado);
                break;

            case 4:
                System.out.println("Digite o primeiro número que deseja dividir: ");
                n1 = entrada.nextDouble();
                System.out.println("Digite o segundo número que deseja dividir: ");
                n2 = entrada.nextDouble();

                if (n2 != 0) { // Verifica divisão por zero
                    resultado = n1 / n2;
                    System.out.println("A divisão resulta em: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;

            default:
                System.out.println("Opção inválida.");
        }
        entrada.close(); 
    }
}
