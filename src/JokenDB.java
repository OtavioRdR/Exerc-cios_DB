import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class JokenDB {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] opcoes = {"tesoura", "pedra", "papel"};

        System.out.println("Escolha, pedra, papel ou tesoura:");
        String escolhoDoJogador = scanner.nextLine().toLowerCase(Locale.ROOT);

        String escolhaDoComputador = opcoes[random.nextInt(3)];

        System.out.println("O computador escolheu " + escolhaDoComputador);

        switch (escolhoDoJogador){
            case "pedra":
                switch (escolhaDoComputador){
                    case "pedra":
                        System.out.println("empate entre computador e usuario");
                        break;
                    case "papel":
                        System.out.println("você perdeu, tente novamente");
                        break;
                    case "tesoura":
                        System.out.println("você ganhou");
                        break;
                }
                break;

            case "papel":
                switch (escolhaDoComputador){
                    case "pedra":
                        System.out.println("você ganhou");
                        break;
                    case "papel":
                        System.out.println("empate entre computador e usuaruo");
                        break;
                    case "tesoura":
                        System.out.println("você perdeu");
                        break;

                }
                break;

            case "tesoura":
                switch (escolhaDoComputador){
                    case "pedra":
                        System.out.println("você perdeu");
                        break;
                    case "papel":
                        System.out.println("você ganhou");
                        break;
                    case "tesoura":
                        System.out.println("empate entre computador e usuario");
                        break;


                }
                break;

            default:
                System.out.println("a opção escolhida não esta disponivel");
                break;


        }
     }


    }
