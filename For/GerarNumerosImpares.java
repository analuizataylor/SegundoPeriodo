//ATIVIDADE 2 - gerar números ímpares de 1 a 10


import java.util.Scanner;

public class GerarNumerosImpares {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		for (int i = 1; i < 10; i = i + 2){
			System.out.println("Valor de i: " + i);
		}

		entrada.close();
	}
}
