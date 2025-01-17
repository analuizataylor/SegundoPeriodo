// aula 05/09/2024 

// ATIVIDADE 1 - VETORES E MATRIZES - calculando soma dos elementos doss vetores
import java.util.Scanner;

public class SomaDeVetores {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		// vetor é o nome
		// new int[x], onde x é o tamanho do vetor
		int[] vetor = new int[10];
		
		// criando a variavel soma
		int soma = 0;

		// solicitando os numeros do vetor
		System.out.println("Digite 10 números: ");

		// enquanto i for menor que 10, vai pedir mais numeros
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = entrada.nextInt();
		}

		// somando os elementos do vetor
		for (int i = 0; i < vetor.length; i++) {
		 soma += vetor[i];
		}

		// printando a soma dos vetores
		System.out.println("Soma dos números: " + soma);
		entrada.close();
	}
}
