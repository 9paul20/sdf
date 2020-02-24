package sample.Eventos;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.WindowEvent;

public class EventosTaquimecanografos implements EventHandler<KeyEvent> {

    Button[] arBotones3;
    boolean ban = true;

    public EventosTaquimecanografos(Button[] arreglo){
        arBotones3 = arreglo;
    }

    @Override
    public void handle(KeyEvent event) {

        int pos = 0;
        if (event.getCode() == KeyCode.TAB)
            pos = 0;
        if (event.getCode() == KeyCode.Q)
            pos = 1;
        if(ban)
            arBotones3[0].setStyle("-fx-base: #9e9d24;");
        else
            arBotones3[0].setStyle("-fx-base: #CCCC08;");
        ban = !ban;


        /*if(event.getCode() == KeyCode.TAB){
            if(ban)
                arBotones3[0].setStyle("-fx-base: #9e9d24;");
            else
                arBotones3[0].setStyle("-fx-base: #CCCC08;");
            ban = !ban;
        }*/


        //System.out.println("PUCHALE TECLAS");
        //System.out.println(event.getText());
        /*if(event.getCode() == KeyCode.DIGIT0)
            System.out.println("EL 0");*/
        /*switch (event.getCode()){
            case KeyCode.DIGIT0:
                System.out.println("El 0");
            case "0":
                System.out.println("PUCHASTE EL 0");
                break;
            case "Backspace":
                System.out.println("PUCHASTE EL ELIMINAR BRO");
                break;
            case "Space":
                System.out.println("PUCHASTE EL ESPACIO UUUUUUUUU!");
                break;
        }*/
        System.out.println(event.getCode().getName());
    }
}
