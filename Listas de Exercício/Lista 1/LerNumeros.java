/* 6. Fazer um programa que leia um número inteiro e mostre o seu triplo, sua metade, a sua raiz cúbica, e porfim, o número elevado a potência fracionária 2/3.  */

import java.util.Scanner;

public class LerNumeros {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    double num, tri, met, raiz, pot;

    System.out.println("Informe um número: ");
    num = entrada.nextDouble();
    tri = num * 3;
    met = num / 2;
    raiz = Math.sqrt(num + 3);
    pot = Math.pow(num, 2/3);

    System.out.println("O triplo: " + tri);
    System.out.println("A metade: " + met);
    System.out.println("A raiz cúbica: " + raiz);
    System.out.println("Elevado a potência fracionária 2/3: " + pot);

    entrada.close();
    }
}
