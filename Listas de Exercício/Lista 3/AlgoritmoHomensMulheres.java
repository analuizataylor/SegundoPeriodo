/* 12)Faça um algoritmo que leia a altura e o sexo de n pessoas e imprima:

a) - Quantos homens e mulheres foram medidas;
b) - Quantos homens acima de 1,70;
c) - A média das alturas das mulheres.

OBS: O número n de pessoas será fornecida pelo usuário do programa no início da sua execução. */



import java.util.Scanner;

public class AlgoritmoHomensMulheres {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        //criando variaveis
        double pessoas; String sexo; double altura;
        //criando constantes
        double mulheres = 0 ; double homens = 0; double alturasMulheres = 0; double homens170 = 0;

        System.out.println("Qual número de pessoas?");
        pessoas = entrada.nextInt();
        entrada.nextLine();

        // para cada pessoa, duas perguntas
        for (int i=0; i < pessoas; i++) {
            System.out.println("Homem ou Mulher? (H ou M)");
            sexo = entrada.nextLine();
            System.out.println("Qual altura?");
            altura = entrada.nextDouble();
            entrada.nextLine();

            // separando grupo homens
            if (sexo.equals("H")) {
                homens++;
                if (altura > 1.70) {
                    homens170++;
                }

            } 

            // separando grupo mulheres
            else if (sexo.equals("M")) {
                mulheres++;
                alturasMulheres += altura;
            }

            double mediaMulheres = alturasMulheres / mulheres;

            System.out.println("Foi medido " + homens + " homens");
            System.out.println(homens170 + " com altura acima de 1.70m");
            System.out.println("Foi medido " + mulheres + " mulheres");
            System.out.println("A média das alturasdas mulheres é de " + mediaMulheres);
        }
        entrada.close();
    }
}
