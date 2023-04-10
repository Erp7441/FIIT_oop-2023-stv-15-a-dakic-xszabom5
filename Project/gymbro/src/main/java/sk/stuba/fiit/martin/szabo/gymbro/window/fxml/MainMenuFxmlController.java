package sk.stuba.fiit.martin.szabo.gymbro.window.fxml;

import javafx.fxml.FXML;
import sk.stuba.fiit.martin.szabo.gymbro.window.Window;

/**
 * The type Main menu fxml controller.
 */
public class MainMenuFxmlController{
    /**
     * Start map.
     */
    @FXML
    protected void startMap(){
        MapFxmlController controller = new MapFxmlController();
        controller.showMap();
    }

    /**
     * Go to favorites menu.
     */
    @FXML
    protected void goToFavoritesMenu(){
        FavoritesMenuFxmlController controller = new FavoritesMenuFxmlController();
        controller.showMenu();
    }

    /**
     * Quit.
     */
    public void quit(){
        Window.getInstance().handleQuit();
    }
}
