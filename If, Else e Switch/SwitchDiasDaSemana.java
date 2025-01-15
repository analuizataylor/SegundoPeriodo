// aula 29/08/2024

// menu de dias da semana com base no que foi digitado
import java.util.Scanner;

public class SwitchDiasDaSemana {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int diaDaSemana;
		System.out.println("Digite um número de 1 a 7: ");

		diaDaSemana = entrada.nextInt();

		switch (diaDaSemana) {
			case 1:
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Segunda-feira");
				break;
			case 3:
				System.out.println("Terça-feira");
				break;
			case 4:
				System.out.println("Quarta-feira");
				break;
			case 5:
				System.out.println("Quinta-feira");
				break;
			case 6:
				System.out.println("Sexta-feira");
				break;
			case 7:
				System.out.println("Sábado");
				break;
			default:
				System.out.print("Dia inválido");
		}

		entrada.close();
	}
}
