// ATIVIDADE 2 - MATRIZES - imprimir uma matriz 3x3

import java.util.Scanner;

public class Matrizes {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		// dois espaços + nome = new tipo [i][j]
		int[][] matriz = new int[3][3];
		
		for (int i = 0; i < matriz[0].length; i++) {
			for (int j = 0; j < matriz[0].length; i++) {
				System.out.println("Informe um número inteiro: ");
				int num = entrada.nextInt();

				matriz[i][j] = num;
				
			}
		}

		for (int i = 0; i < matriz[0].length; i++) {
		 for (int j = 0; j < matriz[0].length; j++) {
		 	System.out.print(matriz[i][j]);
		 	System.out.print("\t");
		 }
		}
		entrada.close();
	}
}
