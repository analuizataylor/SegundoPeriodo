// aula 04/09/2024


// ATIVIDADE 1 - utilizando while
import java.util.Scanner;

public class WhileInformarNumero {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int num;
		System.out.println("Informe um número ou informe um número maior que 100 para sair: ");
		num = entrada.nextInt();
		
		while (num < 101) {
			System.out.println("Informe um número ou informe um número maior que 100 para sair: ");
			num = entrada.nextInt();
		}
		
		System.out.println("Você saiu do código");
		entrada.close();
	}
}
