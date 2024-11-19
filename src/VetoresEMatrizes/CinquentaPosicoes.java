package VetoresEMatrizes;

import java.util.ArrayList;
import java.util.Collections;

public class CinquentaPosicoes {
    public static void main(String[] args) {
        ArrayList<Integer> numeros1 = new ArrayList<>();
        ArrayList<Integer> numeros2 = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            numeros1.add(i);
            numeros2.add(i + 50);
        }

        Collections.shuffle(numeros1);
        Collections.shuffle(numeros2);

        int[] vetor1 = numeros1.stream().mapToInt(Integer::intValue).toArray();
        int[] vetor2 = numeros2.stream().mapToInt(Integer::intValue).toArray();

        int[] vetor100 = new int[100];
        System.arraycopy(vetor1, 0, vetor100, 0, 50);
        System.arraycopy(vetor2, 0, vetor100, 50, 50);

        bubbleSort(vetor100);

        System.out.println("vetor 1 ordenado:");
        for (int num : vetor1) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("vetor 2 ordenado:");
        for (int num : vetor2) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("vetor combinado e ordenado:");
        for (int num : vetor100) {
            System.out.print(num + " ");
        }
        System.out.println();
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
