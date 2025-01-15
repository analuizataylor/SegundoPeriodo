/* 3) Faça um programa que vai pedindo números ao usuário até que este introduza o número -1. O computador deve dizer a média dos números introduzidos. */



import java.util.Scanner;

public class MediaNumerosInseridos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num; int total = 0; int contador = 0; 

        System.out.println("Insira um número: ");
        num = entrada.nextInt();
        
        while (num != -1) {
            total += num; // Acumula a soma
            contador++; // Incrementa o contador
            System.out.println("Insira um número: ");
            num = entrada.nextInt();
        }
        double media = total / contador;
        System.out.println("A média dos números introduzidos é: " + media);
        
        entrada.close();
    }
}
