package OrientacaoAObjetos.CarroEx;

public class Main {
    public static void main(String[] args) {
        CarroAutomatico meuCarro = new CarroAutomatico(180);
        meuCarro.ligar(false); // Não liga
        meuCarro.ligar(true); // Liga

        MotoPartidaPedal minhaMoto = new MotoPartidaPedal(150);
        minhaMoto.ligar(false); // Não liga
        minhaMoto.ligar(true); // Liga

        Guincho meuGuincho = new Guincho(120);
        meuGuincho.carregar(meuCarro);
        meuGuincho.carregar(minhaMoto);
    }
}
