package restaurante;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("view/Principal.fxml"));
        Parent root = loader.load();
        stage.setScene(new Scene(root));
        stage.show();

//CONFERINDO
    /*    Pedido pedido = new Pedido();
        System.out.println(pedido);
        pedido.AguardandoPreparo();
        System.out.println(pedido);
        pedido.Feito();
        System.out.println(pedido);
        pedido.Concluido();
        System.out.println(pedido);
    */
    }
    public static void main(String[] args){
        launch(args);
    }
}
