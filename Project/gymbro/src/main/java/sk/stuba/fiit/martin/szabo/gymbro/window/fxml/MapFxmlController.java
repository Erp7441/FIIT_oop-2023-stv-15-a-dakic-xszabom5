package sk.stuba.fiit.martin.szabo.gymbro.window.fxml;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import sk.stuba.fiit.martin.szabo.gymbro.Main;
import sk.stuba.fiit.martin.szabo.gymbro.window.Setup;
import sk.stuba.fiit.martin.szabo.gymbro.window.Window;

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
        Window.getInstance().getSceneManager().addPane("Map", root);
        Window.getInstance().getSceneManager().activate("Map");
    }

    @FXML
    public void showMap(){
        Setup setup = new Setup();
        if(setup.getMap() == null) setup.initializeMap();

        try{
            this.initializeScene();
        }
        catch(IOException e){
            throw new RuntimeException(e);
        }

        this.run(setup);
    }

}
