import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero para ser calculado a série de Fibonacci: ");
        int numeroDoUsuario = scanner.nextInt();

        int numF1 = 0;
        int numF2 = 1;
        int contador = 0;


        do {

            System.out.println(numF1);
            int proximoTermo = numF1 + numF2;
            numF1 = numF2;
            numF2 = proximoTermo;


        } while ( contador++ < numeroDoUsuario );


    }




    }

