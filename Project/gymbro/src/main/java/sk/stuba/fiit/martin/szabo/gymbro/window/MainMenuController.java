package sk.stuba.fiit.martin.szabo.gymbro.window;

import javafx.fxml.FXML;

public class MainMenuController{
    @FXML
    protected void startMap(){
        MapController controller = new MapController();
        controller.showMap();
    }
}
