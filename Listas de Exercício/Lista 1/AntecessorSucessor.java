/* 8. Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu antecessor e seu sucessor.  */

import java.util.Scanner;

public class AntecessorSucessor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int num = entrada.nextInt();

        //adicionando 1 unidade no numero escolhido
        int suc = num + 1;
        //retirando 1 unidade no numero escolhido
        int ant = num - 1;

        System.out.println("Você escolheu o número " + num);
        System.out.println("Seu sucessor é o numero " + suc);
        System.out.println("Seu antecessor é o numero " + ant);

        entrada.close();
    }
}
