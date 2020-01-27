package restaurante;

public enum Cardapio {
    MACARRONADA("macarrao, molho, queijo, tempeiros",10.0),
    BAIAO_DE_DOIS("arroz, feijão, carne,batata", 10.0),
    FEIJOADA("feijão, linguiça, guizado, temperos", 10.0),
    TORTA("Massa, queijo, carne ou frango, molho", 10.0),
    SOPA("carne, macarrão, verdura", 5.0),
    BEBIDAS("suco, refrigerante, café", 2.0);

    public final String IGREDIENTES;
    public final double PRECO;

    private Cardapio(String igredientes, double preco){
        this.IGREDIENTES = igredientes;
        this.PRECO = preco;

    }

}
