package sample.Eventos;

import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.stage.WindowEvent;

public class EventoVentanaTaqui implements EventHandler<WindowEvent> {
    @Override
    public void handle(WindowEvent event) {
        Alert objAlerta = new Alert(Alert.AlertType.CONFIRMATION);
            objAlerta.setTitle("MENSAJE SISMO");
            objAlerta.setHeaderText("ORALE");
            objAlerta.setContentText("PICALE >:c");
            objAlerta.showAndWait();
    }
}
