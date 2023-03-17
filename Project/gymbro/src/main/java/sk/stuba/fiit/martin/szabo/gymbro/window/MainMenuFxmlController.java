package sk.stuba.fiit.martin.szabo.gymbro.window;

import javafx.fxml.FXML;

public class MainMenuFxmlController{
    @FXML
    protected void startMap(){
        MapFxmlController controller = new MapFxmlController();
        controller.showMap();
    }
}
