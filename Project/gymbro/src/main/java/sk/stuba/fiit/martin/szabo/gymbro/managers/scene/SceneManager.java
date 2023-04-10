package sk.stuba.fiit.martin.szabo.gymbro.managers.scene;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import sk.stuba.fiit.martin.szabo.gymbro.Main;

import java.io.IOException;
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

    public Parent getActive(){
        return this.getScene().getRoot();
    }

    public String getActiveName(){
        String name = null;
        for(String key : this.getPaneMap().keySet()){
            if(this.getPaneMap().get(key).equals(this.getActive())){
                name = key;
            }
        }
        return name;
    }

    public static Pane loadFxml(String path){
        try{
            return new FXMLLoader(Main.class.getResource(path)).load();
        }
        catch(IOException e){
            e.printStackTrace();
            return null;
        }
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
