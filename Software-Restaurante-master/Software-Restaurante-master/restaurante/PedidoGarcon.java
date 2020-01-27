package restaurante;

public class PedidoGarcon implements Estado {


    @Override
    public Estado NaoDefinido() {
        return this;
    }

    @Override
    public Estado AguardandoPreparo() {
        return new PedidoCozinha();
    }

    @Override
    public Estado Feito() {
        return AguardandoPreparo();
    }

    @Override
    public Estado Concluido() {
        return new PedidoGerente();
    }

    @Override
    public String toString(){
        return "Pedido Garçom";
    }
}
