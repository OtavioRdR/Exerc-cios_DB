package OrientacaoAObjetos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Livro{

    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString(){
        return " Livro " + titulo + ", Autor: " + autor + ", disponivel: " + disponivel;
    }
}

class Pessoa {
    private String nome;

    public Pessoa(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class Emprestimo{
    private Pessoa pessoa;
    private Livro livro;
    private Date dataEmprestimo;

    public Emprestimo(Pessoa pessoa, Livro livro){
        this.pessoa = pessoa;
        this.livro = livro;
        this.dataEmprestimo = new Date();
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public Livro getLivro() {
        return livro;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    @Override
    public String toString(){
        return "Emprestimo [Pessoa: " + pessoa.getNome() + ", livro: " + livro.getTitulo() + ", data: " + dataEmprestimo + "]";
    }

}

public class EmprestimoDeLivro {
    public static void main(String[] args) {

        Livro primeiroLivro = new Livro("Codigo Limpo[","Robert C. Martin");
        Livro segundoLivro = new Livro("2006","Otavio Rosa");

        Pessoa primeiraPessoa = new Pessoa("Juliana");
        Pessoa segundaPessoa = new Pessoa("Joyce");


        List<Emprestimo> emprestimos = new ArrayList<>();

        if (primeiroLivro.isDisponivel()){
            emprestimos.add(new Emprestimo(primeiraPessoa, primeiroLivro));
            primeiroLivro.setDisponivel(false);
        }
        if (segundoLivro.isDisponivel()){
            emprestimos.add(new Emprestimo(segundaPessoa, segundoLivro));
            segundoLivro.setDisponivel(false);
        }
        System.out.println("Emprestimos realizados: ");
        for (Emprestimo e: emprestimos){
            System.out.println(e);
        }
        System.out.println("\n Estatus do Livro: ");
        System.out.println(primeiroLivro);
        System.out.println(segundoLivro);
    }
}