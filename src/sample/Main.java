package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    private Button btn1, btn2, btn3, btn4;
    private VBox vbox;
    private HBox hbox;

    @Override
    public void start(Stage primaryStage) throws Exception{

        btn1 = new Button("Botón 1");
        btn1.setPrefWidth(150);
        btn2 = new Button("Botón 2");
        btn2.setPrefWidth(150);
        btn3 = new Button("Botón 3");
        btn3.setPrefWidth(70);
        btn4 = new Button("Botón 4");
        btn4.setPrefWidth(70);

        vbox = new VBox();
        hbox = new HBox();

        vbox.getChildren().addAll(btn1, btn2);
        hbox.getChildren().addAll(btn3, btn4);
        vbox.getChildren().add(hbox);

        vbox.setSpacing(10);
        hbox.setSpacing(10);

        vbox.setAlignment(Pos.CENTER);
        hbox.setAlignment(Pos.CENTER);

        primaryStage.setMaximized(true);
        primaryStage.setTitle("Tópicos Avanzados de Programación :)");
        primaryStage.setScene(new Scene(vbox, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}