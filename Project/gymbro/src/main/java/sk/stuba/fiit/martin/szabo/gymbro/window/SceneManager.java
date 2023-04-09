package sk.stuba.fiit.martin.szabo.gymbro.window;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.HashMap;

public class SceneManager{
    private HashMap<String, Pane> paneMap = new HashMap<>();
    private Scene scene;
    private Stage stage;

    public SceneManager(Scene scene){
        this.scene = scene;
    }

    public void addPane(String name, Pane pane){
        this.getPaneMap().put(name, pane);
    }

    public void removePane(String name){
        this.getPaneMap().remove(name);
    }

    public void activate(String name){
        this.getScene().setRoot(this.getPaneMap().get(name));
    }

    public Scene getScene(){
        return scene;
    }

    public HashMap<String, Pane> getPaneMap(){
        return paneMap;
    }

    public Stage getStage(){
        return stage;
    }

    public void setStage(Stage stage){
        this.stage = stage;
    }
}
