package OrientacaoAObjetos.CarroEx;

public class CarroAutomatico extends Carro {
    public CarroAutomatico(int velMax) {
        super(velMax);
    }

    public void ligar(boolean freioPressionado) {
        if (freioPressionado) {
            super.ligar();
            System.out.println("Carro automático da empresa DB ligado com o freio pressionado.");
        } else {
            System.out.println("Não é possível ligar o carro automático da empresa DB sem pressionar o freio.");
        }
    }
}
