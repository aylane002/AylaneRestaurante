package restaurante;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ControllerPrincipal {


    @FXML
    private ComboBox<?> comboBoxOcupadas;

    @FXML
    private ComboBox<Funcionario> comboBoxGarcom = new ComboBox<Funcionario>();
    private List<Funcionario> funcionarios = new ArrayList<>();

    ObservableList<Funcionario> obsFuncionario;

    @FXML
    private ListView<Mesa> listViewOcupadas;

    @FXML
    private ListView<Mesa> listViewReservadas;

    @FXML
    private ListView<Mesa> listViewLivres;




    private ObservableList<Mesa> obsMesas;
    private ObservableList<Mesa> obsMesasOcupadas;



    private FachadaMesas mesas = new FachadaMesas();



    @FXML
    private Button botaoDesocuparMesa;

    @FXML
    private Button botaoAbrirMesa;

    @FXML
    private Button botaoReservarMesa;

    @FXML
    private ComboBox<Pedido> comboBoxPedidos=new ComboBox<Pedido>();
    private List<Pedido> pedidos = new ArrayList<>();
    ObservableList<Pedido> obsPedido;


    private static ArrayList<ObsMudaTela> ouvintes = new ArrayList<ObsMudaTela>();

    public static interface ObsMudaTela {
        void mudaTela(Object objetoQualquer);
    }

    public static void addMudaTela(ObsMudaTela novoOuvinte) {
        ouvintes.add(novoOuvinte);
    }

    public static void notificaOuvintes(Object dado) {
        for (ObsMudaTela o : ouvintes) {
            o.mudaTela(dado);
        }
    }


    @FXML
    public void initialize() {
        carregandoMesas();
        Funcionario funci1 = new Funcionario("José",30,"999999999");
        funcionarios.add(funci1);
        obsFuncionario= FXCollections.observableArrayList((funcionarios));
        comboBoxGarcom.setItems(obsFuncionario);


        Funcionario funci2 = new Funcionario("Maria",30,"999999998");
        funcionarios.add(funci2);
        obsFuncionario= FXCollections.observableArrayList((funcionarios));
        comboBoxGarcom.setItems(obsFuncionario);

        Funcionario funci3 = new Funcionario("Carmem",30,"999999997");
        funcionarios.add(funci3);
        obsFuncionario= FXCollections.observableArrayList((funcionarios));
        comboBoxGarcom.setItems(obsFuncionario);

    }


    public void carregandoMesas() {
        Mesa mesa1 = new Mesa(1);
        Mesa mesa2 = new Mesa(2);
        Mesa mesa3 = new Mesa(3);
        Mesa mesa4 = new Mesa(4);


//        System.out.println("TESTES -> "+mesa1.getComanda().pedidos[0].garcom.getNome());


        mesas.mesasLivres.add(mesa1);
        mesas.mesasLivres.add(mesa2);
        mesas.mesasLivres.add(mesa3);
        mesas.mesasLivres.add(mesa4);


        obsMesas = FXCollections.observableArrayList(mesas.mesasLivres);
        obsMesasOcupadas = FXCollections.observableArrayList(mesas.mesasLivres);

        listViewLivres.setItems(obsMesas);
        listViewOcupadas.setItems(obsMesas);

    }
    @FXML
    void imprime(ActionEvent event) {

//
//        System.out.println("teste");
//        Mesa objMesa = listViewLivres.getSelectionModel().getSelectedItem();
//        listViewLivres.getSelectionModel().clearSelection();
//
//        mesas.remove(objMesa);
//
//        System.out.println(mesasOcupadas.isEmpty());
//
//        mesasOcupadas.add(objMesa);
//
//
//        obsMesas = FXCollections.observableArrayList(mesas);
//        obsMesasOcupadas = FXCollections.observableArrayList(mesas);
//
////        listViewLivres.setItems(obsMesas);
////        listViewOcupadas.setItems(obsMesasOcupadas);
//
//
    }
    @FXML
    public void eventList(MouseEvent event){
        System.out.println("opa!!");
    }

    @FXML
    public void abrirMesa(ActionEvent event) throws IOException {
//        Stage stage1 = (Stage) botaoAbrirMesa.getScene().getWindow();
//        stage1.close();


        FXMLLoader load = new FXMLLoader(this.getClass().getResource("view/Comanda.fxml"));
        Parent root = load.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        System.out.println(listViewLivres.getSelectionModel().getSelectedItem());

        notificaOuvintes(listViewLivres.getSelectionModel().getSelectedItem());
        stage.show();
    }


}
