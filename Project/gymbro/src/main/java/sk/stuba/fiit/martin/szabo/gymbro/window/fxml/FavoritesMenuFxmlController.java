package sk.stuba.fiit.martin.szabo.gymbro.window.fxml;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import sk.stuba.fiit.martin.szabo.gymbro.Main;
import sk.stuba.fiit.martin.szabo.gymbro.handlers.FavoritesHandler;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Constants;
import sk.stuba.fiit.martin.szabo.gymbro.window.Window;

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
