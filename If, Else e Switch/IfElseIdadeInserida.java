// aula 22/08/2024
// ATIVIDADE 1 - identificar fase da vida com base na idade inserida

import java.util.Scanner;

public class IfElseIdadeInserida {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Insira uma idade: ");
		int idade = entrada.nextInt();

		if (idade < 12) {
			System.out.println("É uma criança de " + idade + " anos");
		} if (idade < 18) {
			System.out.println("É um adolescente de " + idade + " anos");
		} if (idade < 60) {
			System.out.println("É um adulto de " + idade + " anos");
		} else {
			System.out.println("É um idoso de " + idade + " anos");
		}
			entrada.close();
	}
}
