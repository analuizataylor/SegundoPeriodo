//ATIVIDADE 2 - utilizando do while


import java.util.Scanner;

public class DoWhileInformarNumero {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int num;
		do {
			System.out.println("Informe um número ou informe um número maior que 100 para sair: ");
			num = entrada.nextInt();
		} while (num < 101);
		
		System.out.println("Você saiu do código");
		entrada.close();
	}
}
