package ExercíciosBásicos;

public class ProdutosComDesconto {
    public static void main(String[] args) {

        int unidadeLaranja = 55;
        int valorLaranja = 20;

        if (unidadeLaranja >= 50) {
            double desconDeCinquenta = valorLaranja * 0.50;
            double valorDescontoDeCinquenta = valorLaranja - desconDeCinquenta;
            System.out.println("O valor com desconto de 50% pela quantidade foi de: " + valorDescontoDeCinquenta);

        } else if (unidadeLaranja >= 21) {
            double descontoDeVinte = valorLaranja * 0.20;
            double valorComDescontoDeVinte = valorLaranja - descontoDeVinte;
            System.out.println("O valor com desconto de 20% pela quantidade foi de: " + valorComDescontoDeVinte);

        } else if (unidadeLaranja >= 11) {
            double desconto = valorLaranja * 0.10;
            double valorComDesconto = valorLaranja - desconto;
            System.out.println("O valor com desconto de 10% pela quantidade foi de: " + valorComDesconto);

        } else {
            System.out.println("Preço de " + unidadeLaranja + " unidades totais: " + unidadeLaranja);
        }
    }
}
