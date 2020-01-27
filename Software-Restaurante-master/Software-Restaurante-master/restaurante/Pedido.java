package restaurante;

public class Pedido {
    public Funcionario garcom = new Funcionario("Zé",32,"88888808");
    public Prato prato =  new Prato();
    public Integer quantidade;

    public Pedido() {
        garcom.setNome("Zé");
        prato.setNome("Macarronada");
        prato.setValorPrato(10.0);
    }

   /* public Pedido() {

    }*/

    public Double calculaPreco() {
        return this.prato.getValor() * this.quantidade;
    }

    protected Estado estado;
  /*  public Pedido(){
        estado = new PedidoGarcon();
    }*/
    public void NaoDefinido(){
        estado = estado.NaoDefinido();
    }
    public void AguardandoPreparo(){
        estado = estado.AguardandoPreparo();
    }
    public void Feito(){
        estado = estado.Feito();
    }
    public void Concluido(){
        estado = estado.Concluido();
    }
    @Override
    public String toString(){
        return estado.toString();
    }
}
