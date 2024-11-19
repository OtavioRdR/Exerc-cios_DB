package OrientacaoAObjetos;

import java.util.ArrayList;
import java.util.Scanner;

class Colaborador {
    String nome, telefone;

    Colaborador(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return nome + " - " + telefone;
    }
}

public class Gestor {
    static ArrayList<Colaborador> equipe = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Adicionar Colaborador");
            System.out.println("2. Remover Colaborador");
            System.out.println("3. Listar equipe");
            System.out.println("4. Sair");
            System.out.print("Escolha: ");
            int opcao = Integer.parseInt(scanner.nextLine());

            if (opcao == 1) {
                adicionarColaborador();
            } else if (opcao == 2) {
                removerColaborador();
            } else if (opcao == 3) {
                listarEquipe();
            } else if (opcao == 4) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }

    static void adicionarColaborador() {
        System.out.print("Digite o nome do colaborador: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o telefone do colaborador: ");
        String telefone = scanner.nextLine();
        equipe.add(new Colaborador(nome, telefone));
        System.out.println("Colaborador adicionado.");
    }

    static void removerColaborador() {
        System.out.print("Digite o nome do colaborador a ser removido: ");
        String nome = scanner.nextLine();
        boolean encontrado = false;
        for (Colaborador colaborador : equipe) {
            if (colaborador.nome.equalsIgnoreCase(nome)) {
                equipe.remove(colaborador);
                System.out.println("Colaborador removido.");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Colaborador não encontrado.");
        }
    }

    static void listarEquipe() {
        if (equipe.isEmpty()) {
            System.out.println("A equipe está vazia.");
        } else {
            System.out.println("Lista de colaboradores:");
            for (Colaborador colaborador : equipe) {
                System.out.println(colaborador);
            }
        }
    }
}
