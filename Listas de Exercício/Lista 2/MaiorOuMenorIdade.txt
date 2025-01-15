/* 12. Leia sexo e idade de uma pessoa e imprima maior idade ou menor idade, considerando que sexo masculinoe maior idade se maior igual a 21 anos e sexo feminino e maior idade se maior igual a 18 anos. */



import java.util.Scanner;

public class MaiorOuMenorIdade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String sexo; int idade;
        String fem = "F"; String masc = "M";

        System.out.println("Informe o sexo entre F ou M: ");
        sexo = entrada.nextLine();

        System.out.println("Informa a idade:" );
        idade = entrada.nextInt();

        if (sexo == fem) {
            if (idade > 18) {
                System.out.println("É mulher e maior de idade");
            } else {
                System.out.println("É mulher e menor de idade");
            }
        } if (sexo == masc) {
            if (idade > 21) {
                System.out.println("É homem e maior de idade");
            } else {
                System.out.println("É homem e menor de idade");
            }
        } 
        entrada.close();
}
