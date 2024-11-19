package EstruturaDeRepetição;

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {

        Random aleatorio = new Random();
        int[] numeros = new int[10];

        System.out.println("gerenado 10 numeros aleatorios de 0 a 100: ");


        numeros[0] = aleatorio.nextInt(101);
        int menorNumero = numeros[0];
        int maiorNumero = numeros[0];


        for (int i = 1; i < 10; i++){
            numeros[i] = aleatorio.nextInt(101);

            if (numeros[i] > maiorNumero){

                maiorNumero = numeros[i];
            }

            if (numeros[i] < menorNumero){

                menorNumero = numeros[i];

            }
        }

        System.out.print("numeros: ");

        for (int i = 0; i < 10; i++){

            System.out.print(numeros[i]);

            if (i < 9) {

                System.out.print(", ");

            }
        }

        System.out.println("\nMaior numero da lista: " + maiorNumero + " |  Menor numero da lista: " + menorNumero);

        }
    }
    //a mais dificil até agora, mais de 1 hora nesse codigo...

