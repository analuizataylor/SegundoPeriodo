/* 10. Leia três números e imprima o maior deles. Não é necessário verificar se os números são iguais.*/

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n1, n2, n3;

        System.out.println("Informe o primeiro número: ");
        n1 = entrada.nextInt();
        System.out.println("Informe o segundo número: ");
        n2 = entrada.nextInt();
        System.out.println("Informe o terceiro número: ");
        n3 = entrada.nextInt();

        int maior = 0;
        if (n1 > maior) {
            maior = n1;
        } if (n2 > maior) {
            maior = n2;
        } else {
            maior = n3;
        }

        System.out.println("O maior número é " + maior);
        entrada.close();
    }
}
