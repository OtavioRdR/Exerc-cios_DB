package OrientacaoAObjetos.CarroEx;

public class Main {
    public static void main(String[] args) {
        CarroAutomatico meuCarro = new CarroAutomatico(180);
        meuCarro.ligar(false);
        meuCarro.ligar(true);

        MotoPartidaPedal minhaMoto = new MotoPartidaPedal(150);
        minhaMoto.ligar(false);
        minhaMoto.ligar(true);

        Guincho meuGuincho = new Guincho(120);
        meuGuincho.carregar(meuCarro);
        meuGuincho.carregar(minhaMoto);
    }
}
