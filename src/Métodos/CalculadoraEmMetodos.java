package Métodos;

public class CalculadoraEmMetodos
{

    public static double soma(double a, double b) {
        return a + b;
    }

    public static double subtracao(double a, double b) {
        return a - b;
    }

    public static double multiplicacao(double a, double b) {
        return a * b;
    }

    public static double divisao(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor não pode ser zero");
        }
        return a / b;
    }

    public static double potenciacao(double base, double expoente) {
        return Math.pow(base, expoente);
    }

    public static void main(String[] args) {

        double num1 = 2;
        double num2 = 4;

        System.out.println("potenciação: " + potenciacao(num1, num2));

        System.out.println("divisão: " + divisao(num1, num2));

        System.out.println("subtração: " + subtracao(num1, num2));

        System.out.println("soma: " + soma(num1, num2));

        System.out.println("multiplicação: " + multiplicacao(num1, num2));

    }
}
