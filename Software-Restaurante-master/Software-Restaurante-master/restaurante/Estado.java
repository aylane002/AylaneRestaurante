package restaurante;

public interface Estado {
    Estado NaoDefinido();
    Estado AguardandoPreparo();
    Estado Feito();
    Estado Concluido();
}
