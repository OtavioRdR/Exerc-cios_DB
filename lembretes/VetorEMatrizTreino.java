import java.util.Locale;
import java.util.Scanner;

public class VetorEMatrizTreino {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        double [] vect = new double[n];

        for (int i = 0; i < n; i++){
            vect[i] = scanner.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < n; i++){
            soma += vect[i];
        }
        double avg = soma/n;

        System.out.printf("o valor mediano daaltura foi de:  %.2f", avg);

    }

}
