package OrientacaoAObjetos.CarroEx;

public class Guincho extends Automovel {
    public Guincho(int velMax) {
        super(4, velMax);
    }

    public void carregar(Automovel automovel) {
        System.out.println("O guincho da empresa DB está carregando um " + automovel.getClass().getSimpleName());
    }
}
