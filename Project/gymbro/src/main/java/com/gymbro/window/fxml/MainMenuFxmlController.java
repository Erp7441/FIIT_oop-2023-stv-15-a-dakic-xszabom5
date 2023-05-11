package com.gymbro.window.fxml;

import com.gymbro.Main;
import com.gymbro.window.Window;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Objects;

/**
 * The type Main menu fxml controller.
 */
public class MainMenuFxmlController{

    @FXML
    private ImageView logo;

    /**
     * Initialize.
     */
    public void initialize(){
        Image logo2Normal = new Image(Objects.requireNonNull(Main.class.getResourceAsStream("assets/logo2_normal.png")));
        logo.setImage(logo2Normal);
        logo.setFitWidth(logo2Normal.getWidth() / 2);
        logo.setFitHeight(logo2Normal.getHeight() / 2);
        logo.setLayoutX(Window.getInstance().getWidth() / 4);
    }

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
