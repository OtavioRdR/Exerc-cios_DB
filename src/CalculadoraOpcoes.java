import java.util.Locale;
import java.util.Scanner;

public class CalculadoraOpcoes {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        char[] operdaores = {'+', '-', 'x', '/'};

        System.out.println(" 1) + \n 2) - \n 3) x \n 4) / \n Escolha um dos Operadores: ");
        char escolhaDoUsuario = scanner.nextLine().charAt(0);

        System.out.println("você escolheu o operadaor: \n" + escolhaDoUsuario);


        switch (escolhaDoUsuario){

            case '+':
                System.out.println("Digite o primeiro numero: ");
                double primeiraAdicao = scanner.nextDouble();
                System.out.println("Digite o segundo numero: ");
                double segundaAdicao = scanner.nextDouble();


                System.out.printf("o resultado da soma foi de: %.2f " , (primeiraAdicao + segundaAdicao));

                break;


            case '-':
                System.out.println("Digite o primeiro numero: ");
                double primeiraSubtracao = scanner.nextDouble();
                System.out.println("Digite o segundo numero: ");
                double segundaSubtracao = scanner.nextDouble();

                System.out.printf("o resultado da subtração foi: %.2f ", (primeiraSubtracao - segundaSubtracao));

                break;


            case 'x':
                System.out.println("Digite o primeiro numero: ");
                double primeiraMultiplicacao = scanner.nextDouble();
                System.out.println("Digite o segundo numero: ");
                double segundaMultiplicacao = scanner.nextDouble();

                System.out.printf("o resultado da subtração foi: %.2f ", (primeiraMultiplicacao * segundaMultiplicacao));

                break;

            case '/':
                System.out.println("Digite o primerio numero: " );
                double primeiraDivisao = scanner.nextDouble();
                System.out.println("Digite o segundo numero: ");
                double segundaDivisao = scanner.nextDouble();

                System.out.printf("o resultado da subtração foi: %.2f ", (primeiraDivisao / segundaDivisao));

                break;

            default:
                System.out.println("a opção " + escolhaDoUsuario + " não é valida...");
                break;
        }


    }


}
