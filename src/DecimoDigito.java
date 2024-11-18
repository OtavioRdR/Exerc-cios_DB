import java.util.Scanner;

public class DecimoDigito {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite numeros, enquanto o numero for diferente de 10, o programa continuara");
        int digitoDoUsuario;
        digitoDoUsuario = scanner.nextInt();


        do {

            System.out.println("digite mais numeros");
            digitoDoUsuario = scanner.nextInt();


        }while (digitoDoUsuario != 10);

        System.out.println("voce inseriu o numero 10, o programa ira fechar...");

    }
}
