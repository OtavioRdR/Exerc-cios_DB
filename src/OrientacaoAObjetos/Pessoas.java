package OrientacaoAObjetos;


    public class Pessoas {
        public String nome;
        public int idade;
        public Pessoas pai;
        public Pessoas mae;

        public Pessoas(String nome, int idade, Pessoas pai, Pessoas mae) {
            this.nome = nome;
            this.idade = idade;
            this.pai = pai;
            this.mae = mae;
        }

        public static void main(String[] args) {
            Pessoas avoPaterno = new Pessoas("Antonio", 78, null, null);
            Pessoas avoMaterno = new Pessoas("Maria Helena", 75, null, null);
            Pessoas avoMaternoDois = new Pessoas("Dinei", 60, null, null);
            Pessoas avoPaternoDois = new Pessoas("Tuca", 57, null, null);

            Pessoas pai = new Pessoas("Clecio", 46, avoPaterno, avoMaterno);
            Pessoas mae = new Pessoas("Vanessa", 39, avoMaternoDois, avoPaternoDois);

            Pessoas filho = new Pessoas("Lucas", 20, pai, mae);

            System.out.println("seu nome: " + filho.nome);
            System.out.println("idade: " + filho.idade);
            System.out.println("pai: " + filho.pai.nome + " | idade: " + pai.idade);
            System.out.println("mãe: " + filho.mae.nome + " | idade: " + mae.idade);
            System.out.println("avô paterno: " + filho.pai.pai.nome +" | idade: "+ avoPaterno.idade);
            System.out.println("avó paterna: " + filho.pai.mae.nome +" | idade: " + avoPaternoDois.idade);
            System.out.println("avô materno: " + filho.mae.pai.nome + " | idade: " + avoMaterno.idade);
            System.out.println("avó materna: " + filho.mae.mae.nome + " | idade: " + avoMaternoDois.idade);
        }
    }


