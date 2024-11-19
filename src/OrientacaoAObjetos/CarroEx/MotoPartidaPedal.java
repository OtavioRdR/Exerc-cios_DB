package OrientacaoAObjetos.CarroEx;

public class MotoPartidaPedal extends Moto {
    public MotoPartidaPedal(int velMax) {
        super(velMax);
    }

    public void ligar(boolean aceleradorPuxado) {
        if (aceleradorPuxado) {
            super.ligar();
            System.out.println("Moto com partida a pedal da empresa DB ligada com o acelerador puxado.");
        } else {
            System.out.println("Não é possível ligar a moto com partida a pedal da empresa DB sem puxar o acelerador.");
        }
    }
}
