package sample.Vistas;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import sample.Eventos.EventoBuscaminas;

public class Buscaminas extends Stage implements EventHandler {

    /*private static final String BOOTSTRAP_PREFIX = "http://getbootstrap.com/components/#";

    private enum Anchor { progress, jumbotron, badges, pagination }*/

    private Label lblNoRows, lblNoCols;
    private TextField txtNoRows, txtNoCols;
    private Button btnMinar;
    private GridPane gdpCampo;
    private Button[][] arBtnCeldas;
    private Scene escena;
    private HBox hBox;
    private VBox vBox;

    public Buscaminas(){
        CrearGUI();
        this.setTitle("Mi Buscaminas Shidoris :D");
        this.setScene(escena);
        this.show();
    }

    private void CrearGUI() {
        vBox = new VBox();

        lblNoRows = new Label("No. Rows");
        lblNoCols = new Label("No. Cols");
        txtNoRows = new TextField();
        txtNoCols = new TextField();
        btnMinar = new Button("Minar Campo");
        //btnMinar.addEventHandler(MouseEvent.MOUSE_CLICKED,this);
        btnMinar.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventoBuscaminas(txtNoRows,txtNoCols,arBtnCeldas,gdpCampo,vBox));
        /*btnMinar.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        System.out.println("Tercer Evento :c.... ya uei");
                    }
                });*/

        //btnMinar.setOnAction(event -> System.out.println("Cuarto Intento.... Otro mas! -¬U.U-¬"));
        //btnMinar.setOnAction(event -> Evento());
        hBox = new HBox();
        hBox.getChildren().addAll(lblNoRows,txtNoRows,lblNoCols,txtNoCols,btnMinar);
        vBox.getChildren().addAll(hBox);

        escena = new Scene(vBox,350,350);
        escena.getStylesheets().add("sample/Estilos/Estilos_buscaminas.css");
    }

    private void Evento() {
        System.out.println("QUINTO EVENTO KK");
    }


    @Override
    public void handle(Event event) {
        System.out.println("Primer Evento ¬¬");
    }
}