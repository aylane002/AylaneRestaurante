package restaurante;

public class Funcionario extends Pessoa{

    public Funcionario(String nome, Integer idade, String contato) {

        super(nome, idade, contato);
    }
    @Override
    public String toString(){
        return super.getNome().toString();
    }
}
