package sk.stuba.fiit.martin.szabo.gymbro.window.fxml;

import javafx.fxml.FXML;
import sk.stuba.fiit.martin.szabo.gymbro.window.Window;

public class MainMenuFxmlController{
    @FXML
    protected void startMap(){
        MapFxmlController controller = new MapFxmlController();
        controller.showMap();
    }

    @FXML
    protected void goToFavoritesMenu(){
        FavoritesMenuFxmlController controller = new FavoritesMenuFxmlController();
        controller.showMenu();
    }

    public void quit(){
        Window.getInstance().handleQuit();
    }
}
