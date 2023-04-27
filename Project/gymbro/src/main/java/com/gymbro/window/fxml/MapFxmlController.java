package com.gymbro.window.fxml;

import com.gymbro.Main;
<<<<<<< HEAD
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import com.gymbro.setups.Setup;
import com.gymbro.setups.SetupFavorites;
import com.gymbro.utils.Constants;
import com.gymbro.window.Window;
=======
import com.gymbro.setups.Setup;
import com.gymbro.setups.SetupFavorites;
import com.gymbro.utils.Constants;
import com.gymbro.window.Window;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
>>>>>>> 9079eeaea8be65203256d1a56dedc2d96de92a57

import java.io.IOException;
import java.util.Objects;

/**
 * The type Map fxml controller.
 */
public class MapFxmlController{

    /**
     * Instantiates a new Map fxml controller.
     */
    public MapFxmlController(){
    }

    /**
     * Run.
     *
     * @param setup the setup
     */
    public void run(Setup setup){
        setup.getMap().draw();
    }

    /**
     * Initialize scene.
     *
     * @throws IOException the io exception
     */
    public void initializeScene() throws IOException{
        Pane root = FXMLLoader.load(Objects.requireNonNull(Main.class.getResource("fxml/map.fxml")));
        Window.getInstance().getSceneManager().addPane(Constants.ID_MAP_PANE, root);
        Window.getInstance().getSceneManager().activate(Constants.ID_MAP_PANE);
    }

    private void initializeSetup(Setup setup){
        if(setup.getMap() == null) setup.initializeMap();

        try{
            this.initializeScene();
        }
        catch(IOException e){
            throw new RuntimeException(e);
        }

        this.run(setup);
    }

    /**
     * Show map.
     */
    @FXML
    public void showMap(){
        this.initializeSetup(new Setup());
    }

    /**
     * Show favorites map.
     */
    @FXML
    public void showFavoritesMap(){
        this.initializeSetup(new SetupFavorites());
    }

    /**
     * Back.
     */
    public void back(){
        Window.getInstance().handleBackToMainMenu();
    }
}
