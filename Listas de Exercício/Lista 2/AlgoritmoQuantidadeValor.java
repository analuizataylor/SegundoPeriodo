/* 13. A loja Constrói em Partes produz dois tipos de hastes: cobre e alumínio. Cada haste de cobre é vendida porR$ 2,00, e cada haste de alumínio é vendida por R$ 4,00. O desconto dado dependerá da quantidade dehastes compradas, conforme tabela abaixo. Fazer um algoritmo para ler a quantidade comprada de cada tipo de haste e imprima o total pago.

qtd // desconto
Abaixo de 5 = 0%
Entre 5 e 15 = 10%
Entre 16 e 20 = 15%
Acima de 20 = 20%  */



import java.util.Scanner;

public class AlgoritmoQuantidadeValor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int cobreValor = 2; int aluminioValor = 4;
        int cobreUnid; int aluminioUnid;
        double desconto; double total; double quantidade;

        System.out.println("Quantas hastes de cobre? ");
        cobreUnid = entrada.nextInt();
        System.out.println("Quantas hastes de aluminio? ");
        aluminioUnid = entrada.nextInt();
        quantidade = cobreUnid + aluminioUnid;
        System.out.println("Quantidade total: " + quantidade);

        if (quantidade < 5) {
            total = (cobreUnid * cobreValor) + (aluminioUnid * aluminioValor);
            System.out.println("Não há desconto, o valor total é de: " + total);
        } else if (quantidade < 16) {
            desconto = 0.9;
            total = ((cobreUnid * cobreValor) + (aluminioUnid * aluminioValor)) * desconto;
            System.out.println("Desconto de 10%, o valor total é de: " + total);
        } else if (quantidade < 20) {
            desconto = 0.85;
            total = ((cobreUnid * cobreValor) + (aluminioUnid * aluminioValor)) * desconto;
            System.out.println("Desconto de 15%, o valor total é de: " + total);
        } else {
            desconto = 0.80;
            total = ((cobreUnid * cobreValor) + (aluminioUnid * aluminioValor)) * desconto;
            System.out.println("Desconto de 20%, o valor total é de: " + total);
        }
        entrada.close();
    }  
}
