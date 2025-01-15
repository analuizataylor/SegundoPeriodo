/* 7. Construa um algoritmo que, tendo como dados de entrada dois pontos quaisquer no plano, P(x1,y1) e P(x2,y2), escreva a distância entre eles */


import java.util.Scanner;

public class DistanciaEntrePontos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double x1, y1, x2, y2, distancia;
        
        System.out.println("Digite o valor de x1: ");
        x1 = entrada.nextDouble();
        System.out.println("Digite o valor de y1: ");
        y1 = entrada.nextDouble();
        System.out.println("Digite o valor de x2: ");
        x2 = entrada.nextDouble();
        System.out.println("Digite o valor de y2: ");
        y2 = entrada.nextDouble();

        distancia = Math.sqrt( ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
        System.out.println("A distância entre esses pontos é de: " + distancia);

        entrada.close();
    }
}
