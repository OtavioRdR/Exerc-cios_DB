package Métodos;

import java.util.Scanner;

public class SegundosEmMinutos {
    public static int lerSegundos(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite os segundos: ");
        return scanner.nextInt();
    }

    public static void escreverTempo(int horas, int minutos, int segundos){
        System.out.println(horas + "h" + minutos + "min" + segundos + "seg");
    }

    public static int obterHoras(int segundosTotais){
        return segundosTotais / 3600;
    }

    public static int obterMinutos(int segundosTotais){
        return (segundosTotais % 3600) / 60;
    }

    public static int obterSegundos(int segundosTotais){
        return segundosTotais % 60;
    }

    public static void main(String[] args) {
        int segundosTotais = lerSegundos();

        int horas = obterHoras(segundosTotais);
        int minutos = obterMinutos(segundosTotais);
        int segundos = obterSegundos(segundosTotais);


        escreverTempo(horas, minutos, segundos);


    }

}
