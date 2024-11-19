package OrientacaoAObjetos;

import java.util.ArrayList;
public class SupermercadoBoa {
    static class Produto {
        private String nome;
        private double preco;
        private int quantidadeEmEstoque;
        public Produto(String nome, double preco, int quantidadeEmEstoque) {
            this.nome = nome;
            this.preco = preco;
            this.quantidadeEmEstoque = quantidadeEmEstoque;
        }
        public String getNome() {
            return nome;
        }
        public double getPreco() {
            return preco;
        }
        public int getQuantidadeEmEstoque() {
            return quantidadeEmEstoque;
        }
        public void atualizarEstoque(int quantidade) {
            this.quantidadeEmEstoque += quantidade;
        }
    }
    static class Item {
        private Produto produto;
        private int quantidade;
        private double valorDoItem;
        public Item(Produto produto, int quantidade) {
            this.produto = produto;
            this.quantidade = quantidade;
            this.valorDoItem = produto.getPreco() * quantidade;
        }
        public double getValorDoItem() {
            return valorDoItem;
        }
    }
    static class Pedido {
        private ArrayList<Item> listaDeItens;
        private double valorTotalDoPedido;
        public Pedido() {
            listaDeItens = new ArrayList<>();
            valorTotalDoPedido = 0;
        }
        public void adicionarItemAoPedido(Produto produto, int quantidade) {
            if (produto.getQuantidadeEmEstoque() >= quantidade) {
                Item novoItem = new Item(produto, quantidade);
                listaDeItens.add(novoItem);
                produto.atualizarEstoque(-quantidade);
                valorTotalDoPedido += novoItem.getValorDoItem();
                System.out.println("produto adicionado: " + produto.getNome());
            } else {
                System.out.println("estoque insuficiente para o produto: " + produto.getNome());
            }
        }

        public double getValorTotalDoPedido() {
            return valorTotalDoPedido;
        }
        public double calcularTroco(double valorPago) {
            if (valorPago >= valorTotalDoPedido) {
                return valorPago - valorTotalDoPedido;
            } else {

                System.out.println("valor pago insuficiente.");

                return -1;
            }
        }
        public void calcularMenorQuantidadeDeNotas(double troco) {

            int[] notas = {100, 50, 20, 10, 5, 2, 1};
            int[] quantidadeNotas = new int[notas.length];

            for (int i = 0; i < notas.length; i++) {
                if (troco >= notas[i]) {
                    quantidadeNotas[i] = (int) (troco / notas[i]);
                    troco %= notas[i];
                }
            }
            System.out.println("notas necessárias para o troco:");
            for (int i = 0; i < notas.length; i++) {
                if (quantidadeNotas[i] > 0) {
                    System.out.println("R$ " + notas[i] + ": " + quantidadeNotas[i] +"reais");
                }
            }
        }
    }
    public static void main(String[] args) {
        Produto arroz = new Produto("arroz", 20.0, 50);
        Produto feijao = new Produto("feijao", 10.0, 30);

        Pedido pedido = new Pedido();
        pedido.adicionarItemAoPedido(arroz, 2);
        pedido.adicionarItemAoPedido(feijao, 1);

        System.out.println("valor total do pedido: R$ " + pedido.getValorTotalDoPedido());

        double valorPago = 100.0;
        double troco = pedido.calcularTroco(valorPago);

        if (troco >= 0) {
            System.out.println("troco: R$ " + troco);
            pedido.calcularMenorQuantidadeDeNotas(troco);
        }
    }
}