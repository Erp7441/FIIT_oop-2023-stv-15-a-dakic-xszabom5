package com.gymbro.window.fxml;

import com.gymbro.window.Window;
import javafx.fxml.FXML;
<<<<<<< HEAD
import com.gymbro.window.Window;
=======
>>>>>>> 9079eeaea8be65203256d1a56dedc2d96de92a57

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
