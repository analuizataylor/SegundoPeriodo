// fazer a formula de celsius e fahrenheit e vice versa

import java.util.Scanner;

public class ProcedimentoConversaoTemperatura {
    public static void main(String[] args) {
        saudacao();
        converterParaCelsius();
        converterParaFahrenheit();
    }

    public static void saudacao() {
        System.out.println("Olá! Bem-vindo à conversões de temperatura");
    }
        
    public static void converterParaCelsius() {
        double temperaturaInicial;

        System.out.println("Insira a temperatura a ser convertida para celsius: ");
        Scanner entrada = new Scanner(System.in);
        temperaturaInicial = entrada.nextDouble();
        entrada.nextLine();
        double temperaturaConvertida = temperaturaInicial / 5;
        System.out.println("A temperatura em Celsius é de: " + temperaturaConvertida);

        entrada.close();
    }

    public static void converterParaFahrenheit() {
        double temperaturaInicial;

        System.out.println("Insira a temperatura a ser convertida para fahrenheit: ");
        Scanner entrada = new Scanner(System.in);
        temperaturaInicial = entrada.nextDouble();
        entrada.nextLine();
        double temperaturaConvertida = (temperaturaInicial - 32) / 9;
        System.out.println("A temperatura em Fahrenheit é de: " + temperaturaConvertida);

        entrada.close();
    }
}
