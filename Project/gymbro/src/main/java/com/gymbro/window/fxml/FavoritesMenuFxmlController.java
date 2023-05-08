package com.gymbro.window.fxml;

import com.gymbro.Main;
import com.gymbro.handlers.FavoritesHandler;
import com.gymbro.utils.Constants;
import com.gymbro.window.Window;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.util.Objects;

/**
 * The type Favorites menu fxml controller.
 */
public class FavoritesMenuFxmlController{

    @FXML
    private ImageView logo;

    public void initialize(){
        Image logo2Normal = new Image(Objects.requireNonNull(Main.class.getResourceAsStream("assets/logo2_normal.png")));
        logo.setImage(logo2Normal);
        logo.setFitWidth(logo2Normal.getWidth() / 2);
        logo.setFitHeight(logo2Normal.getHeight() / 2);
        logo.setLayoutX(Window.getInstance().getWidth() / 4);
    }


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
