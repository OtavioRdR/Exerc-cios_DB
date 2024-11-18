import java.util.Collections;
import java.util.ArrayList;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            numeros.add(i);
        }

        Collections.shuffle(numeros, new Random());

        int[] vetor = new int[100];
        for (int i = 0; i < 100; i++) {
            vetor[i] = numeros.get(i);
        }

        System.out.println("numeros antes da ordenação:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();

        bubbleSort(vetor);

        System.out.println("numeros após a ordenação:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }

    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;
        boolean trocado;

        do {
            trocado = false;
            for (int i = 0; i < n - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;
                    trocado = true;
                }
            }
            n--;
        } while (trocado);
    }
}
