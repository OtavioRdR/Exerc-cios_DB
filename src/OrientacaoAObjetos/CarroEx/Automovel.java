package OrientacaoAObjetos.CarroEx;

public class Automovel {
    public int numRodas;
    public int velMax;
    public boolean ligado;

    public Automovel(int numRodas, int velMax) {
        this.numRodas = numRodas;
        this.velMax = velMax;
        this.ligado = false;
    }

    public void ligar() {
        this.ligado = true;
        System.out.println("Automóvel da empresa DB ligado.");
    }

    public void desligar() {
        this.ligado = false;
        System.out.println("Automóvel da empresa DB desligado.");
    }
}

