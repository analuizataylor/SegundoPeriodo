// aula 21/08/2024

import java.util.Scanner;



public class MediaAritmetica {
	public static void main(String[] args) {
		// código base para inserir input
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a primeira nota: ");
		// inserir double pelo teclado
		double n1 = entrada.nextDouble(); 
		System.out.println("Digite a segunda nota: ");
		double n2 = entrada.nextDouble(); 
		System.out.println("Digite a terceira nota: ");
		double n3 = entrada.nextDouble(); 
		
		double media = (n1 + n2 + n3) / 3;
		
		boolean aprovacao = media >= 7;
		
		System.out.println("Média: " + media);
		System.out.println("Aprovado: " + aprovacao);
	}
}
