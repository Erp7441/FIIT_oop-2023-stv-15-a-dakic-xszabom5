package com.gymbro.window.fxml;

import com.gymbro.Main;
import com.gymbro.handlers.FavoritesHandler;
<<<<<<< HEAD
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import com.gymbro.utils.Constants;
import com.gymbro.window.Window;
=======
import com.gymbro.utils.Constants;
import com.gymbro.window.Window;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
>>>>>>> 9079eeaea8be65203256d1a56dedc2d96de92a57

import java.io.IOException;

/**
 * The type Favorites menu fxml controller.
 */
public class FavoritesMenuFxmlController{


    /**
     * Favorites map.
     */
    public void favoritesMap(){
        MapFxmlController controller = new MapFxmlController();
        controller.showFavoritesMap();
    }

    /**
     * Show menu.
     */
    public void showMenu(){
        try{
            Pane root = new FXMLLoader(Main.class.getResource("fxml/favoritesMenu.fxml")).load();
            Window.getInstance().getSceneManager().addPane(Constants.ID_FAVORITES_MENU_PANE, root);
            Window.getInstance().getSceneManager().activate(Constants.ID_FAVORITES_MENU_PANE);
        }
        catch(IOException e){
            throw new RuntimeException(e);
        }
    }

    /**
     * Back to main menu.
     */
    public void backToMainMenu(){
        Window.getInstance().handleBackToMainMenu();
    }

    /**
     * Save favorites.
     */
    public void saveFavorites(){
        FavoritesHandler.save("favorite_gyms");
    }
}
