package restaurante;

public class PedidoGerente implements Estado {
    @Override
    public Estado NaoDefinido() {
        return new PedidoGarcon();
    }

    @Override
    public Estado AguardandoPreparo() {
        return new PedidoCozinha();
    }

    @Override
    public Estado Feito() {
        return this;
    }

    @Override
    public Estado Concluido() {
        return this;
    }
    @Override
    public String toString(){
        return "Pedido Gerente";
    }
}
