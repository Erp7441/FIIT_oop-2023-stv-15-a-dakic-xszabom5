package com.gymbro.managers.scene;

import com.gymbro.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;

/**
 * The type Scene manager.
 */
public class SceneManager{
    private HashMap<String, Pane> paneMap = new HashMap<>();
    private Scene scene;
    private Stage stage;

    /**
     * Instantiates a new Scene manager.
     *
     * @param scene the scene
     */
    public SceneManager(Scene scene){
        this.scene = scene;
    }

    /**
     * Add pane.
     *
     * @param name the name
     * @param pane the pane
     */
    public void addPane(String name, Pane pane){
        this.getPaneMap().put(name, pane);
    }

    /**
     * Remove pane.
     *
     * @param name the name
     */
    public void removePane(String name){
        this.getPaneMap().remove(name);
    }

    /**
     * Activate.
     *
     * @param name the name
     */
    public void activate(String name){
        this.getScene().setRoot(this.getPaneMap().get(name));
    }

    /**
     * Get active parent.
     *
     * @return the parent
     */
    public Parent getActive(){
        return this.getScene().getRoot();
    }

    /**
     * Get active name string.
     *
     * @return the string
     */
    public String getActiveName(){
        String name = null;
        for(String key : this.getPaneMap().keySet()){
            if(this.getPaneMap().get(key).equals(this.getActive())){
                name = key;
            }
        }
        return name;
    }

    /**
     * Load fxml pane.
     *
     * @param path the path
     * @return the pane
     */
    public static Pane loadFxml(String path){
        try{
            return new FXMLLoader(Main.class.getResource(path)).load();
        }
        catch(IOException e){
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Get scene scene.
     *
     * @return the scene
     */
    public Scene getScene(){
        return scene;
    }

    /**
     * Get pane map hash map.
     *
     * @return the hash map
     */
    public HashMap<String, Pane> getPaneMap(){
        return paneMap;
    }

    /**
     * Get stage stage.
     *
     * @return the stage
     */
    public Stage getStage(){
        return stage;
    }

    /**
     * Set stage.
     *
     * @param stage the stage
     */
    public void setStage(Stage stage){
        this.stage = stage;
    }
}
