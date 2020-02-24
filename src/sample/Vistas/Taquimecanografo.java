package sample.Vistas;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToolBar;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import sample.Eventos.EventoVentanaTaqui;
import sample.Eventos.EventosTaquimecanografos;

import java.io.File;


public class Taquimecanografo extends Stage {
    private Scene escena;
    private ToolBar tlbMenu;
    private Button btnAbrir;
    private TextArea txaArea, txaEscritura, txaTexto;
    private VBox vPrincipal, vTeclado;
    private HBox hTeclas1,hTeclas2,hTeclas3,hTeclas4,hTeclas5,hTeclas6;
    private Button[] arBotones1,arBotones2,arBotones3,arBotones4,arBotones5,arBotones6;
    private String[] arTeclas1 = {"Esc","F1","F2","F3","F4","F5","F6","F7","F8","F9","F10","F11","F12","IMP PNT","SUPR"};
    private String[] arTeclas2 = {"|","1","2","3","4","5","6","7","8","9","0","'","¿"," "};
    private String[] arTeclas3 = {"-><-","Q","W","E","R","T","Y","U","O","P","´","+","}"," "};
    private String[] arTeclas4 = {"BLOQ","A","S","D","F","G","H","J","K","L","Ñ","{","+","<-"};
    private String[] arTeclas5 = {"SHIFT","Z","X","C","V","B","N","M",",",":","-","{","+","SHIFT"};
    private String[] arTeclas6 = {"CTRL","FN","INICIO","ALT"," "," "," "," SPACE"," SPACE"," "," "," ","ALTGR","<"};
    private FileChooser flcArchivos;

    public Taquimecanografo(){
        CrearGUI();
        this.setTitle("El Meca Este");
        this.setScene(escena);
        this.addEventHandler(WindowEvent.WINDOW_CLOSE_REQUEST,new EventoVentanaTaqui());
        this.show();
    }

    private void CrearGUI(){
        tlbMenu = new ToolBar();
        btnAbrir = new Button();
        btnAbrir.setPrefSize(140,140);
        btnAbrir.setGraphic(new ImageView("sample/Imagenes/iconfinder_document-open_118911.png"));
        btnAbrir.setOnAction(event -> AbrirExplorador());
        tlbMenu.getItems().add(btnAbrir);

        txaTexto = new TextArea();
        txaTexto.setEditable(false);
        txaTexto.setPrefRowCount(5);
        txaTexto.setPrefColumnCount(5);

        txaEscritura = new TextArea();
        txaEscritura.setPrefRowCount(5);
        txaEscritura.setPrefColumnCount(5);
        txaEscritura.setOnKeyPressed(new EventosTaquimecanografos());

        hTeclas1 = new HBox();
        hTeclas2 = new HBox();
        hTeclas3 = new HBox();
        hTeclas3.setSpacing(5);
        hTeclas3.setId("hbox-custom");
        hTeclas4 = new HBox();
        hTeclas5 = new HBox();
        hTeclas6 = new HBox();
        arBotones1 = new Button[15];
        for(int i= 0; i < 15; i ++){
            arBotones1[i] = new Button(arTeclas1[i]);
            hTeclas1.getChildren().addAll(arBotones1[i]);
        }
        arBotones2 = new Button[14];
        for(int i= 0; i < 14; i ++){
            arBotones2[i] = new Button(arTeclas2[i]);
            hTeclas2.getChildren().addAll(arBotones2[i]);
        }
        arBotones3 = new Button[14];
        for(int i= 0; i < 14; i ++){
            arBotones3[i] = new Button(arTeclas3[i]);
            hTeclas3.getChildren().addAll(arBotones3[i]);
        }
        arBotones4 = new Button[14];
        for(int i= 0; i < 14; i ++){
            arBotones4[i] = new Button(arTeclas4[i]);
            hTeclas4.getChildren().addAll(arBotones4[i]);
        }
        arBotones5 = new Button[14];
        for(int i= 0; i < 14; i ++){
            arBotones5[i] = new Button(arTeclas5[i]);
            hTeclas5.getChildren().addAll(arBotones5[i]);
        }
        arBotones6 = new Button[14];
        for(int i= 0; i < 14; i ++){
            arBotones6[i] = new Button(arTeclas6[i]);
            hTeclas6.getChildren().addAll(arBotones6[i]);
        }
        vTeclado = new VBox();
        vTeclado.getChildren().addAll(hTeclas1,hTeclas2,hTeclas3,hTeclas4,hTeclas5,hTeclas6);

        vPrincipal = new VBox();
        vPrincipal.setSpacing(5);
        vPrincipal.getChildren().addAll(tlbMenu, txaTexto, txaEscritura, vTeclado);
        escena = new Scene(vPrincipal, 900, 500);
        //escena.addEventHandler((WindowEvent.WINDOW_CLOSE_REQUEST.new EventoVentanaTaqui()));
        escena.getStylesheets().add("sample/Estilos/Bootstrap3.css");
        this.show();
    }

    private void AbrirExplorador() {
        flcArchivos = new FileChooser();
        flcArchivos.setTitle("Pon EL ARCHIVO AQUI!!");
        flcArchivos.showOpenDialog(this);
        File objFile = flcArchivos.showOpenDialog(this);

    }
}
