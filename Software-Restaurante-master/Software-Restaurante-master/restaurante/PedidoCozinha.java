package restaurante;

public class PedidoCozinha implements Estado{

    @Override
    public Estado NaoDefinido() {
        return Feito();
    }

    @Override
    public Estado AguardandoPreparo() {
        return Feito();
    }

    @Override
    public Estado Feito() {
        return new PedidoGarcon();
    }

    @Override
    public Estado Concluido() {
        return new PedidoGerente();
    }
    @Override
    public String toString(){
        return "Pedido Cozinha";
    }
}
