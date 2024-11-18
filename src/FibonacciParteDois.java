import java.util.Scanner;

public class FibonacciParteDois {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero para ser calculado a série de Fibonacci: ");
        int limitador = scanner.nextInt();

        int numF1 = 0;
        int numF2 = 1;

        System.out.print("Serie de fibonacci: " + numF1);

        do {

            if (numF2 > limitador){
                break;
            }

            System.out.print(", " +numF2);

            int proximoNumero = numF1 + numF2;
            numF1 = numF2;
            numF2 = proximoNumero;

        } while (numF1 <= limitador);
        System.out.println("\naqui está sua sequencia de fibonacci.");

    }

}

