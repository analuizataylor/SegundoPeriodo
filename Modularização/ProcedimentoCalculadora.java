// aula 02/10/2024 

// fazer uma calculadora utilizando metodos em java 

public class ProcedimentoCalculadora {
    public static void main(String[] args) {
        soma(10, 5);
        subtracao(10, 5);
        multiplicacao(10, 5);
        divisao(10, 5);

    }

    public static void soma(double a, double b) {
        double resultado = a + b;
        System.out.println("A soma é: " + resultado);
    }

    public static void subtracao(double a, double b) {
        double resultado = a - b;
        System.out.println("A subtração é: " + resultado);
    }

    public static void multiplicacao(double a, double b) {
        double resultado = a * b;
        System.out.println("A multiplicacao é: " + resultado);
    }

    public static void divisao(double a, double b) {
        double resultado = a / b;
        System.out.println("A divisao é: " + resultado);
    }
}
