/* 9. Escrever um algoritmo que lê:

a) a porcentagem do IPI a ser acrescido no valor das peças
b) o código da peça 1, valor unitário da peça 1, quantidade de peças 1
c) o código da peça 2, valor unitário da peça 2, quantidade de peças 2

O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.

Fórmula: (valor1*quant1 + valor2*quant2)*(IPI/100 + 1) */



import java.util.Scanner;

public class AlgoritmoValorPecas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // criando as variaveis
        String cod1, cod2;
        double ipi, valor1, valor2, resultado;
        int qt1, qt2;

        //solicitando valores da primeira peça
        System.out.println("Insira o código da peça 1: ");
        cod1 = entrada.nextLine();
        System.out.println("Insira o valor da peça 1: ");
        valor1 = entrada.nextDouble();
        System.out.println("Insira a quantidade da peça 1: ");
        qt1 = entrada.nextInt();

        //solicitando valores da segunda peça
        System.out.println("Insira o código da peça 2: ");
        cod2 = entrada.nextLine();
        System.out.println("Insira o valor da peça 2: ");
        valor2 = entrada.nextDouble();
        System.out.println("Insira a quantidade da peça 2: ");
        qt2 = entrada.nextInt();

        System.out.println("Insira o valor do IPI: ");
        ipi = entrada.nextDouble();

        //calculando resultado
        resultado = (valor1 * qt1 + valor2 * qt2) * (ipi/100 + 1);
        System.out.println("O valor total a ser pago para o produto " + cod1 + " e " + cod2 + " é de: " + resultado);

        entrada.close();
    }
}
