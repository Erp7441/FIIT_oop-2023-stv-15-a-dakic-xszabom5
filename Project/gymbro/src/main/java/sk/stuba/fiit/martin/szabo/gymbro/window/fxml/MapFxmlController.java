package sk.stuba.fiit.martin.szabo.gymbro.window.fxml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import sk.stuba.fiit.martin.szabo.gymbro.Main;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Constants;
import sk.stuba.fiit.martin.szabo.gymbro.setups.Setup;
import sk.stuba.fiit.martin.szabo.gymbro.window.Window;
import sk.stuba.fiit.martin.szabo.gymbro.setups.SetupFavorites;

import java.io.IOException;
import java.util.Objects;

public class MapFxmlController{

    public MapFxmlController(){
    }

    public void run(Setup setup){
        setup.getMap().draw();
    }

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

    @FXML
    public void showMap(){
        this.initializeSetup(new Setup());
    }

    @FXML
    public void showFavoritesMap(){
        this.initializeSetup(new SetupFavorites());
    }

    public void back(){
        Window.getInstance().handleBackToMainMenu();
    }
}
