package sk.stuba.fiit.martin.szabo.gymbro.window.fxml;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import sk.stuba.fiit.martin.szabo.gymbro.window.Window;

public class MainMenuFxmlController{
    @FXML
    protected void startMap(){
        MapFxmlController controller = new MapFxmlController();
        controller.showMap();
    }

    public void favoritesMap(){
        MapFxmlController controller = new MapFxmlController();
        controller.showFavoritesMap();
    }

    public void quit(){
        Window.getInstance().handleQuit();
    }
}
